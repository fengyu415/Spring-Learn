package com.feng.AopLog;

import org.springframework.stereotype.Component;

@Component("diyPointcut")
public class DiyPointcut {
    public  void  beformethod()
    {
        System.out.println("---------方法执行前----------");
    }
    public  void aftermethod()
    {
        System.out.println("----------方法执行后----------------");
    }
}
