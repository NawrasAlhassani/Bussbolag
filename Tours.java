package Tour;

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
		Tours time1 = new Tours("");
		time1.test();
	}	
}
