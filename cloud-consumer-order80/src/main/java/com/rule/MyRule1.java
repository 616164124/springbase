/**
 * projectName: cloud2020-   
 * fileName: MyRule.java  
 * packageName: com.rule   
 * date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司  
 */
package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: MyRule
 * @packageName: com.rule
 * @description: ribbon负载均衡策略
 * @data: 2020-09-20
 **/
@Configuration
public class MyRule1 {

    @Bean
    public IRule myRule(){
        RandomRule randomRule = new RandomRule();  //随机
         //                     new RoundRobinRule()  轮询
        return randomRule ;
        //
    }
}
