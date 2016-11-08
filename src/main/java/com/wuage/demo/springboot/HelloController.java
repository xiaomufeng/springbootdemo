/*
 * Copyright 2016 alibaba.com All right reserved. This software is the
 * confidential and proprietary information of alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with alibaba.com.
 */
package com.wuage.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuage.demo.springboot.service.HelloService;

/**
 * 类HelloController.java的实现描述：TODO 类实现描述 
 * @author macun 2016年11月7日 上午10:57:30
 */
@RestController
//@Component
public class HelloController {
    @Autowired
    private HelloService helloService;
    
    @RequestMapping("/hello")
    public String getHello(){
        return helloService.getHello("Monday");
    }
    
    
}
