package org.maximus.learning.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

import org.maximus.learning.designpatterns.factory.MailSender;
import org.maximus.learning.designpatterns.factory.SMSSender;
import org.maximus.learning.designpatterns.factory.Sender;

public class Builder {
	
	public List<Sender> list = new ArrayList<Sender>(); 
	
	public void produceMailsender(int count) {
		for (int i = 0; i <= count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSMSSender(int count) {
		for (int i = 0; i <= count; i++) {
			list.add(new SMSSender());
		}
	}

}
