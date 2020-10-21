/**
 * projectName: cloud2020- fileName: OrderController.java packageName: com.demo.controller date:
 * 2020-09-20 copyright(c) 2017-2020 xxx公司
 */
package com.demo.controller;

import com.demo.dao.Result;
import com.demo.dao.User;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @author: mikael
 * @className: OrderController
 * @packageName: com.demo.controller
 * @description: ordercontroller
 * @data: 2020-09-20
 */
@RestController
public class OrderController {

    // 成功的
    // public final static String PAYMENT_URL = "http://localhost:8001";

    //  public final static String PAYMENT_URL = "http://cloud-payment-service";

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order80/newUser")
    public Result<User> creatUser() {
        // RestTemplate restTemplate = new RestTemplate();
        System.out.println("进入");
        User user = new User();
        user.setName("小新");
        user.setId(1);
        user.setAge(5);

        return restTemplate.postForObject(PAYMENT_URL + "/createUser3", user, Result.class);
    }
}
