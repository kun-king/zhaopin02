package com.zhaopin.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ChatList {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long chatListId;
  private long chatId;
  private String hrId;
  private String userId;
  private long isOnline;
  private long unread;
  private long status;


  public long getChatListId() {
    return chatListId;
  }

  public void setChatListId(long chatListId) {
    this.chatListId = chatListId;
  }


  public long getChatId() {
    return chatId;
  }

  public void setChatId(long chatId) {
    this.chatId = chatId;
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


  public long getIsOnline() {
    return isOnline;
  }

  public void setIsOnline(long isOnline) {
    this.isOnline = isOnline;
  }


  public long getUnread() {
    return unread;
  }

  public void setUnread(long unread) {
    this.unread = unread;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
