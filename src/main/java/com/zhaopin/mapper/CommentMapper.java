package com.zhaopin.mapper;

import com.zhaopin.bean.Comment;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CommentMapper extends Mapper<Comment> {

    //查询评论
    List<Comment> selectComment(Comment comment);

    //增加评论
    int insetComment(Comment comment);

    //删除评论
    int deleteComment(Comment comment);

}
