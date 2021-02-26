package com.zhaopin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentVo {

    @JsonProperty(value = "commentId")
    private String commentId;
    @JsonProperty(value = "commentGrade")
    private String reviewdetail;
    @JsonProperty(value = "commentTime")
    private String commentTime;
    @JsonProperty(value = "nickname")
    private String nickname;
    @JsonProperty(value = "userId")
    private String userId;
    @JsonProperty(value = "hrId")
    private String hrId;
    @JsonProperty(value = "positionId")
    private String positionId;
    @JsonProperty(value = "companyId")
    private String companyId;


    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getReviewdetail() {
        return reviewdetail;
    }

    public void setReviewdetail(String reviewdetail) {
        this.reviewdetail = reviewdetail;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
