package com.example2.demo.web;

import com.example2.demo.service.SetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

@Controller
public class SetController {

    @RequestMapping("/set")
    public String compute(Model m) throws Exception {
        SetService set = new SetService();
        HashSet s =  set.BuildSet();
        s.add("1");
        s.add("ab");
        s.add("4c");
        System.out.printf("size : %d\n", s.size());
        System.out.printf(s.toString());
        return "setPage";
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