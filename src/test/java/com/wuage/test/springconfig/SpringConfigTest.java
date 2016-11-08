/*
 * Copyright 2016 alibaba.com All right reserved. This software is the
 * confidential and proprietary information of alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with alibaba.com.
 */
package com.wuage.test.springconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wuage.demo.springboot.javaconfig.ServiceBeanConfig;
import com.wuage.demo.springboot.service.HelloService;

/**
 * 类SpringConfigTest.java的实现描述：TODO 类实现描述
 * 
 * @author macun 2016年11月7日 下午2:13:18
 */
public class SpringConfigTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceBeanConfig.class);

        HelloService helloService = (HelloService) context.getBean("helloService");

        System.out.println(helloService.getHello("xiaoming"));

    }
}
