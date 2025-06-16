import java.util.*;
class TotalOfArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of array : "); 
				double arr[]=new double[10];
		int idx = 0;
		while(true){
			double value = input.nextDouble();
			if(idx>10 ||  value<=0.0){
				break;
			}
			arr[idx]=value;
			idx++;
		}
		double total = 0.0;
		for(int i=0;i<10;i++){
			total += arr[i];
		}
		System.out.print("Sum of total element of the array : " +total);
			
		
	}
}