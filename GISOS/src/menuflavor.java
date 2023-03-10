
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JComboBox;
	import javax.swing.JSpinner;
	import javax.swing.SpinnerNumberModel;
	import javax.swing.JCheckBox;
	import javax.swing.JTextArea;
	import java.awt.Color;
	import javax.swing.JTextField;

	public class menuflavor extends JFrame {

		private JPanel contentPane;
		private JTextField codediscount;
		private int x =0;
		private int icecream=25;
		private int cup=0;
		private JTextField textField;
		private double price=0;

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
			setBounds(100, 100, 1275, 805);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnChooseFlavor = new JButton("CHOOSE FLAVOR!!");
			btnChooseFlavor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			
			textField = new JTextField();
			textField.setBounds(341, 605, 211, 31);
			contentPane.add(textField);
			textField.setColumns(10);
			
			codediscount = new JTextField();
			codediscount.setBackground(Color.PINK);
			codediscount.setBounds(331, 596, 230, 48);
			contentPane.add(codediscount);
			codediscount.setColumns(10);
			
			JTextArea textArea = new JTextArea();
			textArea.setBackground(Color.WHITE);
			textArea.setBounds(917, 69, 294, 583);
			contentPane.add(textArea);
			
			JButton oddernow = new JButton("Redeem");
			oddernow.setBounds(367, 652, 152, 41);
			contentPane.add(oddernow);
			oddernow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText(textArea.getText()+Order());
				}
			});
			oddernow.setFont(new Font("Tahoma", Font.PLAIN, 22));
			
			
			JLabel PannacotPIC = new JLabel("");
			PannacotPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\pannacot.png"));
			PannacotPIC.setBounds(691, 354, 140, 101);
			contentPane.add(PannacotPIC);
			
			JLabel ChocoPIC = new JLabel("");
			ChocoPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\chooco.png"));
			ChocoPIC.setBounds(691, 134, 150, 101);
			contentPane.add(ChocoPIC);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.PINK);
			panel.setBounds(897, 51, 332, 618);
			contentPane.add(panel);
			
			JLabel StrawPIC = new JLabel("");
			StrawPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\straw.png"));
			StrawPIC.setBounds(468, 354, 152, 101);
			contentPane.add(StrawPIC);
			
			JLabel VanilaPIC = new JLabel("");
			VanilaPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\vanilla.png"));
			VanilaPIC.setBounds(261, 354, 152, 101);
			contentPane.add(VanilaPIC);
			
			JLabel LemonPIC = new JLabel("");
			LemonPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\lemon.png"));
			LemonPIC.setBounds(48, 354, 158, 101);
			contentPane.add(LemonPIC);
			
			JLabel MandorlaPIC = new JLabel("");
			MandorlaPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\mandola.png"));
			MandorlaPIC.setBounds(483, 134, 129, 101);
			contentPane.add(MandorlaPIC);
			
			JLabel CaffePIC = new JLabel("");
			CaffePIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\coffee.png"));
			CaffePIC.setBounds(261, 134, 150, 101);
			contentPane.add(CaffePIC);
			
			JLabel TiramisuPIC = new JLabel("");
			TiramisuPIC.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\GelaPIC\\tiramisu.png"));
			TiramisuPIC.setBounds(54, 125, 152, 110);
			contentPane.add(TiramisuPIC);
			
			//spinner model
			SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 3, 1);
			SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model2 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model3 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model4 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model5 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model6 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model7 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model8 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model9 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model10 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model11 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model12 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model13 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model14 = new SpinnerNumberModel(0, 0, 3, 1);  
			SpinnerNumberModel model15 = new SpinnerNumberModel(0, 0, 3, 1);
			
			//Count spinner	
			JSpinner Count_Mandorla = new JSpinner(model2);
			Count_Mandorla.setBounds(596, 301, 30, 20);
			contentPane.add(Count_Mandorla);
			
			JSpinner Count_Caffe = new JSpinner(model3);
			Count_Caffe.setBounds(389, 301, 30, 20);
			contentPane.add(Count_Caffe);
			
			JSpinner Count_Chocolate = new JSpinner(model5);
			Count_Chocolate.setBounds(811, 301, 30, 20);
			contentPane.add(Count_Chocolate);
			
			JSpinner Count_Tiramisu = new JSpinner(model8);
			Count_Tiramisu.setBounds(176, 301, 30, 20);
			contentPane.add(Count_Tiramisu);
			
			JSpinner Count_Strawberry = new JSpinner(model9);
			Count_Strawberry.setBounds(596, 521, 30, 20);
			contentPane.add(Count_Strawberry);
			
			JSpinner Count_Vanilla = new JSpinner(model10);
			Count_Vanilla.setBounds(389, 521, 30, 20);
			contentPane.add(Count_Vanilla);
			
			JSpinner Count_PannaCotta = new JSpinner(model11);
			Count_PannaCotta.setBounds(811, 522, 30, 20);
			contentPane.add(Count_PannaCotta);
			
			JSpinner Count_Lemon = new JSpinner(model12);
			Count_Lemon.setBounds(176, 521, 30, 20);
			contentPane.add(Count_Lemon);
			
			//Purchase botton
			JCheckBox CheckBox_Lemon = new JCheckBox("Purchase");
			CheckBox_Lemon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Lemon.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Lemon.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Lemon\t\t"+Count_Lemon.getValue()+"\n");
						  }else {
							  CheckBox_Lemon.setSelected(false);
						  }
					  }else {
						  CheckBox_Lemon.setSelected(false);
					  }
					  
				}
			});
			CheckBox_Lemon.setBounds(48, 521, 93, 21);
			contentPane.add(CheckBox_Lemon);
			
			JCheckBox CheckBox_Vanilla = new JCheckBox("Purchase");
			CheckBox_Vanilla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Vanilla.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Vanilla.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Vanilla\t\t"+Count_Vanilla.getValue()+"\n");
						  }else {
							  CheckBox_Vanilla.setSelected(false);
						  }
					  }else {
						  CheckBox_Vanilla.setSelected(false);
					  }
					  
				}
			});
			CheckBox_Vanilla.setBounds(261, 521, 93, 21);
			contentPane.add(CheckBox_Vanilla);
			
			JCheckBox CheckBox_PannaCotta = new JCheckBox("Purchase");
			CheckBox_PannaCotta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_PannaCotta.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_PannaCotta.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Panna Cotta\t\t"+Count_PannaCotta.getValue()+"\n");
						  }else {
							  CheckBox_PannaCotta.setSelected(false);
						  }
					  }else {
						  CheckBox_PannaCotta.setSelected(false);
					  }
					  
				}
			});
			CheckBox_PannaCotta.setBounds(683, 521, 93, 21);
			contentPane.add(CheckBox_PannaCotta);
			
			JCheckBox CheckBox_Mandorla = new JCheckBox("Purchase");
			CheckBox_Mandorla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Mandorla.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Mandorla.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Mandorla\t\t"+Count_Mandorla.getValue()+"\n");
						  }else {
							  CheckBox_Mandorla.setSelected(false);
						  }
					  }else {
						  CheckBox_Mandorla.setSelected(false);
					  }
					  
				}
			});
			CheckBox_Mandorla.setBounds(468, 301, 93, 21);
			contentPane.add(CheckBox_Mandorla);
			
			JCheckBox CheckBox_Strawberry = new JCheckBox("Purchase");
			CheckBox_Strawberry.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Strawberry.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Strawberry.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Strawberry\t\t"+Count_Strawberry.getValue()+"\n");
						  }else {
							  CheckBox_Strawberry.setSelected(false);
						  }
					  }else {
						  CheckBox_Strawberry.setSelected(false);
					  }
					  
				}
			});
			CheckBox_Strawberry.setBounds(468, 521, 93, 21);
			contentPane.add(CheckBox_Strawberry);
			
			JCheckBox CheckBox_Caffe = new JCheckBox("Purchase");
			CheckBox_Caffe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Caffe.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Caffe.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Caffe\t\t"+Count_Caffe.getValue()+"\n");
						  }else {
							  CheckBox_Caffe.setSelected(false);
						  }
					  }else {
						  CheckBox_Caffe.setSelected(false);
					  }
					  
				}
			});
			CheckBox_Caffe.setBounds(261, 301, 93, 21);
			contentPane.add(CheckBox_Caffe);
			
			JCheckBox CheckBox_Chocolate = new JCheckBox("Purchase");
			CheckBox_Chocolate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Chocolate.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Chocolate.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Chocolate\t\t"+Count_Chocolate.getValue()+"\n");
						  }else {
							  CheckBox_Chocolate.setSelected(false);
						  }
					  }else {
						  CheckBox_Chocolate.setSelected(false);
					  }
					  
				}
			});
			CheckBox_Chocolate.setBounds(683, 301, 93, 21);
			contentPane.add(CheckBox_Chocolate);
			
			JCheckBox CheckBox_Tiramisu = new JCheckBox("Purchase");
			CheckBox_Tiramisu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int qty = Integer.parseInt(Count_Tiramisu.getValue().toString());
					  if(qtyIsZero(qty)&&CheckBox_Tiramisu.isSelected()) {
						  x++;
						  cup+=qty;
						  if(mtc(cup,qty)){
							  if(x==1) {
								  textArea.setText(recipe()+"\n");
							  }
							  price += (qty*icecream);
							  textArea.setText(textArea.getText()+"Tiramisu\t\t"+Count_Tiramisu.getValue()+"\n");
						  }else {
							  CheckBox_Tiramisu.setSelected(false);
						  }
					  }else {
						  CheckBox_Tiramisu.setSelected(false);
					  }
				}
			});
			CheckBox_Tiramisu.setBounds(48, 301, 93, 21);
			contentPane.add(CheckBox_Tiramisu);
			
			
			btnChooseFlavor.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnChooseFlavor.setBounds(261, 35, 515, 78);
			contentPane.add(btnChooseFlavor);
			
			JButton btnTiramisu = new JButton("Tiramisu");
			btnTiramisu.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnTiramisu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnTiramisu.setBounds(54, 246, 152, 48);
			contentPane.add(btnTiramisu);
			
			JButton btnCaffe = new JButton("Caffe");
			btnCaffe.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnCaffe.setBounds(261, 246, 158, 48);
			contentPane.add(btnCaffe);
			
			JButton btnPannaCotta = new JButton("Panna Cotta");
			btnPannaCotta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnPannaCotta.setBounds(683, 466, 158, 48);
			contentPane.add(btnPannaCotta);
			
			JButton btnMandorla = new JButton("Mandorla");
			btnMandorla.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnMandorla.setBounds(468, 246, 158, 48);
			contentPane.add(btnMandorla);
			
			JButton btnLemon = new JButton("Lemon");
			btnLemon.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnLemon.setBounds(48, 466, 158, 48);
			contentPane.add(btnLemon);
			
			JButton btnVanilla = new JButton("Vanilla");
			btnVanilla.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnVanilla.setBounds(261, 466, 158, 48);
			contentPane.add(btnVanilla);
			
			JButton btnStrawberry = new JButton("Strawberry");
			btnStrawberry.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnStrawberry.setBounds(468, 466, 158, 48);
			contentPane.add(btnStrawberry);
			
			JButton btnChocolate = new JButton("Chocolate");
			btnChocolate.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnChocolate.setBounds(683, 246, 158, 48);
			contentPane.add(btnChocolate);
			
			JButton btnBack = new JButton("Back");
			btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnBack.setBounds(30, 711, 158, 31);
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menucone cone = new menucone();
					cone.show();
					
					dispose();
				}
			});
			contentPane.add(btnBack);
			
			JLabel HeadingDescripsion = new JLabel("25 ฿ for each ball");
			HeadingDescripsion.setFont(new Font("Tahoma", Font.PLAIN, 22));
			HeadingDescripsion.setBounds(30, 11, 263, 31);
			contentPane.add(HeadingDescripsion);
			
			JButton btnOrrderNow = new JButton("Order Now!");
			btnOrrderNow.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnOrrderNow.setBounds(1067, 711, 158, 31);
			btnOrrderNow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Menulast last = new Menulast();
					int option =JOptionPane.showConfirmDialog(null, "Your Discount is "+Discount(textField.getText(),price)+" baht.",
							"Totol discount",JOptionPane.YES_NO_OPTION);
					if(option ==JOptionPane.YES_OPTION ) {
						last.show();
						dispose();
					}
				}
			});
			contentPane.add(btnOrrderNow);
			
			JLabel BG = new JLabel("");
			BG.setBounds(10, -11, 1259, 766);
			BG.setIcon(new ImageIcon("C:\\Users\\naraa\\OneDrive\\เดสก์ท็อป\\drive-download-20230220T083051Z-001\\cartoon-ice-cream-seamless-background_6997-1664.jpg"));
		contentPane.add(BG);
		}
		public String recipe() {
			return	"**************GISOS****************";
		}
		
		public String Order() {
			return	"Your order is in process...❤️❤️❤️";
		}
		
		public boolean qtyIsZero(int qty) {
			if(qty==0) {
				JOptionPane.showMessageDialog(null, "Please increase the item quantity");
				return false;
			}
			return true;
		}
		
		public boolean mtc(int incup,int qty) {
			if(incup>3) {
				JOptionPane.showMessageDialog(null, "You can't choose more than 3 ice cream ");
				cup-=qty;
				return false;
			}
			return true;
		}
		
		public double Discount(String code,double price) {
			if(code.equalsIgnoreCase("INT-108")) {
				return price-(price*10/100);
			}
			return price;
		}
	}


