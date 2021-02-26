package com.zhaopin.service;

import com.zhaopin.bean.ChatDetails;

import java.util.List;

public interface ChatDetailsService {

    /*查询*/
    List<ChatDetails> selectChatDetails(long chatId,String userId,java.sql.Timestamp times);

    /*增加*/
    int insertChatDetails(long chatId,String userId,String content,java.sql.Timestamp times,String type,long isLatest);

    /*删除*/
    int deleteChatDetails(long chatId,String content);

    /*修改*/
    int updateChatDetails(long chatDetailsId,String content,java.sql.Timestamp times,String type,long isLatest);

}
