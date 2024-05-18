package it.pierpaolo.chatdemo.controller;

import it.pierpaolo.chatdemo.dto.MessageDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/message")
    public MessageDto message(MessageDto message) {
        return message;
    }
}
