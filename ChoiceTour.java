package gui;

import java.awt.Choice;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoiceTour extends JPanel{
//	 JPanel viewpan = new JPanel(new GridLayout());
//	 JPanel infopan = new JPanel(new GridLayout());
	 Choice country = new Choice();
	 Choice city = new Choice();
	 Choice week = new Choice();
	 Choice clndr = new Choice();
	 JLabel or = new JLabel("eller");
//	 Calendar CAL = Calendar.getInstance () ; 
	 JButton btnsearch = new JButton("Sök");
//	 JButton btnreserve = new JButton("Boka");
	
	public ChoiceTour(){
		setPreferredSize(new Dimension());
//		CAL.set(Calendar.YEAR, 2016);
//		int save = CAL.get(Calendar.YEAR);
		
		add(country);
		add(city);
		add(week);
		add(or);
		add(clndr);
		add(btnsearch);
		
		
		country.add("Danmark");
		country.add("Sverige");
		country.add("Tyskland");
		
		
		city.add("Helsinggör");
		city.add("Köpenhamn");
		city.add("Odense");
		city.add("Göteborg");
		city.add("Helsingborg");
		city.add("Malmö");
		city.add("Stockholm");
		city.add("Berlin");
		city.add("München");
		
		
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
		
		
		clndr.add("1/6");
		clndr.add("2/6");
		clndr.add("3/6");
		clndr.add("4/6");
		clndr.add("5/6");
		clndr.add("6/6");
		clndr.add("7/6");
		clndr.add("8/6");
		clndr.add("9/6");
		clndr.add("10/6");
		clndr.add("11/6");
		clndr.add("12/6");
		clndr.add("13/6");
		clndr.add("14/6");
		clndr.add("15/6");
		clndr.add("16/6");
		clndr.add("17/6");
		clndr.add("18/6");
		clndr.add("19/6");
		clndr.add("20/6");
		clndr.add("21/6");
		clndr.add("22/6");
		clndr.add("23/6");
		clndr.add("24/6");
		clndr.add("25/6");
		clndr.add("26/6");
		clndr.add("27/6");
		clndr.add("28/6");
		clndr.add("29/6");
		clndr.add("30/6");
		clndr.add("1/7");
		clndr.add("2/7");
		clndr.add("3/7");
		clndr.add("4/7");
		clndr.add("5/7");
		clndr.add("6/7");
		clndr.add("7/7");
		clndr.add("8/7");
		clndr.add("9/7");
		clndr.add("10/7");
		clndr.add("11/7");
		clndr.add("12/7");
		clndr.add("13/7");
		clndr.add("14/7");
		clndr.add("15/7");
		clndr.add("16/7");
		clndr.add("17/7");
		clndr.add("18/7");
		clndr.add("19/7");
		clndr.add("20/7");
		clndr.add("21/7");
		clndr.add("22/7");
		clndr.add("23/7");
		clndr.add("24/7");
		clndr.add("25/7");
		clndr.add("26/7");
		clndr.add("27/7");
		clndr.add("28/7");
		clndr.add("29/7");
		clndr.add("30/7");
		clndr.add("31/7");
		clndr.add("1/8");
		clndr.add("2/8");
		clndr.add("3/8");
		clndr.add("4/8");
		clndr.add("5/8");
		clndr.add("6/8");
		clndr.add("7/8");
		clndr.add("8/8");
		clndr.add("9/8");
		clndr.add("10/8");
		clndr.add("11/8");
		clndr.add("12/8");
		clndr.add("13/8");
		clndr.add("14/8");
		clndr.add("15/8");
		clndr.add("16/8");
		clndr.add("17/8");
		clndr.add("18/8");
		clndr.add("19/8");
		clndr.add("20/8");
		clndr.add("21/8");
		clndr.add("22/8");
		clndr.add("23/8");
		clndr.add("24/8");
		clndr.add("25/8");
		clndr.add("26/8");
		clndr.add("27/8");
		clndr.add("28/8");
		clndr.add("29/8");
		clndr.add("30/8");
		clndr.add("31/8");
		clndr.add("1/9");
		clndr.add("2/9");
		clndr.add("3/9");
		clndr.add("4/9");
		clndr.add("5/9");
		clndr.add("6/9");
		clndr.add("7/9");
		clndr.add("8/9");
		clndr.add("9/9");
		clndr.add("10/9");
		clndr.add("11/9");
		clndr.add("12/9");
		clndr.add("13/9");
		clndr.add("14/9");
		clndr.add("15/9");
		clndr.add("16/9");
		clndr.add("17/9");
		clndr.add("18/9");
		clndr.add("19/9");
		clndr.add("20/9");
		clndr.add("21/9");
		clndr.add("22/9");
		clndr.add("23/9");
		clndr.add("24/9");
		clndr.add("25/9");
		clndr.add("26/9");
		clndr.add("27/9");
		clndr.add("28/9");
		clndr.add("29/9");
		clndr.add("30/9");
		clndr.add("1/10");
		clndr.add("2/10");
		clndr.add("3/10");
		clndr.add("4/10");
		clndr.add("5/10");
		clndr.add("6/10");
		clndr.add("7/10");
		clndr.add("8/10");
		clndr.add("9/10");
		clndr.add("10/10");
		clndr.add("11/10");
		clndr.add("12/10");
		clndr.add("13/10");
		clndr.add("14/10");
		clndr.add("15/10");
		clndr.add("16/10");
		clndr.add("17/10");
		clndr.add("18/10");
		clndr.add("19/10");
		clndr.add("20/10");
		clndr.add("21/10");
		clndr.add("22/10");
		clndr.add("23/10");
		clndr.add("24/10");
		clndr.add("25/10");
		clndr.add("26/10");
		clndr.add("27/10");
		clndr.add("28/10");
		clndr.add("29/10");
		clndr.add("30/10");
		clndr.add("31/10");
		clndr.add("1/11");
		clndr.add("2/11");
		clndr.add("3/11");
		clndr.add("4/11");
		clndr.add("5/11");
		clndr.add("6/11");
		clndr.add("7/11");
		clndr.add("8/11");
		clndr.add("9/11");
		clndr.add("10/11");
		clndr.add("11/11");
		clndr.add("12/11");
		clndr.add("13/11");
		clndr.add("14/11");
		clndr.add("15/11");
		clndr.add("16/11");
		clndr.add("17/11");
		clndr.add("18/11");
		clndr.add("19/11");
		clndr.add("20/11");
		clndr.add("21/11");
		clndr.add("22/11");
		clndr.add("23/11");
		clndr.add("24/11");
		clndr.add("25/11");
		clndr.add("26/11");
		clndr.add("27/11");
		clndr.add("28/11");
		clndr.add("29/11");
		clndr.add("30/11");
		
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
		frame.setSize(550, 100);
		
	}

	public static void main(String args[]) {
		ChoiceTour cho = new ChoiceTour();
		cho.start();
	}

}
