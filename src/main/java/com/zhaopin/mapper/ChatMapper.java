package com.zhaopin.mapper;

import com.zhaopin.bean.Chat;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ChatMapper extends Mapper<Chat> {

    /*查询*/
    List<Chat> selectChat(Chat chat);

    /*增加*/
    int insertChat(Chat chat);

    /*删除*/
    int deleteChat(Chat chat);

    /*修改*/
    int updateChat(Chat chat);

}
