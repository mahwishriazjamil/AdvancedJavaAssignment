package com.riazjamil.secondDay.tutorial;

public class Box<T> {

	/**
	 * @author Administrator
	 * @param <T>
	 */

	private final T t;

	public Box(T t) {
		this.t = t;
	}

	public T get(){
		return t;
	}

}
