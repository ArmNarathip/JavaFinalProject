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
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;

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
		
		JTextArea txtrBahtball = new JTextArea();
		txtrBahtball.setEditable(false);
		txtrBahtball.setFont(new Font("Monospaced", Font.BOLD, 36));
		txtrBahtball.setText("25.- Baht/Ball");
		txtrBahtball.setBackground(new Color(255, 128, 128));
		txtrBahtball.setBounds(296, 483, 313, 52);
		contentPane.add(txtrBahtball);
		
		JTextArea txtrBalls_2_1_1 = new JTextArea();
		txtrBalls_2_1_1.setEditable(false);
		txtrBalls_2_1_1.setText("7 Balls");
		txtrBalls_2_1_1.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrBalls_2_1_1.setBackground(new Color(255, 128, 192));
		txtrBalls_2_1_1.setBounds(725, 370, 76, 31);
		contentPane.add(txtrBalls_2_1_1);
		
		JTextArea txtrBalls_2_1 = new JTextArea();
		txtrBalls_2_1.setEditable(false);
		txtrBalls_2_1.setText("4 Balls");
		txtrBalls_2_1.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrBalls_2_1.setBackground(new Color(255, 128, 192));
		txtrBalls_2_1.setBounds(517, 370, 76, 31);
		contentPane.add(txtrBalls_2_1);
		
		JTextArea txtrBalls_2 = new JTextArea();
		txtrBalls_2.setEditable(false);
		txtrBalls_2.setText("4 Balls");
		txtrBalls_2.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrBalls_2.setBackground(new Color(255, 128, 192));
		txtrBalls_2.setBounds(310, 370, 76, 31);
		contentPane.add(txtrBalls_2);
		
		JTextArea txtrBalls = new JTextArea();
		txtrBalls.setEditable(false);
		txtrBalls.setBackground(new Color(255, 128, 192));
		txtrBalls.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrBalls.setText("3 Balls");
		txtrBalls.setBounds(85, 370, 76, 31);
		contentPane.add(txtrBalls);
		HeadingText.setFont(new Font("Eras Bold ITC", Font.PLAIN, 43));
		HeadingText.setBounds(185, 21, 515, 78);
		contentPane.add(HeadingText);
		
		JLabel Bananaboat = new JLabel("");
		Bananaboat.setIcon(new ImageIcon("C:\\drive-download-20230220T083051Z-001\\kd9ooh (1).jpg"));
		Bananaboat.setHorizontalAlignment(SwingConstants.CENTER);
		Bananaboat.setForeground(Color.LIGHT_GRAY);
		Bananaboat.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Bananaboat.setBackground(Color.RED);
		Bananaboat.setBounds(671, 139, 190, 186);
		contentPane.add(Bananaboat);
		
		JLabel Cup = new JLabel("");
		Cup.setIcon(new ImageIcon("C:\\drive-download-20230220T083051Z-001\\cup.jpg"));
		Cup.setHorizontalAlignment(SwingConstants.CENTER);
		Cup.setForeground(Color.LIGHT_GRAY);
		Cup.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Cup.setBackground(Color.RED);
		Cup.setBounds(463, 139, 177, 186);
		contentPane.add(Cup);
		
		JLabel Browsecone = new JLabel("");
		Browsecone.setIcon(new ImageIcon("C:\\drive-download-20230220T083051Z-001\\71AoVY1mHwL._SL1500_ (1).jpg"));
		Browsecone.setHorizontalAlignment(SwingConstants.CENTER);
		Browsecone.setForeground(Color.LIGHT_GRAY);
		Browsecone.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Browsecone.setBackground(Color.RED);
		Browsecone.setBounds(37, 139, 190, 192);
		contentPane.add(Browsecone);
		
		JLabel Normalcone = new JLabel("");
		Normalcone.setIcon(new ImageIcon("C:\\drive-download-20230220T083051Z-001\\Wafer-Twin-Cone (1).jpg"));
		Normalcone.setHorizontalAlignment(SwingConstants.CENTER);
		Normalcone.setForeground(Color.LIGHT_GRAY);
		Normalcone.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Normalcone.setBackground(Color.RED);
		Normalcone.setBounds(253, 137, 200, 194);
		contentPane.add(Normalcone);
		
		JButton BtnNormalcone = new JButton("Normal Cone");
		BtnNormalcone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuflavor flavor = new menuflavor();
				flavor.show();
		
				dispose();
			}
		});
		BtnNormalcone.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
		BtnNormalcone.setBounds(37, 334, 190, 33);
		contentPane.add(BtnNormalcone);
		
		JButton btnBrowseCone = new JButton("Browse Cone");
		btnBrowseCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuCupAndBrowsecone Browsecone = new menuCupAndBrowsecone();
				Browsecone.show();
		
				dispose();
			}
		});
		btnBrowseCone.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
		btnBrowseCone.setBounds(258, 334, 190, 33);
		contentPane.add(btnBrowseCone);
		
		JButton btnCup = new JButton("Cup");
		btnCup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuCupAndBrowsecone Cup = new menuCupAndBrowsecone();
				Cup.show();
		
				dispose();
			}
		});
		btnCup.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
		btnCup.setBounds(463, 334, 190, 33);
		contentPane.add(btnCup);
		
		JButton btnBananaboat = new JButton("Banana Boat");
		btnBananaboat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuBananaboat Bananaboat = new MenuBananaboat();
				Bananaboat.show();
		
				dispose();
			}
		});
		btnBananaboat.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
		btnBananaboat.setBounds(671, 335, 190, 31);
		contentPane.add(btnBananaboat);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gelatomenu menu = new gelatomenu();
				menu.show();
				
				dispose();
			}
		});
		btnBack.setBounds(10, 619, 99, 31);
		contentPane.add(btnBack);
		
		JLabel BG = new JLabel("");
		BG.setBackground(new Color(255, 128, 128));
		BG.setBounds(5, 5, 874, 651);
		BG.setIcon(new ImageIcon("C:\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
		contentPane.add(BG);
	}
}
