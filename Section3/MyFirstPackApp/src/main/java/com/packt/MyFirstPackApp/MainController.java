package com.packt.MyFirstPackApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/packt")
    @ResponseBody
    String returnAppName() {
        return "This is my first Packt app";
    }
}
