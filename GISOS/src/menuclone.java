import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuclone extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuclone frame = new menuclone();
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
	public menuclone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\kd9ooh (1).jpg"));
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_1_2_1.setBackground(Color.RED);
		lblNewLabel_1_2_1.setBounds(595, 373, 200, 200);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\1_ถ้วยไอศกรีม_4_oz.jpg"));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_1_2.setBackground(Color.RED);
		lblNewLabel_1_2.setBounds(83, 373, 200, 200);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\71AoVY1mHwL._SL1500_ (1).jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(83, 125, 200, 200);
		contentPane.add(lblNewLabel_1);
		
		JButton btnC = new JButton("CHOOSE ONE!!");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnC.setBounds(185, 21, 515, 78);
		contentPane.add(btnC);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\Wafer-Twin-Cone (1).jpg"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_1_1.setBackground(Color.RED);
		lblNewLabel_1_1.setBounds(595, 125, 200, 200);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Normal Cone");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuflavor flavor = new menuflavor();
				flavor.show();
		
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(93, 334, 190, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBrowseCone = new JButton("Browse Cone");
		btnBrowseCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuflavor flavor = new menuflavor();
				flavor.show();
		
				dispose();
			}
		});
		btnBrowseCone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrowseCone.setBounds(605, 336, 190, 23);
		contentPane.add(btnBrowseCone);
		
		JButton btnCup = new JButton("Cup");
		btnCup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuflavor flavor = new menuflavor();
				flavor.show();
		
				dispose();
			}
		});
		btnCup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCup.setBounds(93, 582, 190, 23);
		contentPane.add(btnCup);
		
		JButton btnBrowseCone_1 = new JButton("Banana Boat");
		btnBrowseCone_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuflavor flavor = new menuflavor();
				flavor.show();
		
				dispose();
			}
		});
		btnBrowseCone_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrowseCone_1.setBounds(605, 584, 190, 23);
		contentPane.add(btnBrowseCone_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Back");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gelatomenu menu = new gelatomenu();
				menu.show();
				
				dispose();
			}
		});
		btnNewButton_2_1_1_1.setBounds(10, 619, 158, 31);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 874, 651);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
		contentPane.add(lblNewLabel);
	}

}
