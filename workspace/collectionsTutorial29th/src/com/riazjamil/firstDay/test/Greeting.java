package com.riazjamil.firstDay.test;

public class Greeting {

	// default - only visible in the package it's in
	static void greet(String name){
		System.out.println("Hello " + name);
	}

	// protected - only visible in the package in which it's defined AND also to the members in it's inheritance hierarchy
	protected static void greet(){
		System.out.println("Hello, world");
	}

	public static void greet(String name, String message){
		System.out.println(message + " " + name);
	}
}
