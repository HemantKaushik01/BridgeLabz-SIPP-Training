import java.util.*;
class calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float number1 =sc.nextInt();
		float number2 =sc.nextInt();

		float addition = number1+number2;
		float subtraction =number1-number2;
		double multiplication = number1*number2;
		double division = number1/number2;
		

	
		System.out.println(The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+ addition +" , "+subtraction+" , " +multiplication+ " , and "+ division
);
		
}
} 