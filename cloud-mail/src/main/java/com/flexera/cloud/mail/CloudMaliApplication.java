package com.flexera.cloud.mail;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by harbor on 12/7/2017.
 */
@SpringBootApplication
public class CloudMaliApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(CloudMaliApplication.class)
                .web(true)
                .run(args);
    }
}
