package com.tanxy.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * springboot整合dubbo的三种方式
 * 1.导入依赖；
 *      导入dubbo-starter，在application.properties配置属性，使用@Service【暴露服务】 @Reference【】
 *      导入dubbo其他依赖
 * 2。保留dubbo xml配置文件
 *         导入dubbo-starter
 *        使用注解@ImportResource(locations="classpath:provider.xml")导入配置文件
 *  3。使用注解API的方式 @EnableDubbo(scanBasePackages = "com.tanxy.dubbo")
 */
@SpringBootApplication
//@EnableDubbo//启用dubbo
@EnableDubbo(scanBasePackages = "com.tanxy.dubbo")
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
