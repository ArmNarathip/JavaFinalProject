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
			
			JButton btnOk = new JButton("Back to main");
			btnOk.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					gelatomenu menu = new gelatomenu();
					menu.show();					
					dispose();
				}
			});
			
			JLabel lblEnjoyEatting = new JLabel("Enjoy eating!!");
			lblEnjoyEatting.setVerticalAlignment(SwingConstants.TOP);
			lblEnjoyEatting.setHorizontalAlignment(SwingConstants.LEFT);
			lblEnjoyEatting.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
			lblEnjoyEatting.setBounds(326, 338, 252, 53);
			contentPane.add(lblEnjoyEatting);
			btnOk.setBounds(341, 418, 210, 48);
			contentPane.add(btnOk);
			
			JPanel panel_1_1 = new JPanel();
			panel_1_1.setBackground(new Color(255, 128, 128));
			panel_1_1.setBounds(295, 327, 295, 81);
			contentPane.add(panel_1_1);
			
			JLabel TotalText = new JLabel("GISOS Gelato ");
			TotalText.setBackground(new Color(255, 128, 128));
			TotalText.setVerticalAlignment(SwingConstants.TOP);
			TotalText.setHorizontalAlignment(SwingConstants.LEFT);
			TotalText.setFont(new Font("Comic Sans MS", Font.BOLD, 53));
			TotalText.setBounds(259, 182, 417, 97);
			contentPane.add(TotalText);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 128, 128));
			panel.setBounds(239, 182, 406, 81);
			contentPane.add(panel);
			
			JLabel HandThisBill = new JLabel("Thank you for purchase");
			HandThisBill.setVerticalAlignment(SwingConstants.TOP);
			HandThisBill.setHorizontalAlignment(SwingConstants.LEFT);
			HandThisBill.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
			HandThisBill.setBounds(241, 272, 431, 53);
			contentPane.add(HandThisBill);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 128, 128));
			panel_1.setBounds(209, 257, 467, 81);
			contentPane.add(panel_1);
					
			JLabel BG = new JLabel("");
			BG.setBounds(5, 5, 874, 651);
			BG.setIcon(new ImageIcon("C:\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
			contentPane.add(BG);
			
			
			
			
		}
}
