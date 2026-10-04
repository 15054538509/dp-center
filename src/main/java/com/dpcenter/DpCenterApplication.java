package com.dpcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.dpcenter.mapper")
@SpringBootApplication
@EnableScheduling
public class DpCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DpCenterApplication.class, args);
    }

}
