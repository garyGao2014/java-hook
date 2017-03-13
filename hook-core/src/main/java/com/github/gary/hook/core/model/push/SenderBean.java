package com.github.gary.hook.core.model.push;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Data
public class SenderBean {
    @JSONField(name = "login")
    private String login;
    @JSONField(name = "id")
    private int id;
    @JSONField(name = "avatar_url")
    private String avatarUrl;
    @JSONField(name = "gravatar_id")
    private String gravatarId;
    @JSONField(name = "url")
    private String url;
    @JSONField(name = "html_url")
    private String htmlUrl;
    @JSONField(name = "followers_url")
    private String followersUrl;
    @JSONField(name = "following_url")
    private String followingUrl;
    @JSONField(name = "gists_url")
    private String gistsUrl;
    @JSONField(name = "starred_url")
    private String starredUrl;
    @JSONField(name = "subscriptions_url")
    private String subscriptionsUrl;
    @JSONField(name = "organizations_url")
    private String organizationsUrl;
    @JSONField(name = "repos_url")
    private String reposUrl;
    @JSONField(name = "events_url")
    private String eventsUrl;
    @JSONField(name = "received_events_url")
    private String receivedEventsUrl;
    @JSONField(name = "type")
    private String type;
    @JSONField(name = "site_admin")
    private boolean siteAdmin;
}
