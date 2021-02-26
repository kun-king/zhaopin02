package com.zhaopin.mapper;

import com.zhaopin.bean.ChatDetails;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ChatDetailsMapper extends Mapper<ChatDetails> {

    /*查询*/
    List<ChatDetails> selectChatDetails(ChatDetails chatDetails);

    /*增加*/
    int insertChatDetails(ChatDetails chatDetails);

    /*删除*/
    int deleteChatDetails(ChatDetails chatDetails);

    /*修改*/
    int updateChatDetails(ChatDetails chatDetails);

}
