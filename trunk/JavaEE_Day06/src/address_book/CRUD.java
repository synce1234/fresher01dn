
package address_book;

import java.util.ArrayList;

/**
 * chú ý: chỉ sử dụng khi tương tác với lớp có sử dụng autoincrement id
 * 
 * @author Fresher041
 * 
 */
public interface CRUD {

    /**
     * Create - INSERT
     * chèn 1 dòng vào csdl.
     * trả về số thứ tự do RDBMS sinh ra.
     * 
     * @param c
     * @return
     */
    public abstract long create(Contact c);

    /**
     * Read - SELECT (all)
     * đọc tất cả các dòng của 1 bảng .
     * trả về 1 ArrayList các đối tượng chứa dữ liệu kiểu của bảng.
     * 
     * @return
     */
    public abstract ArrayList<Contact> read();

    /**
     * Update
     * update các thông tin từ contact mới vào contact cũ có id cung cấp ở
     * param.
     * 
     * @param id
     * @param newContact
     * @return
     */
    public abstract boolean update(long id, Contact newContact);

    /**
     * D
     * Delete 1 contact xác định bởi id
     * 
     * @param c
     * @return
     */
    public abstract boolean delete(long id);

    /**
     * trả về 1 Contact với id tương ứng với id trong param.
     * trong trg` hợp tìm k thấy thì trả về null
     * 
     * @param id
     * @return
     */
    public abstract Contact getContactById(long id);

    
}