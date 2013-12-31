package org.maximus.learning.designpatterns.singleton;

/**
 * If the program will always need an instance, or if the cost of creating the
 * instance is not too large in terms of time/resources, the programmer can
 * switch to eager initialization, which always creates an instance.
 * 
 * This method has a number of advantages: 
 *   1) The instance is not constructed until
 * the class is used. 
 * 
 *   2) There is no need to synchronize the getInstance() method,
 * meaning all threads will see the same instance and no (expensive) locking is
 * required. 
 * 
 *   3) The final keyword means that the instance cannot be redefined,
 * ensuring that one (and only one) instance ever exists.
 * 
 * @author maximuszeng
 * 
 */
public class EagerInitSingleton {

	private static final EagerInitSingleton instance = new EagerInitSingleton();

	private EagerInitSingleton() {

	}

	public static EagerInitSingleton getInstance() {
		return instance;
	}

}
