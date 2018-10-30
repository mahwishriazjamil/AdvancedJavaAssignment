package com.riazjamil.firstDay.test;

import com.riazjamil.interfaces.Printable;

public abstract class Shape implements Printable, Comparable<Shape> {

	protected double sideA;
	protected double sideB;
	protected double sideC;

	public Shape(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public abstract double area();

	public abstract double perimeter();

	@Override
	public String toString() {
		return "The area is " + area() + " and the perimeter is " + perimeter();
	}

	@Override
	public int compareTo(Shape o){

//		if (area()==o.area()){
//			return 0;
//		}
//		else if (area()>o.area()){
//			return 1;
//		}
//		else return -1;
		// ^ does the same thing as the above
		return (int) (area() - o.area());
	}

}
