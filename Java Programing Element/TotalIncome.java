import java.util.*;
class TotalIncome{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Salary of a person : ");
		int salary =input.nextInt();
		System.out.print("Bonus of a person : ");
		int bonus = input.nextInt();
		
		System.out.print("The salary is INR "+ salary +" and the bonus is INR " +bonus + " . Hence Total Income is INR " + (salary+bonus));
		
		
		}
} 