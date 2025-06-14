import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if input is a positive integer
        if (number > 0) {
            System.out.println("FizzBuzz Output:");
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Not a positive integer.");
        }

        scanner.close();
    }
}
