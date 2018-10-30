package com.riazjamil.secondDay.tutorial;

public class ReverseArray {

	int numbers [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	public static void main(String[] args) {

		reverse(new Integer[] {2,3,4,5,6,7});
		reverse(new String[] {"2","3","4","5","6","7"});

		Box<Integer> myBox = new Box<>(12);
		int x = myBox.get();
	}

	public static <T> void reverse(T[] array) {

	    for (int i = 0; i < 10; i++) {
	        System.out.println("");
			}

	    }
}






