package com.plateer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ShoppingGoodsBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShoppingGoodsBootApplication.class, args);
        log.error("hello");
    }
}
