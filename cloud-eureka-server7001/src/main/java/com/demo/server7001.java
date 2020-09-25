/**
 * projectName: cloud2020-   
 * fileName: server7001.java  
 * packageName: com.demo   
 * date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司  
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: server7001
 * @packageName: com.demo
 * @description: 启动类
 * @data: 2020-09-20
 **/
@SpringBootApplication
@EnableEurekaServer
public class server7001 {
    public static void main(String[] args) {
        SpringApplication.run(server7001.class,args);
    }
}

