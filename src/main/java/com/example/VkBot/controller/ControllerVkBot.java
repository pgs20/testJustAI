package com.example.VkBot.controller;

import com.example.VkBot.request.CallbackRequest;
import com.example.VkBot.request.Message;
import com.example.VkBot.request.MessageObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ControllerVkBot {
    private static final String VK_API_URL = "https://api.vk.com/method/messages.send";
    private final String ACCESS_TOKEN = "vk1.a.b3of54ykw8ZRhOHwnwD19ZZZ03pkTPXlAu3utGq7wP6ybCWnoMmmdRZXpt0ji6BSuCk-i2zf56LqCofm8F_cfLqBEaTkwy8MoIYGILxP5eps7bUK94wAnoI1cX5h2N_REG76Wo7MTK3Dr3iny8Oh_Tv36LVddh_xZRqqBZUPltuXiCQdvBPt8lY43woAGCA3uTY6ZyVYWG4nSX8yM3aL4g";
    private static final long GROUP_ID = 226952158;


    @PostMapping("/callback")
    public ResponseEntity authorizationServer(@RequestBody CallbackRequest request) {
        String type = request.getType();
        long groupId = request.getGroupId();
        if (type.equals("confirmation") && groupId == GROUP_ID) {
            return ResponseEntity.ok("b45ce1a1");
        } else if (type.equals("message_new")) {
            MessageObject messageObj = request.getObject();
            Message message = messageObj.getMessage();
            long userId = message.getFromId();
            String text = message.getText();

            sendMessage(userId, text);
        }
        return ResponseEntity.ok("ok");
    }

    private void sendMessage(long userId, String text) {
        RestTemplate restTemplate = new RestTemplate();
        long randomId = System.currentTimeMillis();
        String requestUrl = String.format("%s?user_id=%d&message=%s&access_token=%s&v=5.199&random_id=%d",
                VK_API_URL, userId, text, ACCESS_TOKEN, randomId);
        restTemplate.getForObject(requestUrl, String.class);
    }
}
