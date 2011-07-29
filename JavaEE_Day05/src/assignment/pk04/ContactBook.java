
package assignment.pk04;

import java.util.ArrayList;

/**
 * 4. Hãy tạo ra sổ ghi nhớ của chính bạn, nơi mà những con số được nhập vào như
 * sau:
 * Joy 34543
 * Jack 56765
 * Tina 34567
 * Bảng 4.14
 * Chương trình phải làm như sau:
 *  Kiểm tra xem số 3443 có tồn tại trong sổ ghi nhớ của bạn hay không.
 *  Kiểm tra xem mẫu tin của Jack có hiện hữu trong sổ ghi nhớ của bạn hay
 * không.
 *  Hiển thị số điện thoại của Tina.
 *  Xoá số điện thoại của Joy.
 *  Hiển thị các mẫu tin còn lại.
 * 
 * @author Fresher041
 * 
 */
public class ContactBook {

    private ArrayList<ContactEntry> listEntry = new ArrayList<ContactEntry>();

    public void setListEntry(ArrayList<ContactEntry> listEntry) {

        this.listEntry = listEntry;
    }

    public ArrayList<ContactEntry> getListEntry() {

        return listEntry;
    }

    public ContactBook() {

        this.listEntry = new ArrayList<ContactEntry>();
    }

    public void add(ContactEntry ce) {

        this.listEntry.add(ce);
    }
    
    /**
     * Kiểm tra xem số 3443 có tồn tại trong sổ ghi nhớ của bạn hay không.
     * 
     * @param cb
     * @param number
     * @return
     */
    public ContactEntry searchByNumber(int number) {

        for (ContactEntry ce : this.getListEntry()) {
            if (ce.getNumber() == number) {
                return ce;
            }
        }
        return null;
    }

    /**
     * Kiểm tra xem mẫu tin của Jack có hiện hữu trong sổ ghi nhớ của bạn hay
     * không.
     * 
     * @param cb
     * @param name
     * @return
     */
    public ContactEntry searchByName(String name) {

        for (ContactEntry ce : this.getListEntry()) {
            if (ce.getName().equalsIgnoreCase(name)) {
                return ce;
            }
        }
        return null;
    }

    /**
     * *  Hiển thị số điện thoại của Tina.
     * 
     * @param cb
     * @param name
     * @return
     */
    public int showNumber( String name) {

        ContactEntry ce = searchByName(name);
        if (ce != null) {
            return ce.getNumber();
        }
        return 0;
    }

    /**
     * *  Xoá số điện thoại của Joy.
     * 
     * @param cb
     * @param name
     */
    public void delete(String name) {

        ContactEntry ce = searchByName(name);
        if (ce != null) {
            this.getListEntry().remove(ce);
        }
    }
    
    public void delete(ContactEntry ce){
        this.getListEntry().remove(ce);
    }
    
    
    public void show() {
        for(ContactEntry ce : this.getListEntry()){
            System.out.println(ce.toString());
        }
    }
}
