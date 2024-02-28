package com.designpatterns.creational.prototype;

public class Eagle implements Bird{
	private String type;
	public Eagle(String type){
		this.type = type;
	}
	@Override
	public void fly() {
		System.out.println("I am a " + type +" "+ this.getClass() + " and I am flying.");
	}
	@Override
	public Bird clone() {
		return new Eagle(this.type);
	}

	@Override
	public String toString(){
		return ("class : " + this.getClass() + " type : " + this.type);
	}
}
