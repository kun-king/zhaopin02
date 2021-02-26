package com.zhaopin.bean;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

public class UserIntroduction {

  @Id
  @JsonProperty(value = "introductionId")
  private String introductionId;

  @JsonProperty(value = "ability")
  private String ability;

  @JsonProperty(value = "internship")
  private String internship;

  @JsonProperty(value = "workExperience")
  private String workExperience;

  @JsonProperty(value = "certificate")
  private String certificate;

  @JsonProperty(value = "jobDesire")
  private String jobDesire;

  @JsonProperty(value = "userId")
  private String userId;


  public String getIntroductionId() {
    return introductionId;
  }

  public void setIntroductionId(String introductionId) {
    this.introductionId = introductionId;
  }


  public String getAbility() {
    return ability;
  }

  public void setAbility(String ability) {
    this.ability = ability;
  }


  public String getInternship() {
    return internship;
  }

  public void setInternship(String internship) {
    this.internship = internship;
  }


  public String getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(String workExperience) {
    this.workExperience = workExperience;
  }


  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public String getJobDesire() {
    return jobDesire;
  }

  public void setJobDesire(String jobDesire) {
    this.jobDesire = jobDesire;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

}
