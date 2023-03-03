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

public class menucone extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menucone frame = new menucone();
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
	public menucone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton HeadingText = new JButton("CHOOSE ONE!!");
		HeadingText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HeadingText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		HeadingText.setBounds(185, 21, 515, 78);
		contentPane.add(HeadingText);
		
		JLabel Bananaboat = new JLabel("");
		Bananaboat.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\kd9ooh (1).jpg"));
		Bananaboat.setHorizontalAlignment(SwingConstants.CENTER);
		Bananaboat.setForeground(Color.LIGHT_GRAY);
		Bananaboat.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Bananaboat.setBackground(Color.RED);
		Bananaboat.setBounds(595, 373, 200, 200);
		contentPane.add(Bananaboat);
		
		JLabel Cup = new JLabel("");
		Cup.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\1_ถ้วยไอศกรีม_4_oz.jpg"));
		Cup.setHorizontalAlignment(SwingConstants.CENTER);
		Cup.setForeground(Color.LIGHT_GRAY);
		Cup.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Cup.setBackground(Color.RED);
		Cup.setBounds(83, 373, 200, 200);
		contentPane.add(Cup);
		
		JLabel Browsecone = new JLabel("");
		Browsecone.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\71AoVY1mHwL._SL1500_ (1).jpg"));
		Browsecone.setHorizontalAlignment(SwingConstants.CENTER);
		Browsecone.setForeground(Color.LIGHT_GRAY);
		Browsecone.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Browsecone.setBackground(Color.RED);
		Browsecone.setBounds(83, 125, 200, 200);
		contentPane.add(Browsecone);
		
		JLabel Normalcone = new JLabel("");
		Normalcone.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\Wafer-Twin-Cone (1).jpg"));
		Normalcone.setHorizontalAlignment(SwingConstants.CENTER);
		Normalcone.setForeground(Color.LIGHT_GRAY);
		Normalcone.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Normalcone.setBackground(Color.RED);
		Normalcone.setBounds(595, 125, 200, 200);
		contentPane.add(Normalcone);
		
		JButton BtnNormalcone = new JButton("Normal Cone");
		BtnNormalcone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuflavor flavor = new menuflavor();
				flavor.show();
		
				dispose();
			}
		});
		BtnNormalcone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BtnNormalcone.setBounds(93, 334, 190, 23);
		contentPane.add(BtnNormalcone);
		
		JButton btnBrowseCone = new JButton("Browse Cone");
		btnBrowseCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuCupAndBrowsecone Browsecone = new menuCupAndBrowsecone();
				Browsecone.show();
		
				dispose();
			}
		});
		btnBrowseCone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBrowseCone.setBounds(605, 336, 190, 23);
		contentPane.add(btnBrowseCone);
		
		JButton btnCup = new JButton("Cup");
		btnCup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuCupAndBrowsecone Cup = new menuCupAndBrowsecone();
				Cup.show();
		
				dispose();
			}
		});
		btnCup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCup.setBounds(93, 582, 190, 23);
		contentPane.add(btnCup);
		
		JButton btnBananaboat = new JButton("Banana Boat");
		btnBananaboat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuBananaboat Bananaboat = new MenuBananaboat();
				Bananaboat.show();
		
				dispose();
			}
		});
		btnBananaboat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBananaboat.setBounds(605, 584, 190, 23);
		contentPane.add(btnBananaboat);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gelatomenu menu = new gelatomenu();
				menu.show();
				
				dispose();
			}
		});
		btnBack.setBounds(10, 619, 158, 31);
		contentPane.add(btnBack);
		
		JLabel BG = new JLabel("");
		BG.setBounds(5, 5, 874, 651);
		BG.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
		contentPane.add(BG);
	}

}
