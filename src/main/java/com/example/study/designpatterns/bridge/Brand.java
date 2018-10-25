package com.example.study.designpatterns.bridge;

public interface Brand {
    void sale();
}

class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售联想电脑！");
    }
}

class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("销售戴尔电脑！");
    }
}

class Shenzhou implements Brand{
    @Override
    public void sale() {
        System.out.println("销售戴尔电脑！");
    }
}
