package com.zhaopin.bean;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

public class User {

  @Id
  @JsonProperty(value = "userId")
  private String userId;//主键Id

  @JsonProperty(value = "mobile")
  private String mobile;//联系方式

  @JsonProperty(value = "password")
  private String password;//密码

  @JsonProperty(value = "userName")
  private String userName;//姓名

  @JsonProperty(value = "gender")
  private String gender;//性别

  @JsonProperty(value = "birth")
  private String birth;//出生年月日

  @JsonProperty(value = "nickname")
  private String nickname;//昵称

  @JsonProperty(value = "email")
  private String email;//邮箱

  @JsonProperty(value = "province")
  private String province;//省份

  @JsonProperty(value = "city")
  private String city;//城市

  @JsonProperty(value = "eduDegree")
  private String eduDegree;//学历

  @JsonProperty(value = "graduation")
  private String graduation;//毕业学校

  @JsonProperty(value = "graYear")
  private String graYear;//毕业时间

  @JsonProperty(value = "major")
  private String major;//专业

  @JsonProperty(value = "dirDesire")
  private String dirDesire;//方向选择


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getEduDegree() {
    return eduDegree;
  }

  public void setEduDegree(String eduDegree) {
    this.eduDegree = eduDegree;
  }


  public String getGraduation() {
    return graduation;
  }

  public void setGraduation(String graduation) {
    this.graduation = graduation;
  }


  public String getGraYear() {
    return graYear;
  }

  public void setGraYear(String graYear) {
    this.graYear = graYear;
  }


  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }


  public String getDirDesire() {
    return dirDesire;
  }

  public void setDirDesire(String dirDesire) {
    this.dirDesire = dirDesire;
  }

}
