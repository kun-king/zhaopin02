package com.zhaopin.controller;


import com.zhaopin.bean.ChatDetails;
import com.zhaopin.service.ChatDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "ChatDetails")
public class ChatDetailsController {

    @Autowired
    ChatDetailsService chatDetailsService;

    /*查询*/
    @PostMapping("select")
    public List<ChatDetails> selectChatDetails(@RequestParam(value = "chatId",defaultValue = "0") long chatId,
                                               @RequestParam(value = "userId",defaultValue = "") String userId,
                                               @RequestParam(value = "times",defaultValue = "") java.sql.Timestamp times){
        List<ChatDetails> chatDetailsList = chatDetailsService.selectChatDetails(chatId, userId, times);
        return chatDetailsList;
    }

    /*增加*/
    @PostMapping("insert")
    public boolean insertChatDetails(@RequestParam long chatId,@RequestParam String userId,@RequestParam String content,
                                     @RequestParam java.sql.Timestamp times,@RequestParam String type,@RequestParam long isLatest){
        int chatDetailses = chatDetailsService.insertChatDetails(chatId, userId, content, times, type, isLatest);
        if (chatDetailses > 0){
            return true;
        }else{
            return false;
        }
    }

    /*删除*/
    @PostMapping("delete")
    public boolean deleteChatDetails(@RequestParam long chatId,@RequestParam String content){
        int chatDetailses = chatDetailsService.deleteChatDetails(chatId, content);
        if (chatDetailses > 0){
            return true;
        }else{
            return false;
        }
    }

    /*修改*/
    @PostMapping("update")
    public boolean updateChatDetails(long chatDetailsId,String content,java.sql.Timestamp times,String type,long isLatest){
        int chatDetailses = chatDetailsService.updateChatDetails(chatDetailsId, content, times, type, isLatest);
        if (chatDetailses > 0){
            return true;
        }else{
            return false;
        }
    }

    /*字符串型转换成java.sql.Date*//*
    public static java.sql.Date strToDate(String strDate) {
        String str = strDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }*/
}
