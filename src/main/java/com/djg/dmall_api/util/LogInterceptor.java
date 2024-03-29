package com.djg.dmall_api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mac
 * 拦截器打印远程连接及参数
 */
@Component
public class LogInterceptor implements HandlerInterceptor {
    private static final Logger LOG = LoggerFactory.getLogger(LogInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
// 打印请求信息
        LOG.info("------------- LogInterceptor 开始 -------------");
        if ("GET".equals(request.getMethod())) {
            LOG.info("请求地址: {} {}", request.getRequestURL().toString(), request.getMethod());
            LOG.info("请求参数:{}", request.getParameterMap());
            LOG.info("远程地址: {}", request.getRemoteAddr());
        } else {
            LOG.info("请求地址: {} {}", request.getRequestURL().toString(), request.getMethod());
            byte[] bodyBytes = StreamUtils.copyToByteArray(request.getInputStream());
            String body = new String(bodyBytes, request.getCharacterEncoding());
            LOG.info("请求体：{}", body);
            LOG.info("远程地址: {}", request.getRemoteAddr());
        };
        long startTime = System.currentTimeMillis();
        request.setAttribute("requestStartTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("requestStartTime");
        LOG.info("------------- LogInterceptor 结束 耗时：{} ms -------------", System.currentTimeMillis() - startTime);
    }
}
