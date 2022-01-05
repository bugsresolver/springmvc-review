package com.springmvc.mymvc1.controller;

import com.springmvc.mymvc1.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {
    @Autowired
    MyBean myBean;
    @GetMapping("/getmybean")
    @ResponseBody
    public String getMyBean(){
        return myBean.toString();
    }
}
