package Tour;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
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

public class Login extends JPanel{
	JLabel header = new JLabel("Blomstermåla Bussbolag");
	JLabel text = new JLabel("Välj någon av de registrerade användarna för att logga in:   ");
	Choice users = new Choice();
	JButton btnlog = new JButton("Logga in");
	Font font = new Font("Monotype Corsiva", Font.BOLD, 30);
	
	
	public Login (){
		setPreferredSize(new Dimension(500, 400));
		setLayout(new BorderLayout());
		
		header.setFont(font);
		
		add(header, BorderLayout.NORTH);
	    add(text, BorderLayout.WEST);
	    add(users, BorderLayout.CENTER);
	    add(btnlog, BorderLayout.SOUTH);
	    users.
	}
	
	public List Login1() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
        
		Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bussbolag?user=root&password=");
        PreparedStatement stmt = conn.prepareStatement("select Namn from resenar");
        ResultSet rs = stmt.executeQuery();
        List reslist = new ArrayList();
        while (rs.next()){
        	reslist.add(rs.getString(1));
        	
        }
        return reslist;
        
	}
	
	public void setReslist(List reslist){
		List rslist = reslist;
	}

	public void start() {
		JFrame frame = new JFrame("Bussbolag");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Login());
		frame.setSize(500, 400);
		
	}

	public static void main(String args[]) {
		Login log = new Login();
		log.start();
	}

}
