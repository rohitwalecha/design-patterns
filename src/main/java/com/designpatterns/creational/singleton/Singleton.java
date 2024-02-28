package com.designpatterns.creational.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton(String info){
		super();
	}

	public static Singleton getInstance(){
		if(instance == null)
			instance = new Singleton("I am the Same Singleton !!");
		return instance;
	}

	@Override
	public String toString(){
		return "I am the Same Singleton !!";
	}
}
