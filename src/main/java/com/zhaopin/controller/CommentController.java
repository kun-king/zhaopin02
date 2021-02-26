package com.zhaopin.controller;

import com.alibaba.fastjson.JSON;
import com.zhaopin.bean.Comment;
import com.zhaopin.myResult.UserBoxMyResult;
import com.zhaopin.service.CommentService;
import com.zhaopin.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*评论接口*/
@RestController
@RequestMapping("Comment")
@CrossOrigin(allowCredentials = "true")
public class CommentController {

    @Autowired
    CommentService commentService;

    /*查询评论数据返回给前端渲染*/
    @GetMapping("select")
    public UserBoxMyResult selectComment(@RequestParam(value = "commentId",defaultValue = "0") long commentId,
                                         @RequestParam(value = "userId",defaultValue = "") String userId,
                                         @RequestParam(value = "positionId",defaultValue = "0") long positionId,
                                         @RequestParam(value = "companyId",defaultValue = "0") long companyId){
        Comment comment = new Comment();
        UserBoxMyResult userBoxMyResult = new UserBoxMyResult();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        comment.setPositionId(positionId);
        comment.setCompanyId(companyId);
        List<Comment> commentList = commentService.selectComment(comment);
        if (commentList.size() !=0){
            userBoxMyResult.setList(commentList);
            userBoxMyResult.setBooleans(true);
        }else{
            userBoxMyResult.setList(commentList);
            userBoxMyResult.setBooleans(false);
        }
        return userBoxMyResult;
    }

    /*写评论接口，新建评论*/
    @GetMapping("inset")
    @ResponseBody
    public boolean insetComment(HttpServletRequest request){
        CommentVo commentVo = JSON.parseObject(request.getParameter("Comment"), CommentVo.class);
        int commens = commentService.insetComment(commentVo);
        if (commens > 0){
            return true;
        }else{
            return false;
        }
    }

    /*删除评论，只有user可以删除自己写下的评论*/
    @GetMapping("delete")
    public boolean deleteComment(@RequestParam(value = "commentId") long commentId,
                                 @RequestParam(value = "userId") String userId){
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        int comments = commentService.deleteComment(comment);
        if (comments > 0){
            return true;
        }else{
            return false;
        }
    }


}
