/**
 * List all contacts
 * View a contact
 * Create new contact then save
 * Edit
 * Delete
 */

package address_book;

import java.util.ArrayList;

/**
 * @author Admin
 * 
 */
public class ContactBook implements CRUD {

    ArrayList<Contact> listContact = new ArrayList<Contact>();

    /**
     * 
     */
    public ContactBook() {

    }

    /* (non-Javadoc)
     * @see address_book.CRUD#create(address_book.Contact)
     */
    @Override
    public long create(Contact c) {

        
        return 0;
    }

    /* (non-Javadoc)
     * @see address_book.CRUD#read()
     */
    @Override
    public ArrayList<Contact> read() {

        return null;
    }

    /* (non-Javadoc)
     * @see address_book.CRUD#update(address_book.Contact)
     */
    @Override
    public boolean update(long id, Contact newContact) {

        return false;
    }

    /* (non-Javadoc)
     * @see address_book.CRUD#delete(address_book.Contact)
     */
    @Override
    public boolean delete(long id) {

        return false;
    }

    @Override
    public Contact getContactById(long id) {

        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * trả về id tương ứng của Contact có name trong param
     * @param name
     * @return
     */
    public long getIdByName(String name){
        return 0;
    }
}
