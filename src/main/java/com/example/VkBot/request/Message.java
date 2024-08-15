package com.example.VkBot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

class Message {
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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getFromId() {
        return fromId;
    }

    public void setFromId(long fromId) {
        this.fromId = fromId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getPeerId() {
        return peerId;
    }

    public void setPeerId(long peerId) {
        this.peerId = peerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
