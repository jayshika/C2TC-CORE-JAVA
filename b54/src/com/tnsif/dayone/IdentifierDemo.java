package com.tnsif.dayone;

public class IdentifierDemo {

	public static void main(String[] args) {//variable declaration-Invalid Identifiers Examples
		/*
		 * int for -13;//error because keyword cannot be identifier
		 * system.out.println("value of the number variable is :"+for);
		 
		 */
		/* 
		 * int number 2 -13;//error because do not add space within identifier
		 * System.out.println("value of the number variable is :"+ number 2);
		 
		 */
		//error  because identifier cannot start with @,#
		// int @number 3=10;
		
		//valid Identifier examples
		int $number=20;//starts with $
		System.out.println("value of number variable is : "+ $number);
		String studentName="Ankiet";// use camel case
		System.out.println("value is: "+ studentName);
	}

		// TODO Auto-generated method stub

}
