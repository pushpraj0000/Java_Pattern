package com.pattern.java;

import java.util.Scanner;

public class HollowRectangle1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int n = sc.nextInt();
		System.out.print("Enter coloumn : ");
		
		int m = sc.nextInt();
		
		
		//for rows
		for(int i=1; i<=n; i++) {
			//for coloums
			for(int j=1; j<=m; j++) {
				if(i==1|| j==1 || i==n || j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
