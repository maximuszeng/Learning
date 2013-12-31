package org.maximus.learning.designpatterns.factory.abst;

import org.maximus.learning.designpatterns.factory.Sender;

public interface Provider {
	
	abstract Sender produce();

}
