package com.example.study.designpatterns.adapter;

/**
 * 适配器（类适配器）
 * 转接口
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
