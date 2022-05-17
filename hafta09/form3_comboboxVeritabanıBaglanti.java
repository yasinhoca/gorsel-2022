package postgreNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class form3 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	String  sorgu = "select * from ogrenci";
	DefaultTableModel modelim = new DefaultTableModel();
	Object[] kolonlar = {"Numara","Ad","Soyad","Telefon"};
	Object[] satirlar = new Object[4];
	private JTextField txtSelectFrom;
	private JComboBox comboBox;
	DefaultComboBoxModel m = new DefaultComboBoxModel<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form3 frame = new form3();
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
	public form3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 143, 487, 264);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("Sorgula");

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(396, 85, 128, 37);
		contentPane.add(btnNewButton);

		txtSelectFrom = new JTextField();
		txtSelectFrom.setText("select * from ogrenci");
		txtSelectFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSelectFrom.setBounds(38, 88, 333, 30);
		contentPane.add(txtSelectFrom);
		txtSelectFrom.setColumns(10);

		comboBox = new JComboBox();

		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(38, 23, 333, 37);
		contentPane.add(comboBox);

		Veritabani.baglan();
		ResultSet rs = Veritabani.listele("select * from ogrenci");
		try {
			while(rs.next()) {
				m.addElement(rs.getString("ogrencino"));								
			}
			comboBox.setModel(m);


		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sorgu = txtSelectFrom.getText();
				modelim.setColumnCount(0);
				modelim.setRowCount(0);
				modelim.setColumnIdentifiers(kolonlar);

				ResultSet rs = Veritabani.listele(sorgu);

				try {
					while(rs.next()) {
						satirlar[0]=rs.getString("ogrencino");
						satirlar[1]=rs.getString("ad");
						satirlar[2]=rs.getString("soyad");
						satirlar[3]=rs.getString("tel");
						modelim.addRow(satirlar);
					}
					table.setModel(modelim);


				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});


		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				sorgu = "select * from ogrenci where ogrencino='" +
						comboBox.getSelectedItem().toString() +"'";
				modelim.setColumnCount(0);
				modelim.setRowCount(0);
				modelim.setColumnIdentifiers(kolonlar);

				ResultSet rs = Veritabani.listele(sorgu);

				try {
					while(rs.next()) {
						satirlar[0]=rs.getString("ogrencino");
						satirlar[1]=rs.getString("ad");
						satirlar[2]=rs.getString("soyad");
						satirlar[3]=rs.getString("tel");
						modelim.addRow(satirlar);
					}
					table.setModel(modelim);


				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});


	}
}
