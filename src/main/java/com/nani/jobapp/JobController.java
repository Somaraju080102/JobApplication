package com.nani.jobapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @GetMapping("/")
    public String home() {
        System.out.println("Home called");
        return "index";
    }

    @GetMapping("/viewalljobs")
    public String jobs() {
        System.out.println("viewalljobs called");
        return "viewalljobs";
    }
    @GetMapping("/addjob")
    public String addjob() {
        System.out.println("addjob called");
        return "addjob";
    }
    @PostMapping("/handleForm")
    public String handleform(JobPost jobPost) {
        System.out.println("handleform called");
        return "sucess";
    }


}
