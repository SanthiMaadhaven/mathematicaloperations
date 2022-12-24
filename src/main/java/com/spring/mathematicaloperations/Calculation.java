package com.spring.mathematicaloperations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Calculation {
    int result =0 ;
    @GetMapping("/Calculate/{operator}/{first}/{second}")
    public int Calculate(@PathVariable String operator, @PathVariable int first, @PathVariable int second)
    {
        if (operator.contentEquals("+"))
            result = first + second;
        else if (operator.contentEquals("-"))
            result = first - second;
        else if (operator.contentEquals("*"))
            result = first * second;
        return result;
    }
}
