package com.udemy.microservices.limitsservice.controllers;

import com.udemy.microservices.limitsservice.config.FileBasedLimitsConfiguration;
import com.udemy.microservices.limitsservice.config.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsServiceConfigurationController {

    private FileBasedLimitsConfiguration configuration;

    public LimitsServiceConfigurationController(FileBasedLimitsConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitsConfiguration getLimitsFromConfiguration() {
        return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
