/**
 * projectName: springbase fileName: LoginController.java packageName:
 * com.demo.controller.logincontroller date: 2020-10-22 copyright(c) 2017-2020 xxx公司
 */
package com.demo.controller.filtercontroller;

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
public class LoginControllerFilter {

    @GetMapping(path = "/filterlogin")
    public void doLogin() {
        System.out.println("进入filterloginlogin页面");
    }

    @GetMapping(path = "/filteradmin")
    public void doAdmin() {
        System.out.println("进入filteradminadmin页面");
    }
}
