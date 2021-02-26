package com.zhaopin.bean;


import javax.persistence.Id;

public class Hr {

  @Id
  private String hrId;
  private String mobile;
  private String password;
  private String hrName;
  private String email;
  private String description;
  private long companyId;


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

  public void setHRName(String hrName) {
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


  public long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

}
