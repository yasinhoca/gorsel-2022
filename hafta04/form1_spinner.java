package hafta04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;

public class form1_spinner extends JFrame {

	private JPanel contentPane;
	int w,h,x,y,r,g,b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1_spinner frame = new form1_spinner();
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
	public form1_spinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner width = new JSpinner();
		width.setModel(new SpinnerNumberModel(50, 0, 100, 1));
		width.setFont(new Font("Tahoma", Font.PLAIN, 20));
		width.setBounds(20, 39, 74, 45);
		contentPane.add(width);
		
		JSpinner height = new JSpinner();
		height.setModel(new SpinnerNumberModel(50, 0, 100, 1));
		height.setFont(new Font("Tahoma", Font.PLAIN, 20));
		height.setBounds(186, 39, 74, 45);
		contentPane.add(height);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(20, 89, 300, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn = new JButton("");
		btn.setBounds(126, 114, 50, 50);
		panel.add(btn);
		
		JLabel lblNewLabel = new JLabel("Geni\u015Flik");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(20, -1, 93, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblYkseklik = new JLabel("Y\u00FCkseklik");
		lblYkseklik.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYkseklik.setBounds(186, -1, 93, 30);
		contentPane.add(lblYkseklik);
		
		JSpinner xspinner = new JSpinner();
		
		xspinner.setModel(new SpinnerNumberModel(126, 0, 300, 5));
		xspinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		xspinner.setBounds(342, 155, 74, 45);
		contentPane.add(xspinner);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(342, 115, 93, 30);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblY.setBounds(342, 232, 93, 30);
		contentPane.add(lblY);
		
		JSpinner yspinner = new JSpinner();
		yspinner.setModel(new SpinnerNumberModel(114, 0, 300, 5));
		yspinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yspinner.setBounds(342, 272, 74, 45);
		contentPane.add(yspinner);
		
		JSpinner rs = new JSpinner();
		
		rs.setForeground(Color.RED);
		rs.setBackground(Color.RED);
		rs.setModel(new SpinnerNumberModel(0, 0, 255, 10));
		rs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rs.setBounds(496, 115, 74, 45);
		contentPane.add(rs);
		
		JSpinner gs = new JSpinner();
		gs.setForeground(Color.GREEN);
		gs.setModel(new SpinnerNumberModel(0, 0, 255, 10));
		gs.setBackground(Color.GREEN);
		gs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gs.setBounds(496, 210, 74, 45);
		contentPane.add(gs);
		
		JSpinner bs = new JSpinner();
		bs.setForeground(Color.BLUE);
		bs.setModel(new SpinnerNumberModel(0, 0, 255, 10));
		bs.setBackground(Color.BLUE);
		bs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bs.setBounds(496, 312, 74, 45);
		contentPane.add(bs);
		
		JLabel lblR = new JLabel("R");
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblR.setBounds(496, 89, 93, 30);
		contentPane.add(lblR);
		
		JLabel lblG = new JLabel("G");
		lblG.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblG.setBounds(496, 185, 93, 30);
		contentPane.add(lblG);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblB.setBounds(496, 280, 93, 30);
		contentPane.add(lblB);
		h = w = 50;
		x = 126;
		y = 114;
		
		width.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				w = (int) width.getValue();
				h = (int) height.getValue();
				btn.setBounds(x,y,w,h);
			}
		});
		
		height.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				w = (int) width.getValue();
				h = (int) height.getValue();
				btn.setBounds(x,y,w,h);
			}
		});
		
		xspinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				x = (int) xspinner.getValue();
				y = (int) yspinner.getValue();
				btn.setBounds(x,y,w,h);
			}
		});
		
		yspinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				x = (int) xspinner.getValue();
				y = (int) yspinner.getValue();
				btn.setBounds(x,y,w,h);
			}
		});
		
		r=g=b=0;
		rs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = (int) rs.getValue();
				g = (int) gs.getValue();
				b = (int) bs.getValue();
				btn.setBackground(new Color(r,g,b));
			}
		});
		gs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = (int) rs.getValue();
				g = (int) gs.getValue();
				b = (int) bs.getValue();
				btn.setBackground(new Color(r,g,b));
			}
		});
		bs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = (int) rs.getValue();
				g = (int) gs.getValue();
				b = (int) bs.getValue();
				btn.setBackground(new Color(r,g,b));
			}
		});
		
	}
}
