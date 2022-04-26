package com.tanxy.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tanxy.dubboapi.DemoApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName DemoService.java
 * @Description TODO
 * @createTime 2022年03月28日 09:29:00
 */
@Service
public class DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    @Reference  //dubbo 注解
    private DemoApi demoApi;

    public String sayHello(String name) {
        logger.info("【消费者】【服务层】---请求参数 name ：{}", name);
        return demoApi.sayHello(name);
    }
}
