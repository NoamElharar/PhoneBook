package phonebook;
import java.io.*;
import java.util.*;

/**
 * The {@code PhoneBook} class provides functionality to manage a list of contacts.
 * It supports operations such as adding, deleting, viewing, searching, sorting,
 * removing duplicates, reversing order, and saving/loading contacts to/from a file.
 *
 */
// Creating a PhoneBook class
public class PhoneBook {
    // Creating an ArrayList to store all of the contacts and initialize it.
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Creating a Scanner object for reading input from the console
    private Scanner scanner = new Scanner(System.in); //Initializing a Scanner object to read from the console


    /**
     * Adds a new contact to the phone book.
     * <p>Prompts the user to enter the first name, last name, and cell phone number of the contact.
     * Optional fields such as home phone, workplace, and email can also be provided.
     * The first name, last name, and cell phone number are mandatory fields and are validated
     * to ensure they are not empty or contain only whitespace.
     * After validation, a new {@code Contact} object is created and added to the phone book's contact list.
     *
     * <p>If a contact with the same first name, last name, and cell phone number already exists in the
     * phone book, the addition is aborted to prevent duplicates.     */
    // Add contact method
    public void addContact() {
        String firstName, lastName, cellPhone;

        // Validate first name (Mandatory field)
        while (true) {
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                System.out.println("First name is a mandatory field. cannot be empty or contain only whitespace. Please try again.");
            } else {
                break;
            }
        }

