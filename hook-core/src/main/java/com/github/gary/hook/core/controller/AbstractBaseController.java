package com.github.gary.hook.core.controller;

import com.github.gary.hook.core.utils.JsonUtil;
import com.github.gary.hook.core.utils.SynThreadPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
public abstract class AbstractBaseController<P> {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    public abstract Runnable runHandle(P payload);
    @RequestMapping(method = RequestMethod.POST)
    public void handle(@RequestBody P payload) {
        try {
            logger.info(JsonUtil.tranObjectToJsonStr(payload));
            SynThreadPool.execute(runHandle(payload));
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
