package com.github.gary.hook.example.handler.push;

import com.github.gary.hook.core.model.push.PushBean;
import com.github.gary.hook.core.utils.JsonUtil;
import org.springframework.stereotype.Component;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Component
public class PushHandler extends AbstractPushHandler<PushBean> {
    public void handler(PushBean bean){
        logger.info("receive push data -> {} ", JsonUtil.tranObjectToJsonStr(bean));
        //execute somethings
    }
}
