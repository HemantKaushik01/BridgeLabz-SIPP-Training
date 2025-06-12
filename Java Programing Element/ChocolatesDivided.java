import java.util.Scanner;
class ChocolatesDivided{
 	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Get an integer value from the user for the numberOfchocolates and numberOfChildren.
		int numberOfChocolates = input.nextInt();
		int numberOfChildren = input.nextInt();
		System.out.print("The number of chocolates each child gets is "+ numberOfChocolates/numberOfChildren +" and the number of remaining chocolates is " + numberOfChocolates%numberOfChildren);
	}
}

		
		