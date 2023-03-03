
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.Font;
	import javax.swing.SwingConstants;
	import javax.swing.JTextField;
	import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class menutotal extends JFrame {

		private JPanel contentPane;
		private JTextField txtInt;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						menutotal frame = new menutotal();
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
		public menutotal() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel HeadingText = new JLabel("You will have {4Item} With {flavor}flavor {Nflavor} balls\r\n");
			HeadingText.setVerticalAlignment(SwingConstants.TOP);
			HeadingText.setHorizontalAlignment(SwingConstants.LEFT);
			HeadingText.setFont(new Font("Tahoma", Font.PLAIN, 30));
			HeadingText.setBounds(56, 124, 794, 123);
			contentPane.add(HeadingText);
			
			txtInt = new JTextField();
			txtInt.setText("INT108");
			txtInt.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtInt.setBounds(56, 268, 398, 55);
			contentPane.add(txtInt);
			txtInt.setColumns(10);
			
			JLabel RedeemCode = new JLabel("Redeem Code for 10% discount");
			RedeemCode.setVerticalAlignment(SwingConstants.TOP);
			RedeemCode.setHorizontalAlignment(SwingConstants.LEFT);
			RedeemCode.setFont(new Font("Tahoma", Font.PLAIN, 30));
			RedeemCode.setBounds(56, 186, 794, 123);
			contentPane.add(RedeemCode);
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnBack.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							menuflavor flavor = new menuflavor();
							flavor.show();
							
							dispose();
						}
					});
				}
			});
			btnBack.setBounds(56, 365, 158, 48);
			contentPane.add(btnBack);
			
			JButton btnOk = new JButton("Ok");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnOk.setBounds(265, 365, 158, 48);
			contentPane.add(btnOk);
			
			JButton btnSkip = new JButton("Skip");
			btnSkip.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Menulast last = new Menulast();
					last.show();
					
					dispose();

				}
			});
			btnSkip.setBounds(488, 365, 158, 48);
			contentPane.add(btnSkip);
			
			JLabel BG = new JLabel("");
			BG.setBounds(5, 5, 874, 651);
			BG.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
			contentPane.add(BG);
		}
}
