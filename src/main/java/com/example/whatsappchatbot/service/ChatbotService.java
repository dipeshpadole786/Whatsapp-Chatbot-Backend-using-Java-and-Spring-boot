package com.example.whatsappchatbot.service;

import com.example.whatsappchatbot.dto.ChatbotResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ChatbotService {

    private static final Logger logger = LoggerFactory.getLogger(ChatbotService.class);

    public ChatbotResponse getReply(String message) {
        logger.info("Incoming message: {}", message);

        String normalized = message == null ? "" : message.trim().toLowerCase();
 
        String reply;
        if (normalized.isEmpty()) {
            reply = "Sorry, I didn't understand that.";
        } else {
            switch (normalized) {
                case "hi":
                    reply = "Hello ";
                    break;
                case "bye":
                    reply = "Goodbye ";
                    break;
                default:
                    reply = "Sorry, I didn't understand that.";
                    break;
            }
        }

        ChatbotResponse response = new ChatbotResponse(reply, LocalDateTime.now());
        logger.info("Outgoing response: {}", response.getReply());
        return response;
    }
}
