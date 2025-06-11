class volume{
	public static void main(String[] args){
		int radiusOfEarthInKm = 6378;
		double radiusOfEarthInMiles = 6378 * 0.62;
		double discountPercent=10;
		double volumeInKm= (4/(double)3) *3.14* (radiusOfEarthInKm*radiusOfEarthInKm*radiusOfEarthInKm);
		double volumeInMiles = (4/(double)3) *3.14* (radiusOfEarthInMiles*radiusOfEarthInMiles*radiusOfEarthInMiles);
		

	
		System.out.println(" The volume of earth in cubic kilometers is "+ volumeInKm+ " and cubic miles is "+volumeInMiles);
		}
} 