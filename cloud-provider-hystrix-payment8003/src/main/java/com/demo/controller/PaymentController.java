/**
 * projectName: cloud2020-   
 * fileName: PaymentController.java  
 * packageName: com.demo.controller   
 * date: 2020-09-22
 * copyright(c) 2017-2020 xxx公司  
 */
package com.demo.controller;

import com.demo.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: PaymentController
 * @packageName: com.demo.controller
 * @description: PaymentController类
 * @data: 2020-09-22
 **/
@RestController
public class PaymentController {
    private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:"+result + "*********"+serverPort);
        return result;
    }
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result +"*********"+serverPort);
        return result;
    }

}