        // Validate last name (Mandatory field)
        while (true) {
            System.out.print("Enter last name: ");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.println("Last name is a mandatory field. cannot be empty or contain only whitespace. Please try again.");
            } else {
                break;
            }
        }

        // Validate cellphone number (Mandatory field)
        while (true) {
            System.out.println("Enter cellphone number:");
            cellPhone = scanner.nextLine().trim();
            if (cellPhone.isEmpty()) {
                System.out.println("Cellphone is a mandatory field. cannot be empty or contain only whitespace. Please try again.");
            } else {
                break;
            }
        }
        // Optional fields
        System.out.println("Enter home phone number (optional): ");
        String homePhone = scanner.nextLine();
        System.out.println("Enter workplace (optional): ");
        String workPlace = scanner.nextLine();
        System.out.println("Enter email (optional): ");
        String email = scanner.nextLine();


        // Check for duplicate contact
      /*  for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName) &&
                    contact.getCellPhone().equalsIgnoreCase(cellPhone)) {
                System.out.println("Contact already exists. Addition stopped.");
                return;
            }
        } */
        // Creating a new Contact object with first name, last name, and cell phone
        Contact contact = new Contact(firstName, lastName, cellPhone);
        // Setting the 3 main mandatory fields
        contact.setHomePhone(homePhone);
        contact.setWorkplace(workPlace);
        contact.setEmail(email);
        //Add the 'contact' to the contacts list which is ArrayList
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

    /**
     * Displays all contacts currently stored in the phone book.
     *
     * <p>If the phone book is empty, it prints a message indicating that there are no contacts.
     * Otherwise, it iterates through the list of contacts and prints each contact's details.
     */
    // View contacts method
    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            System.out.println("---------Contacts---------");
            // Iterate over each contact in the contacts list
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    /**
     * Deletes a contact from the phone book based on the first name.
     *<p>Prompts the user to enter the first name of the contact to delete.
     * If a contact with the specified first name is found, it is removed from the phone book.
     * If no matching contact is found, a message is printed indicating that the contact was not found.
     * If the phone book is empty, it prints a message indicating that there are no contacts to delete.</p>
     */
    // Delete contact method
    public void deleteContact() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty. Nothing to delete.");
            return;
        }

        System.out.println("Enter the first name of the contact to delete: ");
        // Search name to delete the contact
        // This line is used to read a string input from the user.
        String searchName = scanner.next();
        // 'for' loop in order to get the first name by iterate over each contact in the contact list (Ignoring Cases)
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(searchName)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found...");
    }
    /**
     * Searches for a contact in the phone book by the first name.
     *
     * <p>Prompts the user to enter the first name to search for.
     * If a contact with the specified first name is found, it prints the contact's details.
     * If no matching contact is found, it prints a message indicating that the contact was not found.
     */
    // Search contact by first name method
    public void searchContactByName() {
        System.out.println("Enter the first name to search: ");
        //Read user's input and store it in the variable searchName
        String searchName = scanner.next();
    // Iterate on every contact in the contacts list by the firstname (searchName)
        for (Contact contact : contacts) {
            //Check if contact's first name matches the search name
            if (contact.getFirstName().equalsIgnoreCase(searchName)) {
                //if yes, print the contact's details
                System.out.println(contact);
            }
        }
    }
    /**
     * Sorts the contacts in the phone book alphabetically by first name and then by last name.
     *
     * <p>Uses the {@link java.util.Comparator#comparing(java.util.function.Function)} method
     * to compare contacts based on their first names. If two contacts have the same first name,
     * they are further compared by their last names.
     *
     * <p>The sorting is performed in ascending order (A-Z) of first names.
     */

    // Sort contacts by name (from A-Z)
     // The "Comparator" is an interface that provides the 'comparing' method. </p>
     // The 'comparing' method returns a comparator.</p>
     //Creates a comparator that compares Contact objects based on their first name.</p>

    public void sortContactsByName() {

        //getFirstName is a key extractor function. it extracts the first name from a 'Contact' object.
        //same for lastName
        contacts.sort(Comparator.comparing(Contact::getFirstName).thenComparing(Contact::getLastName));
        System.out.println("Contacts sorted by name.");
    }

    // Sort contacts by phone number in descending order
    /**
     * Sorts the contacts in the phone book by their cell phone numbers in descending order.
     *
     * <p>Uses the {@link java.util.Comparator#comparing(java.util.function.Function)} method
     * to compare contacts based on their cell phone numbers. The sorting is performed in
     * descending order by reversing the natural order (ascending order).
     *
     * <p>The sorting is performed in descending order (highest to lowest) of cell phone numbers.
     */
    public void sortContactsByPhoneNumber() {
        // Sort the contacts list by cell phone number in descending order
        //*note that the default sorting is in ascending order.
        //By chaining the 'reversed()' method, you reverse the order of the comparator, making it sort in descending order instead.
        contacts.sort(Comparator.comparing(Contact::getCellPhone).reversed());
        System.out.println("Contacts sorted by phone number.");
    }
    /**
     * Removes duplicate contacts from the phone book.
     *
     * <p>Iterates through the contacts list and checks each contact against a list of unique contacts.
     * A contact is considered a duplicate if another contact with the same first name, last name,
     * and cell phone number already exists in the unique contacts list.
     *
     * <p>After identifying duplicates, the contacts list is updated to contain only unique contacts.
     * A message is printed indicating that duplicates have been removed.
     */
    // Remove duplicates
    public void removeDuplicates() {
        // Create a new list to store unique contacts that will hold objects from the 'Contact' type.
        ArrayList<Contact> uniqueContacts = new ArrayList<>();
        // Iterate over each contact in the original contacts list
        for (Contact contact : contacts) {
            // Assume the current contact is not a duplicate
            boolean isDuplicate = false;
            // Check the current contact against each contact in the uniqueContacts list
            for (Contact uniqueContact : uniqueContacts) {
                // If a contact with the same first name, last name, and cell phone is found
                if (contact.getFirstName().equalsIgnoreCase(uniqueContact.getFirstName()) &&
                        contact.getLastName().equalsIgnoreCase(uniqueContact.getLastName()) &&
                        contact.getCellPhone().equalsIgnoreCase(uniqueContact.getCellPhone())) {
                    // Mark the current contact as a duplicate
                    isDuplicate = true;
                    // Break out of the inner loop since a duplicate is found
                    break;
                }
            }
            // If the current contact is not a duplicate, add it to the uniqueContacts list
            if (!isDuplicate) {
                uniqueContacts.add(contact);
            }
        }
        // Replace the original contacts list with the list of unique contacts
        contacts = uniqueContacts;
        // Print a message indicating that duplicates have been removed
        System.out.println("Duplicates removed.");
    }
    /**
     * Reverses the order of the contacts in the phone book.
     *
     * <p>Uses the {@link java.util.Collections#reverse(List)} method to reverse the order
     * of the contacts in the list. This operation changes the order of the contacts
     * to be the opposite of their current order.
     *
     * <p>A message is printed indicating that the contacts order has been reversed.
     */
    // Reverse the order of the list
    public void reverseOrder() {
        Collections.reverse(contacts);
        System.out.println("Contacts order reversed.");
    }
    /**
     * Saves the contacts in the phone book to a specified file.
     *
     * <p>Prompts the user to enter the file name where the contacts will be saved.
     * Calls the {@link #saveContactsToFile(String)} method to perform the actual file writing process.
     * Each contact's details are written to the file in a string representation.
     *
     * <p>If an error occurs during the saving process, an error message is printed.
     */

    // Save phonebook to file
    public void saveToFile() {
        // Prompt the user to enter the file name where contacts will be saved
        System.out.println("Enter file name to save contacts: ");
        //Get file name from the user
        String fileName = scanner.next();
        //A Short method for saving the contacts to a specified file.
        saveContactsToFile(fileName);
    }
    // A method for the actual file writing process.
    // This method is private because we don't want to make effect on this section from any other code outside.
    // and also we want to hide internal processes and simplifies the class's public interface.
    /**
     * Writes the contacts in the phone book to a specified file.
     *
     * <p>This method is private to encapsulate the file writing process and prevent
     * external code from directly affecting it. It simplifies the class's public interface
     * by hiding internal processes.
     *
     * <p>Uses a try-with-resources block to ensure that the {@code BufferedWriter} is closed
     * automatically after writing. Each contact's details are written to the file in a string representation,
     * and a new line is added after each contact.
     *
     * <p>If an error occurs during the file writing process, an error message is printed.
     *
     * @param fileName the name of the file where the contacts will be saved
     */
    private void saveContactsToFile(String fileName) {
        // Try-with-resources block to ensure the BufferedWriter is closed automatically (free-up and close resources)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            //Loop through each contact in the contacts list
            for (Contact contact : contacts) {
                // Write the string representation of each contact to the file
                writer.write(contact.toString());
                // Move to a new line after writing each contact
                writer.newLine();
            }
            // Print a success message after all contacts are saved
            System.out.println("Contacts saved to file.");
        }
        catch (IOException error) {
            // Print an error message if an IOException occurs
            System.out.println("An error occurred while saving contacts.");
        }
    }

    /**
     * Loads contacts from a specified file and adds them to the phone book.
     *
     * <p>This method prompts the user to enter the file name from which contacts will be loaded.
     * It reads the contents of the file line by line, splits each line into contact parameters,
     * and creates a new {@code Contact} object for each valid entry. The contact is then added
     * to the phone book's contact list.
     *
     * <p>If an error occurs during the file reading process, such as if the file does not exist
     * or cannot be read, an error message is printed.
     *
     * @throws IOException if an I/O error occurs during reading the file
     */
    // Load phonebook from file
    public void loadFromFile() {
        System.out.println("Enter file name to load contacts from: ");
        String fileName = scanner.next();

        // Open the specified file and read its contents line by line.
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file until the end is reached ('null').
            while ((line = reader.readLine()) != null) {
                // Split each line into all contact parameters.
                String[] details = line.split(",");
                // Check in the array if it contains 6 elements.
                if (details.length == 6) {
                    String firstName = details[0].trim();
                    String lastName = details[1].trim();
                    String homePhone = details[2].trim();
                    String cellPhone = details[3].trim();
                    String workplace = details[4].trim();
                    String email = details[5].trim();
                    //Create a new 'Contact' object and add it to the 'contacts' list.
                    Contact contact = new Contact(firstName, lastName, cellPhone);
                    //Set all the parameters to add the contact.
                    contact.setHomePhone(homePhone);
                    contact.setWorkplace(workplace);
                    contact.setEmail(email);
                    contacts.add(contact);
                }
            }
            System.out.println("Contacts loaded from file.");
        }
        // Print an error message if an IOException occurs while loading the contacts
        // Example: the file doesn't exist or can't be read.
        catch (IOException error) {
            System.out.println("An error occurred while loading contacts.");
        }
    }
}
