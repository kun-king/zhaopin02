package com.zhaopin.controller;

import com.zhaopin.bean.ChatList;
import com.zhaopin.service.ChatListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "ChatList")
public class ChatListController {

    @Autowired
    ChatListService chatListService;

    /*查询*/
    @PostMapping("select")
    public List<ChatList> selectChatList(@RequestParam(value = "chatId",defaultValue = "0") String chatId,
                                         @RequestParam(value = "hrId",defaultValue = "") String hrId,
                                         @RequestParam(value = "userId",defaultValue = "") String userId){
        int chatIds = Integer.parseInt(chatId);
        List<ChatList> chatListList = chatListService.selectChatList(chatIds, hrId, userId);
        return chatListList;
    }

    /*增加*/
    @PostMapping("insert")
    public boolean insertChatList(@RequestParam String chatId,@RequestParam String hrId,@RequestParam String userId,
                                  @RequestParam String isOnline,@RequestParam String unread,@RequestParam String status){
        int chatIds = Integer.parseInt(chatId);
        int isOnlines = Integer.parseInt(isOnline);
        int unreads = Integer.parseInt(unread);
        int statuses = Integer.parseInt(status);
        int chatLists = chatListService.insertChatList(chatIds, hrId, userId, isOnlines, unreads, statuses);
        if (chatLists > 0){
            return true;
        }else {
            return false;
        }
    }

    /*删除*/
    @PostMapping("delete")
    public boolean deleteChatList(@RequestParam String chatListId){
        int chatListIds = Integer.parseInt(chatListId);
        int chatLists = chatListService.deleteChatList(chatListIds);
        if (chatLists > 0){
            return true;
        }else {
            return false;
        }
    }

    /*修改*/
    @PostMapping("update")
    public boolean updateChatList(String chatListId,String isOnline,String unread,String status){
        int chatListIds = Integer.parseInt(chatListId);
        int isOnlines = Integer.parseInt(isOnline);
        int unreads = Integer.parseInt(unread);
        int statuses = Integer.parseInt(status);
        int chatLists = chatListService.updateChatList(chatListIds, isOnlines, unreads, statuses);
        if (chatLists > 0){
            return true;
        }else {
            return false;
        }
    }

}
