
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JComboBox;

	public class menuflavor extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						menuflavor frame = new menuflavor();
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
		public menuflavor() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnChooseFlavor = new JButton("CHOOSE FLAVOR!!");
			btnChooseFlavor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnChooseFlavor.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnChooseFlavor.setBounds(188, 35, 515, 78);
			contentPane.add(btnChooseFlavor);
			
			JButton btnNewButton = new JButton("Crema");
			btnNewButton.setBounds(30, 173, 158, 48);
			contentPane.add(btnNewButton);
			
			JButton btnFiorDiLatte = new JButton("Fior Di Latte");
			btnFiorDiLatte.setBounds(261, 173, 158, 48);
			contentPane.add(btnFiorDiLatte);
			
			JButton btnNewButton_1_1 = new JButton("Riso");
			btnNewButton_1_1.setBounds(494, 173, 158, 48);
			contentPane.add(btnNewButton_1_1);
			
			JButton btnNewButton_1_1_1 = new JButton("Nocciola");
			btnNewButton_1_1_1.setBounds(700, 173, 158, 48);
			contentPane.add(btnNewButton_1_1_1);
			
			JButton btnGianduia = new JButton("Gianduia");
			btnGianduia.setBounds(30, 276, 158, 48);
			contentPane.add(btnGianduia);
			
			JButton btnNewButton_1_2 = new JButton("Tiramisù");
			btnNewButton_1_2.setBounds(261, 276, 158, 48);
			contentPane.add(btnNewButton_1_2);
			
			JButton btnNewButton_1_1_2 = new JButton("Caffè");
			btnNewButton_1_1_2.setBounds(494, 276, 158, 48);
			contentPane.add(btnNewButton_1_1_2);
			
			JButton btnNewButton_1_1_1_1 = new JButton("Biscotto Della Nonna");
			btnNewButton_1_1_1_1.setBounds(700, 276, 158, 48);
			contentPane.add(btnNewButton_1_1_1_1);
			
			JButton btnNewButton_2_1 = new JButton("Zuppa Inglese");
			btnNewButton_2_1.setBounds(30, 392, 158, 48);
			contentPane.add(btnNewButton_2_1);
			
			JButton btnNewButton_1_2_1 = new JButton("Panna Cotta");
			btnNewButton_1_2_1.setBounds(261, 392, 158, 48);
			contentPane.add(btnNewButton_1_2_1);
			
			JButton btnNewButton_1_1_2_1 = new JButton("Cantucci");
			btnNewButton_1_1_2_1.setBounds(494, 392, 158, 48);
			contentPane.add(btnNewButton_1_1_2_1);
			
			JButton btnNewButton_1_1_1_1_1 = new JButton("Mandorla");
			btnNewButton_1_1_1_1_1.setBounds(700, 392, 158, 48);
			contentPane.add(btnNewButton_1_1_1_1_1);
			
			JButton btnNewButton_2_1_1 = new JButton("Lemon");
			btnNewButton_2_1_1.setBounds(30, 490, 158, 48);
			contentPane.add(btnNewButton_2_1_1);
			
			JButton btnNewButton_1_2_1_1 = new JButton("Vanilla");
			btnNewButton_1_2_1_1.setBounds(261, 490, 158, 48);
			contentPane.add(btnNewButton_1_2_1_1);
			
			JButton btnNewButton_1_1_2_1_1 = new JButton("Strawberry");
			btnNewButton_1_1_2_1_1.setBounds(494, 490, 158, 48);
			contentPane.add(btnNewButton_1_1_2_1_1);
			
			JButton btnNewButton_1_1_1_1_1_1 = new JButton("Chocolate");
			btnNewButton_1_1_1_1_1_1.setBounds(700, 490, 158, 48);
			contentPane.add(btnNewButton_1_1_1_1_1_1);
			
			JButton btnNewButton_2_1_1_1_1 = new JButton("Back");
			btnNewButton_2_1_1_1_1.setBounds(5, 619, 158, 31);
			btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuclone clone = new menuclone();
					clone.show();
					
					dispose();
				}
			});
			contentPane.add(btnNewButton_2_1_1_1_1);
			
			JLabel lblNewLabel = new JLabel("25 ฿ for each ball");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(48, 124, 263, 31);
			contentPane.add(lblNewLabel);
			
			JButton btnNewButton_2_1_1_1_1_1 = new JButton("Next");
			btnNewButton_2_1_1_1_1_1.setBounds(721, 619, 158, 31);
			btnNewButton_2_1_1_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menutotal total = new menutotal();
					total.show();
					
					dispose();
				}
			});
			contentPane.add(btnNewButton_2_1_1_1_1_1);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(40, 232, 41, 22);
			contentPane.add(comboBox);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(271, 232, 41, 22);
			contentPane.add(comboBox_1);
			
			JComboBox comboBox_1_1 = new JComboBox();
			comboBox_1_1.setBounds(504, 232, 41, 22);
			contentPane.add(comboBox_1_1);
			
			JComboBox comboBox_1_2 = new JComboBox();
			comboBox_1_2.setBounds(710, 232, 41, 22);
			contentPane.add(comboBox_1_2);
			
			JComboBox comboBox_1_3 = new JComboBox();
			comboBox_1_3.setBounds(271, 348, 41, 22);
			contentPane.add(comboBox_1_3);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(40, 348, 41, 22);
			contentPane.add(comboBox_2);
			
			JComboBox comboBox_1_1_1 = new JComboBox();
			comboBox_1_1_1.setBounds(504, 348, 41, 22);
			contentPane.add(comboBox_1_1_1);
			
			JComboBox comboBox_1_2_1 = new JComboBox();
			comboBox_1_2_1.setBounds(710, 348, 41, 22);
			contentPane.add(comboBox_1_2_1);
			
			JComboBox comboBox_1_3_1 = new JComboBox();
			comboBox_1_3_1.setBounds(271, 451, 41, 22);
			contentPane.add(comboBox_1_3_1);
			
			JComboBox comboBox_2_1 = new JComboBox();
			comboBox_2_1.setBounds(40, 451, 41, 22);
			contentPane.add(comboBox_2_1);
			
			JComboBox comboBox_1_1_1_1 = new JComboBox();
			comboBox_1_1_1_1.setBounds(504, 451, 41, 22);
			contentPane.add(comboBox_1_1_1_1);
			
			JComboBox comboBox_1_2_1_1 = new JComboBox();
			comboBox_1_2_1_1.setBounds(710, 451, 41, 22);
			contentPane.add(comboBox_1_2_1_1);
			
			JComboBox comboBox_1_3_1_1 = new JComboBox();
			comboBox_1_3_1_1.setBounds(279, 556, 41, 22);
			contentPane.add(comboBox_1_3_1_1);
			
			JComboBox comboBox_2_1_1 = new JComboBox();
			comboBox_2_1_1.setBounds(48, 556, 41, 22);
			contentPane.add(comboBox_2_1_1);
			
			JComboBox comboBox_1_1_1_1_1 = new JComboBox();
			comboBox_1_1_1_1_1.setBounds(512, 556, 41, 22);
			contentPane.add(comboBox_1_1_1_1_1);
			
			JComboBox comboBox_1_2_1_1_1 = new JComboBox();
			comboBox_1_2_1_1_1.setBounds(718, 556, 41, 22);
			contentPane.add(comboBox_1_2_1_1_1);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(5, 5, 874, 651);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
			contentPane.add(lblNewLabel_1);
		}
	}


