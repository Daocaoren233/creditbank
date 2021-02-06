package com.bank.credit.controller;

import com.bank.credit.dataobject.studentInfo;
import com.bank.credit.form.StudentForm;
import com.bank.credit.service.studentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

@RestController
@ResponseBody
@RequestMapping("/student/login")
public class StudentLoginController {
    @Autowired
    private studentInfoService studentInfoService;

    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("student/login/home");
    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("student/login/login");
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid StudentForm form, BindingResult bindingResult, Map<String,Object> map){
        if (bindingResult.hasErrors()){
            // 返回错误页面
            map.put("url", "/creditbank/student/login/login");
            return new ModelAndView("common/error", map);
        }
//        System.out.println("/////////////////here///////////////////////////////////////////////////");
//        System.out.println(form.getStudentId());
//        System.out.println(form.getPassWord());

//        map.put("url", "/creditbank/student/login/home");
//        return new ModelAndView("common/success", map);
//        studentInfo StudentInfo = studentInfoService.findOne(form.getStudentId());

//        if (StudentInfo.getPassWord().equals(form.getPassWord())){
//            map.put("url", "/creditbank/student/login/home");
//        }
//        else {
//            map.put("url", "/creditbank/student/login/login");
//        }
        map.put("url", "/creditbank/student/login/home");
        return new ModelAndView("common/success", map);


    }


}
