package com.test;

public class NumberSum {
	
	public void sumSeven(int[] intArray){
		
		for(int i=0;i<intArray.length;i++){
			
			int start = 0;
			int end = intArray.length;
			int midPoint = (start + end)/2;
			
			System.out.println(intArray[midPoint]);
			System.out.println("hello");
			
			int[] newArr = null;
			
			//create another array that can be sent back.
			for(int j=0;j<midPoint;j++){
				newArr[j] = intArray[j];
			}
			
			sumSeven(newArr);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberSum numberSum = new NumberSum();
		int[] i = {1, 2, 3, 4, 5, 6};
		numberSum.sumSeven(i);
	}

}
