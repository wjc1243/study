package com.example.study.designpatterns.adapter;

/**
 * 适配器（对象适配器， 使用了组合跟被适配器对象整合）
 * 转接口
 */
public class Adapter2 implements Target {
    private Adaptee adaptee;
    @Override
    public void handleReq() {
        adaptee.request();
    }
}
