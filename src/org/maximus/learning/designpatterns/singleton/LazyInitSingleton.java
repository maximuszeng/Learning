package org.maximus.learning.designpatterns.singleton;

/**
 * This method uses double-checked locking, which should not be used prior to
 * J2SE 5.0, as it is vulnerable to subtle bugs. The problem is that an
 * out-of-order write may allow the instance reference to be returned before the
 * Singleton constructor is executed.
 * 
 * @author maximuszeng
 * 
 */
public class LazyInitSingleton {
	private static volatile LazyInitSingleton instance = null;
	
	private LazyInitSingleton() {
	}

	public static LazyInitSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyInitSingleton.class) {
				if (instance == null) {
					instance = new LazyInitSingleton();
				}
			}
		}
		return instance;
	}
}