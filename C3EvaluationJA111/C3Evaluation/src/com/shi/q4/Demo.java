package com.shi.q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username- ");
		String a = sc.nextLine();
		System.out.println("Enter password- ");
		String b = sc.nextLine();
		System.out.println("Enter mobileNumber- ");
		String c = sc.nextLine();
		System.out.println("Enter email- ");
		String d = sc.nextLine();
		
		System.out.println("Customer username- "+a);
		System.out.println("Customer password- "+b);
		System.out.println("Customer mobileNumber- "+c);
		System.out.println("Customer email- "+d);
	}
}
