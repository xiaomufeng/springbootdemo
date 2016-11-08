/*
 * Copyright 2016 alibaba.com All right reserved. This software is the
 * confidential and proprietary information of alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with alibaba.com.
 */
package com.wuage.demo.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 类ApplicationTest.java的实现描述：TODO 类实现描述 
 * @author macun 2016年11月4日 上午9:48:04
 */
//@Configuration
//@RestController
//@EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication
public class ApplicationTest {
    @RequestMapping("/springboot")
    String index() {
        return "www.yoodb.com";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Object[]{ApplicationTest.class,HelloController.class}, args);
    }
}
