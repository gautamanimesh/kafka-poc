package com.example.kafkapoc.controller;

import com.example.kafkapoc.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HomeController {

    @Autowired
    Producer producer;

    @GetMapping("/message")
    public void getMessageFromClient(@RequestParam("message") String message) {
        producer.sendMessageToTopic(message);
    }

}
