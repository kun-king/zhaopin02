package com.zhaopin.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserFavorites {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long favoritesId;
  private String title;
  private long salaryUp;
  private long salaryDown;
  private String workCity;
  private String userId;
  private String positionId;

  public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public long getFavoritesId() {
    return favoritesId;
  }

  public void setFavoritesId(long favoritesId) {
    this.favoritesId = favoritesId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getSalaryUp() {
    return salaryUp;
  }

  public void setSalaryUp(long salaryUp) {
    this.salaryUp = salaryUp;
  }


  public long getSalaryDown() {
    return salaryDown;
  }

  public void setSalaryDown(long salaryDown) {
    this.salaryDown = salaryDown;
  }


  public String getWorkCity() {
    return workCity;
  }

  public void setWorkCity(String workCity) {
    this.workCity = workCity;
  }

}
