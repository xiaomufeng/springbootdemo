/*
 * Copyright 2016 alibaba.com All right reserved. This software is the
 * confidential and proprietary information of alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with alibaba.com.
 */
package com.wuage.demo.springboot.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wuage.demo.springboot.service.HelloService;
import com.wuage.demo.springboot.service.HelloServiceImpl;

/**
 * 类ServiceBeanConfig.java的实现描述：TODO 类实现描述 
 * @author macun 2016年11月7日 上午10:38:22
 */
@Configuration
//@ComponentScan(basePackages = "com.wuage.demo")
public class ServiceBeanConfig {
    @Bean(name="helloService")
    public HelloService helloService(){
        return new HelloServiceImpl();
    }
}
