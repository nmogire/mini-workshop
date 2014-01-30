package com.mogire.snippets;

public class EvenOrOdd {
	
public static void main(String[]args) {
	
	//creating an array of 10 numbers
	int[]numbers=new int[] {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]%2==0) 
			System.out.println(numbers[i]+" "+"is even");
		else 
				System.out.println(numbers[i]+" "+"is odd");
		
		
	}
	
}
}
