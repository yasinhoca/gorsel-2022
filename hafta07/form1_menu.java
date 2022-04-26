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
		
		JMenuItem mnýtmNewMenuItem = new JMenuItem("Java");
		mnýtmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kodlarý buraya yazýyoruz
			}
		});
		mnNewMenu_1.add(mnýtmNewMenuItem);
		
		JMenuItem mnýtmNewMenuItem_2 = new JMenuItem("C++");
		mnNewMenu_1.add(mnýtmNewMenuItem_2);
		
		JMenuItem mnýtmNewMenuItem_1 = new JMenuItem("Html");
		mnNewMenu_1.add(mnýtmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Dosya a\u00E7");
		mnNewMenu.add(mnNewMenu_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mnýtmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu.add(mnýtmNewMenuItem_3);
		
		JMenuItem mnýtmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu.add(mnýtmNewMenuItem_4);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("New menu");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mnýtmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mnýtmNewMenuItem_5);
		
		JCheckBoxMenuItem chckbxmnýtmNewCheckItem = new JCheckBoxMenuItem("New check item");
		mnNewMenu_5.add(chckbxmnýtmNewCheckItem);
		
		JRadioButtonMenuItem rdbtnmnýtmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		mnNewMenu_5.add(rdbtnmnýtmNewRadioItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
