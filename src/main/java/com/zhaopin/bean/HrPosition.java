package com.zhaopin.bean;


import com.zhaopin.vo.HrPositionVo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class HrPosition {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long positionId;
  private String title;//职位
  private String education;//学历要求
  private String experience;//经验要求
  private String welfare;//福利待遇
  private String positionDescription;//职位描述
  private long quantity;//招聘人数
  private String workCity;//工作城市
  private String workAddress;//工作地址
  private String workTime;//工作周期
  private long salaryUp;//最高工资
  private long salaryDown;//最低工资
  private long salaryAverage;//平均工资
  private java.sql.Date releaseDate;//发布时间
  private java.sql.Date validDate;//截止时间
  private String Label;//标签
  private String Keyword;//关键字
  private String positionType;//招聘类型
  private long companyId;//company外键
  private String companyName;//公司名称
  private String companyType;
  private String companyDescription;//公司简介
  private String hrId;//hr外键
  private String hrMobile;//hr的手机号
  private String hrEmail;//hr的邮箱
  private long categoryId;//category外键


  public long getPositionId() {
    return positionId;
  }

  public void setPositionId(long positionId) {
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


  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
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


  public long getSalaryAverage() {
    return salaryAverage;
  }

  public void setSalaryAverage(long salaryAverage) {
    this.salaryAverage = salaryAverage;
  }


  public java.sql.Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(java.sql.Date releaseDate) {
    this.releaseDate = releaseDate;
  }


  public java.sql.Date getValidDate() {
    return validDate;
  }

  public void setValidDate(java.sql.Date validDate) {
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


  public long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(long companyId) {
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

  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

}
