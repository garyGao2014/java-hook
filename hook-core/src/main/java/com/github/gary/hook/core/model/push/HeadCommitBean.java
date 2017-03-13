package com.github.gary.hook.core.model.push;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Data
public class HeadCommitBean {
    @JSONField(name = "id")
    private String id;
    @JSONField(name = "tree_id")
    private String treeId;
    @JSONField(name = "distinct")
    private boolean distinct;
    @JSONField(name = "message")
    private String message;
    @JSONField(name = "timestamp")
    private String timestamp;
    @JSONField(name = "url")
    private String url;
    @JSONField(name = "author")
    private AuthorBean author;
    @JSONField(name = "committer")
    private AuthorBean committer;
    @JSONField(name = "added")
    private List<?> added;
    @JSONField(name = "removed")
    private List<?> removed;
    @JSONField(name = "modified")
    private List<String> modified;
}

