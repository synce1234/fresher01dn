/**
 * Create an Address Book application uses a database to store Contact
 * information:
 * Contact name
 * Phone
 * Email
 * Address
 * It allows user to:
 * List all contacts
 * View a contact
 * Create new contact then save
 * Edit
 * Delete
 * The GUI should as below:
 */

package address_book;

/**
 * @author Admin
 * 
 */
public class Contact {

    private String contactName = "";
    private String phone = "n/a";
    private String email = "n/a";

    private String address = "n/a";
    private String city = "n/a";
    private String state = "n/a";
    private String country = "n/a";

    /**
     * 
     */
    public Contact() {

    }

    public Contact(String name, String phone, String email, String address,
            String city, String state, String country) {

        this.setAddress(address);
        this.setCity(city);
        this.setCountry(country);
        this.setEmail(email);
        this.setContactName(name);
        this.setPhone(phone);
        this.setState(state);

    }

    /**
     * @return the contactName
     */
    public String getContactName() {

        return contactName;
    }

    /**
     * @param contactName
     *            the contactName to set
     */
    public void setContactName(String contactName) {

        this.contactName = contactName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {

        return phone;
    }

    /**
     * @param phone
     *            the phone to set
     */
    public void setPhone(String phone) {

        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {

        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {

        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {

        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {

        this.address = address;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getCity() {

        return city;
    }

    public void setState(String state) {

        this.state = state;
    }

    public String getState() {

        return state;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getCountry() {

        return country;
    }

}
