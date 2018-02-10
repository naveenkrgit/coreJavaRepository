package com.test;



public class ExceptionTest {
	  public static void main(String[] args) {
	    int num1, num2;
	    try {
	     // num1 = KeyboardReader.getPromptedInt("Enter a number: ");
	      //num2 = KeyboardReader.getPromptedInt("Enter another number: ");
	      num1 = Integer.parseInt(args[0]);	
	      num2 = Integer.parseInt(args[1]);	
	    	
	    	
	    	
	      System.out.println(num1 + " / " + num2 + " = " + num1/num2);      
	    }
	    catch(java.util.InputMismatchException e){
	    	System.out.println("InputMismatchException occurred");
	    }
	    catch (NumberFormatException e) {
	      System.out.println("Number Format Exception occurred");
	    }
	    
	    catch (ArithmeticException e) {
	      System.out.println("Divide by Exception occurred");
	    }
	    catch (Exception e) {
	      System.out.println("General Exception occurred");
	    }
	  } 
	}


