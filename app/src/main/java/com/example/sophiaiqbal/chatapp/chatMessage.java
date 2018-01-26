package com.example.sophiaiqbal.chatapp;

import java.util.Date;

/**
 * Created by Sophia Iqbal on 1/26/2018.
 */

public class chatMessage {

    private String messageText;
    private String messageUser;
    private long messageTime;

    public chatMessage(String messageText, String messageUser)
    {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.messageTime = new Date().getTime();
    }

    public chatMessage()
    {

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
