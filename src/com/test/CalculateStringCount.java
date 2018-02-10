package com.test;

import java.util.HashMap;
import java.util.Set;

public class CalculateStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] email = {"test1@gmail.com","test100@hotmail.com","test200@gmail.com"};
		countStringOccurences(email);
		/*for (String strTemp : email){

			System.out.println(strTemp.substring(strTemp.indexOf("@")+1));

			}*/
	}
	
	private static void countStringOccurences(String[] strArray) {
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        for (String string : strArray) {
            if (!countMap.containsKey(string.substring(string.indexOf("@")+1))) {
                countMap.put(string.substring(string.indexOf("@")+1), 1);
            } else {
                Integer count = countMap.get(string.substring(string.indexOf("@")+1));
                count = count + 1;
                countMap.put(string.substring(string.indexOf("@")+1), count);
            }
        }
        printCount(countMap);
    }

    /**
     * This method will print the occurrence of each element
     * 
     * @param countMap
     *            map containg string as a key, and its count as the value
     */
    private static void printCount(HashMap<String, Integer> countMap) {
        Set<String> keySet = countMap.keySet();
        for (String string : keySet) {
            System.out.println(string + " : " + countMap.get(string));
        }
    }

}
