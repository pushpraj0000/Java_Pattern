package com.pattern.java;

public class triangle_diffNumb {
	public static void main(String args[]) {
		int n = 10;
		for(int i =1; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
				
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
				
				
		}
		
		
	}

}
