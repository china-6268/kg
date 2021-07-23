package com.liuzengyu.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Index
@ComponentScan(basePackages = {
        "com.liuzengyu.examples.biz.config",
        "com.liuzengyu.examples.biz.config.impl",
        "com.liuzengyu.examples.es.service",
        "com.liuzengyu.examples.es.service.impl"})
public class CqwjsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CqwjsApplication.class, args);
    }

    @Value("${es.indexName}")
    private String indexName;
    @Value("${server.port}")
    private int port;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("es.indexName is " + indexName);
        System.out.println("Environment port is " + port);
    }
}
