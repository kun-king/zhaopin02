package com.zhaopin.mapper;

import com.zhaopin.bean.ChatList;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ChatListMapper extends Mapper<ChatList> {

    /*查询*/
    List<ChatList> selectChatList(ChatList chatList);

    /*增加*/
    int insertChatList(ChatList chatList);

    /*删除*/
    int deleteChatList(ChatList chatList);

    /*修改*/
    int updateChatList(ChatList chatList);

}
