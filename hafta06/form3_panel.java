package hafta06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form3_panel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	boolean mavi=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form3_panel frame = new form3_panel();
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
	public form3_panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel maviPanel = new JPanel();
		maviPanel.setBackground(new Color(224, 255, 255));
		maviPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		maviPanel.setBounds(22, 10, 344, 268);
		contentPane.add(maviPanel);
		maviPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 29, 45, 13);
		maviPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(63, 26, 96, 19);
		maviPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 68, 45, 13);
		maviPanel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 65, 96, 19);
		maviPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 112, 45, 13);
		maviPanel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(63, 109, 96, 19);
		maviPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel sariPanel = new JPanel();
		sariPanel.setLayout(null);
		sariPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		sariPanel.setBackground(new Color(255, 250, 205));
		sariPanel.setBounds(22, 10, 344, 268);
		contentPane.add(sariPanel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 29, 45, 13);
		sariPanel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(63, 26, 96, 19);
		sariPanel.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(10, 68, 45, 13);
		sariPanel.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(63, 65, 96, 19);
		sariPanel.add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(10, 112, 45, 13);
		sariPanel.add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(63, 109, 96, 19);
		sariPanel.add(textField_5);
		
		JButton btnNewButton = new JButton("Paneli De\u011Fi\u015Ftir");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(386, 22, 165, 58);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mavi) {
					sariPanel.setVisible(true);
					maviPanel.setVisible(false);
					mavi=false;
				} else {
					sariPanel.setVisible(false);
					maviPanel.setVisible(true);
					mavi=true;
				}
			}
		});
		
	}
}
