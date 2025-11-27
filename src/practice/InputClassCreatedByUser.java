package practice;

import java.util.Scanner;

public class InputClassCreatedByUser {
	private static Scanner scn = new Scanner(System.in);//created scanner object here

	public static long getLineShownToUser(String message) {
		System.out.println(message);//we're giving this prompt line to user  
		                           //to put "Please enter Base" & many more needed lines
		return scn.nextLong();//then we'll take the input from user tht is number
		                      //tht we want to put as base and many more
	}

}
