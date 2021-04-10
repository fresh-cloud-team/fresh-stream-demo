package com.fresh.stream.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class StreamSender {

    @Autowired
    private Source source;

    @GetMapping("/")
    public String sendSucceed() {
        Date date = new Date();
        source.message().send(MessageBuilder.withPayload("Hello World..." + date)
                .setHeader("routingKey", "login.user.succeed")
                .setHeader("version", "1.0")

                .build());
        return "OK " + date;
    }

    @GetMapping("/v2")
    public String sendHeader() {
        Date date = new Date();
        source.message().send(MessageBuilder.withPayload("Hello World..." + date)
                .setHeader("routingKey", "login.user.succeed")
                .setHeader("version", "2.0")
                .setHeader("x-delay", 5000)
                .build());
        return "OK " + date;
    }

    @GetMapping("/failed")
    public String sendFailed() {
        Date date = new Date();
        source.message().send(MessageBuilder.withPayload("Hello World..." + date)
                .setHeader("routingKey", "login.user.failed")
                .build());
        return "OK " + date;
    }
}
