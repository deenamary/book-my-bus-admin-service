package com.example.bookmybusadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookMyBusAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMyBusAdminServiceApplication.class, args);
    }

}
