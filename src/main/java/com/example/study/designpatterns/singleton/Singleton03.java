package com.example.study.designpatterns.singleton;

/**
 * 静态内部类
 */
public class Singleton03 {
    private Singleton03(){
    }

    private static class Singleton03Instance{
        private static final Singleton03 singleton03 = new Singleton03();
    }

    //方法不同步，调用效率高
    private static Singleton03 getInstance(){
        return Singleton03Instance.singleton03;
    }

    public static void main(String[] args) {
        Singleton03 s1 = Singleton03.getInstance();
        Singleton03 s2 = Singleton03.getInstance();
        System.out.println(s1.equals(s2));

        Singleton03 s3 = new Singleton03();
        Singleton03 s4 = new Singleton03();
        System.out.println(s3.equals(s4));
    }
}
