package com.jie.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;
//如果我们需要扩展mvc 官方建议使用 config
//全面扩展Mvc
@Configuration
//@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {
//    //public interface ViewResolve;
//    //实现了视图解析器接口我们就可以叫它视图解析器
//    @Bean
//    public ViewResolver MyViewResolve(){
//        return new MyViewResolver();
//    }
//
//    //定义一个自己的视图解析器MyViewResolver
//    public static class MyViewResolver implements ViewResolver{
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//    }
//视图跳转

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/jie").setViewName("test");
//  }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");

    }
    //自定义国际化
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
