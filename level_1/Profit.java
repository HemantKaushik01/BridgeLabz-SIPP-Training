class Profit{
	public static void main(String[] args){
		int CostPrice =2000;
		int SellingPrice = 2025;
		int profit = SellingPrice - CostPrice ;
		double ProfitPercentage = (profit/(double)CostPrice)*100;
		
		System.out.println("The Cost Price is INR "+ CostPrice +" and Selling Price is INR "+SellingPrice);
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+ ProfitPercentage);
		}
} 