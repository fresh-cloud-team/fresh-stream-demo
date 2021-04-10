package com.fresh.stream.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface Source {
    String OUTPUT = "myOutput";

    @Output(OUTPUT)
    MessageChannel message();


}
