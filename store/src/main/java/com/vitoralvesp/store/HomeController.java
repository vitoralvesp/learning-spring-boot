package com.vitoralvesp.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName; // appName = store

    @RequestMapping("/")
    public String index() { return "index.html"; }


}
