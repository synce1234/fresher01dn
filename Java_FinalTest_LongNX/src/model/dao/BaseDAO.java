
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseDAO {

    private Connection conn     = null;
    private String     url      = "jdbc:sqlserver://localhost:1433;databaseName=Java_FinalTest_LongNX";
    private String     user     = "user01";
    private String     password = "password01";

    public BaseDAO() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }

    public boolean openConnection() throws SQLException {

        boolean r = false;
        this.conn = DriverManager.getConnection(url, user, password);
        if (conn != null) {
            r = true;
        }
        return r;
    }

    public boolean closeConnection() throws SQLException {

        boolean res = false;
        if (this.conn != null) {
            this.conn.close();
        }
        return res;
    }

    public Statement createStatement() throws SQLException {

        Statement st = null;
        st = this.conn.createStatement();
        return st;
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {

        PreparedStatement ps = null;
        ps = this.conn.prepareStatement(sql);
        return ps;
    }

    
    public Connection getConn() {
    
        return this.conn;
    }

    
    public void setConn(Connection conn) {
    
        this.conn = conn;
    }

    
    public String getUrl() {
    
        return this.url;
    }

    
    public void setUrl(String url) {
    
        this.url = url;
    }

    
    public String getUser() {
    
        return this.user;
    }

    
    public void setUser(String user) {
    
        this.user = user;
    }

    
    public String getPassword() {
    
        return this.password;
    }

    
    public void setPassword(String password) {
    
        this.password = password;
    }
}
