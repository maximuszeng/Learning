package org.maximus.learning.designpatterns.factory;

public class SMSSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is sms sender!");
	}

}
