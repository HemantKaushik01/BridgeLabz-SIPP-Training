import java.util.Scanner;
class TemperaturConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Create a fahrenheit variable and take the user's input
		float Fahrenheit = input.nextFloat();
		double Celsius = (Fahrenheit -32)* 5/(double)9;
		System.out.print("The " +Fahrenheit +" fahrenheit is " + Celsius +" celsius");
	}
}