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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gelatomenu frame = new gelatomenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public gelatomenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setForeground(new Color(51, 255, 204));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\image_2023-01-18_185605009.png"));
		lblNewLabel.setBounds(191, 157, 515, 280);
		getContentPane().add(lblNewLabel);
		
		JButton OrderButton = new JButton("Order Now!!");
		OrderButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		OrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menucone cone = new menucone();
				cone.show();
				
				dispose();

			}
		});
		OrderButton.setBounds(191, 517, 515, 78);
		getContentPane().add(OrderButton);
		
		JLabel HeadingText = new JLabel("Gelato GISOS");
		HeadingText.setHorizontalAlignment(SwingConstants.CENTER);
		HeadingText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		HeadingText.setBounds(10, 22, 849, 120);
		getContentPane().add(HeadingText);
		
		
	}
}
