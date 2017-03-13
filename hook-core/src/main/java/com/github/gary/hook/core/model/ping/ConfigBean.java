package com.github.gary.hook.core.model.ping;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConfigBean {
    @JSONField(name = "content_type")
    private String contentType;
    @JSONField(name = "insecure_ssl")
    private String insecureSsl;
    @JSONField(name = "url")
    private String url;
}