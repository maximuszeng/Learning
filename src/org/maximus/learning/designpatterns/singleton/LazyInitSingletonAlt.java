package org.maximus.learning.designpatterns.singleton;

/**
 * An alternate simpler and cleaner version may be used at the expense of
 * potentially lower amounts of concurrency in a multithreaded environment.
 * 
 * @author maximuszeng
 * 
 */
public class LazyInitSingletonAlt {

	private static LazyInitSingletonAlt instance = null;

	private LazyInitSingletonAlt() {

	}

	public static synchronized LazyInitSingletonAlt getInstance() {
		if (instance == null) {
			instance = new LazyInitSingletonAlt();
		}
		return instance;
	}
}
