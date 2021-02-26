package com.zhaopin.service;

import com.zhaopin.bean.Comment;
import com.zhaopin.vo.CommentVo;

import java.util.List;

public interface CommentService {

    //查询评论
    List<Comment> selectComment(Comment comment);

    //增加评论
    int insetComment(CommentVo commentVo);

    //删除评论
    int deleteComment(Comment comment);

}
