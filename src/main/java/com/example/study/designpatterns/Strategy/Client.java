package com.example.study.designpatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        Content c1 = new Content(new NewCustomerFewStrategy());
        Content c2 = new Content(new NewCustomerManyStrategy());
        Content c3 = new Content(new OldCustomerFewStrategy());
        Content c4 = new Content(new OldCustomerManyStrategy());

        c1.printPrice(1000);
        c2.printPrice(1000);
        c3.printPrice(1000);
        c4.printPrice(1000);
    }
}
