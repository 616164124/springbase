/**
 * projectName: cloud2020-   
 * fileName: OrderHystrixMain80.java  
 * packageName: demo   
 * date: 2020-09-22
 * copyright(c) 2017-2020 xxx公司  
 */
package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: OrderHystrixMain80
 * @packageName: demo
 * @description: OrderHystrixMain80 启动类
 * @data: 2020-09-22
 **/

@SpringBootApplication
@EnableHystrix
@EnableFeignClients
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
