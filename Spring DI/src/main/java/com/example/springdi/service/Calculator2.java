package com.example.springdi.service;

import com.example.springdi.exception.CalculatorException;
import org.springframework.stereotype.Service;

@Service
public class Calculator2 implements ICalculator{
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subs(double a, double b) {
        return a-b;
    }

    @Override
    public double mult(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {

        if(b==0){
            throw new CalculatorException("Divisor can not be \"0\"");
        }

        return a/b;
    }
}
