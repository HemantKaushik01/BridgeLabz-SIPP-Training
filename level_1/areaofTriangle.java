import java.util.*;
class areaOfTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float baseInCm =sc.nextFloat();
		float heightInCm =sc.nextFloat();
		double areaInCm = (1/2.0)*baseInCm*heightInCm;
		double areaInInches = areaInCm/(2.54*2.54); 
		

	
		System.out.println("Triangle area in cm is "+ areaInCm + " and inches is " + areaInInches);
		}
} 