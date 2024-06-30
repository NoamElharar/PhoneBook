package phonebook;

// Create a 'Contact' class with string parameters of a contact.

/**
 * The {@code Contact} class represents a contact entry in a phone book.
 * It contains the first name, last name, cell phone, and optional information
 * such as home, workplace, and email.
 */
public class Contact {
    // Declare private fields for the contact class
    private String firstName;
    private String lastName;
    private String homePhone;
    private String cellPhone;
    private String workplace;
    private String email;

    // Constructor for initializing the contact

    /**
     * Constructs and initializes a new {@code Contact} with the specified parameters.
     * @param firstName the first name of the contact (mandatory field)
     * @param lastName  the last name of the contact (mandatory field)
     * @param cellPhone the cellphone of the contact (mandatory field)
     */
    public Contact(String firstName, String lastName, String cellPhone) {
        // Assign trimmed parameters to avoid unnecessary whitespaces
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.cellPhone = cellPhone.trim();

    }
// Getters & Setters
    // A setter method allows you to set or update the value of a private field while performing any necessary validation.
    //  getter method allows you to get or access the value of a private field.

    //firstName, lastName, and cellPhone
        //have only getters to make them read-only after they are set in the constructor,
        // ensuring they remain mandatory and immutable.
    //homePhone, workplace, and email
    // have both getters and setters, allowing them to be optional and modifiable.

    /**
     * Gets the first name of the contact.
     * @return the first name of the contact
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the contact.
     * @return the last name of the contact
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the cellphone of the contact.
     * @return the cellphone of the contact
     */
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * Gets the home phone of the contact.
     * @return the home phone of the contact
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the home phone of the contact
     * @param homePhone the home phone number to set
     *
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    /**
     * Gets the workplace of the contact.
     * @return the workplace of the contact
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * Sets the workplace of the contact
     * @param workplace the workplace name/company to set
     */
    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    /**
     * Get the email of the contact.
     * @return the workplace of the contact
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the contact
     * @param email the email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    //@Override Used to indicate that a method in a subclass overrides a method in its superclass,
    // providing clarity and ensuring correctness during compilation.

    /**
     * Returns a string representation of the contact.
     * The string representation consists of the contact's first name, last name,
     * home phone, cell phone, workplace, and email.
     *
     * @return
     */
    @Override
    public String toString() {
        //toString() method in the Object class returns a string consisting of the class name representation
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", workplace='" + workplace + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
