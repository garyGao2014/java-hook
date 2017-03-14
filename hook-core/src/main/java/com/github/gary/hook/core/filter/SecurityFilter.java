package com.github.gary.hook.core.filter;

import com.github.gary.hook.core.utils.HttpHelper;
import com.github.gary.hook.core.utils.SercetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by gaozhicheng on 2017/3/13.
 */
//@WebFilter(filterName = "securityFilter", urlPatterns = "/*")
//@Component
public class SecurityFilter extends OncePerRequestFilter implements Serializable {
    private static Logger logger = LoggerFactory.getLogger(SecurityFilter.class);
    private String secret;

    public SecurityFilter(String secret) {
        this.secret = secret;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String signatureHeader = request.getHeader("X-Hub-Signature");
            if (signatureHeader != null && !signatureHeader.equals("")) {
                //为了二次读取流
                PreReadRequestWrapper preRequest = new PreReadRequestWrapper(request);
                ServletInputStream inputStream = preRequest.getInputStream();
                byte[] bytes = SercetUtil.toByteArray(inputStream);
                String accessSecret = "sha1="+SercetUtil.HmacSHA1Encrypt(new String(bytes), secret);
                if (accessSecret.equals(signatureHeader)) {
                    logger.info("签名认证通过");
                    filterChain.doFilter(preRequest, response);
                }else{
                    logger.info("签名认证失败 -> signatureHeader" + signatureHeader + " -- accessSecret" +accessSecret);
                }
            }else {
                filterChain.doFilter(request,response);
            }
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    private class PreReadRequestWrapper extends HttpServletRequestWrapper {
        private final byte[] body;

        public PreReadRequestWrapper(HttpServletRequest request) {
            super(request);
            body = HttpHelper.getBodyString(request).getBytes(Charset.forName("UTF-8"));
        }

        @Override
        public BufferedReader getReader() throws IOException {
            return new BufferedReader(new InputStreamReader(getInputStream()));
        }

        @Override
        public ServletInputStream getInputStream() throws IOException {

            final ByteArrayInputStream bais = new ByteArrayInputStream(body);

            return new ServletInputStream() {

                @Override
                public int read() throws IOException {
                    return bais.read();
                }

                @Override
                public boolean isFinished() {
                    return false;
                }

                @Override
                public boolean isReady() {
                    return false;
                }

                @Override
                public void setReadListener(ReadListener readListener) {

                }
            };
        }

    }
}
