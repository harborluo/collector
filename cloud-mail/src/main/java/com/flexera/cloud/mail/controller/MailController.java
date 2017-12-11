package com.flexera.cloud.mail.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harbor on 12/8/2017.
 */
@RestController
@RequestMapping(value = "/mail")
public class MailController {

    @ApiOperation(value = "Send e-mail to specified address.", notes ="")
    @PostMapping(value = "send")
    public String send(){
        return "ok";
    }

}
