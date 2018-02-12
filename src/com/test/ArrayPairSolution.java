package com.test;

public class ArrayPairSolution {

	public static void calculateSum(int[] intArr){
		
		for(int i=0;i<intArr.length;i++){
			
			System.out.println("Init Value::"+intArr[i]);
			System.out.println("Next ValueintArr::"+intArr[i+1]);
		}
	}

	/*
	 * Purpose of this problem is to print out 
	 * all those combinations whose sum equals 7.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6};
		calculateSum(intArray);

	}

}
