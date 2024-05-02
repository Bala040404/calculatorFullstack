package com.calculator.demo.controller;

import com.calculator.demo.pojo.Operands;
import com.calculator.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @CrossOrigin
    @PostMapping("/add")
    public int add(@RequestBody Operands operands){
        return calculatorService.add(operands.getA(),operands.getB());
    }
    @CrossOrigin
    @PostMapping("/sub")
    public int sub(@RequestBody Operands operands){
        return calculatorService.sub(operands.getA(),operands.getB());
    }

    @CrossOrigin
    @PostMapping("/mul")
    public int mul(@RequestBody Operands operands){
        return calculatorService.mul(operands.getA(),operands.getB());
    }

    @CrossOrigin
    @PostMapping("/div")
    public int div(@RequestBody Operands operands){
        return calculatorService.div(operands.getA(),operands.getB());
    }
}
