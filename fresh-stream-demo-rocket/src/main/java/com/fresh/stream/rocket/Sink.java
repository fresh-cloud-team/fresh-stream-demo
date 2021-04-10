package com.fresh.stream.rocket;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {
    String INPUT = "myInput";

    @Input(INPUT)
    SubscribableChannel sub1();
}
