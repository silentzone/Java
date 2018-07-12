package com.example2.demo.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}




//import java.text.DateFormat;
//import java.util.Date;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class HelloController {
//
//    @RequestMapping("/hello")
//    public String hello(Model m) {
//        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
//        return "hello";
//    }
//}

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//
//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello Spring Boot!";
//    }
//
//}