
package assignment.pk04;

public class ContactEntry {

    private String name;
    private int number;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setNumber(int phoneNumber) {

        this.number = phoneNumber;
    }

    public int getNumber() {

        return number;
    }
    
    public ContactEntry(){}
    
    public String toString() {
        return this.getName() + "  " + String.valueOf(this.getNumber());
    }
}
