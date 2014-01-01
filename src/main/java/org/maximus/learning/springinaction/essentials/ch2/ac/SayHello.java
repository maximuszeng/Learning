package org.maximus.learning.springinaction.essentials.ch2.ac;

public class SayHello {
	
	public String greetingMessage;
	
	/**
	 * default constructor.
	 */
	public SayHello() {
		
	}
	
	/**
	 * Constructor.
	 * @param greetingMessage
	 */
	public SayHello(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}
	
	public void say() {
		System.out.println(greetingMessage);
	}
	
	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}
}
