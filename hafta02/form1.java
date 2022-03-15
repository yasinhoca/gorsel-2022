package hafta02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
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
	public form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Etiket ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(47, 33, 137, 46);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 0));
		textField.setBackground(new Color(0, 0, 205));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(47, 89, 137, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setForeground(new Color(220, 20, 60));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(47, 139, 137, 46);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("EKLE");
		Image img = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(47, 196, 171, 59);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		Image img2 = new ImageIcon(this.getClass().getResource("/icon2.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(47, 274, 53, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbl = new JLabel("");	
		Image mavi = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();
		Image kirmizi = new ImageIcon(this.getClass().getResource("/bkirmizi.png")).getImage();
		Image yesil = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();
		lbl.setIcon(new ImageIcon(mavi));
		lbl.setBounds(293, 117, 200, 97);
		contentPane.add(lbl);
		
		
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl.setIcon(new ImageIcon(kirmizi));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl.setIcon(new ImageIcon(mavi));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(new ImageIcon(yesil));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(new ImageIcon(mavi));
			}
		});
		
		
	}
}
