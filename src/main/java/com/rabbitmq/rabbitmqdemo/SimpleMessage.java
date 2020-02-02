package com.rabbitmq.rabbitmqdemo;

import java.io.Serializable;

public class SimpleMessage implements Serializable {
    private String Name;
    private String Description;

    public SimpleMessage() {
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
