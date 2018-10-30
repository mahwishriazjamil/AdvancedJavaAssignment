package com.riazjamil.secondDay.tutorial;

public final class Item {

	private String name;

	public Item(){

	}

	public static Item getInstance(){
		return new Item();
	}

	public final void setName(String name) {
		this.name = name;
	}



}
