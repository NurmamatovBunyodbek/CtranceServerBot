package org.example;

import lombok.*;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/27/2024 *Time:8:43 PM
 */
@Data
public class User2 {
    private String name;
    private String chatId;
    private String text;

    public User2(String name, String chatId, String text) {
        this.name = name;
        this.chatId = chatId;
        this.text = text;
    }

    public User2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
