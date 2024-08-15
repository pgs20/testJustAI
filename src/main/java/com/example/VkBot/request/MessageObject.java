package com.example.VkBot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageObject {
    @JsonProperty("message")
    private Message message;

    // Getters and Setters
    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageObject{" +
                "message=" + message +
                '}';
    }
}
