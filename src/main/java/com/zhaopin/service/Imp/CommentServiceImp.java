package com.zhaopin.service.Imp;

import com.zhaopin.bean.Comment;
import com.zhaopin.mapper.CommentMapper;
import com.zhaopin.service.CommentService;
import com.zhaopin.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service("CommentService")
public class CommentServiceImp implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> selectComment(Comment comment) {
        List<Comment> commentList = commentMapper.selectComment(comment);
        return commentList;
    }

    @Override
    public int insetComment(CommentVo commentVo) {
        Comment comment = new Comment();
        comment.setReviewdetail(commentVo.getReviewdetail());
        Timestamp commentTime = new Timestamp(System.currentTimeMillis());//获取当前时间挫
        comment.setCommentTime(commentTime);
        comment.setNickname(commentVo.getNickname());
        comment.setUserId(commentVo.getUserId());
        comment.setHrId(commentVo.getHrId());
        comment.setPositionId(Long.parseLong(commentVo.getPositionId()));
        comment.setCompanyId(Long.parseLong(commentVo.getCommentId()));
        int comments = commentMapper.insetComment(comment);
        return comments;
    }

    @Override
    public int deleteComment(Comment comment) {
        int comments = commentMapper.deleteComment(comment);
        return comments;
    }
}
