import java.util.Scanner;
class temperature{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float c=sc.nextFloat();
		double f=(c*9/5.0)+32;
		System.out.print(f);
	}
}
