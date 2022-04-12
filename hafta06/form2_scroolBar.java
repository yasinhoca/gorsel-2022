package hafta06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class form2_scroolBar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form2_scroolBar frame = new form2_scroolBar();
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
	public form2_scroolBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(110);
		scrollBar.setValue(50);
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(51, 30, 381, 22);
		contentPane.add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(173, 89, 160, 81);
		contentPane.add(lblNewLabel);
		
		
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				int deger = scrollBar.getValue();
				lblNewLabel.setText(Integer.toString(deger));
			}
		});
		
	}
}
