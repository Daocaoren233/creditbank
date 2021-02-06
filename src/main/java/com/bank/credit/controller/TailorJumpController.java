package com.bank.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 尾部跳转
 * */

@Controller
@RequestMapping("/student/tailor")
public class TailorJumpController {

    @GetMapping("/jump")
    public ModelAndView tailorjump(@RequestParam("filename") String filename, Map<String,Object> map){

        String url = "/creditbank/student/tailor/"+filename;
        map.put("url", url);
        return new ModelAndView("common/success",map);
    }

    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("student/login/home");
    }

    @GetMapping("/bank")
    public ModelAndView bank(){
        return new ModelAndView("student/bank/bank");
    }

    @GetMapping("/mine")
    public ModelAndView mine(){
        return new ModelAndView("student/mine/mine");
    }

    @GetMapping("/recorde")
    public ModelAndView recorde(){
        return new ModelAndView("student/record/recorde");
    }

    @GetMapping("/course")
    public ModelAndView course(){
        return new ModelAndView("student/course/course");
    }

    @GetMapping("/accum")
    public ModelAndView accum(){
        return new ModelAndView("student/bank/accum");
    }

    @GetMapping("/authen")
    public ModelAndView authen(){
        return new ModelAndView("student/bank/authen");
    }

    @GetMapping("/loan")
    public ModelAndView loan(){
        return new ModelAndView("student/bank/loan");
    }

    @GetMapping("/switche")
    public ModelAndView switche(){
        return new ModelAndView("student/bank/switch");
    }

    @GetMapping("/Matlab")
    public ModelAndView Matlab(){
        return new ModelAndView("student/course/Matlab");
    }
}
