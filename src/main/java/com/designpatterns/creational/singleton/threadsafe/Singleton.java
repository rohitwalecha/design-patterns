package com.designpatterns.creational.singleton.threadsafe;

public class Singleton {
	private static Singleton singleton;

	private Singleton(){
		super();
	}

	/**
	 * If you notice carefully once an object is created synchronization is no longer useful
	 * because now obj will not be null and any sequence of operations will lead to consistent results.
	 * So we will only acquire the lock on the getInstance() once when the obj is null.
	 * This way we only synchronize the first way through, just what we want.
	 * @return
	 */
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	@Override
	public String toString(){
		return "I am the Same Singleton !!";
	}
}
