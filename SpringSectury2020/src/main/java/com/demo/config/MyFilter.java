/**
 * projectName: springbase fileName: MyFilter.java packageName: com.demo.config date: 2020-10-22
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @version: V1.0
 * @author: mikael
 * @className: MyFilter
 * @packageName: com.demo.config
 * @description: 不要忘记添加扫描 @ServletComponentScan("com.demo.config")
 * @data: 2020-10-22
 */
@WebFilter(urlPatterns = "/*", filterName = "sectury")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init---------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("doFilter------------------");
        HttpServletRequest req = (HttpServletRequest) request; // 向下转型
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        if ("/sectury/filterlogin".equals(requestURI)) {
            chain.doFilter(request, response); // 符合  /sectury/filterlogin    通过
        } else {
            return;
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy---------------------");
    }
}
