package com.flexera.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by harbor on 11/30/2017.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaServerApplication.class)
                .web(true)
                .run(args);
    }
}
