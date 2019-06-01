package com.udemy.microservices.limitsservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitsConfiguration {
    private int minimum;
    private int maximum;
}
