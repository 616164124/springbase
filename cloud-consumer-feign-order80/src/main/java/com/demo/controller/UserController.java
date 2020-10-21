/**
 * projectName: cloud2020- fileName: userController.java packageName: com.demo.controller date:
 * 2020-09-21 copyright(c) 2017-2020 xxx公司
 */
package com.demo.controller;

import com.demo.dao.Result;
import com.demo.dao.User;
import com.demo.service.Getuser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @author: mikael
 * @className: userController
 * @packageName: com.demo.controller
 * @description: user控制类
 * @data: 2020-09-21
 */
@RestController
public class UserController {

    @Resource
    private Getuser getuser;

    @GetMapping("/order80/newUser")
    public Result<User> creatUser(@RequestParam("id") String id) {
        // RestTemplate restTemplate = new RestTemplate();
        System.out.println("进入");
        User user = new User();
        user.setName("小新");
        user.setId(1);
        user.setAge(5);
        Result user1 = getuser.getUser2(id);
        return user1;
    }

    @GetMapping("/order80/timeout")
    public Result<User> creatUser2(@RequestParam("id") String id) {
        // RestTemplate restTemplate = new RestTemplate();
        System.out.println("进入");
        User user = new User();
        user.setName("小新");
        user.setId(1);
        user.setAge(5);
        Result user1 = getuser.getUser3(id);
        return user1;
    }
}
