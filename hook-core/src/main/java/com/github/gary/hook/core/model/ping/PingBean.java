package com.github.gary.hook.core.model.ping;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Setter
@Getter
public class PingBean {
    @JSONField(name = "zen")
    private String zen;
    @JSONField(name = "hook_id")
    private int hookId;
    @JSONField(name = "hook")
    private HookBean hook;
    @JSONField(name = "repository")
    private RepositoryBean repository;
    @JSONField(name = "sender")
    private OwnerBean sender;
}
