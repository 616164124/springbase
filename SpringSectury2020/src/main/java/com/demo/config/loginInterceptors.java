/**
 * projectName: springbase fileName: Filtter.java packageName: com.demo.config date: 2020-10-22
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version: V1.0
 * @author: mikael
 * @className: Filtter
 * @packageName: com.demo.config
 * @description: 拦截器
 * @data: 2020-10-22
 */
@Configuration
public class loginInterceptors extends WebMvcConfigurationSupport {
  @Bean
  public HandlerInterceptor getHandlerInterceptor() {
    return new HandlerInterceptor() {
      // 进入controller之前     postHandle进入controller之后
      @Override
      public boolean preHandle(
              HttpServletRequest request, HttpServletResponse response, Object handler)
              throws Exception {
        System.out.println(request.getServletPath());
        // 跳转到 /error 页面
        //  request.getRequestDispatcher("/error").forward(request,response);
        System.out.println(request.getHeader("Referer"));
        response.sendRedirect("/error");
        System.out.println("拦截");
        return true; // true 之后进入controller
      }
    };
  }

  // 添加拦截器
  protected void addInterceptors(InterceptorRegistry registry) {
    super.addInterceptors(registry);
    //
    // registry.addInterceptor(getHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");

  }
}
