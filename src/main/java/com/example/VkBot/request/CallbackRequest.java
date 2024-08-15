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

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MessageObject getObject() {
        return object;
    }

    public void setObject(MessageObject object) {
        this.object = object;
    }
}

