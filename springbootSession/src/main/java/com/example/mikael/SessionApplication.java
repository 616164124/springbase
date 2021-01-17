/**
 * projectName: cloud2020 fileName: SessionApplication.java packageName: com.example.mikael date:
 * 2020-10-24 copyright(c) 2017-2020 xxx公司
 */
package com.example.mikael;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @version: V1.0
 * @author: mikael
 * @className: SessionApplication
 * @packageName: com.example.mikael
 * @description:
 * @data: 2020-10-24
 */
@SpringBootApplication
public class SessionApplication {
  public static void main(String[] args) {
    SpringApplication.run(SessionApplication.class, args);
  }
}
