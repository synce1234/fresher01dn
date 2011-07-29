
package address_book;

import java.sql.SQLException;
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
     * 
     * @param c
     * @return
     * @throws SQLException 
     */
    public abstract boolean create(Contact c) throws SQLException;

    /**
     * Read - SELECT (all)
     * đọc tất cả các dòng của 1 bảng .
     * trả về 1 ArrayList các đối tượng chứa dữ liệu kiểu của bảng.
     * 
     * @return
     * @throws SQLException
     */
    public abstract ArrayList<Contact> read() throws SQLException;

    /**
     * Update
     * update các thông tin từ contact mới vào contact cũ có id cung cấp ở
     * param.
     * 
     * @param id
     * @param newContact
     * @return
     * @throws SQLException
     */
    public abstract boolean update(long id, Contact newContact)
            throws SQLException;

    /**
     * D
     * Delete 1 contact xác định bởi id
     * 
     * @param c
     * @return
     * @throws SQLException 
     */
    public abstract boolean delete(long id) throws SQLException;

    /**
     * trả về 1 Contact với id tương ứng với id trong param.
     * trong trg` hợp tìm k thấy thì trả về null
     * 
     * @param id
     * @return
     * @throws SQLException 
     */
    public abstract Contact getContactById(long id) throws SQLException;

}