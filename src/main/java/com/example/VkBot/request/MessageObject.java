package com.example.VkBot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

class MessageObject {
    @JsonProperty("message")
    private Message message;

    // Getters and Setters
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
