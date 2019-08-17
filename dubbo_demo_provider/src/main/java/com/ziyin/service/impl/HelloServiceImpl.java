package com.ziyin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ziyin.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ziyin
 @create 2019-07-2019/7/7-15:08
 */
@Service(interfaceClass = HelloService.class,protocol = "dubbo") //发布服务必须使用Dubbo提供的Service注解
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String str) {
        return "你好 " + str;
    }
}
