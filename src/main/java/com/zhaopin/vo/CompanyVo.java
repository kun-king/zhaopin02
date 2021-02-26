package com.zhaopin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyVo {

    @JsonProperty(value = "positionId")
    private String companyId;
    @JsonProperty(value = "positionId")
    private String companyName;
    @JsonProperty(value = "positionId")
    private String companyAbbreviation;
    @JsonProperty(value = "positionId")
    private String companyFullname;
    @JsonProperty(value = "positionId")
    private String type;
    @JsonProperty(value = "positionId")
    private String description;

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
