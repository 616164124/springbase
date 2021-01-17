/**
 * projectName: cloud2020 fileName: AspectTest.java packageName: com.example.mikael.aspect date:
 * 2020-10-22 copyright(c) 2017-2020 xxx公司
 */
package com.example.mikael.aspect;

import com.example.mikael.annotation.Pointcuts;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @version: V1.0
 * @author: mikael
 * @className: AspectTest
 * @packageName: com.example.mikael.aspect
 * @description:
 * @data: 2020-10-22
 */
@Aspect
@Component
public class AspectTest {
  private static final Logger logger = LoggerFactory.getLogger(AspectTest.class);

  @Autowired
  private HttpServletRequest request;

  // excution()  表达式
  @Pointcut("@annotation(com.example.mikael.annotation.Pointcuts)")
  public void piontCut() {
  }

  // 注解方法  实现之前执行
  @Before("piontCut()")
  public void piontCutBefore() {
    String requestURI = request.getRequestURI();
    logger.info("--------前置通知---------" + requestURI);
  }

  @Around("piontCut()")
  public void piontCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
    logger.info("---环绕通知前--");
    Object proceed = joinPoint.proceed(); // 执行目标方法
    logger.info("---环绕通知后--");
  }
}
