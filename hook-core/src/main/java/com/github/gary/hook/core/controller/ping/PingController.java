package com.github.gary.hook.core.controller.ping;

import com.github.gary.hook.core.model.ping.PingBean;
import com.github.gary.hook.core.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@RestController
@RequestMapping(headers = "X-GitHub-Event=ping")
public class PingController {
    private static Logger logger = LoggerFactory.getLogger(PingController.class);
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String index(@RequestBody PingBean pingBean){
        logger.info("receive ping data - > {} ", JsonUtil.tranObjectToJsonStr(pingBean));
        return pingBean.getZen();
    }

}
