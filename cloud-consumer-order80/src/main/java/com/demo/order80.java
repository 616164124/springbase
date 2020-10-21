/**
 * projectName: cloud2020- fileName: order80.java packageName: com date: 2020-09-20 copyright(c)
 * 2017-2020 xxx公司
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @version: V1.0
 * @author: mikael
 * @className: order80
 * @packageName: com
 * @description: 80启动类
 * @data: 2020-09-20
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = com.rule.MyRule1.class)
public class order80 {
    public static void main(String[] args) {
        SpringApplication.run(order80.class, args);
    }
}
