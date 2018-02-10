package com.test;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		HashMap map = new HashMap();
		int n = in.nextInt();
		in.nextLine();
		String name = new String();
		int phone = 9999;
		/*try {

			for (int i = 0; i < n; i++) {
				name = in.nextLine();
				phone = in.nextInt();
				map.put(name, phone);
				in.nextLine();
			}
		} catch (Exception ex) {
			System.out.println("Input incorrect::" + ex);
			// String name = in.nextLine();
			// int phone = in.nextInt();
			map.put(name, "Not found");
		}*/
		  while(in.hasNext())
	      {
			try {
				//String s=in.nextLine();
				name = in.nextLine();
				phone = in.nextInt();
				map.put(name, phone);
			}catch(Exception ex){
				System.out.println("Input incorrect::" + ex);
				// String name = in.nextLine();
				// int phone = in.nextInt();
				map.put(name, "Not found");
			}
	      }
	}

	/*
	 * 6 uncle sam 99912222 tom 11122222 harry 12299933 uncle sam uncle tom
	 * harry
	 */

}
