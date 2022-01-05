package com.springmvc.mymvc1.config;

import com.springmvc.mymvc1.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
