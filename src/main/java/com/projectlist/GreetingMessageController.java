package com.projectlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingMessageController {

    @GetMapping("/")
    public String index(){
        return "If you see this, there was no error";
    }
}
