package com.array.oneDimensional;

import java.util.Scanner;

public class FirstArray {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}

}
