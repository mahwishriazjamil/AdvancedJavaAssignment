package com.riazjamil.firstDay.test;

import java.time.LocalDateTime;

import com.riazjamil.firstDay.tutorial.Coordinate;

public class Circle {

	private final double radius;
	private final LocalDateTime dateCreated;
	private final Coordinate coordinate;

	public Circle(double radius, Coordinate coordinate) {
		super();
		this.radius = radius;
		dateCreated = LocalDateTime.now();
		this.coordinate = coordinate;
	}

	public double area(){
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter(){
		return Math.PI * 2 * radius;
	}

	@Override
	public String toString() {
		return "The circle was created on " + dateCreated + ". The area is " + area() + " and the perimeter is " + perimeter();
	}

}
