
package assignment.pk03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MinMaxUI {

    private JFrame frame;
    private JTextField txtInput;
    private JTextField txtBinhPhuongSoMax;
    private JTextField txtBinhPhuongSoMin;
    private JTextField txtMin;
    private JTextField txtMax;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    MinMaxUI window = new MinMaxUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MinMaxUI() {

        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 591, 289);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtInput = new JTextField();
        txtInput.setBounds(10, 36, 563, 20);
        frame.getContentPane().add(txtInput);
        txtInput.setColumns(10);

        JLabel lblNhpDy = new JLabel(
                "Nhập 1 dãy các số nguyên, phân cách với nhau bằng dấu space");
        lblNhpDy.setFont(new Font("Dialog", Font.BOLD, 12));
        lblNhpDy.setBounds(10, 11, 422, 14);
        frame.getContentPane().add(lblNhpDy);

        JButton btnTinh = new JButton("Tìm số min & max theo bình phương");
        btnTinh.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

            }
        });
        btnTinh.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

                String str = txtInput.getText();

                String[] mangSo = str.split(" ");

                ArrayList<Integer> mangCacDoiTuongSoNguyen = new ArrayList<Integer>();
                Integer temp = null;
                for (int i = 0; i < mangSo.length; i++) {
                    try {
                        temp = Integer.valueOf(mangSo[i]);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    mangCacDoiTuongSoNguyen.add(temp);
                }

                int min = BinhPhuongMinMax
                        .binhPhuongMin(mangCacDoiTuongSoNguyen);
                int max = BinhPhuongMinMax
                        .binhPhuongMax(mangCacDoiTuongSoNguyen);

                txtMin.setText(String.valueOf(min));
                txtMax.setText(String.valueOf(max));
            }
        });
        btnTinh.setBounds(231, 67, 342, 23);
        frame.getContentPane().add(btnTinh);

        JLabel lblNewLabel = new JLabel("Số: ");
        lblNewLabel.setBounds(10, 101, 112, 14);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblCBnhPhng = new JLabel("Có bình phương lớn nhất là: ");
        lblCBnhPhng.setBounds(305, 101, 172, 14);
        frame.getContentPane().add(lblCBnhPhng);

        txtBinhPhuongSoMax = new JTextField();
        txtBinhPhuongSoMax.setBounds(487, 101, 86, 20);
        frame.getContentPane().add(txtBinhPhuongSoMax);
        txtBinhPhuongSoMax.setColumns(10);

        JLabel label = new JLabel("Số: ");
        label.setBounds(10, 129, 112, 14);
        frame.getContentPane().add(label);

        JLabel lblCBnhPhng_1 = new JLabel("Có bình phương bé nhất là: ");
        lblCBnhPhng_1.setBounds(305, 129, 172, 14);
        frame.getContentPane().add(lblCBnhPhng_1);

        txtBinhPhuongSoMin = new JTextField();
        txtBinhPhuongSoMin.setColumns(10);
        txtBinhPhuongSoMin.setBounds(487, 126, 86, 20);
        frame.getContentPane().add(txtBinhPhuongSoMin);

        txtMin = new JTextField();
        txtMin.setBounds(132, 101, 158, 20);
        frame.getContentPane().add(txtMin);
        txtMin.setColumns(10);

        txtMax = new JTextField();
        txtMax.setColumns(10);
        txtMax.setBounds(132, 126, 158, 20);
        frame.getContentPane().add(txtMax);
    }
}
