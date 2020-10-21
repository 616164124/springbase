/**
 * projectName: cloud2020- fileName: ApplicationContextConfig.java packageName: com.demo.config
 * date: 2020-09-20 copyright(c) 2017-2020 xxx公司
 */
package com.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: ApplicationContextConfig
 * @packageName: com.demo.config
 * @description: config配置类
 * @data: 2020-09-20
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
