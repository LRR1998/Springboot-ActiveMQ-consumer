package com.yaspeed.demo7162;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Demo7162Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo7162Application.class, args);
    }

}
