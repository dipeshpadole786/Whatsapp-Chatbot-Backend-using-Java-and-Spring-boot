package com.example.whatsappchatbot.controller;

import com.example.whatsappchatbot.dto.ChatbotRequest;
import com.example.whatsappchatbot.dto.ChatbotResponse;
import com.example.whatsappchatbot.service.ChatbotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    private final ChatbotService chatbotService;

    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public ResponseEntity<ChatbotResponse> receiveMessage(@RequestBody ChatbotRequest request) {
        String message = request == null ? null : request.getMessage();
        logger.info("Incoming message: {}", message);

        ChatbotResponse response = chatbotService.getReply(message);
        logger.info("Outgoing response: {}", response.getReply());

        return ResponseEntity.ok(response);
    }
}
