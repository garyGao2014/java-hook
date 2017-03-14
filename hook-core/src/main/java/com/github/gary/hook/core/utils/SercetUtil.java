package com.github.gary.hook.core.utils;

import ch.qos.logback.core.encoder.ByteArrayUtil;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by gaozhicheng on 2017/3/13.
 */
public class SercetUtil {

    /**
     * 使用 HMAC-SHA1 签名方法对对encryptText进行签名
     * @param encryptText
     * @param encryptKey
     * @return
     * @throws Exception
     */
    public static String HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception {
        String encode = "UTF-8";
        String signate = "HmacSHA1";
        byte[] data = encryptKey.getBytes(encode);
        //根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
        SecretKey secretKey = new SecretKeySpec(data, signate);
        //生成一个指定 Mac 算法 的 Mac 对象
        Mac mac = Mac.getInstance(signate);
        //用给定密钥初始化 Mac 对象
        mac.init(secretKey);
        byte[] text = encryptText.getBytes(encode);
        //完成 Mac 操作
        byte[] resultByte = mac.doFinal(text);
        String result = ByteArrayUtil.toHexString(resultByte);
        return result;
    }

    public static byte[] toByteArray(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        copy((InputStream) in, (OutputStream) out);
        return out.toByteArray();
    }

    private static long copy(InputStream from, OutputStream to) throws IOException {
        byte[] buf = new byte[4096];
        long total = 0L;
        while (true) {
            int r = from.read(buf);
            if (r == -1) {
                return total;
            }
            to.write(buf, 0, r);
            total += (long) r;
        }
    }
}
