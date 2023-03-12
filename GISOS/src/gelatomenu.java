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
		getContentPane().setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setForeground(Color.PINK);
		getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("Exit");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(24, 603, 85, 37);
		getContentPane().add(btnClose);
		
		JLabel bgmain = new JLabel("");
		bgmain.setBackground(new Color(255, 0, 0));
		bgmain.setForeground(new Color(192, 192, 192));
		bgmain.setHorizontalAlignment(SwingConstants.CENTER);
		bgmain.setFont(new Font("Tahoma", Font.PLAIN, 8));
		bgmain.setIcon(new ImageIcon(gelatomenu.class.getResource("/resource/BG main.png")));
		bgmain.setBounds(137, 144, 615, 350);
		getContentPane().add(bgmain);
		
		JButton OrderButton = new JButton("Order Now!!");
		OrderButton.setFont(new Font("Eras Bold ITC", Font.PLAIN, 47));
		OrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menucone cone = new menucone();
				cone.show();
				
				dispose();

			}
		});
		OrderButton.setBounds(191, 517, 504, 78);
		getContentPane().add(OrderButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(191, 41, 504, 78);
		getContentPane().add(panel);
		
		JLabel HeadingText = new JLabel("Gelato GISOS");
		panel.add(HeadingText);
		HeadingText.setHorizontalAlignment(SwingConstants.CENTER);
		HeadingText.setFont(new Font("Britannic Bold", Font.PLAIN, 60));
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(gelatomenu.class.getResource("/resource/BG.jpg")));
		bg.setBounds(10, 25, 864, 628);
		getContentPane().add(bg);
		
		
	}
}
