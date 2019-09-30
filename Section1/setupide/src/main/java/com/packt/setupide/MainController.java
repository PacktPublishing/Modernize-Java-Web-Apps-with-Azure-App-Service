package com.packt.setupide;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/packt")
    @ResponseBody
    public String testMethod() {
        return "THIS IS MY FIRST JAVA APP";
    }
}
