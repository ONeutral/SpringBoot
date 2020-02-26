package com.ONeutral.springbootemail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ONeutral.springbootemail.dao")
public class SpringbootemailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootemailApplication.class, args);
    }

}

