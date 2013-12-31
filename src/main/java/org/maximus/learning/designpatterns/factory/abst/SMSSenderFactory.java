package org.maximus.learning.designpatterns.factory.abst;

import org.maximus.learning.designpatterns.factory.SMSSender;
import org.maximus.learning.designpatterns.factory.Sender;

public class SMSSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new SMSSender();
	}

}
