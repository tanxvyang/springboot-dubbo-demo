package com.tanxy.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tanxy.dubboapi.DemoApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName DemoApiImpl.java
 * @Description TODO
 * @createTime 2022年03月25日 17:51:00
 */
@Service
public class DemoApiImpl implements DemoApi {
    public static final Logger logger = LoggerFactory.getLogger(DemoApiImpl.class);
    @Override
    public String sayHello(String name) {
        logger.info("【提供者】【服务实现】---请求参数 name ：{}",name);
               return "hello"+ name +"(Springboot 整合 Dubbo --采用注解方式）";
    }
}
