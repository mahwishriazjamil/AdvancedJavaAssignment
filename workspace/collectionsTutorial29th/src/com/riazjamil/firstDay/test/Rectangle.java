package com.riazjamil.firstDay.test;

public class Rectangle extends Shape {

	public Rectangle(double sideA, double sideB, double sideC, double sideD) {
		super(sideA, sideB, sideC, sideD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		double s = (sideA + sideB + sideC + ) / 2;

		double area = s * ((s - sideA) * (s - sideB) * (s - sideC));

		return Math.sqrt(area);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
