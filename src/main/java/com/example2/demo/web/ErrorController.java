
package com.example2.demo.web;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/erro")
    public String ErrorController(Model m) throws Exception {
        if(true){
            throw new Exception("some exception");
        }
        return "hello";
    }
}
