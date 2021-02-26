package com.zhaopin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HrPositionVo {

    @JsonProperty(value = "positionId")
    private String positionId;
    @JsonProperty(value = "title")
    private String title;//职位
    @JsonProperty(value = "education")
    private String education;//学历要求
    @JsonProperty(value = "experience")
    private String experience;//经验要求
    @JsonProperty(value = "welfare")
    private String welfare;//福利待遇
    @JsonProperty(value = "positionDescription")
    private String positionDescription;//职位描述
    @JsonProperty(value = "quantity")
    private String quantity;//招聘人数
    @JsonProperty(value = "workCity")
    private String workCity;//工作城市
    @JsonProperty(value = "workAddress")
    private String workAddress;//工作地址
    @JsonProperty(value = "workTime")
    private String workTime;//工作周期
    @JsonProperty(value = "salaryUp")
    private String salaryUp;//最高工资
    @JsonProperty(value = "salaryDown")
    private String salaryDown;//最低工资
    @JsonProperty(value = "salaryAverage")
    private String salaryAverage;//平均工资
    @JsonProperty(value = "releaseDate")
    private String releaseDate;//发布时间
    @JsonProperty(value = "validDate")
    private String validDate;//截止时间
    @JsonProperty(value = "Label")
    private String Label;//标签
    @JsonProperty(value = "Keyword")
    private String Keyword;//关键字
    @JsonProperty(value = "positionType")
    private String positionType;//招聘类型
    @JsonProperty(value = "companyId")
    private String companyId;//company外键
    @JsonProperty(value = "companyName")
    private String companyName;//公司名称
    @JsonProperty(value = "companyType")
    private String companyType;//公司类型
    @JsonProperty(value = "companyDescription")
    private String companyDescription;//公司简介
    @JsonProperty(value = "hrId")
    private String hrId;//hr外键
    @JsonProperty(value = "hrMobile")
    private String hrMobile;//hr的手机号
    @JsonProperty(value = "hrEmail")
    private String hrEmail;//hr的邮箱
    @JsonProperty(value = "categoryId")
    private String categoryId;//category外键


    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
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

    public String getSalaryAverage() {
        return salaryAverage;
    }

    public void setSalaryAverage(String salaryAverage) {
        this.salaryAverage = salaryAverage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public String getHrMobile() {
        return hrMobile;
    }

    public void setHrMobile(String hrMobile) {
        this.hrMobile = hrMobile;
    }

    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
