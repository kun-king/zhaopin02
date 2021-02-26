package com.zhaopin.service;

import com.zhaopin.bean.ChatList;

import java.util.List;

public interface ChatListService {

    /*查询*/
    List<ChatList> selectChatList(long chatId,String hrId,String userId);

    /*增加*/
    int insertChatList(long chatId,String hrId,String userId,long isOnline,long unread,long status);

    /*删除*/
    int deleteChatList(long chatListId);

    /*修改*/
    int updateChatList(long chatListId,long isOnline,long unread,long status);

}
