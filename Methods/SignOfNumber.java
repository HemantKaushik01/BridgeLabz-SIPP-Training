import java.util.Scanner;
class SignOfNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a numbers : ");
		int number = input.nextInt();
		SignOfNumber obj = new SignOfNumber();
		System.out.println(  obj.fun(number));
	}
	public int fun(int number){
		
		if(number>0){
			return 1;
		}
		else if(number<0){
			return -1;

		}
		else{
			
		        return 0;
		}

	}
}
