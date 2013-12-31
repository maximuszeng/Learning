package org.maximus.learning.designpatterns.singleton;

public class StaticBlockInitSingleton {
	
	private StaticBlockInitSingleton() {
		
	}

	private static final StaticBlockInitSingleton instance;
	
	static {
		try {
			instance = new StaticBlockInitSingleton();
		} catch (Exception e) {
			throw new RuntimeException("An error occured!", e);
		}
	}
	
	public static StaticBlockInitSingleton getInstance() {
		return instance;
	}
}
