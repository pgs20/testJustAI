package com.example.VkBot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty("date")
    private long date;

    @JsonProperty("from_id")
    private long fromId;

    @JsonProperty("id")
    private int id;

    @JsonProperty("out")
    private int out;

    @JsonProperty("version")
    private String version;

    @JsonProperty("peer_id")
    private long peerId;

    @JsonProperty("text")
    private String text;

    public long getFromId() {
        return fromId;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + date +
                ", fromId=" + fromId +
                ", id=" + id +
                ", out=" + out +
                ", version='" + version + '\'' +
                ", peerId=" + peerId +
                ", text='" + text + '\'' +
                '}';
    }
}
