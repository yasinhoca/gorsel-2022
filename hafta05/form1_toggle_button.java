package hafta05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form1_toggle_button extends JFrame {

	private JPanel contentPane;
	int durum = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1_toggle_button frame = new form1_toggle_button();
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
	public form1_toggle_button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tglbtnNewToggleButton.setBounds(99, 34, 188, 68);
		contentPane.add(tglbtnNewToggleButton);
		
		JButton btnNewButton = new JButton("KAPALI");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(126, 141, 139, 39);
		contentPane.add(btnNewButton);
		
		tglbtnNewToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(tglbtnNewToggleButton.isSelected()) {
					System.out.println("Toggle buton açýk!");
				} else {
					System.out.println("Toggle buton kapalý!");
				}
			}
		});
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(durum==0) {
					btnNewButton.setText("AÇIK");
					btnNewButton.setBackground(Color.GREEN);
					durum = 1;
				} else {
					btnNewButton.setText("KAPALI");
					btnNewButton.setBackground(Color.RED);
					durum = 0;
				}
			}
		});
		
	}
}
