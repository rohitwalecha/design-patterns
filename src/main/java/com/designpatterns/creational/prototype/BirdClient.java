package com.designpatterns.creational.prototype;

public class BirdClient {
	private Bird bird;
	public BirdClient(Bird bird){
		this.bird = bird;
	}
	public Bird createBird(){
		return bird.clone();
	}
}
