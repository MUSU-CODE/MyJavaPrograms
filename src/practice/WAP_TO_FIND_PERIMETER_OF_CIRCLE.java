package practice;

import java.util.Scanner;

public class WAP_TO_FIND_PERIMETER_OF_CIRCLE {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in); //Take input from user
		System.out.println("Please enter radius:");
		int radius=scn.nextInt();//whtever user enter we put it in this"radius"variable
		scn.close();//after scanner class propose is done we need to close the class
		
		double perimeter=2*Math.PI*radius;//double used bcoz pi is decimal value
		//in java there a predefined Math class there where PI is a predefined constant
		System.out.println("Circle perimeter is "+perimeter);
		System.out.println("Circle perimeter is "+perimeter);

		
	}

}
