package com.atguigu.exercise.homework6;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/4/2023 6:32 PM
 */
public class Message implements Serializable {
    private String Sender;
    private String Accepter;
    private String content;
    private LocalTime time;

    public Message() {
    }

    public Message(String sender, String accepter, String content, LocalTime time) {
        Sender = sender;
        Accepter = accepter;
        this.content = content;
        this.time = time;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getAccepter() {
        return Accepter;
    }

    public void setAccepter(String accepter) {
        Accepter = accepter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Sender='" + Sender + '\'' +
                ", Accepter='" + Accepter + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
