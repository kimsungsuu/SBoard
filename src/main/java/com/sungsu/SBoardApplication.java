package com.sungsu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mapper 경로를 찾지 못해서 BasePackages 선언
@SpringBootApplication
@MapperScan(basePackages = {"com.sungsu.mapper"})
public class SBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SBoardApplication.class, args);
    }

}
