package com.example.study.designpatterns.singleton;

import java.lang.reflect.Constructor;

/**
 * 懒汉
 */
public class Singleton02 {
    private static Singleton02 singleton02;

    public Singleton02() {
    }

    //方法同步，调用效率低
    private static synchronized Singleton02 getSingleton02(){//延时加载
        if(singleton02 == null){
            singleton02 = new Singleton02();
        }
        return singleton02;
    }

    public static void main(String[] args) throws Exception {
        Singleton02 s1 = Singleton02.getSingleton02();
        Singleton02 s2 = Singleton02.getSingleton02();
        System.out.println(s1);
        System.out.println(s2);

        //反射
        Class<Singleton02> aClass = (Class<Singleton02>) Class.forName("com.example.study.designpatterns.singleton.Singleton02");
        Constructor<Singleton02> declaredConstructor = aClass.getDeclaredConstructor(null);
        //declaredConstructor.setAccessible(true);
        Singleton02 s3 = declaredConstructor.newInstance();
        Singleton02 s4 = declaredConstructor.newInstance();
        System.out.println(s3);
        System.out.println(s4);
    }
}
