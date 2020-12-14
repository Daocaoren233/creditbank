package com.bank.credit.controller;

import com.bank.credit.dataobject.studentInfo;
import com.bank.credit.form.StudentForm;
import com.bank.credit.service.studentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/student/login")
public class StudentLoginController {
    @Autowired
    private studentInfoService studentInfoService;

    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("common/demo");
    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("student/login/login");
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid StudentForm form, BindingResult bindingResult, Map<String,Object> map){
        if (bindingResult.hasErrors()){
            // 返回错误页面
            map.put("msg", bindingResult.getFieldError().getDefaultMessage());
            map.put("url", "/creditbank/student/login/login");
            return new ModelAndView("common/error", map);
        }
        System.out.println("----------------------------------");
        System.out.println(form.getStudentId());
        System.out.println(form.getPassWord());
        studentInfo studentInfo = studentInfoService.findOne(form.getStudentId());
        if (form.getStudentId()==null){

            map.put("msg", "欢迎"+studentInfo.getStudentName()+"回来！");
            map.put("url", "/creditbank/student/login/home");
            return new ModelAndView("common/success", map);
//            String code = KeyUtil.code();

        }
        else {
            map.put("msg", "学号密码错误!");
            map.put("url", "/creditbank/student/login/login");
            return new ModelAndView("common/error", map);
        }


    }


}
