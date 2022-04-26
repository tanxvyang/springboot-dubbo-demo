package com.tanxy.dubbo.consumer.controller;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.tanxy.dubbo.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName DemoController.java
 * @Description 消费者 控制层
 * @createTime 2022年03月28日 09:36:00
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);


    @Autowired
    private DemoService demoService;

    /**
     * 打开浏览器，输入/demo/sayHello
     *
     * @return
     */

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        logger.info("【消费者】【控制层】---请求入口");
        return demoService.sayHello("Jessy");


    }
}
