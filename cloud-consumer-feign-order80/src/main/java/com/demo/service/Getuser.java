package com.demo.service;

import com.demo.dao.Result;
import com.demo.dao.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface Getuser {
    @GetMapping("/getUserId")
    public Result<User> getUser2(@RequestParam("id") String id);

    @GetMapping("/getUserId2")
    public Result getUser3(@RequestParam("id") String id) ;

}
