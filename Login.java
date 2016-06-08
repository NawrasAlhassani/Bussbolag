package gui;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JPanel;

public class Login extends JPanel implements ActionListener {
	JLabel header = new JLabel("Blomstermåla Bussbolag");
	JLabel text = new JLabel("Välj någon av de registrerade användarna för att logga in:   ");
	Choice users = new Choice();
	JButton btnlog = new JButton("Logga in");
	Font font = new Font("Monotype Corsiva", Font.BOLD, 30);
	List<Integer> resenarID = new ArrayList<Integer>();
	Connection myConn;

	public Login() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		setPreferredSize(new Dimension(500, 400));
		setLayout(new BorderLayout());

		header.setFont(font);

		add(header, BorderLayout.NORTH);
		add(text, BorderLayout.WEST);
		add(users, BorderLayout.CENTER);
		add(btnlog, BorderLayout.SOUTH);
		btnlog.addActionListener(this);

		Connect();
		PreparedStatement stmt = myConn.prepareStatement("select ResenarID, Namn from resenar");
		ResultSet rs = stmt.executeQuery();
		List<String> reslist = new ArrayList<String>();

		while (rs.next()) {
			resenarID.add(rs.getInt(1));
			reslist.add(rs.getString(2));
		}

		for (int i = 0; i < reslist.size(); i++)
			users.add((String) reslist.get(i) + resenarID.get(i));

		Disconnect();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlog) {
			JFrame fr = new JFrame();
			fr.pack();
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			try {

				int index = users.getSelectedIndex();
				int ID = resenarID.get(index);

				fr.add(new ChoiceTour(ID));
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			fr.setSize(500, 400);
		}

	}

	public void start() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		JFrame frame = new JFrame("Bussbolag");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Login());
		frame.setSize(500, 400);

	}

	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Login log = new Login();
		log.start();
	}

	private void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {

			myConn = DriverManager.getConnection("jdbc:mysql://localhost/bussbolag1?user=root&password=");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void Disconnect() {
		try {
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
