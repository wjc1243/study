package com.example.study.designpatterns.templateMethod;

public abstract class BankTemplateMethod {
    //具体方法
    public void takeNum(){
        System.out.println("我要取号！");
    }

    //抽象方法，在这里不实现，不同逻辑给与不同的实现(子类或者匿名内部类)
    //办理具体的业务
    public abstract void tarnsact();

    //具体方法
    public void evaluate(){
        System.out.println("我要评分！");
    }

    //执行
    public final void process(){
        this.takeNum();
        this.tarnsact();
        this.evaluate();
    }
}
