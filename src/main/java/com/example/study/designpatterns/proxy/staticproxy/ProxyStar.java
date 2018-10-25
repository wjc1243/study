package com.example.study.designpatterns.proxy.staticproxy;

public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar confer");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("ProxyStar sing");
    }

    @Override
    public void collectMoney() {
        star.sing();
    }
}
