import java.util.*;
class DiscountFees{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int fees = sc.nextInt();
		double discountPercent=sc.nextDouble();
		double discountAmount = (fees*discountPercent)/100;
		

	
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+ (fees-discountAmount));
		}
} 