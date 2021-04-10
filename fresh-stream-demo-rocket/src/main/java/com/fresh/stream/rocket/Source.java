package com.fresh.stream.rocket;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface Source {
    String OUTPUT = "myOutput";

    @Output(OUTPUT)
    MessageChannel message();


}
