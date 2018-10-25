package com.example.study.designpatterns.ZeRenLian;

public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest request = new LeaveRequest("Tom", 33, "回家弹琴");
        a.handleRequest(request);
    }
}
