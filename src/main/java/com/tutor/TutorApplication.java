package com.tutor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan("com.tutor.dao")
@SpringBootApplication
public class TutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorApplication.class, args);
    }

}
