package com.djg.dmall_api.config;

import com.djg.dmall_api.util.LogInterceptor;
import com.djg.dmall_api.util.XinDispatcherServlet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author mac
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    private LogInterceptor logInterceptor;

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(logInterceptor)
                .addPathPatterns("/**")
                // 对那些接口拦截
                .excludePathPatterns("/login");
        // 对哪些接机口放行
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    /**
     * 处理POST请求两次报错的问题
     * @return
     */
    @Bean
    @Qualifier(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
    public DispatcherServlet dispatcherServlet() {
        return new XinDispatcherServlet();
    }
}
