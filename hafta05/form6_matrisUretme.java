package hafta05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form6_matrisUretme extends JFrame {

	private JPanel contentPane;
	private JTable matris1;
	DefaultTableModel model= new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form6_matrisUretme frame = new form6_matrisUretme();
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
	public form6_matrisUretme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SATIR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 21, 62, 22);
		contentPane.add(lblNewLabel);
		
		JSpinner satirs = new JSpinner();
		satirs.setModel(new SpinnerNumberModel(3, 1, 20, 1));
		satirs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		satirs.setBounds(70, 10, 47, 33);
		contentPane.add(satirs);
		
		JLabel lblSutun = new JLabel("SUTUN");
		lblSutun.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSutun.setBounds(139, 21, 62, 22);
		contentPane.add(lblSutun);
		
		JSpinner sutuns = new JSpinner();
		sutuns.setModel(new SpinnerNumberModel(3, 1, 20, 1));
		sutuns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sutuns.setBounds(211, 10, 47, 33);
		contentPane.add(sutuns);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 86, 239, 218);
		contentPane.add(scrollPane);
		
		matris1 = new JTable();
		scrollPane.setViewportView(matris1);
		matris1.setTableHeader(null);
		JButton btnNewButton = new JButton("OLU\u015ETUR");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(294, 10, 123, 36);
		contentPane.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int satir,sutun,i,j;
				satir = (int) satirs.getValue();
				sutun = (int) sutuns.getValue();
				model.setColumnCount(sutun);
				model.setRowCount(satir);
				
				int[][] m = Matris.uret(satir, sutun);
				
				for(i=0;i<satir;i++) {
					for(j=0;j<sutun;j++) {
						model.setValueAt(m[i][j], i, j);
					}
				}
				
				matris1.setModel(model);		
				
				
			}
		});
		
	}

}
