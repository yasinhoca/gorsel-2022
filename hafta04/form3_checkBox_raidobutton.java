package hafta04;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class form3_checkBox_raidobutton extends JFrame {

	private JPanel contentPane;
	ArrayList<String> secimler = new ArrayList<>();
	//Checkbox[] cboxler = new Checkbox[8];
	//cboxler[1].isSelected

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form3_checkBox_raidobutton frame = new form3_checkBox_raidobutton();
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
	public form3_checkBox_raidobutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 587, 139);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox c1 = new JCheckBox("\u0130ngilizce");
		c1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c1.setBounds(16, 6, 147, 31);
		panel.add(c1);
		
		JCheckBox c2 = new JCheckBox("Almanca");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c2.setBounds(16, 39, 147, 31);
		panel.add(c2);
		
		JCheckBox c3 = new JCheckBox("\u0130spanyolca");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c3.setBounds(16, 72, 147, 31);
		panel.add(c3);
		
		JCheckBox c4 = new JCheckBox("Arap\u00E7a");
		c4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c4.setBounds(16, 105, 147, 31);
		panel.add(c4);
		
		JButton btnNewButton = new JButton("SE\u00C7\u0130M");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(187, 39, 100, 48);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(322, 6, 224, 112);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
		panel_1.setBounds(20, 159, 238, 193);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton r1 = new JRadioButton("Algoritma");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1.setBounds(6, 6, 180, 31);
		panel_1.add(r1);
		
		JRadioButton r2 = new JRadioButton("T\u00FCrk\u00E7e");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r2.setBounds(6, 52, 180, 31);
		panel_1.add(r2);
		
		JRadioButton r3 = new JRadioButton("\u0130\u015Fletme");
		r3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r3.setBounds(6, 100, 180, 31);
		panel_1.add(r3);
		
		JRadioButton r4 = new JRadioButton("Giri\u015Fimcilik");
		r4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r4.setBounds(6, 149, 180, 31);
		panel_1.add(r4);
		
		JButton btnNewButton_1 = new JButton("SE\u00C7\u0130M");
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(284, 228, 210, 42);
		contentPane.add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secimler.clear();
				if(c1.isSelected()) secimler.add(c1.getText());
				if(c2.isSelected()) secimler.add(c2.getText());
				if(c3.isSelected()) secimler.add(c3.getText());
				if(c4.isSelected()) secimler.add(c4.getText());
				System.out.println(secimler);
				lblNewLabel.setText(secimler.toString());
			}
		});
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) btnNewButton_1.setText(r1.getText());
				if(r2.isSelected()) btnNewButton_1.setText(r2.getText());
				if(r3.isSelected()) btnNewButton_1.setText(r3.getText());
				if(r4.isSelected()) btnNewButton_1.setText(r4.getText());
			}
		});
		
		
	}
}
