import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GelatoSys extends JFrame {
	private int cup;
	private int icecream = 25;
	private int qty;
	
	
	public GelatoSys(int cup) {
		this.cup = cup;		
	}
	
	public GelatoSys() {
		this.cup = 0;		
	}

	
	public void setcup(int cup) {
		this.cup = cup;
	}
		
	public int getcup() {
		return this.cup;
	}
	
	public int getqty() {
		return this.qty;
	}
	
	public int geticecream() {
		return this.icecream;
	}
	
	public void setqty(int qty) {
		this.qty = qty;
	}
	
	public String recipe() {
		return	"**************GISOS****************\n";
	}
	
	public String Order(String code) {
		if(code.equalsIgnoreCase("INT-108")) {
		return	" Your code has been redeemed.\n\n------------Thank you------------\n";
		}else {
			return " Invalid code";
		}
	}
	
	public boolean qtyIsZero() {
		if(getqty()==0) {
			JOptionPane.showMessageDialog(null, "Please increase the item quantity");
			return false;
		}
		return true;
	}
	
	public boolean mtc3(int incup) {
		if(incup>3) {
			JOptionPane.showMessageDialog(null, "You can't choose more than 3 ice cream ");
			return false;
		}
		return true;
	}
	
	public boolean mtc4(int incup) {
		if(incup>4) {
			JOptionPane.showMessageDialog(null, "You can't choose more than 4 ice cream ");
			return false;
		}
		return true;
	}
	
	public boolean mtc7(int incup) {
		if(incup>7) {
			JOptionPane.showMessageDialog(null, "You can't choose more than 7 ice cream ");
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