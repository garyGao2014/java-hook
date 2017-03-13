package com.github.gary.hook.example.handler.push;

import com.github.gary.hook.api.push.IPushHandler;
import com.github.gary.hook.core.model.push.PushBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
public abstract class AbstractPushHandler<P> implements IPushHandler<PushBean> {
    protected Logger logger = LoggerFactory.getLogger(getClass());

}
