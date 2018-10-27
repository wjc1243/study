package com.example.study.bjsxt.designpatterns.strategy;

public class Client {
	public static void main(String[] args) {
		
		Strategy s1 = new OldCustomerManyStrategy();
		Context ctx = new Context(s1);
		
		ctx.pringPrice(998);
		
	}
}
