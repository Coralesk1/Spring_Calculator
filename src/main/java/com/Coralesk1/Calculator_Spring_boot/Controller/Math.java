package com.Coralesk1.Calculator_Spring_boot.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Math")
public class Math {
    @RequestMapping("/sum/{num1}/{num2}")
    public Double sum(
                    @PathVariable Double num1,
                    @PathVariable Double num2){
        return num1 + num2;
    }

}
