package com.example.study.designpatterns.singleton;

/**
 * 饿汉
 */
public class Singleton01 {
    private static Singleton01 singleton01 = new Singleton01();//类初始化，立即加载

    private Singleton01(){
    }

    //方法不同步，调用效率高
    private static Singleton01 getInstance(){
        return singleton01;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1.equals(s2));

        Singleton01 s3 = new Singleton01();
        Singleton01 s4 = new Singleton01();
        System.out.println(s3.equals(s4));
    }
}
