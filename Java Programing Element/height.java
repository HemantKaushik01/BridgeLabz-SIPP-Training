import java.util.*;
class height{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double heightInCentimeter = sc.nextDouble();
		double heightInInches = heightInCentimeter/(2.54);
		double heightInFeet = heightInInches/12;
		

	
		System.out.println("Your Height in cm is "+ heightInCentimeter + " while in feet is "+ heightInFeet+ " and inches is " + heightInInches);
		}
} 