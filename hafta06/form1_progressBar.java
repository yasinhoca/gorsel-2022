package hafta06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class form1_progressBar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1_progressBar frame = new form1_progressBar();
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
	public form1_progressBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.BLUE);
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		progressBar.setStringPainted(true);
		progressBar.setBounds(80, 36, 311, 54);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("BA\u015ELAT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(175, 116, 134, 40);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0;i<101;i++) {
						try {
							TimeUnit.MILLISECONDS.sleep(30);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
						progressBar.setValue(i);
					}
				}
			});
				
			t1.start();	
				
				
			}
		});
		
	}
}
