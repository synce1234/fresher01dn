package address_book;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

@SuppressWarnings("serial")
public class ui extends JFrame {

    private JPanel contentPane;
    private JTextField txtNguyn;
    private JTextField textField;
    private JTextField txtPhmTh;
    private JTextField txtHu;
    private JTextField txtThaThinHu;
    private JTextField txtVitNam;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ui frame = new ui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ui() {
        setTitle("Address Book Demo");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 466, 292);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JList list = new JList();
        list.setBounds(12, 11, 138, 238);
        contentPane.add(list);
        
        JLabel lblLastName = new JLabel("Name:");
        lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblLastName.setBounds(183, 11, 31, 14);
        contentPane.add(lblLastName);
        
        JLabel lblPhone = new JLabel("Phone:");
        lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblPhone.setBounds(180, 75, 34, 14);
        contentPane.add(lblPhone);
        
        JLabel lblAddress = new JLabel("Address 1:");
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblAddress.setBounds(162, 106, 52, 14);
        contentPane.add(lblAddress);
        
        JLabel lblCity = new JLabel("City:");
        lblCity.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblCity.setBounds(191, 131, 23, 14);
        contentPane.add(lblCity);
        
        JLabel lblState = new JLabel("State:");
        lblState.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblState.setBounds(184, 161, 30, 14);
        contentPane.add(lblState);
        
        JLabel lblCountry = new JLabel("Country:");
        lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblCountry.setBounds(171, 191, 43, 14);
        contentPane.add(lblCountry);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblEmail.setBounds(186, 42, 28, 14);
        contentPane.add(lblEmail);
        
        txtNguyn = new JTextField();
        txtNguyn.setHorizontalAlignment(SwingConstants.LEFT);
        txtNguyn.setText("Nguyễn Xuân Long");
        txtNguyn.setBounds(224, 8, 222, 20);
        contentPane.add(txtNguyn);
        txtNguyn.setColumns(10);
        
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.LEFT);
        textField.setText("0905764750");
        textField.setBounds(224, 68, 220, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        txtPhmTh = new JTextField();
        txtPhmTh.setHorizontalAlignment(SwingConstants.LEFT);
        txtPhmTh.setText("63/22 Phạm Thị Liên");
        txtPhmTh.setBounds(224, 98, 220, 20);
        contentPane.add(txtPhmTh);
        txtPhmTh.setColumns(10);
        
        txtHu = new JTextField();
        txtHu.setHorizontalAlignment(SwingConstants.LEFT);
        txtHu.setText("Huế");
        txtHu.setBounds(224, 128, 220, 20);
        contentPane.add(txtHu);
        txtHu.setColumns(10);
        
        txtThaThinHu = new JTextField();
        txtThaThinHu.setHorizontalAlignment(SwingConstants.LEFT);
        txtThaThinHu.setText("Thừa Thiên Huế");
        txtThaThinHu.setBounds(226, 158, 220, 20);
        contentPane.add(txtThaThinHu);
        txtThaThinHu.setColumns(10);
        
        txtVitNam = new JTextField();
        txtVitNam.setHorizontalAlignment(SwingConstants.LEFT);
        txtVitNam.setText("Việt Nam");
        txtVitNam.setBounds(226, 188, 220, 20);
        contentPane.add(txtVitNam);
        txtVitNam.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setHorizontalAlignment(SwingConstants.LEFT);
        textField_3.setBounds(224, 38, 222, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        JButton btnNew = new JButton("New");
        btnNew.setBounds(161, 221, 59, 26);
        contentPane.add(btnNew);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(234, 221, 70, 26);
        contentPane.add(btnDelete);
        
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(316, 221, 55, 26);
        contentPane.add(btnEdit);
        
        JButton btnSave = new JButton("Save");
        btnSave.setBounds(383, 219, 62, 26);
        contentPane.add(btnSave);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(640, 126, 89, 23);
        contentPane.add(btnCancel);
        contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtNguyn, textField_3, textField, txtPhmTh, txtHu, txtThaThinHu, txtVitNam, btnSave}));
        setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtNguyn, textField_3, textField, txtPhmTh, txtHu, txtThaThinHu, txtVitNam, btnSave}));
    }
}
