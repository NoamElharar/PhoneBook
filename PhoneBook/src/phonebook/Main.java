package phonebook;
import java.util.Scanner;
/**
 * The main class of the PhoneBook application.
 *
 * <p>This class contains the main method which serves as the entry point of the application.
 * It initializes a {@code PhoneBook} object and provides a simple command-line interface
 * for users to interact with the phone book. Users can add, view, delete, search, sort,
 * and remove duplicate contacts, as well as save and load contacts from a file.
 *
 * <p>The class demonstrates basic functionalities of a phone book and how to handle
 * contact management through a user-friendly console interface.
 */
public class Main {
    public static void main(String[] args) {
// Record the current time in nanoseconds to measure elapsed time with high precision
    long start = System.currentTimeMillis();
    // Declaring and Initializing a new PhoneBook object.
        PhoneBook phoneBook = new PhoneBook();
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Initialize a boolean variable 'exit' to manage the loop control (initially false)
        boolean exit = false;

        //Creating a while loop that will continue until the user chooses to exit.
        while (!exit) {
            // Display the phone book menu options
            System.out.println("Phone Book Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Delete a contact by name");
            System.out.println("3. View all contacts");
            System.out.println("4. Search for a contact by name");
            System.out.println("5. Sort the phone book by name");
            System.out.println("6. Sort the phone book by phone number");
            System.out.println("7. Remove duplicates");
            System.out.println("8. Reverse the order of the phone book");
            System.out.println("9. Save the phone book to a file");
            System.out.println("10. Load the phone book from a file");
            System.out.println("11. Exit");
            // Prompt the user to choose an option
            System.out.print("Choose an option: ");
            // Set an int variable 'choice' to store the user's selected menu option
            int choice = scanner.nextInt();
            // Use a switch statement to handle the user's menu choice
            switch (choice) {
                //Every case is a 'call' to a method in the phonebook
                //The 'break' keyword is used to terminate a case and prevent the program from executing the subsequent cases unintentionally.
                case 1:
                    phoneBook.addContact();
                    break;
                case 2:
                    phoneBook.deleteContact();
                     break;
                case 3:
                    phoneBook.viewContacts();
                    break;
                case 4:
                    phoneBook.searchContactByName();
                    break;
                case 5:
                    phoneBook.sortContactsByName();
                    break;
                case 6:
                    phoneBook.sortContactsByPhoneNumber();
                    break;
                case 7:
                    phoneBook.removeDuplicates();
                    break;
                case 8:
                    phoneBook.reverseOrder();
                    break;
                case 9:
                    phoneBook.saveToFile();
                    break;
                case 10:
                    phoneBook.loadFromFile();
                    break;
                case 11:
                    // Set 'exit' to true to end the loop and exit the program
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
// Calculate the duration in milliseconds by subtracting the start time from the current time,
// then dividing the result by 1,000,000 to convert from nanoseconds to milliseconds.
// If you want the result in seconds, divide by 1,000,000,000 (i.e., 1 billion or 10^9).
    long duration = (System.currentTimeMillis() - start)/1000;
    System.out.println("Duration: " + duration + "s");

    }

}
