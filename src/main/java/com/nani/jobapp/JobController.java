package com.nani.jobapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home called");
        return "index";
    }

    @RequestMapping("/viewalljobs")
    public String jobs() {
        System.out.println("viewalljobs called");
        return "viewalljobs";
    }
    @RequestMapping("/addjob")
    public String addjob() {
        System.out.println("addjob called");
        return "addjob";
    }
    @RequestMapping("/handleForm")
    public String handleform() {
        System.out.println("handleform called");
        return "sucess";
    }


}
