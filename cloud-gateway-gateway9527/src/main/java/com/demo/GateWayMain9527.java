/**
 * projectName: cloud2020- fileName: GateWayMain9527.java packageName: com.demo date: 2020-09-22
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version: V1.0
 * @author: mikael
 * @className: GateWayMain9527
 * @packageName: com.demo
 * @description: GateWayMain9527 启动类
 * @data: 2020-09-22
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}
