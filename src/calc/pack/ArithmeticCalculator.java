package calc.pack;
import java.util.Scanner;

public class ArithmeticCalculator {
	
	static double num1, num2;
	

	
	public static void main(String[] args) {
		String choice = "";
		int choice2;
		
		float result = 0;
		Scanner buf = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		num1 = buf.nextDouble();
		System.out.println("Enter the Second Number: ");
		num2 = buf.nextDouble();
		
		System.out.println("\n1: Addition \n2: Subraction");
		System.out.println("3: Multiplication \n4: Division");
		System.out.print("5: Remainder\n6: Exit\n");
		System.out.println("Enter the Operator : ");
		choice = buf.next();
		System.out.println("valid operator="+isValid(choice));
		if(isValid(choice))
		{
		choice2 = Integer.parseInt(choice);
		
		switch(choice2){
			case 1:
				result = (float) (num1+num2);
				break;
			case 2:
				result = (float) (num1 - num2);
				break;
			case 3:
				result = (float) (num1 * num2);
				break;
			case 4:
				result = (float)((float)num1 / (float)num2);
				break;
			case 5:
				result = (float) (num1%num2);
				break;
			case 6:
				break;
			default:
				buf.close();
				System.out.println("An Invalid Choice!!! \n");
				System.exit(0);
					
		}
		if(choice2>=1 && choice2<=5)
            System.out.println("Result is: " + result);
		}
		else
		{
			System.out.println("Please enter valid operator ");
		}
		
		

	}
	
	static boolean isValid(String choice) {
		
		String regex = "-?\\d+(\\.\\d+)?";		
		return choice.matches(regex);
		
		
	}



}
