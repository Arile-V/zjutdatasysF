package org.example.zjutdatasys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class ZjutdatasysApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZjutdatasysApplication.class, args);
    }

}
