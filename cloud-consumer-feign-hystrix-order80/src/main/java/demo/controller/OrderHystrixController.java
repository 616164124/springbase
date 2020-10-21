/**
 * projectName: cloud2020- fileName: OrderHystrixController.java packageName: demo.controller date:
 * 2020-09-22 copyright(c) 2017-2020 xxx公司
 */
package demo.controller;

import demo.service.PaymentHystrixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @author: mikael
 * @className: OrderHystrixController
 * @packageName: demo.controller
 * @description: OrderHystrixController类
 * @data: 2020-09-22
 */
@RestController
public class OrderHystrixController {
    private static final Logger log = LoggerFactory.getLogger(OrderHystrixController.class);

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        log.info("*******result:" + result);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("*******result:" + result);
        return result;
    }
}
