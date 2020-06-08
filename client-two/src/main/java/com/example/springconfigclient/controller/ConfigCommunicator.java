package com.example.springconfigclient.controller;

import com.example.springconfigclient.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigCommunicator {

    @Autowired
    private Configuration config;

    @RequestMapping("/server/url")
    String getURL() {
        return this.config.getName() + " : " + this.config.getEnv();
    }
}
