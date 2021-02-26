package com.zhaopin.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ChatDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  private long chatDetailsId;
  private long chatId;
  private String userId;
  private String content;
  private java.sql.Timestamp times;
  private String type;
  private long isLatest;


  public long getChatDetailsId() {
    return chatDetailsId;
  }

  public void setChatDetailsId(long chatDetailsId) {
    this.chatDetailsId = chatDetailsId;
  }


  public long getChatId() {
    return chatId;
  }

  public void setChatId(long chatId) {
    this.chatId = chatId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getTimes() {
    return times;
  }

  public void setTimes(java.sql.Timestamp times) {
    this.times = times;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public long getIsLatest() {
    return isLatest;
  }

  public void setIsLatest(long isLatest) {
    this.isLatest = isLatest;
  }

}
