package hafta06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form6_dinamik_component_ekleme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JTextField[] text;
	JLabel[] etiket;
	int sayi = 1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form6_dinamik_component_ekleme frame = new form6_dinamik_component_ekleme();
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
	public form6_dinamik_component_ekleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("1");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(217, 15, 61, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hangi dilleri biliyorsunuz");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 20, 197, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("G\u00D6NDER");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(288, 15, 110, 32);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("TEM\u0130ZLE");
		btnNewButton_1.setEnabled(false);
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(418, 15, 116, 32);
		contentPane.add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Integer.parseInt(textField.getText());
				text = new JTextField[sayi];
				etiket = new JLabel[sayi];
				for(int i=0;i<sayi;i++) {
					text[i] = new JTextField();
					text[i].setFont(new Font("Tahoma", Font.PLAIN, 18));
					text[i].setBounds(100,70+i*40,80,30);
					etiket[i] = new JLabel(Integer.toString(i+1)+". dil : ");
					etiket[i].setFont(new Font("Tahoma", Font.PLAIN, 18));
					etiket[i].setBounds(10,70+i*40,70,30);
					contentPane.add(text[i]);
					contentPane.add(etiket[i]);
					contentPane.repaint();
				}
				btnNewButton_1.setEnabled(true);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<sayi;i++) {
					contentPane.remove(text[i]);
					contentPane.remove(etiket[i]);
					contentPane.revalidate();
					contentPane.repaint();
				}
				btnNewButton_1.setEnabled(false);
			}
		});
		
	}
}
