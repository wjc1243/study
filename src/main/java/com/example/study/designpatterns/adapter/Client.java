package com.example.study.designpatterns.adapter;

/**
 * 客户端类
 * 相当于笔记本，只有USB接口，需要USB接口的键盘
 */
public class Client {
    public void test1(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        Client c1 = new Client();
        Target t1 = new Adapter();
        Target t2 = new Adapter();
        c1.test1(t1);
        c1.test1(t2);
    }
}
