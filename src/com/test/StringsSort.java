package com.test;

import java.util.Arrays;
import java.util.Scanner;

// Checks whether two words are anagrams of each other in Java
public class StringsSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first word: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Please enter the second word: ");
        String word2 = scanner.nextLine();
        
        if(isAnagram(word1,word2)) {
            System.out.println(word1+" is an anagram of "+word2);
        }else {
            System.out.println(word1+" is NOT an anagram of "+word2);
        }

        scanner.close();
    }

    // Check if two words are anagrams in Java
    // Uses sorting and comparison of character arrays
    private static boolean isAnagram(String word1, String word2) {
       word1 = word1.replaceAll("\\s", "").toLowerCase();
       word2 = word2.replaceAll("\\s", "").toLowerCase();
       
       char[] word1Arr = word1.toCharArray();
       char[] word2Arr = word2.toCharArray();
       
       Arrays.sort(word1Arr);
       Arrays.sort(word2Arr);
       
       return (Arrays.equals(word1Arr, word2Arr));
    }
}
