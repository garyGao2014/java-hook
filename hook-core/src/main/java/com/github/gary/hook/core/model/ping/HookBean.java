package com.github.gary.hook.core.model.ping;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Setter
@Getter
public class HookBean {
    @JSONField(name = "type")
    private String type;
    @JSONField(name = "id")
    private int id;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "active")
    private boolean active;
    @JSONField(name = "config")
    private ConfigBean config;
    @JSONField(name = "updated_at")
    private String updatedAt;
    @JSONField(name = "created_at")
    private String createdAt;
    @JSONField(name = "url")
    private String url;
    @JSONField(name = "test_url")
    private String testUrl;
    @JSONField(name = "ping_url")
    private String pingUrl;
    @JSONField(name = "last_response")
    private LastResponseBean lastResponse;
    @JSONField(name = "events")
    private List<String> events;
}
