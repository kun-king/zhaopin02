package com.zhaopin.service.Imp;

import com.zhaopin.bean.Chat;
import com.zhaopin.mapper.ChatMapper;
import com.zhaopin.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ChatService")
public class ChatServiceImp implements ChatService {

    @Autowired
    ChatMapper chatMapper;

    @Override
    public List<Chat> selectChat(String userId, String hrId) {
        Chat chat = new Chat();
        chat.setUserId(userId);
        chat.setHrId(hrId);
        List<Chat> chatList = chatMapper.selectChat(chat);
        return chatList;
    }

    @Override
    public int insertChat(String userId, String hrId) {
        Chat chat = new Chat();
        chat.setUserId(userId);
        chat.setHrId(hrId);
        int chats = chatMapper.insertChat(chat);
        return chats;
    }

    @Override
    public int deleteChat(long chatId) {
        Chat chat = new Chat();
        chat.setChatId(chatId);
        int chats = chatMapper.deleteChat(chat);
        return chats;
    }

    @Override
    public int updateChat(long chatId, String userId, String hrId) {
        Chat chat = new Chat();
        chat.setChatId(chatId);
        chat.setUserId(userId);
        chat.setHrId(hrId);
        int chats = chatMapper.updateChat(chat);
        return chats;
    }
}
