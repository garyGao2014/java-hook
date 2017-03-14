package com.github.gary.hook.example.handler.push;

import com.github.gary.hook.core.model.push.PushBean;
import com.github.gary.hook.core.utils.JsonUtil;
import com.github.gary.hook.core.utils.PropertiesUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Component
public class PushHandler extends AbstractPushHandler<PushBean> {

    @Value("${push.handler}")
    private String pushHandlerEnv;

    public void handler(PushBean bean) {
        try {
            logger.info("receive push data -> {} ", JsonUtil.tranObjectToJsonStr(bean));
            //execute somethings
            if (pushHandlerEnv != null && !pushHandlerEnv.equals("")) {
                String absFilePath = PropertiesUtil.getAbsFilePath(pushHandlerEnv);
                logger.info("ready exec sh - > "+absFilePath);
                Process exec = Runtime.getRuntime().exec("sh "+absFilePath);
                BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                String result = sb.toString();
                logger.info("exec sh - > {} ",result);
            }
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
