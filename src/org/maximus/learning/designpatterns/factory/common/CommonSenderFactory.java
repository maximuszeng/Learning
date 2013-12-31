package org.maximus.learning.designpatterns.factory.common;

import org.maximus.learning.designpatterns.factory.MailSender;
import org.maximus.learning.designpatterns.factory.SMSSender;
import org.maximus.learning.designpatterns.factory.Sender;

public class CommonSenderFactory {
	
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSMS() {
		return new SMSSender();
	}
}
