package com.han.LoginDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;

@SpringBootApplication
@EnableScheduling
public class LoginDemo {
    public static void main(String[] args) {
        SpringApplication.run(LoginDemo.class, args);
    }

}
