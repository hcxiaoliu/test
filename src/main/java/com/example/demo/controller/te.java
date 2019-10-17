package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: lx
 * Date: 2019/10/8 17:34
 * Content:
 */
@Controller
public class te {

    @RequestMapping("/test")
    public  String te(){
        return "index";
    }
}
