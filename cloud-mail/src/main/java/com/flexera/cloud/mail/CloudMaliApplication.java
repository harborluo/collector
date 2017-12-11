package com.flexera.cloud.mail;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by harbor on 12/7/2017.
 */
@EnableEurekaClient
//@SpringBootApplication
@SpringCloudApplication
@EnableSwagger2
@ComponentScan({"com.flexera.cloud.mail.controller"})
public class CloudMaliApplication {
    public static void main(String[] args){
        SpringApplication.run(CloudMaliApplication.class, args);
    }
}
