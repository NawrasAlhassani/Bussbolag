package Tour;

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

public class Login extends JPanel implements ActionListener{
	JLabel header = new JLabel("Blomstermåla Bussbolag");
	JLabel text = new JLabel("Välj någon av de registrerade användarna för att logga in:   ");
	Choice users = new Choice();
	JButton btnlog = new JButton("Logga in");
	Font font = new Font("Monotype Corsiva", Font.BOLD, 30);
	
	
	public Login () throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		setPreferredSize(new Dimension(500, 400));
		setLayout(new BorderLayout());
		
		header.setFont(font);
		
		add(header, BorderLayout.NORTH);
	    add(text, BorderLayout.WEST);
	    add(users, BorderLayout.CENTER);
	    add(btnlog, BorderLayout.SOUTH);
	    btnlog.addActionListener(this);
	    
		Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bussbolag?user=root&password=");
        PreparedStatement stmt = conn.prepareStatement("select Namn from resenar");
        ResultSet rs = stmt.executeQuery();
        List reslist = new ArrayList();
        while (rs.next()){
        	reslist.add(rs.getString(1));
        	
        for(int i = 0; i < reslist.size(); i++){
    	        users.add((String) reslist.get(i));
       }
      }
     }
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlog){
			JFrame fr = new JFrame();
			fr.pack();
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fr.add(new ChoiceTour());
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

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Login log = new Login();
		log.start();
	}




	
	

}
