package com.example.study.designpatterns.adapter;

/**
 * 被适配的类
 * PS/2键盘
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户请求的需要的功能！");
    }
}
