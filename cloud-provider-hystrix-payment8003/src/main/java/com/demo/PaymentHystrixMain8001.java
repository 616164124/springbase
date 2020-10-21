/**
 * projectName: cloud2020- fileName: PaymentHystrixMain8001.java packageName: com.demo date:
 * 2020-09-22 copyright(c) 2017-2020 xxx公司
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @version: V1.0
 * @author: mikael
 * @className: PaymentHystrixMain8001
 * @packageName: com.demo
 * @description: PaymentHystrixMain8001 启动类
 * @data: 2020-09-22
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}
