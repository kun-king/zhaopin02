package com.zhaopin.service.Imp;

import com.zhaopin.bean.ChatList;
import com.zhaopin.mapper.ChatListMapper;
import com.zhaopin.service.ChatListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ChatListService")
public class ChatListServiceImp implements ChatListService {

    @Autowired
    ChatListMapper chatListMapper;

    @Override
    public List<ChatList> selectChatList(long chatId, String hrId, String userId) {
        ChatList chatList = new ChatList();
        chatList.setChatId(chatId);
        chatList.setHrId(hrId);
        chatList.setUserId(userId);
        List<ChatList> chatLists = chatListMapper.selectChatList(chatList);
        return chatLists;
    }

    @Override
    public int insertChatList(long chatId, String hrId, String userId, long isOnline, long unread, long status) {
        ChatList chatList = new ChatList();
        chatList.setChatId(chatId);
        chatList.setHrId(hrId);
        chatList.setUserId(userId);
        chatList.setIsOnline(isOnline);
        chatList.setUnread(unread);
        chatList.setStatus(status);
        int chatLists = chatListMapper.insertChatList(chatList);
        return chatLists;
    }

    @Override
    public int deleteChatList(long chatListId) {
        ChatList chatList = new ChatList();
        chatList.setChatListId(chatListId);
        int chatLists = chatListMapper.deleteChatList(chatList);
        return chatLists;
    }

    @Override
    public int updateChatList(long chatListId, long isOnline, long unread, long status) {
        ChatList chatList = new ChatList();
        chatList.setChatListId(chatListId);
        chatList.setIsOnline(isOnline);
        chatList.setUnread(unread);
        chatList.setStatus(status);
        int chatLists = chatListMapper.updateChatList(chatList);
        return chatLists;
    }
}
