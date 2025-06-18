package String;

import java.util.ArrayList;
import java.util.Scanner;

class BookStore {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> author = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        System.out.print("How many books do you want to enter initially? ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Title: ");
            title.add(input.next());
            System.out.print("Author: ");
            author.add(input.next());
            System.out.print("Price: ");
            price.add(input.nextInt());
        }

        System.out.println("\n--- Add New Book ---");
        addNewBook(title, author, price);

        System.out.println("\n--- Remove Book ---");
        System.out.print("Enter title of book to remove: ");
        String titleOfBook = input.next();
        removeBook(title, author, price, titleOfBook);

        System.out.println("\n--- Search Book ---");
        System.out.print("Enter title of book to search: ");
        String search = input.next();
        searchBook(title, author, price, search);

        System.out.println("\n--- Display All Books ---");
        display(title, author, price);
    }

    public static void addNewBook(ArrayList<String> title, ArrayList<String> author, ArrayList<Integer> price) {
        System.out.print("Enter title: ");
        title.add(input.next());
        System.out.print("Enter author: ");
        author.add(input.next());
        System.out.print("Enter price: ");
        price.add(input.nextInt());

        System.out.print("Do you want to add more books? (true/false): ");
        if (input.nextBoolean()) {
            addNewBook(title, author, price);
        }
    }

    public static void removeBook(ArrayList<String> title, ArrayList<String> author, ArrayList<Integer> price, String titleOfBook) {
        boolean found = false;
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(titleOfBook)) {
                title.remove(i);
                author.remove(i);
                price.remove(i);
                System.out.println("Book removed successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }

        System.out.print("Do you want to remove another book? (true/false): ");
        if (input.nextBoolean()) {
            System.out.print("Enter title of book to remove: ");
            titleOfBook = input.next();
            removeBook(title, author, price, titleOfBook);
        }
    }

    public static void searchBook(ArrayList<String> title, ArrayList<String> author, ArrayList<Integer> price, String search) {
        boolean found = false;
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(search)) {
                System.out.println("Book found:");
                System.out.println("Title: " + title.get(i));
                System.out.println("Author: " + author.get(i));
                System.out.println("Price: " + price.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }

        System.out.print("Do you want to search for another book? (true/false): ");
        if (input.nextBoolean()) {
            System.out.print("Enter title of book to search: ");
            search = input.next();
            searchBook(title, author, price, search);
        }
    }

    public static void display(ArrayList<String> title, ArrayList<String> author, ArrayList<Integer> price) {
        if (title.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("Book List:");
        for (int i = 0; i < title.size(); i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + title.get(i));
            System.out.println("Author: " + author.get(i));
            System.out.println("Price: " + price.get(i));
            System.out.println("---------------------------");
        }
    }
}
