/**
 * projectName: cloud2020-   
 * fileName: DiscoveryClinet.java  
 * packageName: com.controller   
 * date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司  
 */
package com.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: DiscoveryClinet
 * @packageName: com.controller
 * @description: 服务发现
 * @data: 2020-09-20
 **/
@RestController
public class DiscoveryClinet {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public List<String> discoveryClient(){
        List<String> services = discoveryClient.getServices();
        //获取实例 及实例中的具体信息
        /*List<ServiceInstance> instances = discoveryClient.getInstances();
        for (ServiceInstance instance : instances) {
            instance.getHost();
        }
*/
        return services;
    }

}
