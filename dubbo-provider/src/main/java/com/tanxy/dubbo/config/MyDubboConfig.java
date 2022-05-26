package com.tanxy.dubbo.config;

import com.alibaba.dubbo.config.*;
import com.tanxy.dubboapi.DemoApi;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanxy
 * @date 2022年05月26日 3:18 下午
 */
@Configurable
public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-springboot-provider");
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setId("zookeeper-registry");
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
    @Bean
    public ServiceConfig<DemoApi> demoApiServiceConfig(DemoApi demoApi){
        ServiceConfig<DemoApi> demoApiServiceConfig = new ServiceConfig<DemoApi>();
        demoApiServiceConfig.setInterface(DemoApi.class);
        demoApiServiceConfig.setRef(demoApi);
//        demoApiServiceConfig.setVersion("1.0.0");
        //配置method信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("sayHello");
        methodConfig.setTimeout(1000);
        //将method的设置配置到service配置中
        List<MethodConfig> methodConfigs = new ArrayList<>();
        methodConfigs.add(methodConfig);
        demoApiServiceConfig.setMethods(methodConfigs);

        return demoApiServiceConfig;
    }

}
