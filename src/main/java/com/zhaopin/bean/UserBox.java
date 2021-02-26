package com.zhaopin.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserBox {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long boxId;
  private String title;
  private long salaryUp;
  private long salaryDown;
  private String workCity;//工作城市
  private String hrMobile;//hr的电话
  private String userMobile;//user的电话
  private String hrEmail;//hr的邮箱
  private String userEmail;//user的邮箱
  private String hrId;//hr外键
  private String userId;//user外键
  private String status;//投件状态


  public long getBoxId() {
    return boxId;
  }

  public void setBoxId(long boxId) {
    this.boxId = boxId;
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
