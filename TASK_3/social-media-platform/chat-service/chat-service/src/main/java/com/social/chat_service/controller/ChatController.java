package com.social.chat_service.controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.social.chat_service.model.ChatMessage;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {

        System.out.println("Message from: " + message.getSender());

        return message;
    }
}
