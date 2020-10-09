package com.jie.demo.config;

import com.sun.corba.se.spi.resolver.LocalResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
//国际化
public class MyLocalResolver implements LocaleResolver {
    @Override

    public Locale resolveLocale(HttpServletRequest request) {
        //如果没有使用默认
        String language =request.getParameter("l");
        System.out.println("debug========>"+language);
        //获取请求中的语言参数
        Locale locale =Locale.getDefault();
        //如果请求的链接携带了国际化的参数
        if(!StringUtils.isEmpty(language)){
        //zh_CN

        String[] split =language.split("_");
        //国家/地区
           locale= new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
