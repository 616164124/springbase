/**
 * projectName: springbase fileName: LoginController.java packageName:
 * com.demo.controller.logincontroller date: 2020-10-22 copyright(c) 2017-2020 xxx公司
 */
package com.example.mikael.controller;

import com.example.mikael.annotation.Pointcuts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: V1.0
 * @author: mikael
 * @className: LoginController
 * @packageName: com.demo.controller.logincontroller
 * @description:
 * @data: 2020-10-22
 */
@RestController
public class LoginController {

    @GetMapping(path = "/login")
    @Pointcuts
    public void doLogin() {
        System.out.println("进入login页面");
    }

    @GetMapping(path = "/admin")
    public void doAdmin() {
        System.out.println("进入admin页面");
    }
}
