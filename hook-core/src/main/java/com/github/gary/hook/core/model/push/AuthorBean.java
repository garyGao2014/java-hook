package com.github.gary.hook.core.model.push;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Data
public class AuthorBean {
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "email")
    private String email;
    @JSONField(name = "username")
    private String username;
}
