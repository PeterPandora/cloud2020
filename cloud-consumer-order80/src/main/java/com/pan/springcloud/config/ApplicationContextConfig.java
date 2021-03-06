package com.pan.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 潘聪
 * @description
 * @date 2021/2/27 16:31
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //使用此注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
