package com.test.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
    "com.test.web", "com.uplight.service", "com.uplight.aspect"
})
@SpringBootApplication
public class ApplicationStarter {
    public static void main( String[] args ) {
        System.out.println( "Starting spring boot application" );
        SpringApplication.run( ApplicationStarter.class, args );
    }

}

