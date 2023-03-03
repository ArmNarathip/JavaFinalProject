import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

public class MenuBananaboat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBananaboat frame = new MenuBananaboat();
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
	public MenuBananaboat() {
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
		
		JCheckBox CheckBox_BiscottoDellaNonna = new JCheckBox("Purchase");
		CheckBox_BiscottoDellaNonna.setBounds(700, 344, 93, 21);
		contentPane.add(CheckBox_BiscottoDellaNonna);
		
		JCheckBox CheckBox_Riso = new JCheckBox("Purchase");
		CheckBox_Riso.setBounds(494, 233, 93, 21);
		contentPane.add(CheckBox_Riso);
		
		JCheckBox CheckBox_FiorDiLatte = new JCheckBox("Purchase");
		CheckBox_FiorDiLatte.setBounds(261, 233, 93, 21);
		contentPane.add(CheckBox_FiorDiLatte);
		
		JCheckBox CheckBox_Lemon = new JCheckBox("Purchase");
		CheckBox_Lemon.setBounds(30, 547, 93, 21);
		contentPane.add(CheckBox_Lemon);
		
		JCheckBox CheckBox_Nocciola = new JCheckBox("Purchase");
		CheckBox_Nocciola.setBounds(700, 233, 93, 21);
		contentPane.add(CheckBox_Nocciola);
		
		JCheckBox CheckBox_Vanilla = new JCheckBox("Purchase");
		CheckBox_Vanilla.setBounds(261, 547, 93, 21);
		contentPane.add(CheckBox_Vanilla);
		
		JCheckBox CheckBox_PannaCotta = new JCheckBox("Purchase");
		CheckBox_PannaCotta.setBounds(261, 449, 93, 21);
		contentPane.add(CheckBox_PannaCotta);
		
		JCheckBox CheckBox_Cantucci = new JCheckBox("Purchase");
		CheckBox_Cantucci.setBounds(494, 449, 93, 21);
		contentPane.add(CheckBox_Cantucci);
		
		JCheckBox CheckBox_Mandorla = new JCheckBox("Purchase");
		CheckBox_Mandorla.setBounds(700, 449, 93, 21);
		contentPane.add(CheckBox_Mandorla);
		
		JCheckBox CheckBox_Strawberry = new JCheckBox("Purchase");
		CheckBox_Strawberry.setBounds(494, 547, 93, 21);
		contentPane.add(CheckBox_Strawberry);
		
		JCheckBox CheckBox_ZuppaInglese = new JCheckBox("Purchase");
		CheckBox_ZuppaInglese.setBounds(30, 449, 93, 21);
		contentPane.add(CheckBox_ZuppaInglese);
		
		JCheckBox CheckBox_Caffe = new JCheckBox("Purchase");
		CheckBox_Caffe.setBounds(494, 344, 93, 21);
		contentPane.add(CheckBox_Caffe);
		
		JCheckBox CheckBox_Chocolate = new JCheckBox("Purchase");
		CheckBox_Chocolate.setBounds(700, 547, 93, 21);
		contentPane.add(CheckBox_Chocolate);
		
		JCheckBox CheckBox_Tiramisu = new JCheckBox("Purchase");
		CheckBox_Tiramisu.setBounds(261, 344, 93, 21);
		contentPane.add(CheckBox_Tiramisu);
		
		JCheckBox CheckBox_Gianduia = new JCheckBox("Purchase");
		CheckBox_Gianduia.setBounds(30, 344, 93, 21);
		contentPane.add(CheckBox_Gianduia);
		
		JCheckBox CheckBox_Crema = new JCheckBox("Purchase");
		CheckBox_Crema.setBounds(30, 233, 93, 21);
		contentPane.add(CheckBox_Crema);
		
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model2 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model3 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model4 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model5 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model6 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model7 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model8 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model9 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model10 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model11 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model12 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model13 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model14 = new SpinnerNumberModel(0, 0, 7, 1);  
		SpinnerNumberModel model15 = new SpinnerNumberModel(0, 0, 7, 1);  
		
		

		
		
		JSpinner Count_Nocciola = new JSpinner(model);
		Count_Nocciola.setBounds(828, 234, 30, 20);
		contentPane.add(Count_Nocciola);
		
		JSpinner Count_Riso = new JSpinner(model1);
		Count_Riso.setBounds(622, 234, 30, 20);
		contentPane.add(Count_Riso);
		
		JSpinner Count_Mandorla = new JSpinner(model2);
		Count_Mandorla.setBounds(828, 450, 30, 20);
		contentPane.add(Count_Mandorla);
		
		JSpinner Count_Caffe = new JSpinner(model3);
		Count_Caffe.setBounds(622, 345, 30, 20);
		contentPane.add(Count_Caffe);
		
		JSpinner Count_Cantucci = new JSpinner(model4);
		Count_Cantucci.setBounds(622, 450, 30, 20);
		contentPane.add(Count_Cantucci);
		
		JSpinner Count_Chocolate = new JSpinner(model5);
		Count_Chocolate.setBounds(828, 548, 30, 20);
		contentPane.add(Count_Chocolate);
		
		JSpinner Count_FiorDiLatte = new JSpinner(model6);
		Count_FiorDiLatte.setBounds(389, 234, 30, 20);
		contentPane.add(Count_FiorDiLatte);
		
		JSpinner Count_BiscottoDellaNonna = new JSpinner(model7);
		Count_BiscottoDellaNonna.setBounds(828, 345, 30, 20);
		contentPane.add(Count_BiscottoDellaNonna);
		
		JSpinner Count_Tiramisu = new JSpinner(model8);
		Count_Tiramisu.setBounds(389, 345, 30, 20);
		contentPane.add(Count_Tiramisu);
		
		JSpinner Count_Strawberry = new JSpinner(model9);
		Count_Strawberry.setBounds(622, 548, 30, 20);
		contentPane.add(Count_Strawberry);
		
		JSpinner Count_Vanilla = new JSpinner(model10);
		Count_Vanilla.setBounds(389, 548, 30, 20);
		contentPane.add(Count_Vanilla);
		
		JSpinner Count_PannaCotta = new JSpinner(model11);
		Count_PannaCotta.setBounds(389, 450, 30, 20);
		contentPane.add(Count_PannaCotta);
		
		JSpinner Count_Lemon = new JSpinner(model12);
		Count_Lemon.setBounds(158, 548, 30, 20);
		contentPane.add(Count_Lemon);
		
		JSpinner Count_ZuppaInglese = new JSpinner(model13);
		Count_ZuppaInglese.setBounds(158, 450, 30, 20);
		contentPane.add(Count_ZuppaInglese);
		
		JSpinner Count_Gianduia = new JSpinner(model14);
		Count_Gianduia.setBounds(158, 345, 30, 20);
		contentPane.add(Count_Gianduia);
		
		JSpinner Count_Crema = new JSpinner(model15);
		Count_Crema.setBounds(158, 234, 30, 20);
		contentPane.add(Count_Crema);
		
		btnChooseFlavor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnChooseFlavor.setBounds(188, 35, 515, 78);
		contentPane.add(btnChooseFlavor);
		
		JButton btnNewButton = new JButton("Crema");
		btnNewButton.setBounds(30, 173, 158, 48);
		contentPane.add(btnNewButton);
		
		JButton btnFiorDiLatte = new JButton("Fior Di Latte");
		btnFiorDiLatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFiorDiLatte.setBounds(261, 173, 158, 48);
		contentPane.add(btnFiorDiLatte);
		
		JButton Riso = new JButton("Riso");
		Riso.setBounds(494, 173, 158, 48);
		contentPane.add(Riso);
		
		JButton Nocciola = new JButton("Nocciola");
		Nocciola.setBounds(700, 173, 158, 48);
		contentPane.add(Nocciola);
		
		JButton Gianduia = new JButton("Gianduia");
		Gianduia.setBounds(30, 276, 158, 48);
		contentPane.add(Gianduia);
		
		JButton Tiramisu = new JButton("Tiramisu");
		Tiramisu.setBounds(261, 276, 158, 48);
		contentPane.add(Tiramisu);
		
		JButton Caffe = new JButton("Caffe");
		Caffe.setBounds(494, 276, 158, 48);
		contentPane.add(Caffe);
		
		JButton BiscottoDellaNonna = new JButton("Biscotto Della Nonna");
		BiscottoDellaNonna.setBounds(700, 276, 158, 48);
		contentPane.add(BiscottoDellaNonna);
		
		JButton ZuppaInglese = new JButton("Zuppa Inglese");
		ZuppaInglese.setBounds(30, 392, 158, 48);
		contentPane.add(ZuppaInglese);
		
		JButton PannaCotta = new JButton("Panna Cotta");
		PannaCotta.setBounds(261, 392, 158, 48);
		contentPane.add(PannaCotta);
		
		JButton Cantucci = new JButton("Cantucci");
		Cantucci.setBounds(494, 392, 158, 48);
		contentPane.add(Cantucci);
		
		JButton Mandorla = new JButton("Mandorla");
		Mandorla.setBounds(700, 392, 158, 48);
		contentPane.add(Mandorla);
		
		JButton Lemon = new JButton("Lemon");
		Lemon.setBounds(30, 490, 158, 48);
		contentPane.add(Lemon);
		
		JButton Vanilla = new JButton("Vanilla");
		Vanilla.setBounds(261, 490, 158, 48);
		contentPane.add(Vanilla);
		
		JButton Strawberry = new JButton("Strawberry");
		Strawberry.setBounds(494, 490, 158, 48);
		contentPane.add(Strawberry);
		
		JButton Chocolate = new JButton("Chocolate");
		Chocolate.setBounds(700, 490, 158, 48);
		contentPane.add(Chocolate);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(5, 619, 158, 31);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menucone cone = new menucone();
				cone.show();
				
				dispose();
			}
		});
		contentPane.add(btnBack);
		
		JLabel HeadingDescripstion = new JLabel("25 ฿ for each ball");
		HeadingDescripstion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HeadingDescripstion.setBounds(48, 124, 263, 31);
		contentPane.add(HeadingDescripstion);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(721, 619, 158, 31);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menutotal total = new menutotal();
				total.show();
				
				dispose();
			}
		});
		contentPane.add(btnNext);
		
		JLabel BG = new JLabel("");
		BG.setBounds(5, 5, 874, 651);
		BG.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
		contentPane.add(BG);
	}
}


