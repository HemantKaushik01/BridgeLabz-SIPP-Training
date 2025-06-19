import java.util.Scanner;

public class ArrayIndexOutOfBoundException {

       public static void handleException(String[] names) {
        try {
            System.out.println("\nHandling Exception:");
            System.out.println("Accessing names[" + names.length + "]: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of names from user
        System.out.print("Enter number of names: ");
        int size = input.nextInt();
        input.nextLine(); 
        // Declare and take names as input
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name[" + i + "]: ");
            names[i] = input.nextLine();
        }

        // Step 1: Call method to generate unhandled exception (comment after observing)
        // generateException(names); // Uncomment to see abrupt stop

        // Step 2: Call method to handle exception safely
        handleException(names);
    }
}
