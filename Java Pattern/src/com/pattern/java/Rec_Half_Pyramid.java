package com.pattern.java;

import java.util.Scanner;

public class Rec_Half_Pyramid {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
