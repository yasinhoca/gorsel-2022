package hafta03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class form3_combo_renk_uygulamasi extends JFrame {

	private JPanel contentPane;
	DefaultComboBoxModel rmodel = new DefaultComboBoxModel();
	DefaultComboBoxModel gmodel = new DefaultComboBoxModel();
	DefaultComboBoxModel bmodel = new DefaultComboBoxModel();
	int r,g,b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form3_combo_renk_uygulamasi frame = new form3_combo_renk_uygulamasi();
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
	public form3_combo_renk_uygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i=0;i<256;i++) rmodel.addElement(i);
		for(int i=0;i<256;i++) gmodel.addElement(i);
		for(int i=0;i<256;i++) bmodel.addElement(i);
		
		JComboBox cred = new JComboBox();
		cred.setModel(rmodel);
		cred.setBackground(Color.RED);
		cred.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cred.setBounds(28, 24, 88, 37);
		contentPane.add(cred);
		
		JComboBox cgreen = new JComboBox();
		
		cgreen.setModel(gmodel);
		cgreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cgreen.setBackground(Color.GREEN);
		cgreen.setBounds(126, 24, 88, 37);
		contentPane.add(cgreen);
		
		JComboBox cblue = new JComboBox();
		
		cblue.setModel(bmodel);
		cblue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cblue.setBackground(Color.BLUE);
		cblue.setBounds(224, 24, 88, 37);
		contentPane.add(cblue);
		
		r = g = b = 0;
		
		cred.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				r = (int) cred.getSelectedIndex();
				contentPane.setBackground(new Color(r,g,b));
			}
		});
		
		cgreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				g = (int) cgreen.getSelectedIndex();
				contentPane.setBackground(new Color(r,g,b));
			}
		});
		
		cblue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				b = (int) cblue.getSelectedIndex();
				contentPane.setBackground(new Color(r,g,b));
			}
		});
		
	}

}
