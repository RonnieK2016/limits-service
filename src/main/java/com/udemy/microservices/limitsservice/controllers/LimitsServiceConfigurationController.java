package com.udemy.microservices.limitsservice.controllers;

import com.udemy.microservices.limitsservice.config.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsServiceConfigurationController {

    @GetMapping("/limits")
    public LimitsConfiguration getLimitsFromConfiguration() {
        return new LimitsConfiguration(1, 1000);
    }
}
