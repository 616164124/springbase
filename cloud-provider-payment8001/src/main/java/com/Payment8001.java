/**
 * projectName: cloud2020- fileName: Payment8001.java packageName: com date: 2020-09-20 copyright(c)
 * 2017-2020 xxx公司
 */
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: Payment8001
 * @packageName: com
 * @description: 8001启动类
 * @data: 2020-09-20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class, args);
    }
}
