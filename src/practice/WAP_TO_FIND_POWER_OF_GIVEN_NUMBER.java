package practice;

import java.util.Scanner;

public class WAP_TO_FIND_POWER_OF_GIVEN_NUMBER {
	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in); //Take input from user
//		System.out.println("Please enter Base:");
//		long base=scn.nextLong();//long ued so we can take big value
//		System.out.println("Please enter Exponent:");
//		long exponent=scn.nextLong();
//		scn.close();
//instead of all ScannerLines,we created reusableClass called "InputClassCreatedByUser"
// and use tht in place of scanner   also   to comment out whole session we use ctl+A+/
		
	long base = InputClassCreatedByUser.getLineShownToUser("Please enter Base:");
	//InputClassCreatedByUser is class, getLineShownToUser is the method of tht class
	long exponent = InputClassCreatedByUser.getLineShownToUser("Please enter Exponent:");
	
	//ThumbRule is always handel special case first
	//Here special case is any number to the power zero is one
	if(exponent == 0) 
	{ System.out.println(base+ "to the power" +exponent+ "=" +1 ); 
	  return; //if user put exponent=0 then we'll always find 1 so we found our answer
	}        //so no need to run the program now so we wrote "return" so the program
	         //will stop and come out of "main" method
	
	//whnever our logic or for loop involves multiplication then we create a variable 
	//like we create "result" here and store 1 but if our logic or forLoop involves 
	//addition then we create a variable and store 0
	//main logic
	long result=1;
	for(int i=1; i<=exponent; i++) //if our exponent is 3 then loop will run 3 times
	{ result = result*base;   }
	System.out.println(base+ "to the power" +exponent+ "=" +result);
	
  }
}