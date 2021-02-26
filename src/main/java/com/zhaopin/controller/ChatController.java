package com.zhaopin.controller;

import com.zhaopin.bean.Chat;
import com.zhaopin.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "Chat")
public class ChatController {

    @Autowired
    ChatService chatService;

    /*查询*/
    @GetMapping("select")
    public List<Chat> selectChat(@RequestParam(value = "userId",defaultValue = "") String userId,
                                 @RequestParam(value = "hrId",defaultValue = "") String hrId){
        List<Chat> chatList = chatService.selectChat(userId, hrId);
        return chatList;
    }

    /*增加*/
    @GetMapping("insert")
    public boolean insertChat(@RequestParam String userId,@RequestParam String hrId){
        int chats = chatService.insertChat(userId, hrId);
        if (chats > 0){
            return true;
        }else{
            return false;
        }
    }

    /*删除*/
    @GetMapping("delete")
    public boolean deleteChat(@RequestParam long chatId){
        int chats = chatService.deleteChat(chatId);
        if (chats > 0){
            return true;
        }else{
            return false;
        }
    }

    /*修改*/
    @GetMapping("update")
    public boolean updateChat(@RequestParam long chatId,@RequestParam String userId,@RequestParam String hrId){
        int chats = chatService.updateChat(chatId, userId, hrId);
        if (chats > 0){
            return true;
        }else{
            return false;
        }
    }

}
