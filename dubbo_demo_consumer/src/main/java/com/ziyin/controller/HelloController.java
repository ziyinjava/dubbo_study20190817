package com.ziyin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ziyin.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ziyin
 @create 2019-07-2019/7/7-15:59
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Reference
    private HelloService helloService;


    @RequestMapping("/sayHello")
    @ResponseBody()
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

}
