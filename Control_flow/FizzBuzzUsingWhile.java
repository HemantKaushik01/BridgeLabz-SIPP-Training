import java.util.Scanner;

class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
	int i=1;

        if (number > 0) {
            System.out.println("FizzBuzz Output:");
            while ( i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
		i++;
            }
        } else {
            System.out.println("Not a positive integer.");
        }

        scanner.close();
    }
}
