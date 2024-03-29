package com.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableConfigurationProperties
@ConfigurationProperties
public class NameServiceConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(NameServiceConfiguration.class);
    }
}
