package com.github.gary.hook.core.controller.push;

import com.github.gary.hook.api.push.IPushHandler;
import com.github.gary.hook.core.controller.AbstractBaseController;
import com.github.gary.hook.core.model.push.PushBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaozhicheng on 2017/3/9.
 */
@RestController
@RequestMapping(headers = "X-GitHub-Event=push")
public class PushController extends AbstractBaseController<PushBean> {
    @Autowired
    protected IPushHandler handler;

    public Runnable runHandle(PushBean payload) {
        return new Runnable() {
            @Override
            public void run() {
                handler.handler(payload);
            }
        };
    }
}
