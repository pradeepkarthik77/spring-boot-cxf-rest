package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@ImportResource(locations= {"classpath:context.xml"})
//@EnableAutoConfiguration(exclude= {ExampleServiceResource.class})
public class DemoApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
