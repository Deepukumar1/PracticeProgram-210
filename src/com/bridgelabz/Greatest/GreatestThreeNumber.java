package com.bridgelabz.Greatest;

import java.util.Scanner;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		 int num1, num2 , num3;
		 System.out.println("Enter any Three Number: ");
		 Scanner r = new Scanner(System.in);
		 num1=r.nextInt();
		 num2=r.nextInt();
		 num3=r.nextInt();

		    //checking if num1 is greatest
		    if (num1 >= num2 && num1 >= num3)
		        System.out.println (num1 + " is the greatest");

		    //checking if num2 is greatest
		    else if (num2 >= num1 && num2 >= num3)
		        System.out.println (num2 + " is the greatest");

		    //checking if num2 is greatest
		    else if (num3 >= num1 && num3 >= num2)
		        System.out.println (num3 + " is the greatest");
	 }
}


