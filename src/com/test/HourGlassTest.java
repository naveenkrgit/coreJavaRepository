package com.test;

public class HourGlassTest {
	
	static int arr[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
	//arr[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};  
	
	/*
	 * 1 1 1 0 0 0
	   0 1 0 0 0 0
	   1 1 1 0 0 0
	   0 0 2 4 4 0
	   0 0 0 2 0 0
	   0 0 1 2 4 0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<arr.length;i++){
			for(int j =0;j<arr.length;j++){
				System.out.println(arr[i][j]);
				/*
				 * a[0,0]+a[0,1]+a[0,2]
				 * a[1,1]
				 * a[2,0]+a[2,1]+a[2,2]
				 * 
				 * a[0,1]+a[0,2]+a[0,2]
				 * a[1,2]
				 * a[2,1]+a[2,2]+a[2,3]
				 * 
				 * a[0,2]+a[0,3]+a[0,4]
				 * a[1,3]
				 * a[2,2]+a[2,3]+a[2,4]
				 */
			}
		}
		
	}

}
