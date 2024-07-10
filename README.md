# Phone Book Project
This project was developed as part of a job interview for an Automation Engineer role at a bank. The phone book application is implemented in Java using IntelliJ IDEA. The program simulates a simple phone book, allowing users to manage contact information efficiently.

## Features
* **Add New Contact:** Users can add a new contact with first name, last name, home phone, cell phone, workplace, and email. Duplicate contacts are detected and prevented.
* **Delete Contact:** Users can delete a contact by name. If multiple contacts share the same name, only the first occurrence is removed.
* **View All Contacts:** Users can view a list of all contacts with their details.
* **Search Contact by Name:** Users can search for a contact by first name and view all occurrences.
* **Sort Contacts by Name:** Contacts can be sorted lexicographically by first name and last name.
* **Sort Contacts by Phone Number:** Contacts can be sorted by phone number in descending order.
* **Remove Duplicates:** Duplicate contacts based on name and phone number can be removed.
* **Reverse Order:** The order of contacts can be reversed.
* **Save to File:** Contacts can be saved to a text file specified by the user.
* **Load from File:** Contacts can be loaded from a specified text file, adding to the current phone book data.

The project is structured with three main classes: **Contact**, **PhoneBook**, and **Main**, following best practices and ensuring clean, maintainable code. Each class and method includes JavaDoc comments for clarity and documentation.

## Technologies Used
* Java
* IntelliJ IDEA

# Getting Started
To get a local copy up and running, follow these simple steps.

## Prerequisites
* Java Development Kit (JDK) installed
* IntelliJ IDEA installed

## Installation
1. Clone the repository

git clone https://github.com/NoamElharar/PhoneBook.git

2. Open the project in IntelliJ IDEA

3. Run the Main class to start the application

#Usage
Upon running the program, a menu will be printed to the user with the following options:

1.Add a new contact
2.Delete a contact by name
3.View all contacts
4.Search for a contact by name
5.Sort the phone book by name
6.Sort the phone book by phone number
7.Remove duplicates
8.Reverse the order of the phone book
9.Save the phone book to a file
10.Load the phone book from a file
11.Exit

After performing each operation, the menu screen will be printed again, allowing the user to perform multiple operations.

# Example
Here is an example of adding a new contact:

Phone Book Menu:
1. Add a new contact
2. Delete a contact by name
3. View all contacts
4. Search for a contact by name
5. Sort the phone book by name
6. Sort the phone book by phone number
7. Remove duplicates
8. Reverse the order of the phone book
9. Save the phone book to a file
10. Load the phone book from a file
11. Exit
Choose an option: 1
Enter first name: John
Enter last name: Doe
Enter home phone number: 123456789
Enter cellphone number: 987654321
Enter workplace: Example Corp
Enter email: john.doe@example.com
Contact added successfully

# Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

1. Fork the project
2. Create your feature branch (git checkout -b feature/AmazingFeature)
3. Commit your changes (git commit -m 'Add some AmazingFeature')
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a pull request

# Contact
Noam Elharar - noamelharar98@gmail.com




