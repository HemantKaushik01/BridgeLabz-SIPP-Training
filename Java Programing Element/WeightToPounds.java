import java.util.Scanner;
class WeightToPounds{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// Create variable weight and take user input.
		double weightInKg= input.nextInt();
		//1 pound = 2.2 kg
		
		System.out.print(" The weight of the person in pounds is " +weightInKg+ "  and in kg is " + weightInKg*2.2 );
		}
}
		