package com.Coralesk1.Calculator_Spring_boot.Controller;
import com.Coralesk1.Calculator_Spring_boot.Controller.Exception.ErrorException;
import com.Coralesk1.Calculator_Spring_boot.model.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MathController")
public class MathController {
    private final Calculator calculator = new Calculator();
    @RequestMapping("/sum/{num1}/{num2}")
    public Double sum(
            @PathVariable Double num1,
            @PathVariable Double num2){
        return calculator.sum(num1, num2);
    }

    @RequestMapping("/sub/{num1}/{num2}")
    public Double sub(
            @PathVariable Double num1,
            @PathVariable Double num2) {
        return calculator.sub(num1, num2);
    }

    @RequestMapping("/mult/{num1}/{num2}")
    public Double mult(
            @PathVariable Double num1,
            @PathVariable Double num2) {
        return calculator.mult(num1, num2);
    }

    @RequestMapping("/div/{num1}/{num2}")
    public Double div(
            @PathVariable Double num1,
            @PathVariable Double num2) {
        if (num2 == 0){
            throw new ErrorException("Não é possivel fazer divisões por 0");
        }
        return calculator.div(num1, num2);
    }
    @RequestMapping("/mean/{num1}/{num2}")
    public Double mean(
            @PathVariable Double num1,
            @PathVariable Double num2) {
        return calculator.mean(num1, num2);
    }
    @RequestMapping("/square/{num1}/{num2}")
    public Double Square(
            @PathVariable Double num1,
            @PathVariable Double num2) {
        return calculator.square(num1, num2);
    }

}
