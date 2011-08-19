
package util;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.BeeDAO;
import model.dto.Bee;
import model.dto.Drone;
import model.dto.Queen;
import model.dto.Worker;

public class DataInit {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Bee> alb = new ArrayList<Bee>();
        BeeDAO bd = null;
        try {
            bd = new BeeDAO();
        } catch (ClassNotFoundException exc) {
            // TODO Auto-generated catch block
            exc.printStackTrace();
        } catch (SQLException exc) {
            // TODO Auto-generated catch block
            exc.printStackTrace();
        }
        Bee d = null;
        Bee q = null;
        Bee w = null;
        for (int i = 0; i < 10; i++) {
            d = new Drone((Math.random() * 100));
            q = new Queen((Math.random() * 100));
            w = new Worker((Math.random() * 100));
            alb.add(d);
            alb.add(q);
            alb.add(w);
        }
        for (Bee b : alb) {
            try {
                bd.create(b);
            } catch (SQLException exc) {
                // TODO Auto-generated catch block
                exc.printStackTrace();
            }
        }
    }
}
