package org.maximus.learning.designpatterns.factory.abst;

import org.maximus.learning.designpatterns.factory.MailSender;
import org.maximus.learning.designpatterns.factory.Sender;

public class MailSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
