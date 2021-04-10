package com.fresh;


import com.fresh.stream.rocket.Sink;
import com.fresh.stream.rocket.Source;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


@EnableBinding(value = {Source.class, Sink.class})
@SpringBootApplication
public class RocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketApplication.class, args);
    }
}

