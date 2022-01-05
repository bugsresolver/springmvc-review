package com.springmvc.mymvc1.controller;

import com.springmvc.mymvc1.bean.MyBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;

@Controller
public class PageController {

    @RequestMapping("/mysubmit")
    @ResponseBody
    public String myPage1(MyBean myBean,@RequestParam(required = true) String id,@RequestBody String body, Model model){
        ModelAndView mv = new ModelAndView();
        System.out.println(body);
        System.out.println(id);
        System.out.println(myBean);
        System.out.println("get");
        return "mysuccess";
    }

    @PutMapping("/mysubmit/{id}")
    @ResponseBody
    public String myPage2(@PathVariable("id") Integer id, MyBean myBean){
        System.out.println(id);
        System.out.println("put");
        System.out.println(myBean);
        return "mysuccess";
    }
    @GetMapping("/test1")
    public String test1(){
        return "forward:/test2";
    }
    @GetMapping("/test2")
    @ResponseBody
    public String test2(){
        return "forward+success";
    }
}
