package hafta08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class form1_DinamikGridYerlesim extends JFrame {

	private JPanel contentPane;
	JButton[][] b = new JButton[4][4];
	int i,j;
	String[][] s = { {"1","2","3","+"},
			{"4","5","6","-"},
			{"7","8","9","*"},
			{"0",",","=","/"},
	};
	private JTextField textField;
	int islem;
	float s1,s2;
	float sonuc;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1_DinamikGridYerlesim frame = new form1_DinamikGridYerlesim();
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
	public form1_DinamikGridYerlesim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 10, 216, 37);
		contentPane.add(textField);
		textField.setColumns(10);



		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				b[i][j]=new JButton();
				b[i][j].setFont(new Font("Tahoma", Font.BOLD, 20));
				b[i][j].setBounds(j*55+10,i*55+50,50,50);
				b[i][j].setText(s[i][j]);
				contentPane.add(b[i][j]);
			}
		}


		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b[0][0]) textField.setText(textField.getText()+b[0][0].getText());
				if(e.getSource()==b[0][1]) textField.setText(textField.getText()+b[0][1].getText());
				if(e.getSource()==b[0][2]) textField.setText(textField.getText()+b[0][2].getText());
				if(e.getSource()==b[0][3]) {
					islem = 1;
					s1 = Integer.parseInt(textField.getText());
					textField.setText("");
				}
				if(e.getSource()==b[1][0]) textField.setText(textField.getText()+b[1][0].getText());
				if(e.getSource()==b[1][1]) textField.setText(textField.getText()+b[1][1].getText());
				if(e.getSource()==b[1][2]) textField.setText(textField.getText()+b[1][2].getText());
				if(e.getSource()==b[1][3]) {
					islem = 2;
					s1 = Float.parseFloat(textField.getText());
					textField.setText("");
				}
				if(e.getSource()==b[2][0]) textField.setText(textField.getText()+b[2][0].getText());
				if(e.getSource()==b[2][1]) textField.setText(textField.getText()+b[2][1].getText());
				if(e.getSource()==b[2][2]) textField.setText(textField.getText()+b[2][2].getText());
				if(e.getSource()==b[2][3]) {
					islem = 3;
					s1 = Float.parseFloat(textField.getText());
					textField.setText("");
				}
				if(e.getSource()==b[3][0]) textField.setText(textField.getText()+b[3][0].getText());
				if(e.getSource()==b[3][1]) textField.setText(textField.getText()+b[3][1].getText());
				if(e.getSource()==b[3][2]) {
					s2= Float.parseFloat(textField.getText());
					textField.setText("");
					if(islem==1) sonuc = s1 + s2;
					if(islem==2) sonuc = s1 - s2;
					if(islem==3) sonuc = s1 * s2;
					if(islem==4) sonuc = s1 / s2;
					textField.setText(Float.toString(sonuc));
				}
				if(e.getSource()==b[3][3]) {
					islem = 4;
					s1 = Float.parseFloat(textField.getText());
					textField.setText("");
				}


			}
		};
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				b[i][j].addActionListener(al);
			}
		}

	}
}
