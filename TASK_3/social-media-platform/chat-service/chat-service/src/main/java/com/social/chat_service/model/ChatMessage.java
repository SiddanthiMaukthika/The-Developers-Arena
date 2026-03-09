package com.social.chat_service.model;
import lombok.Data;

@Data
public class ChatMessage {
    private String sender;
    private String content;
}
