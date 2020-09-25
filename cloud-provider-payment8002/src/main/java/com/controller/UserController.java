/**
 * projectName: cloud2020-   
 * fileName: UserController.java  
 * packageName: com.contriller   
 * date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司  
 */
package com.controller;

import com.demo.dao.Result;
import com.demo.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: UserController
 * @packageName: com.contriller
 * @description: UserController控制类
 * @data: 2020-09-20
 **/
@RestController
public class UserController {


    @Value("${server.port}")
    private String port;



    //http://localhost:8001/getId/1
    @GetMapping("/getId/{id}")
    public Result getUser(@PathVariable String id) {
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMesge("成功 \t"+port );
        result.setData(id);
        System.out.println(id);
        return result;
    }

    // http://localhost:8001/getUserId?id="1"
    @GetMapping("/getUserId")
    public Result getUser2(@RequestParam String id) {
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMesge("成功"+port);
        result.setData(id);
        return result;
    }

    @PostMapping("/createUser3")
    public Result createUser3(@RequestBody User user){
        Result<Object> objectResult = new Result<>();
        objectResult.setData(user);
        objectResult.setMesge("成功\t  "+port);
        objectResult.setCode(200);
        return objectResult;
    }

    //定义超时5秒
    @GetMapping("/getUserId2")
    public Result getUser3(@RequestParam String id) {
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMesge("成功 \t" +port );
        result.setData(id);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }


}
