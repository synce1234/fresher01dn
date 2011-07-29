/**
 * List all contacts
 * View a contact
 * Create new contact then save
 * Edit
 * Delete
 */

package address_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Admin
 * 
 */
public class ContactDAO implements CRUD {

    private Connection conn;

    /**
     * @throws SQLException
     * 
     * @throws ClassNotFoundException
     * 
     */
    public ContactDAO() throws SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String url = "jdbc:sqlserver://localhost:1433;databaseName=GC0563";
        String userName = "sqluser";
        String password = "sqlpassword";
        conn = DriverManager.getConnection(url, userName, password);
    }

    @Override
    public boolean create(Contact c) throws SQLException {

        String sql = "INSERT INTO Contact(ContactName, Email, Phone, Address, City, State, Country) VALUES(?,?,?,?, ?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // nạp data vào trong pstmt
        pstmt.setString(1, c.getContactName());
        pstmt.setString(2, c.getEmail());
        pstmt.setString(3, c.getAddress());
        pstmt.setString(4, c.getCity());
        pstmt.setString(5, c.getCity());
        pstmt.setString(6, c.getState());
        pstmt.setString(7, c.getCountry());

        return pstmt.executeUpdate() > 0;
    }

    @Override
    public ArrayList<Contact> read() throws SQLException {

        ArrayList<Contact> listContact = new ArrayList<Contact>();
        String sqlString = "SELECT * FROM Contact";
        ResultSet rs = null;
        rs = conn.createStatement().executeQuery(sqlString);
        Contact tmpContact = null;

        while (rs.next()) {
            tmpContact = new Contact();
            
            //lấy dữ liệu
            tmpContact.setContactName(rs.getNString("ContactName"));
            tmpContact.setEmail(rs.getString("Email"));
            tmpContact.setPhone(rs.getString("Phone"));
            tmpContact.setAddress(rs.getNString("Address"));
            tmpContact.setCity(rs.getNString("City"));
            tmpContact.setState(rs.getNString("State"));
            tmpContact.setCountry(rs.getNString("Country"));

            listContact.add(tmpContact);
        }
        return listContact;
    }

    @Override
    public boolean update(long id, Contact c) throws SQLException {

        String updateString = "UPDATE Contact SET [ContactName] = ?,[Email] = ?,[Phone] = ?,[Address] = ,[City] = ?,[State] = ?,[Country] = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(updateString);

        // nạp data vào trong pstmt
        pstmt.setString(1, c.getContactName());
        pstmt.setString(2, c.getEmail());
        pstmt.setString(3, c.getAddress());
        pstmt.setString(4, c.getCity());
        pstmt.setString(5, c.getCity());
        pstmt.setString(6, c.getState());
        pstmt.setString(7, c.getCountry());

        return pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean delete(long id) throws SQLException {

        String deleteString = "DELETE FROM Contact WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(deleteString);

        return pstmt.executeUpdate() > 0;
    }

    @Override
    public Contact getContactById(long id) throws SQLException {

        Contact c = null;

        String sql = "SELCT * FROM Contact WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setLong(1, id);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            c = new Contact();

            c.setContactName(rs.getNString("ContactName"));
            c.setEmail(rs.getString("Email"));
            c.setAddress(rs.getNString("Address"));
            c.setCity(rs.getNString("City"));
            c.setState(rs.getNString("State"));
            c.setCountry(rs.getNString("Country"));
        }

        return c;
    }

    /**
     * trả về id tương ứng của Contact có name trong param
     * 
     * @param name
     * @return
     */
    public long getIdByName(String name) {

        // TODO trả về id tương ứng của Contact có name trong param
        return 0;
    }
}
