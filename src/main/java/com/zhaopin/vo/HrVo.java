package com.zhaopin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HrVo {

    @JsonProperty(value = "hrId")
    private String hrId;
    @JsonProperty(value = "mobile")
    private String mobile;
    @JsonProperty(value = "password")
    private String password;
    @JsonProperty(value = "hrName")
    private String hrName;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "companyId")
    private String companyId;

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
