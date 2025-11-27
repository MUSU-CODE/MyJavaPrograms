package practice;

public class WAP_TO_FIND_SUM_OF_FIRST_N_NATURAL_NUMBERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // LOGIC is if 1+2+3=6 then n is 3 so n(n+1)/2 so 3(3+1)/2 = 3*4/2 = 12/2 = 6
		//other logic is we'll run a for loop where the loop will start from 1 and end 
		//at last number for example here is 3
		
		int num=InputClassCreatedByUser.getNewIntLineShownToUser("Enter the Number");
		//int result=getUsingFormula(num);
		int result=getUsingForLoop(num);
		System.out.println("Sum of first "+num+" numbers is "+result);
	}
	
	/*public static int getUsingFormula(int n) {
		int result = n*(n+1)/2;
		return result;
	}*/
	
	//whnever our logic or for loop involves multiplication then we create a variable 
	//like we create "result" here and store 1 but if our logic or forLoop involves 
	//addition then we create a variable and store 0
    public static int getUsingForLoop(int num) {
		int result=0;
		for(int i=1; i<=num; i++) {
			result=result+i;
		}
		return result;
	}

}
