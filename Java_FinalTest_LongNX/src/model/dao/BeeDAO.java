/**
 * 
 */

package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.dto.Bee;
import model.dto.Drone;
import model.dto.Queen;
import model.dto.Worker;

/**
 * @author Fresher041
 * 
 */
public class BeeDAO extends BaseDAO {

    public static void main(String[] args) {

    }

    public BeeDAO() throws ClassNotFoundException, SQLException {

        super();
        // TODO Auto-generated constructor stub
    }

    public boolean create(Bee b) throws SQLException {

        boolean r = false;
        super.openConnection();
        String sql = "INSERT INTO bee(type,health,deadline,dead) VALUES(?,?,?,?)";
        PreparedStatement ps = super.prepareStatement(sql);
        ps.setString(1, b.getType());
        ps.setDouble(2, b.getHealth());
        ps.setInt(3, b.getDeadline());
        ps.setBoolean(4, b.isDead());
        r = ps.executeUpdate() > 0;
        super.closeConnection();
        return r;
    }

    public Bee getById(int id) throws SQLException {

        Bee b = null;
        super.openConnection();
        String sql = "SELECT * FROM bee WHERE id = ?";
        PreparedStatement ps = super.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        String type = null;
        while (rs.next()) {
            type = rs.getString("type");
            if (type.equalsIgnoreCase(Drone.TYPE)) {
                b = new Drone(rs.getInt("id"), rs.getBoolean("dead"),
                        rs.getInt("deadline"), rs.getDouble("health"),
                        rs.getString("type"));
            } else
                if (type.equalsIgnoreCase(Queen.TYPE)) {
                    b = new Queen(rs.getInt("id"), rs.getBoolean("dead"),
                            rs.getInt("deadline"), rs.getDouble("health"),
                            rs.getString("type"));
                } else
                    if (type.equalsIgnoreCase(Worker.TYPE)) {
                        b = new Worker(rs.getInt("id"), rs.getBoolean("dead"),
                                rs.getInt("deadline"), rs.getDouble("health"),
                                rs.getString("type"));
                    }
        }
        super.closeConnection();
        return b;
    }

    public ArrayList<Bee> read() throws SQLException {

        ArrayList<Bee> alb = new ArrayList<Bee>();
        super.openConnection();
        String sql = "SELECT * FROM bee";
        Statement st = super.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Bee b = null;
        String type = null;
        while (rs.next()) {
            type = rs.getString("type");
            if (type.equalsIgnoreCase(Drone.TYPE)) {
                b = new Drone(rs.getInt("id"), rs.getBoolean("dead"),
                        rs.getInt("deadline"), rs.getDouble("health"),
                        rs.getString("type"));
            } else
                if (type.equalsIgnoreCase(Queen.TYPE)) {
                    b = new Queen(rs.getInt("id"), rs.getBoolean("dead"),
                            rs.getInt("deadline"), rs.getDouble("health"),
                            rs.getString("type"));
                } else
                    if (type.equalsIgnoreCase(Worker.TYPE)) {
                        b = new Worker(rs.getInt("id"), rs.getBoolean("dead"),
                                rs.getInt("deadline"), rs.getDouble("health"),
                                rs.getString("type"));
                    }
            alb.add(b);
        }
        super.closeConnection();
        return alb;
    }

    public boolean update(int id, Bee b) throws SQLException {

        boolean r = false;
        super.openConnection();
        String sql = "UPDATE bee SET type=?, health = ?, deadline = ?, dead = ? WHERE id = ?";
        PreparedStatement ps = super.prepareStatement(sql);
        ps.setString(1, b.getType());
        ps.setDouble(2, b.getHealth());
        ps.setInt(3, b.getDeadline());
        ps.setBoolean(4, b.isDead());
        ps.setInt(5, id);
        r = ps.executeUpdate() > 0;
        super.closeConnection();
        return r;
    }
}
