
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.BeeDAO;
import model.dto.Bee;
import viewmodel.BeeViewModel;

/**
 * Servlet implementation class BeeServlet
 */
public class BeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeeServlet() {

        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rp)
            throws ServletException, IOException {

        BeeDAO bd = null;
        try {
            bd = new BeeDAO();
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        ArrayList<Bee> alb = null;
        try {
            alb = bd.read();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        BeeViewModel bvm = new BeeViewModel(alb);
        rq.setAttribute("bvm", bvm);
        HttpSession sess = rq.getSession(true);
        sess.setAttribute("bvm", bvm);
        RequestDispatcher rd = null;
        rd = rq.getRequestDispatcher("bee-management.jsp");
        rd.forward(rq, rp);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rp)
            throws ServletException, IOException {

        int id = 0;
        try {
            id = Integer.parseInt(rq.getParameter("id"));
        } catch (NumberFormatException exc) {
            exc.printStackTrace();
        }
        BeeDAO bd = null;
        try {
            bd = new BeeDAO();
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        Bee b = null;
        try {
            b = bd.getById(id);
        } catch (SQLException exc) {
            // TODO Auto-generated catch block
            exc.printStackTrace();
        }
        int randomDamage = (int) (Math.random() * 100);
        b.damage(randomDamage);
        try {
            bd.update(b.getId(), b);
        } catch (SQLException exc1) {
            exc1.printStackTrace();
        }
        ArrayList<Bee> alb = null;
        try {
            alb = bd.read();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        BeeViewModel bvm = new BeeViewModel(alb);
        rq.setAttribute("bvm", bvm);
        HttpSession sess = rq.getSession(true);
        sess.setAttribute("bvm", bvm);
        RequestDispatcher rd = null;
        rd = rq.getRequestDispatcher("bee-management.jsp");
        rd.forward(rq, rp);
    }
}
