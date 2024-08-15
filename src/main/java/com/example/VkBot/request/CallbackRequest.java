package com.example.VkBot.request;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackRequest {
    @JsonProperty("group_id")
    private long groupId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("event_id")
    private String eventId;

    @JsonProperty("v")
    private String version;

    @JsonProperty("object")
    private MessageObject object;

    // Getters and Setters
    public long getGroupId() {
        return groupId;
    }

    public String getType() {
        return type;
    }

    public MessageObject getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "СallbackRequest{" +
                "groupId=" + groupId +
                ", type='" + type + '\'' +
                ", eventId='" + eventId + '\'' +
                ", version='" + version + '\'' +
                ", object=" + object +
                '}';
    }
}

