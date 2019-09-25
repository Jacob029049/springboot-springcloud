package com.spring.boot.baseproject;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.spring.boot.baseproject")
public class BaseprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseprojectApplication.class, args);
    }

}
