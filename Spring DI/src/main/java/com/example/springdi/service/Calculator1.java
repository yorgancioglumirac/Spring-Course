package com.example.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator1 implements ICalculator{
    @Override
    public double add(double a, double b) {
        return Math.abs(a+b);
    }

    @Override
    public double subs(double a, double b) {
        return Math.abs(a-b);
    }

    @Override
    public double mult(double a, double b) {
        return Math.abs(a*b);
    }

    @Override
    public double div(double a, double b) {

        if(b == 0){
            return 0;
        }

        return a/b;

    }
}
