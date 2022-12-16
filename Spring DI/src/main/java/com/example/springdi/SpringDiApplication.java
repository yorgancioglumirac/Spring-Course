package com.example.springdi;

import com.example.springdi.service.ICalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDiApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);
    }
}
