package com.riazjamil.firstDay.tutorial;

import java.util.List;

import com.riazjamil.firstDay.test.Circle;
import com.riazjamil.firstDay.test.Greeting;
import com.riazjamil.firstDay.test.Shape;
import com.riazjamil.firstDay.test.ShapeException;
import com.riazjamil.firstDay.test.Triangle;
import com.riazjamil.interfaces.Address;
import com.riazjamil.interfaces.Print;
import com.riazjamil.interfaces.Printable;



import java.util.ArrayList;

public class MyCollections {

	public static void main(String[] args) {
//		int[] numbers = new int[10];

//		for (int index : numbers){
//			numbers[index] = (int) (Math.random() * 100);
//		}

//		for (int i = 0; i <= numbers.length; i++) {
//			numbers[i] = (int) (Math.random() * 100);
//		}
//
//		List<Integer> scores = new ArrayList<>();
//		scores.add(1);
//		scores.add(5);
//
//		double total = 0;
//
//		for (Integer o : scores){
//			total += o;
//		}
//		System.out.println(total);

		printCircles();

		Printable address = new Address("112 Eagles Rest", "Lower Zambezzi", "10101");
		Print.doPrint(address);

		Printable triangle = new Triangle(3, 4, 5);
		Print.doPrint(triangle);

		Shape s = (Shape)triangle;
	}

//	List<Integer> test = new ArrayList<Integer>();

	private static void printCircles(){

		List<Circle> myCircles = new ArrayList<>();
		Circle c = new Circle(30, new Coordinate(2, 3));

		while (myCircles.size() <= 5) {
			myCircles.add(new Circle(40,new Coordinate(2, 4)));
			System.out.println();
		}

//		for (Circle circle : myCircles){
//			String stringArray = null;
//			System.out.println(circle.toString());
//		}

//		StringBuilder sb = new StringBuilder();
//		for (Circle circle : myCircles)
//		{
//		    sb.append(circle);
//		    sb.append("\n");
//		}
//
//		System.out.println(sb.toString());



	}

	private static void sortShapes() throws ShapeException{
		List<Shape> triangles = new ArrayList<>();

		triangles.add(new Triangle(4, 3, 5));
		triangles.add(new Triangle(40, 30, 50));

		java.util.Collections.sort(triangles);

		triangles.forEach((t) -> {
			System.out.println(t);
		});
	}
}
























