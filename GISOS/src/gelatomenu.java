import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
public class gelatomenu extends JFrame {
	public gelatomenu() {
		getContentPane().setForeground(new Color(51, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jokec\\Pictures\\.other\\for gelato\\image_2023-01-18_185605009.png"));
		lblNewLabel.setBounds(191, 157, 515, 280);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Order Now!!");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(191, 517, 515, 78);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Gelato GISOS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 22, 849, 120);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(191, 48, 498, 78);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Jokec\\Pictures\\.other\\for gelato\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
		lblNewLabel_1.setBounds(0, 0, 874, 661);
		getContentPane().add(lblNewLabel_1);
	}
}
