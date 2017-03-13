package com.github.gary.hook.core.model.ping;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by gaozhicheng on 2017/3/10.
 */
@Setter
@Getter
public class RepositoryBean {
    @JSONField(name = "id")
    private int id;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "full_name")
    private String fullName;
    @JSONField(name = "owner")
    private OwnerBean owner;
    @JSONField(name = "private")
    private boolean privateX;
    @JSONField(name = "html_url")
    private String htmlUrl;
    @JSONField(name = "description")
    private Object description;
    @JSONField(name = "fork")
    private boolean fork;
    @JSONField(name = "url")
    private String url;
    @JSONField(name = "forks_url")
    private String forksUrl;
    @JSONField(name = "keys_url")
    private String keysUrl;
    @JSONField(name = "collaborators_url")
    private String collaboratorsUrl;
    @JSONField(name = "teams_url")
    private String teamsUrl;
    @JSONField(name = "hooks_url")
    private String hooksUrl;
    @JSONField(name = "issue_events_url")
    private String issueEventsUrl;
    @JSONField(name = "events_url")
    private String eventsUrl;
    @JSONField(name = "assignees_url")
    private String assigneesUrl;
    @JSONField(name = "branches_url")
    private String branchesUrl;
    @JSONField(name = "tags_url")
    private String tagsUrl;
    @JSONField(name = "blobs_url")
    private String blobsUrl;
    @JSONField(name = "git_tags_url")
    private String gitTagsUrl;
    @JSONField(name = "git_refs_url")
    private String gitRefsUrl;
    @JSONField(name = "trees_url")
    private String treesUrl;
    @JSONField(name = "statuses_url")
    private String statusesUrl;
    @JSONField(name = "languages_url")
    private String languagesUrl;
    @JSONField(name = "stargazers_url")
    private String stargazersUrl;
    @JSONField(name = "contributors_url")
    private String contributorsUrl;
    @JSONField(name = "subscribers_url")
    private String subscribersUrl;
    @JSONField(name = "subscription_url")
    private String subscriptionUrl;
    @JSONField(name = "commits_url")
    private String commitsUrl;
    @JSONField(name = "git_commits_url")
    private String gitCommitsUrl;
    @JSONField(name = "comments_url")
    private String commentsUrl;
    @JSONField(name = "issue_comment_url")
    private String issueCommentUrl;
    @JSONField(name = "contents_url")
    private String contentsUrl;
    @JSONField(name = "compare_url")
    private String compareUrl;
    @JSONField(name = "merges_url")
    private String mergesUrl;
    @JSONField(name = "archive_url")
    private String archiveUrl;
    @JSONField(name = "downloads_url")
    private String downloadsUrl;
    @JSONField(name = "issues_url")
    private String issuesUrl;
    @JSONField(name = "pulls_url")
    private String pullsUrl;
    @JSONField(name = "milestones_url")
    private String milestonesUrl;
    @JSONField(name = "notifications_url")
    private String notificationsUrl;
    @JSONField(name = "labels_url")
    private String labelsUrl;
    @JSONField(name = "releases_url")
    private String releasesUrl;
    @JSONField(name = "deployments_url")
    private String deploymentsUrl;
    @JSONField(name = "created_at")
    private String createdAt;
    @JSONField(name = "updated_at")
    private String updatedAt;
    @JSONField(name = "pushed_at")
    private String pushedAt;
    @JSONField(name = "git_url")
    private String gitUrl;
    @JSONField(name = "ssh_url")
    private String sshUrl;
    @JSONField(name = "clone_url")
    private String cloneUrl;
    @JSONField(name = "svn_url")
    private String svnUrl;
    @JSONField(name = "homepage")
    private Object homepage;
    @JSONField(name = "size")
    private int size;
    @JSONField(name = "stargazers_count")
    private int stargazersCount;
    @JSONField(name = "watchers_count")
    private int watchersCount;
    @JSONField(name = "language")
    private String language;
    @JSONField(name = "has_issues")
    private boolean hasIssues;
    @JSONField(name = "has_downloads")
    private boolean hasDownloads;
    @JSONField(name = "has_wiki")
    private boolean hasWiki;
    @JSONField(name = "has_pages")
    private boolean hasPages;
    @JSONField(name = "forks_count")
    private int forksCount;
    @JSONField(name = "mirror_url")
    private Object mirrorUrl;
    @JSONField(name = "open_issues_count")
    private int openIssuesCount;
    @JSONField(name = "forks")
    private int forks;
    @JSONField(name = "open_issues")
    private int openIssues;
    @JSONField(name = "watchers")
    private int watchers;
    @JSONField(name = "default_branch")
    private String defaultBranch;
}
