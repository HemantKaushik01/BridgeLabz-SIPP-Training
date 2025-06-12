import java.util.Scanner;
class si{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float p=sc.nextInt();
		float r=sc.nextInt();
		float t=sc.nextInt();
		double simpleInterst = (p*r*t)/100;
		System.out.print(simpleInterst);
	}
}
