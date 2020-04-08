package com.zqq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName CrudtestApplication
 * @Author zqq
 * @Date 2020/4/7 8:07
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zqq.mapper")
public class CrudtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudtestApplication.class, args);
    }

}
