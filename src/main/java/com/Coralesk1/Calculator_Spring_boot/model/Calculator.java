package com.Coralesk1.Calculator_Spring_boot.model;


public class Calculator {
    public Double sum(Double num1, Double num2){
        return num1 + num2;
    }
    public Double sub(Double num1, Double num2){
        return num1 - num2;
    }
    public Double mult(Double num1, Double num2){
        return num1 * num2;
    }
    public Double div(Double num1, Double num2){
        return num1 / num2;
    }
    public Double mean(Double num1, Double num2){
        return (num1 + num2) / 2;
    }
    public Double square(Double num1, Double num2){
        return Math.pow(num1, num2);
    }
}
