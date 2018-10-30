package com.riazjamil.firstDay.test;

public class Triangle extends Shape{

	public Triangle(double sideA, double sideB, double sideC) {
		super(sideA, sideB, sideC);

		if (!checkValues()){
			throw new IllegalArgumentException("Please enter appropriate values.");
		}
	}

	@Override
	public double area() {

		double s = (sideA + sideB + sideC) / 2;

		double area = s * ((s - sideA) * (s - sideB) * (s - sideC));

		return Math.sqrt(area);
	}

	@Override
	public double perimeter() {

		return sideA + sideB + sideC;
	}

	public boolean checkValues(){
		boolean check = false;

		if ((sideA+sideB > sideC) && (sideA+sideC > sideB) && (sideB+sideC > sideA)) {
			check = true;
		}

		return check;
	}

	private void validateDimensions() throws ShapeException{

		boolean isValid = ((sideA+sideB > sideC) && (sideA+sideC > sideB) && (sideB+sideC > sideA));
		String message = "";
		if (!isValid){
			throw new ShapeException(message);
		}

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}


























