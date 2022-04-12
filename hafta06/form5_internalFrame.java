package hafta06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;

public class form5_internalFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form5_internalFrame frame = new form5_internalFrame();
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
	public form5_internalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setResizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setClosable(true);
		internalFrame.setBounds(20, 10, 422, 370);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JInternalFrame internalFrame_2 = new JInternalFrame("New JInternalFrame");
		internalFrame_2.setBounds(53, 21, 278, 165);
		internalFrame.getContentPane().add(internalFrame_2);
		internalFrame_2.setVisible(true);
		
		JInternalFrame internalFrame_1 = new JInternalFrame("New JInternalFrame");
		internalFrame_1.setBounds(367, 90, 252, 216);
		contentPane.add(internalFrame_1);
		internalFrame_1.setVisible(true);
		internalFrame.setVisible(true);
	}
}
