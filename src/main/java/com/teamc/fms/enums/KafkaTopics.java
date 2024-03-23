package com.teamc.fms.enums;

public enum KafkaTopics {
    EMAIL("email");

    private final String name;

    KafkaTopics(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
