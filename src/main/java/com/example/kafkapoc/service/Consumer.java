package com.example.kafkapoc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kafkaPocTopic", groupId = "kafkaPocGroup")
    public void listenToTopic(String receivedMessage) {
        System.out.println("Message received: " + receivedMessage);
    }
}
