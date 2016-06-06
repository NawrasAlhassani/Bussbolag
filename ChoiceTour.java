package Tour;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.mysql.fabric.xmlrpc.base.Data;
import com.mysql.jdbc.Statement;

public class ChoiceTour extends JPanel implements ActionListener {
	Choice city = new Choice();
	Choice clndr = new Choice();
	Choice ankomlist = new Choice();
	JLabel showTravel = new JLabel("");
	JLabel nyrad = new JLabel("-----------------------");
	JLabel avgar = new JLabel("Avgår från: ");
	JLabel ankom = new JLabel("Ankommer till: ");
	JButton btnSearch = new JButton("Sök");
	JButton btnBoka = new JButton("Boka");
	Connection myConn;
	List<Stad> städer;
	List<Datum> dates;
	List<Tur> reser = new ArrayList<Tur>();
	int UserID;
	int ReseID;

	private class Stad {
		public int ID;
		public String Land;
		public String Stad;
		public String Sprak;
		public String Valuta;

		public Stad(int ID, String Land, String Stad, String Sprak, String Valuta) {
			this.ID = ID;
			this.Land = Land;
			this.Stad = Stad;
			this.Sprak = Sprak;
			this.Valuta = Valuta;
		}
	}

	private class Tur {
		public  int ReseID;
		public String Veckonr;
		public String Kostnad;
		public String Forbokning;
		public String Fullbokat;
		public int AvgarFran;
		public int AnkommerTill;

		public Tur(int ReseID, String Veckonr, String Kostnad, String Forbokning, String Fullbokat, int AvgarFran,
				int AnkommerTill) {
			this.ReseID = ReseID;
			this.Veckonr = Veckonr;
			this.Kostnad = Kostnad;
			this.Forbokning = Forbokning;
			this.Fullbokat = Fullbokat;
			this.AvgarFran = AvgarFran;
			this.AnkommerTill = AnkommerTill;

		}
	}

	private class Datum {
		public int dID;
		public String datum;
		public String avresetid;
		public String ankomsttid;

		public Datum(int dID, String datum, String avresetid, String ankomsttid) {
			this.dID = dID;
			this.datum = datum;
			this.avresetid = avresetid;
			this.ankomsttid = ankomsttid;

		}

	}

	public ChoiceTour(int ID)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		UserID = ID;
		setPreferredSize(new Dimension());

		add(avgar);
		add(city);
		add(nyrad);
		// add(clndr);
		add(ankom);
		add(ankomlist);
		add(btnSearch);
		add(btnBoka);
		add(showTravel);
		btnSearch.addActionListener(this);
		btnBoka.addActionListener(this);

		// COnnect to sql database
		Connect();
		// City
		PreparedStatement stmt = myConn.prepareStatement("select * from stad");
		ResultSet rs = stmt.executeQuery();
		städer = new ArrayList<Stad>();
		while (rs.next()) {
			Stad stad = new Stad(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			städer.add(stad);
			city.add(stad.Stad);
		}
		// datum
		PreparedStatement stmt2 = myConn.prepareStatement("select * from veckotidtabell");
		ResultSet rs2 = stmt2.executeQuery();
		dates = new ArrayList<Datum>();
		while (rs2.next()) {
			Datum datum = new Datum(rs2.getInt(1), rs2.getString(2), rs2.getString(3), rs2.getString(4));

			dates.add(datum);
			clndr.add(datum.datum);
		}
		Disconnect();
	}

	private void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			myConn = DriverManager.getConnection("jdbc:mysql://localhost/bussbolag1?user=root&password=");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void Disconnect() {
		try {
			myConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		JFrame frame = new JFrame("Välj resa");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ChoiceTour(1));
		frame.setSize(500, 200);

	}

	public void actionPerformed(ActionEvent e1) {

		if (e1.getSource() == btnSearch) {
			int stadsID = 0;

			for (int i = 0; i < städer.size(); i++) {
				if (städer.get(i).Stad == city.getSelectedItem())
					stadsID = städer.get(i).ID;
			}
			Connect();

			PreparedStatement stmt;
			try {
				stmt = myConn.prepareStatement("SELECT * FROM tur WHERE AvgarFran=" + stadsID);
				ResultSet rs = stmt.executeQuery();
				reser.clear();
				ankomlist.removeAll();
				while (rs.next()) {
					Tur tur = new Tur(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
							rs.getInt(6), rs.getInt(7));
					reser.add(tur);
					for (int i = 0; i < städer.size(); i++) {
						if (städer.get(i).ID == tur.AnkommerTill)
							ankomlist.getSelectedItem();
							ankomlist.add(städer.get(i).Stad);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Disconnect();

			String[] array = new String[reser.size()];
			for (int i = 0; i < array.length; i++) {
				array[i] = "" + reser.get(i).ReseID;
			}

		}

		if (e1.getSource() == btnBoka) {
			Connect();
			try{
			PreparedStatement stmt = myConn
			.prepareStatement("INSERT INTO Bokningar (TurID, ResenarID) VALUES (String, null)");
			stmt.setInt(1, city.getSelectedIndex() + ankomlist.getSelectedIndex());
			stmt.setInt(2, UserID);
			//System.out.println("Avgår Från: " + city.getSelectedItem()+ "\nAnkommer till: "+ ankomlist.getItem(0)+ "\nAnvändar ID: " + );
			//System.out.println( "Avgår Från: " + city.getSelectedIndex()+ "\nAnkommer till: "+ ankomlist.getSelectedIndex() + "\nAnvändar ID: " + UserID);
			stmt.execute();
			

			Disconnect();
		} 
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	}

	

	

	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		ChoiceTour cho = new ChoiceTour(1);
		cho.start();
	}

}
