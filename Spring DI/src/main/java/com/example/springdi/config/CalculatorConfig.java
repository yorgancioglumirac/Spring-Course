package com.example.springdi.config;

import com.example.springdi.service.Calculator1;
import com.example.springdi.service.Calculator2;
import com.example.springdi.service.ICalculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public ICalculator createCalculator(@Value("${calculator.type}") int calculatorType){

        if(calculatorType == 1){
            return new Calculator1();
        }
        else{
            return new Calculator2();
        }

    }

}
