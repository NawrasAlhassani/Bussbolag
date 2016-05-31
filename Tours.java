package gui;

import javax.swing.JOptionPane;

public class Tours {
	private String tur ;
	
	public Tours(String tur){
		this.tur = tur;
	}

	public void test() {
		
		String message = JOptionPane.showInputDialog(null, tur);
	}
	@SuppressWarnings("unused")
	public void bokning(){
		String bokat = null;
		if (bokat == null){
			JOptionPane.showMessageDialog(null, "Boka nu");
		}
		else{
			JOptionPane.showMessageDialog(null,"Fullbokat!");
		}
	}
			
	public static void main(String[] args) {
		Tours time1 = new Tours("1. 3/6 kl.14:45 \n2. 5/6 kl.16:00");
		Tours time2 = new Tours("5/6 kl.16:00"); 
		time1.test();
		time2.bokning();
	}	
}
