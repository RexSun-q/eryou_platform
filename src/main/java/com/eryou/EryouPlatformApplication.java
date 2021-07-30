package com.eryou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.eryou.mapper")
public class EryouPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(EryouPlatformApplication.class, args);
    }

}
