package org.maximus.learning.designpatterns.factory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is mail sender!");
	}

}
