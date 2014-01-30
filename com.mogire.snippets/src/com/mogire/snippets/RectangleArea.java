package com.mogire.snippets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
public static void main(String[]args) {
	int Width = 0;
	int Height=0;
	
	try {
		//get radius from console
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter the width of the rectangle\n");
		Width= Integer.parseInt(br.readLine());
		
		System.out.println("Please enter the height of the rectangle\n");
		Height= Integer.parseInt(br.readLine());
	}
	//if invalid value entered
	catch(NumberFormatException ne) {
		System.out.println("Invalid value" + ne);
        System.exit(0);
	}
	catch(IOException ioe) {
		System.out.println("IO Error :" + ioe);
        System.exit(0);
	}
	
	double Area = Width * Height;
    
    System.out.println("Area of the rectangle is " + Area);
}
}