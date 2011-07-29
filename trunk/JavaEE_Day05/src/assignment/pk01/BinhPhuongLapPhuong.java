package assignment.pk01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BinhPhuongLapPhuong {

    private JFrame frmBnhPhng;
    private JTextField textN;
    private JTextField txtBinhPhuong;
    private JTextField txtLapPhuong;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BinhPhuongLapPhuong window = new BinhPhuongLapPhuong();
                    window.frmBnhPhng.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public BinhPhuongLapPhuong() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmBnhPhng = new JFrame();
        frmBnhPhng.setFont(new Font("Tahoma", Font.PLAIN, 12));
        frmBnhPhng.setTitle("Bình phương - Lập phương");
        frmBnhPhng.setBounds(100, 100, 305, 124);
        frmBnhPhng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmBnhPhng.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Nhập vào một số :");
        lblNewLabel.setBounds(13, 7, 106, 14);
        lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
        frmBnhPhng.getContentPane().add(lblNewLabel);

        JLabel lblBnhPhng = new JLabel("Bình phương :");
        lblBnhPhng.setBounds(34, 38, 85, 14);
        lblBnhPhng.setHorizontalTextPosition(SwingConstants.RIGHT);
        frmBnhPhng.getContentPane().add(lblBnhPhng);

        JLabel lblLpPhng = new JLabel("Lập phương :");
        lblLpPhng.setBounds(34, 69, 85, 14);
        lblLpPhng.setHorizontalTextPosition(SwingConstants.RIGHT);
        frmBnhPhng.getContentPane().add(lblLpPhng);

        textN = new JTextField();
        textN.setHorizontalAlignment(SwingConstants.RIGHT);
        textN.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent arg0) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                int n = 0;
                // String tmp = "";
                try {
                    n = Integer.parseInt(textN.getText());
                } catch (NumberFormatException e1) {
//                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, e1.getMessage());
                }
                int binhPhuong = n * n;
                int lapPhuong = n * n * n;
                txtBinhPhuong.setText(String.valueOf(binhPhuong));
                txtLapPhuong.setText(String.valueOf(lapPhuong));
            }
        });
        textN.setBounds(129, 4, 156, 20);
        frmBnhPhng.getContentPane().add(textN);
        textN.setColumns(10);

        txtBinhPhuong = new JTextField();
        txtBinhPhuong.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBinhPhuong.setBounds(129, 35, 156, 20);
        frmBnhPhng.getContentPane().add(txtBinhPhuong);
        txtBinhPhuong.setColumns(10);

        txtLapPhuong = new JTextField();
        txtLapPhuong.setHorizontalAlignment(SwingConstants.RIGHT);
        txtLapPhuong.setBounds(129, 66, 156, 20);
        frmBnhPhng.getContentPane().add(txtLapPhuong);
        txtLapPhuong.setColumns(10);
    }
}
