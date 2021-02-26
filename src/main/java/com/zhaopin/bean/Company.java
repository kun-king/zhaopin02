package com.zhaopin.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long companyId;
  private String companyName;
  private String companyAbbreviation;
  private String companyFullname;
  private String type;
  private String description;


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

  public String getCompanyAbbreviation() {
    return companyAbbreviation;
  }

  public void setCompanyAbbreviation(String companyAbbreviation) {
    this.companyAbbreviation = companyAbbreviation;
  }

  public String getCompanyFullname() {
    return companyFullname;
  }

  public void setCompanyFullname(String companyFullname) {
    this.companyFullname = companyFullname;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
