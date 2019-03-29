package com.ylrqh.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
@RequestMapping("/")
public class HomeController{

    @RequestMapping("home")
    public String  demoTest(ModelMap modelMap){
        modelMap.addAttribute("name", "qian");
        return "demo";
    }

}

