package com.example.springdi;

import com.example.springdi.exception.CalculatorException;
import com.example.springdi.service.ICalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    @Qualifier("createCalculator")
    private ICalculator calculator;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("Add: " + calculator.add(-4.1,-3.2));
        System.out.println("Sub :" + calculator.subs(-4.1,-3.2));
        System.out.println("Mult :" + calculator.mult(4.1,-3.2));
        try{
            System.out.println("Div :" + calculator.div(4.1,0));
        }
        catch (CalculatorException exc){
            System.out.println(exc.getMessage());
        }



    }
}
