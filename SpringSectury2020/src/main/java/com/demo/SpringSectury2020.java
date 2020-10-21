/**
 * projectName: cloud2020- fileName: SpringSectury2020.java packageName: com.demo date: 2020-09-23
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version: V1.0
 * @author: mikael
 * @className: SpringSectury2020
 * @packageName: com.demo
 * @description: SpringSectury2020启动类
 * @data: 2020-09-23
 */
@ServletComponentScan("com.demo.config") // filter 必须扫描
@SpringBootApplication
public class SpringSectury2020 {
  public static void main(String[] args) {
    SpringApplication.run(SpringSectury2020.class, args);
  }
}
