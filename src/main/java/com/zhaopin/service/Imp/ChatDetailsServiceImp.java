package com.zhaopin.service.Imp;

import com.zhaopin.bean.ChatDetails;
import com.zhaopin.mapper.ChatDetailsMapper;
import com.zhaopin.service.ChatDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service("ChatDetailsService")
public class ChatDetailsServiceImp implements ChatDetailsService {

    @Autowired
    ChatDetailsMapper chatDetailsMapper;

    @Override
    public List<ChatDetails> selectChatDetails(long chatId, String userId, Timestamp times) {
        ChatDetails chatDetails = new ChatDetails();
        chatDetails.setChatId(chatId);
        chatDetails.setUserId(userId);
        chatDetails.setTimes(times);
        List<ChatDetails> chatDetailsList = chatDetailsMapper.selectChatDetails(chatDetails);
        return chatDetailsList;
    }

    @Override
    public int insertChatDetails(long chatId, String userId, String content, Timestamp times, String type, long isLatest) {
        ChatDetails chatDetails = new ChatDetails();
        chatDetails.setChatId(chatId);
        chatDetails.setUserId(userId);
        chatDetails.setContent(content);
        chatDetails.setTimes(times);
        chatDetails.setType(type);
        chatDetails.setIsLatest(isLatest);
        int chatdetailss = chatDetailsMapper.insertChatDetails(chatDetails);
        return chatdetailss;
    }

    @Override
    public int deleteChatDetails(long chatId, String content) {
        ChatDetails chatDetails = new ChatDetails();
        chatDetails.setChatId(chatId);
        chatDetails.setContent(content);
        int chatdetailss = chatDetailsMapper.deleteChatDetails(chatDetails);
        return chatdetailss;
    }

    @Override
    public int updateChatDetails(long chatDetailsId, String content, Timestamp times, String type, long isLatest) {
        ChatDetails chatDetails = new ChatDetails();
        chatDetails.setChatDetailsId(chatDetailsId);
        chatDetails.setContent(content);
        chatDetails.setTimes(times);
        chatDetails.setType(type);
        chatDetails.setIsLatest(isLatest);
        int chatdetailss = chatDetailsMapper.updateChatDetails(chatDetails);
        return chatdetailss;
    }

}
