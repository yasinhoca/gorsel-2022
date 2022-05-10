package hafta08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form2_multipleActionListener extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form2_multipleActionListener frame = new form2_multipleActionListener();
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
	public form2_multipleActionListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("1");
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(21, 27, 85, 33);
		contentPane.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(126, 27, 85, 33);
		contentPane.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(235, 27, 85, 33);
		contentPane.add(b3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(21, 104, 299, 42);
		contentPane.add(lblNewLabel);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) lblNewLabel.setText(b1.getText());
				if(e.getSource()==b2) lblNewLabel.setText(b2.getText());
				if(e.getSource()==b3) lblNewLabel.setText(b3.getText());
			}
		};
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		
	}
}
