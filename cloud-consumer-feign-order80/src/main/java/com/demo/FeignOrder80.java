/**
 * projectName: cloud2020- fileName: FeignOrder80.java packageName: com.demo date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version: V1.0
 * @author: mikael
 * @className: FeignOrder80
 * @packageName: com.demo
 * @description: feignOrder80启动类
 * @data: 2020-09-20
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class FeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrder80.class, args);
    }
}
