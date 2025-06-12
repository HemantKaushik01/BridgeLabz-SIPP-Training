import java.util.Scanner;
class SwapTwoNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// Create variable number1 and number2 take user input.
		int number1= input.nextInt();
		int number2 =input.nextInt();
		// swap to number
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.print("The swapped numbers are number1 : " + number1 + " and number2 : " +number2);
		}
}
		