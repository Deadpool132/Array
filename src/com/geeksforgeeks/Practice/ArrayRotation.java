package com.geeksforgeeks.Practice;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		int n;
		int arr[] = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array...");
		n = sc.nextInt();
		int i=0;
		arr = new int[n];
		System.out.println("Enter the elements of te array...");
		for(;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position from where you want to rotate");
		int d = sc.nextInt();
		rotate(arr,d,n);

	}
	
	public static void rotate(int arr[],int d, int n) {
		System.out.println("Elemsnts after rotation are :- ");
		for(int i=d;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<d;i++) {
			System.out.println(arr[i]);
		}
	}

}
