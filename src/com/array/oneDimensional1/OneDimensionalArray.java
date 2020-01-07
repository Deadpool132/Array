package com.array.oneDimensional1;

public class OneDimensionalArray {

	public static void main(String[] args) {
		 System.out.println("Creating an array of 5 elements ....");
		 Operations m = new Operations(5);
		
		 //Method to insert elements in the array...
		 m.insert(0, 10);
		 m.insert(1, 20);
		 m.insert(2, 30);
		 m.insert(3, 40);
		 m.insert(4, 50);
		 
		 
		 //Method to traverse the array....
		 m.traverseArray();
		 
		 //Method for searching an element in the array...
		 m.search(10);
		 m.search(60);
		 
		}

	}


