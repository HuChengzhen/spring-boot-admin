package com.example.springbootadmin2;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdmin2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdmin2Application.class, args);
    }

}
