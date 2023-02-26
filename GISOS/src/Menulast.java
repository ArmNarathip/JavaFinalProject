	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.Font;
	import javax.swing.SwingConstants;
	import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

	public class Menulast extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Menulast frame = new Menulast();
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
		public Menulast() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblThatWillBe = new JLabel("That will be {total} ฿");
			lblThatWillBe.setVerticalAlignment(SwingConstants.TOP);
			lblThatWillBe.setHorizontalAlignment(SwingConstants.LEFT);
			lblThatWillBe.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblThatWillBe.setBounds(33, 83, 314, 48);
			contentPane.add(lblThatWillBe);
			
			JLabel lblHandThisBill = new JLabel("Hand this bill to the Cashier");
			lblHandThisBill.setVerticalAlignment(SwingConstants.TOP);
			lblHandThisBill.setHorizontalAlignment(SwingConstants.LEFT);
			lblHandThisBill.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblHandThisBill.setBounds(33, 125, 393, 53);
			contentPane.add(lblHandThisBill);
			
			JButton btnOk = new JButton("Ok");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					gelatomenu menu = new gelatomenu();
					menu.show();					
					dispose();
				}
			});
			btnOk.setBounds(206, 204, 158, 48);
			contentPane.add(btnOk);
		
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menutotal total = new menutotal();
					total.show();
					dispose();
				}
			});	
			btnBack.setBounds(33, 204, 148, 48);
			contentPane.add(btnBack);
					
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(5, 5, 874, 651);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
			contentPane.add(lblNewLabel_1);
			
			
			
			
		}
}
