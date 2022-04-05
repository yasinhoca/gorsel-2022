package hafta05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class form2_passwordfield_formatted extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JFormattedTextField formattedTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form2_passwordfield_formatted frame = new form2_passwordfield_formatted();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public form2_passwordfield_formatted() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(45, 26, 163, 40);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(257, 26, 163, 40);
		contentPane.add(btnNewButton);
		
		MaskFormatter mf = new MaskFormatter("(05##)-AAA-UU-LL");
		// U upper  büyük harf
		// L lower  küçük harf
		// # sadece sayý
		// A sayý ve harf giriþi
		
		formattedTextField = new JFormattedTextField(mf);
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedTextField.setBounds(67, 130, 354, 67);
		contentPane.add(formattedTextField);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] ps = passwordField.getPassword();
				btnNewButton.setText(ps.toString());
				//btnNewButton.setText(passwordField.getText());
			}
		});
		
	}
}
