package com.bridgelabz.GreatestNumber;

import java.util.Scanner;

public class GreatestNumber {
	/*public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two Number: ");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}*/
	
	public static void GreatestNumber() {
		int a,b;
		System.out.println("Enter two Number: ");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Greatest Number Program");
		GreatestNumber();
	}
}
