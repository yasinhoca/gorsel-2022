package hafta07;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class form1_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1_menu frame = new form1_menu();
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
	public form1_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 394);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Dosya");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Yeni Dosya");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mn�tmNewMenuItem = new JMenuItem("Java");
		mn�tmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kodlar� buraya yaz�yoruz
			}
		});
		mnNewMenu_1.add(mn�tmNewMenuItem);
		
		JMenuItem mn�tmNewMenuItem_2 = new JMenuItem("C++");
		mnNewMenu_1.add(mn�tmNewMenuItem_2);
		
		JMenuItem mn�tmNewMenuItem_1 = new JMenuItem("Html");
		mnNewMenu_1.add(mn�tmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Dosya a\u00E7");
		mnNewMenu.add(mnNewMenu_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mn�tmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu.add(mn�tmNewMenuItem_3);
		
		JMenuItem mn�tmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu.add(mn�tmNewMenuItem_4);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("New menu");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mn�tmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mn�tmNewMenuItem_5);
		
		JCheckBoxMenuItem chckbxmn�tmNewCheckItem = new JCheckBoxMenuItem("New check item");
		mnNewMenu_5.add(chckbxmn�tmNewCheckItem);
		
		JRadioButtonMenuItem rdbtnmn�tmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		mnNewMenu_5.add(rdbtnmn�tmNewRadioItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
