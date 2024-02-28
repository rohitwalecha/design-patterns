package com.designpatterns.creational.prototype;

public class Driver {
	public static void main(String[] args) {
		Bird bird = new Eagle("harpy");
		System.out.println(bird);

		BirdClient birdClient = new BirdClient(bird);
		Bird birdClone = birdClient.createBird();
		System.out.println(birdClone);



	}
}
