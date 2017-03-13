package com.github.gary.hook.core.model.ping;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LastResponseBean {
    @JSONField(name = "code")
    private Object code;
    @JSONField(name = "status")
    private String status;
    @JSONField(name = "message")
    private Object message;
}