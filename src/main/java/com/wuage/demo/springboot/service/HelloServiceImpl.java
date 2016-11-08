package com.wuage.demo.springboot.service;


/**
 * 类HelloServiceImpl.java的实现描述：TODO 类实现描述 
 * @author macun 2016年11月7日 上午9:44:33
 */

public class HelloServiceImpl implements HelloService {

    private static final String HELLO = "Hello";
    @Override
    public String getHello(String echo) {
        System.out.println(echo);
        return HELLO+" "+echo;
    }

}
