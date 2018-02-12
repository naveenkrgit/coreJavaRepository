package com.test;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {-22,-15,1,7,12,20,27,35,37,40,42,47,55};
		//System.out.println(iterativeBinarySearch(intArr,-15));
		System.out.println(iterativeBinarySearch(intArr,-15));
	}

	public static int iterativeBinarySearch(int[] input, int value) {

		int start = 0;
		int end = input.length;// author says that end will always be greater
		// than
		// 1 greater than the partition that we are looking at.

		while (start < end) {
			int midpoint = (start + end) / 2;
			System.out.println("Midpoint = ::" + midpoint);
			System.out.println("Midpoint Value= ::" + input[midpoint]);
			if (input[midpoint] == value) {
				//System.out.println("Value is at position::" + input[midpoint]);
				return midpoint;
			} else if (input[midpoint] < value) {

				// if end < midpoint,then we look at the partition to the right
				// of
				// the midpoint.else to the left.

				// int[] intArr = {-22,-15,1,7,20,35,55};

				start = midpoint + 1;
				// end = input.length;
				// midpoint = (start+end)/2;

			} else {
				// start = 0;
				end = midpoint;

			}
		}

		return -1;
	}

	public static int recursiveBinarySearch(int[] input, int value) {

		return recursiveBinarySearch(input,0,input.length,value);
		//return -1;
	}

	public static int recursiveBinarySearch(int[] input,int start,int end, int value) {


		return -1;
	}


}
