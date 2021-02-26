package com.zhaopin.vo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserFavoritesVo {

    @JsonProperty(value = "favoritesId")
    private String favoritesId;

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "salaryUp")
    private String salaryUp;

    @JsonProperty(value = "salaryDown")
    private String salaryDown;

    @JsonProperty(value = "workCity")
    private String workCity;

    @JsonProperty(value = "userId")
    private String userId;

    @JsonProperty(value = "positionId")
    private String positionId;

    public String getFavoritesId() {
        return favoritesId;
    }

    public void setFavoritesId(String favoritesId) {
        this.favoritesId = favoritesId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
}
