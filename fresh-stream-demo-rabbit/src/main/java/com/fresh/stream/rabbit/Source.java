package com.fresh.stream.rabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface Source {
    String OUTPUT = "myOutput";
    String OUTPUT_STEP_2 = "output-step-2";

    @Output(OUTPUT)
    MessageChannel message();

    @Output(OUTPUT_STEP_2)
    MessageChannel message2();

}
