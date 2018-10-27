package com.example.study.designpatterns.templateMethod;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm1 = new DrawMoney();
        btm1.process();

        //2、匿名内部类实现
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void tarnsact() {
                System.out.println("我要存钱！");
            }
        };
        btm2.process();

        //2、匿名内部类实现
        BankTemplateMethod btm3 = new BankTemplateMethod() {
            @Override
            public void tarnsact() {
                System.out.println("我要理财！");
            }
        };
        btm3.process();
    }
}


//1、子类实现
class DrawMoney extends BankTemplateMethod{
    @Override
    public void tarnsact() {
        System.out.println("我要取钱！");
    }
}
