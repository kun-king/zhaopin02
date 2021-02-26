package com.zhaopin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBoxVo {

    @JsonProperty(value = "boxId")
    private String boxId;
    @JsonProperty(value = "title")
    private String title;
    @JsonProperty(value = "salaryUp")
    private String salaryUp;
    @JsonProperty(value = "salaryDown")
    private String salaryDown;
    @JsonProperty(value = "workCity")
    private String workCity;//工作城市
    @JsonProperty(value = "hrMobile")
    private String hrMobile;//hr的电话
    @JsonProperty(value = "userMobile")
    private String userMobile;//user的电话
    @JsonProperty(value = "hrEmail")
    private String hrEmail;//hr的邮箱
    @JsonProperty(value = "userEmail")
    private String userEmail;//user的邮箱
    @JsonProperty(value = "hrId")
    private String hrId;//hr外键
    @JsonProperty(value = "userId")
    private String userId;//user外键
    @JsonProperty(value = "status")
    private String status;//投件状态


    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalaryUp() {
        return salaryUp;
    }

    public void setSalaryUp(String salaryUp) {
        this.salaryUp = salaryUp;
    }

    public String getSalaryDown() {
        return salaryDown;
    }

    public void setSalaryDown(String salaryDown) {
        this.salaryDown = salaryDown;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getHrMobile() {
        return hrMobile;
    }

    public void setHrMobile(String hrMobile) {
        this.hrMobile = hrMobile;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
