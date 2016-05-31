package Tour;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoiceTour extends JPanel implements ActionListener{
//	 JPanel viewpan = new JPanel(new GridLayout());
//	 JPanel infopan = new JPanel(new GridLayout());
	 Choice country = new Choice();
	 Choice city = new Choice();
	 Choice week = new Choice();
	 Choice clndr = new Choice();
	 JLabel or = new JLabel("eller");
	 JLabel showtravel = new JLabel("khuwheuhaieowhughwieghoisehfishegihweiogrw");
//	 Calendar CAL = Calendar.getInstance () ; 
	 JButton btnsearch = new JButton("Sök");
//	 JButton btnreserve = new JButton("Boka");
	
	public ChoiceTour(){
		setPreferredSize(new Dimension());
//		CAL.set(Calendar.YEAR, 2016);
//		int save = CAL.get(Calendar.YEAR);
		
		//add(country);
		add(city);
		//add(week);
		//add(or);
		add(clndr);
		add(btnsearch);
		add(showtravel);
		
		
		country.add("Danmark");
		country.add("Sverige");
		country.add("Tyskland");
		
		
		city.add("Helsinggör (Danmark)");
		city.add("Köpenhamn (Danmark)");
		city.add("Odense (Danmark)");
		city.add("Göteborg (Sverige)");
		city.add("Helsingborg (Sverige)");
		city.add("Malmö (Sverige)");
		city.add("Stockholm (Sverige)");
		city.add("Berlin (Tyska)");
		city.add("München (Tyska)");
		
		
		week.add("22");
		week.add("23");
		week.add("24");
		week.add("25");
		week.add("26");
		week.add("27");
		week.add("28");
		week.add("29");
		week.add("30");
		week.add("31");
		week.add("32");
		week.add("33");
		week.add("34");
		week.add("35");
		week.add("36");
		week.add("37");
		week.add("38");
		week.add("39");
		week.add("40");
		week.add("41");
		week.add("42");
		week.add("43");
		week.add("44");
		week.add("45");
		week.add("46");
		week.add("47");
		week.add("48");
		
		
		clndr.add("1/6 (v.22)");
		clndr.add("2/6 (v.22)");
		clndr.add("3/6 (v.22)");
		clndr.add("4/6 (v.22)");
		clndr.add("5/6 (v.22)");
		clndr.add("6/6 (v.23)");
		clndr.add("7/6 (v.23)");
		clndr.add("8/6 (v.23)");
		clndr.add("9/6 (v.23)");
		clndr.add("10/6 (v.23)");
		clndr.add("11/6 (v.23)");
		clndr.add("12/6 (v.23)");
		clndr.add("13/6 (v.24)");
		clndr.add("14/6 (v.24)");
		clndr.add("15/6 (v.24)");
		clndr.add("16/6 (v.24)");
		clndr.add("17/6 (v.24)");
		clndr.add("18/6 (v.24)");
		clndr.add("19/6 (v.24)");
		clndr.add("20/6 (v.25)");
		clndr.add("21/6 (v.25)");
		clndr.add("22/6 (v.25)");
		clndr.add("23/6 (v.25)");
		clndr.add("24/6 (v.25)");
		clndr.add("25/6 (v.25)");
		clndr.add("26/6 (v.25)");
		clndr.add("27/6 (v.26)");
		clndr.add("28/6 (v.26)");
		clndr.add("29/6 (v.26)");
		clndr.add("30/6 (v.26)");
		clndr.add("1/7 (v.26)");
		clndr.add("2/7 (v.26)");
		clndr.add("3/7 (v.26)");
		clndr.add("4/7 (v.27)");
		clndr.add("5/7 (v.27)");
		clndr.add("6/7 (v.27)");
		clndr.add("7/7 (v.27)");
		clndr.add("8/7 (v.27)");
		clndr.add("9/7 (v.27)");
		clndr.add("10/7 (v.27)");
		clndr.add("11/7 (v.28)");
		clndr.add("12/7 (v.28)");
		clndr.add("13/7 (v.28)");
		clndr.add("14/7 (v.28)");
		clndr.add("15/7 (v.28)");
		clndr.add("16/7 (v.28)");
		clndr.add("17/7 (v.28)");
		clndr.add("18/7 (v.29)");
		clndr.add("19/7 (v.29)");
		clndr.add("20/7 (v.29)");
		clndr.add("21/7 (v.29)");
		clndr.add("22/7 (v.29)");
		clndr.add("23/7 (v.29)");
		clndr.add("24/7 (v.29)");
		clndr.add("25/7 (v.30)");
		clndr.add("26/7 (v.30)");
		clndr.add("27/7 (v.30)");
		clndr.add("28/7 (v.30)");
		clndr.add("29/7 (v.30)");
		clndr.add("30/7 (v.30)");
		clndr.add("31/7 (v.30)");
		clndr.add("1/8 (v.31)");
		clndr.add("2/8 (v.31)");
		clndr.add("3/8 (v.31)");
		clndr.add("4/8 (v.31)");
		clndr.add("5/8 (v.31)");
		clndr.add("6/8 (v.31)");
		clndr.add("7/8 (v.31)");
		clndr.add("8/8 (v.32)");
		clndr.add("9/8 (v.32)");
		clndr.add("10/8 (v.32)");
		clndr.add("11/8 (v.32)");
		clndr.add("12/8 (v.32)");
		clndr.add("13/8 (v.32)");
		clndr.add("14/8 (v.32)");
		clndr.add("15/8 (v.33)");
		clndr.add("16/8 (v.33)");
		clndr.add("17/8 (v.33)");
		clndr.add("18/8 (v.33)");
		clndr.add("19/8 (v.33)");
		clndr.add("20/8 (v.33)");
		clndr.add("21/8 (v.33)");
		clndr.add("22/8 (v.34)");
		clndr.add("23/8 (v.34)");
		clndr.add("24/8 (v.34)");
		clndr.add("25/8 (v.34)");
		clndr.add("26/8 (v.34)");
		clndr.add("27/8 (v.34)");
		clndr.add("28/8 (v.34)");
		clndr.add("29/8 (v.35)");
		clndr.add("30/8 (v.35)");
		clndr.add("31/8 (v.35)");
		clndr.add("1/9 (v.35)");
		clndr.add("2/9 (v.35)");
		clndr.add("3/9 (v.35)");
		clndr.add("4/9 (v.35)");
		clndr.add("5/9 (v.36)");
		clndr.add("6/9 (v.36)");
		clndr.add("7/9 (v.36)");
		clndr.add("8/9 (v.36)");
		clndr.add("9/9 (v.36)");
		clndr.add("10/9 (v.36)");
		clndr.add("11/9 (v.36)");
		clndr.add("12/9 (v.37)");
		clndr.add("13/9 (v.37)");
		clndr.add("14/9 (v.37)");
		clndr.add("15/9 (v.37)");
		clndr.add("16/9 (v.37)");
		clndr.add("17/9 (v.37)");
		clndr.add("18/9 (v.37)");
		clndr.add("19/9 (v.38)");
		clndr.add("20/9 (v.38)");
		clndr.add("21/9 (v.38)");
		clndr.add("22/9 (v.38)");
		clndr.add("23/9 (v.38)");
		clndr.add("24/9 (v.38)");
		clndr.add("25/9 (v.38)");
		clndr.add("26/9 (v.39)");
		clndr.add("27/9 (v.39)");
		clndr.add("28/9 (v.39)");
		clndr.add("29/9 (v.39)");
		clndr.add("30/9 (v.39)");
		clndr.add("1/10 (v.39)");
		clndr.add("2/10 (v.39)");
		clndr.add("3/10 (v.40)");
		clndr.add("4/10 (v.40)");
		clndr.add("5/10 (v.40)");
		clndr.add("6/10 (v.40)");
		clndr.add("7/10 (v.40)");
		clndr.add("8/10 (v.40)");
		clndr.add("9/10 (v.40)");
		clndr.add("10/10 (v.41)");
		clndr.add("11/10 (v.41)");
		clndr.add("12/10 (v.41)");
		clndr.add("13/10 (v.41)");
		clndr.add("14/10 (v.41)");
		clndr.add("15/10 (v.41)");
		clndr.add("16/10 (v.41)");
		clndr.add("17/10 (v.42)");
		clndr.add("18/10 (v.42)");
		clndr.add("19/10 (v.42)");
		clndr.add("20/10 (v.42)");
		clndr.add("21/10 (v.42)");
		clndr.add("22/10 (v.42)");
		clndr.add("23/10 (v.42)");
		clndr.add("24/10 (v.43)");
		clndr.add("25/10 (v.43)");
		clndr.add("26/10 (v.43)");
		clndr.add("27/10 (v.43)");
		clndr.add("28/10 (v.43)");
		clndr.add("29/10 (v.43)");
		clndr.add("30/10 (v.43)");
		clndr.add("31/10 (v.44)");
		clndr.add("1/11 (v.44)");
		clndr.add("2/11 (v.44)");
		clndr.add("3/11 (v.44)");
		clndr.add("4/11 (v.44)");
		clndr.add("5/11 (v.44)");
		clndr.add("6/11 (v.44)");
		clndr.add("7/11 (v.45)");
		clndr.add("8/11 (v.45)");
		clndr.add("9/11 (v.45)");
		clndr.add("10/11 (v.45)");
		clndr.add("11/11 (v.45)");
		clndr.add("12/11 (v.45)");
		clndr.add("13/11 (v.45)");
		clndr.add("14/11 (v.46)");
		clndr.add("15/11 (v.46)");
		clndr.add("16/11 (v.46)");
		clndr.add("17/11 (v.46)");
		clndr.add("18/11 (v.46)");
		clndr.add("19/11 (v.46)");
		clndr.add("20/11 (v.46)");
		clndr.add("21/11 (v.47)");
		clndr.add("22/11 (v.47)");
		clndr.add("23/11 (v.47)");
		clndr.add("24/11 (v.47)");
		clndr.add("25/11 (v.47)");
		clndr.add("26/11 (v.47)");
		clndr.add("27/11 (v.47)");
		clndr.add("28/11 (v.48)");
		clndr.add("29/11 (v.48)");
		clndr.add("30/11 (v.48)");
		
		
		
		
	}
	public void ChoiceRules (){
		int land = 3;
        String landString = null;
        switch (land) {
            case 1:  landString = "Danmark";
                     break;
            case 2:  landString = "Sverige";
                     break;
            case 3:  landString = "Tyskland";
                     break;
        }
	
        System.out.println(landString);
    
	}
	public void start() {
		JFrame frame = new JFrame("Välj resa");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ChoiceTour());
		frame.setSize(550, 400);
		
	}
	
	public void actionPerformed(ActionEvent e1) {
		if (e1.getSource() == btnsearch){
			
		}
		
	}
	

	public static void main(String args[]) {
		ChoiceTour cho = new ChoiceTour();
		cho.start();
	}
	

}
