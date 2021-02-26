package com.zhaopin.service;

import com.zhaopin.bean.Chat;

import java.util.List;

public interface ChatService {

    /*查询*/
    List<Chat> selectChat(String userId,String hrId);

    /*增加*/
    int insertChat(String userId,String hrId);

    /*删除*/
    int deleteChat(long chatId);

    /*修改*/
    int updateChat(long chatId,String userId,String hrId);

}
