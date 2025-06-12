class Discount{
	public static void main(String[] args){
		int fees = 125000;
		double discountPercent=10;
		double discountAmount = (fees*discountPercent)/100;
		

	
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+ (fees-discountAmount));
		}
} 