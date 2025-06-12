import java.util.*;
class TriangleRounds{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Each side in Meter
		System.out.println("Taking 3 sides input form the user: ");
		int side1 = sc.nextInt();
		int side2 =sc.nextInt();
		int side3 = sc.nextInt();
		double distance = 5; // distance given in Km;
		distance=distance*1000; // for converting in meter;
		int perimeterOfTriangle = side1+side2+side3;
		System.out.print("The total number of rounds the athlete will run is " +(distance/(double)perimeterOfTriangle)+ " to complete 5 km");
		
		}
} 