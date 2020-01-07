package com.array.oneDimensional1;

public class Operations {
	int arr[] = null;
	
	Operations(int sizeOfArray){
		arr = new int[sizeOfArray];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
		
	public  void traverseArray() {
		try {
		System.out.println("The elements of the array are ....");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
		}
		catch(Exception e) {
			System.out.println("Array no longer exists");
		}
	
}
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location] == Integer.MIN_VALUE ) {
				arr[location] = valueToBeInserted;
			}
			else {
				System.out.println("Element already present");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public void search(int elementToBeSearched) {
		int flag =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == elementToBeSearched) {
				flag=1;
			}	
		}
		if(flag == 1) {
			System.out.println(elementToBeSearched+ " Element Found");
		}
		else {
			System.out.println("Element not found");
		}
	}
}
