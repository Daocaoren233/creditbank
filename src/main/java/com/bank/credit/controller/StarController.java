package com.bank.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StarController {

    @GetMapping("/start")
    public ModelAndView start(){
        return new ModelAndView("start/start");
    }

    @GetMapping("/start_switch")
    public ModelAndView start_switch(){
        return new ModelAndView("start/start_switch");
    }


}

