package com.flexera.cloud.mail;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Created by harbor on 12/7/2017.
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudMaliApplication {
    public static void main(String[] args){
        SpringApplication.run(CloudMaliApplication.class, args);
    }
}
