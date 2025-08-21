package com.Coralesk1.Calculator_Spring_boot.Controller;

import com.Coralesk1.Calculator_Spring_boot.Controller.Exception.ErrorException;
import com.Coralesk1.Calculator_Spring_boot.model.Calculator;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // permite qualquer origem
@RestController
@RequestMapping("/MathController")
public class MathController {
    private final Calculator calculator = new Calculator();

    // soma
    @RequestMapping("/sum")
    public Double sum(@RequestParam String num1, @RequestParam String num2){
        if (num1.isBlank() || num2.isBlank()){
            throw new NumberFormatException("Inputs cannot be empty");
        }
        try {
            Double n1 = Double.parseDouble(num1);
            Double n2 = Double.parseDouble(num2);
            return calculator.sum(n1, n2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only numbers");
        }
    }

    // subtração
    @RequestMapping("/sub")
    public Double sub(@RequestParam String num1, @RequestParam String num2){
        if (num1.isBlank() || num2.isBlank()){
            throw new NumberFormatException("Inputs cannot be empty");
        }
        try {
            Double n1 = Double.parseDouble(num1);
            Double n2 = Double.parseDouble(num2);
            return calculator.sub(n1, n2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only numbers");
        }
    }

    // multiplicação
    @RequestMapping("/mult")
    public Double mult(@RequestParam String num1, @RequestParam String num2){
        if (num1.isBlank() || num2.isBlank()){
            throw new NumberFormatException("Inputs cannot be empty");
        }
        try {
            Double n1 = Double.parseDouble(num1);
            Double n2 = Double.parseDouble(num2);
            return calculator.mult(n1, n2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only numbers");
        }
    }

    // divisão
    @RequestMapping("/div")
    public Double div(@RequestParam String num1, @RequestParam String num2){
        if (num1.isBlank() || num2.isBlank()){
            throw new NumberFormatException("Inputs cannot be empty");
        }
        try {
            Double n1 = Double.parseDouble(num1);
            Double n2 = Double.parseDouble(num2);
            if (n2 == 0){
                throw new ErrorException("Não é possivel fazer divisões por 0");
            }
            return calculator.div(n1, n2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only numbers");
        }
    }

    // média
    @RequestMapping("/mean")
    public Double mean(@RequestParam String num1, @RequestParam String num2){
        if (num1.isBlank() || num2.isBlank()){
            throw new NumberFormatException("Inputs cannot be empty");
        }
        try {
            Double n1 = Double.parseDouble(num1);
            Double n2 = Double.parseDouble(num2);
            return calculator.mean(n1, n2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only numbers");
        }
    }

    // raiz quadrada
    @RequestMapping("/square")
    public Double square(@RequestParam String num1, @RequestParam String num2){
        if (num1.isBlank() || num2.isBlank()){
            throw new NumberFormatException("Inputs cannot be empty");
        }
        try {
            Double n1 = Double.parseDouble(num1);
            Double n2 = Double.parseDouble(num2);
            return calculator.square(n1, n2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Only numbers");
        }
    }
}
