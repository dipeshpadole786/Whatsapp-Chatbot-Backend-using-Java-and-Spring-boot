package com.example.whatsappchatbot.dto;

import java.time.LocalDateTime;

public class ChatbotResponse {

    private String reply;
    private LocalDateTime timestamp;

    public ChatbotResponse() {
    }

    public ChatbotResponse(String reply, LocalDateTime timestamp) {
        this.reply = reply;
        this.timestamp = timestamp;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
