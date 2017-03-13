package com.github.gary.hook.core.model.push;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Data
public class PushBean {
    @JSONField(name = "ref")
    private String ref;
    @JSONField(name = "before")
    private String before;
    @JSONField(name = "after")
    private String after;
    @JSONField(name = "created")
    private boolean created;
    @JSONField(name = "deleted")
    private boolean deleted;
    @JSONField(name = "forced")
    private boolean forced;
    @JSONField(name = "base_ref")
    private Object baseRef;
    @JSONField(name = "compare")
    private String compare;
    @JSONField(name = "head_commit")
    private HeadCommitBean headCommit;
    @JSONField(name = "repository")
    private RepositoryBean repository;
    @JSONField(name = "pusher")
    private AuthorBean pusher;
    @JSONField(name = "sender")
    private SenderBean sender;
    @JSONField(name = "commits")
    private List<HeadCommitBean> commits;
}
