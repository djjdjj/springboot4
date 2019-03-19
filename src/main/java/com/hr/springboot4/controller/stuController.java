package com.hr.springboot4.controller;

import com.hr.springboot4.entity.student;
import com.hr.springboot4.service.imp.stuServiceImpl;
import com.hr.springboot4.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/stu")
public class stuController {

    @Autowired
    private studentService studentService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv=new ModelAndView("/list");
        mv.addObject("stu",studentService.findAll());
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(Integer id){
        studentService.delete(id);
        ModelAndView mv=new ModelAndView("/list");
        return mv;
    }
}