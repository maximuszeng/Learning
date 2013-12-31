package org.maximus.learning.designpatterns.adapter;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {

		System.out.println("this is the targetable method!"); 
	}

}
