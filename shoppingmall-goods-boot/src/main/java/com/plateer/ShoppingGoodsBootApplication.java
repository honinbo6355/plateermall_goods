package com.plateer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class ShoppingGoodsBootApplication {

    @Autowired
    public static void main(String[] args) {
    	
        SpringApplication.run(ShoppingGoodsBootApplication.class, args);
    }
}
