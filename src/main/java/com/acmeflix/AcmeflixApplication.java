package com.acmeflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class AcmeflixApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcmeflixApplication.class, args);
    }
}
