package com.sudalover;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan(value = "com.sudalover")
public class BootStrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BootStrap.class).run(args);
    }
}
