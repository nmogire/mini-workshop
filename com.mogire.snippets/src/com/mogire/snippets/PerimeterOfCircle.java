package com.mogire.snippets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimeterOfCircle {
public static void main(String[]args) {
	int radius = 0;
	System.out.println("Please enter radius of a circle\n");
	
	try {
		//get radius from console
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	radius = Integer.parseInt(br.readLine());
	}
	//if invalid value entered
	catch(NumberFormatException ne) {
		System.out.println("Invalid radius value" + ne);
        System.exit(0);
	}
	catch(IOException ioe) {
		System.out.println("IO Error :" + ioe);
        System.exit(0);
	}
	
	double perimeter = 2*Math.PI * radius;
    
    System.out.println("Perimeter of a circle is " + perimeter);
}
}

