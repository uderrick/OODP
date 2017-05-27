package handongplay3.Payment;

//카드결제방식
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import handongplay3.User.BookPlay;
import handongplay3.User.HandongPlay;


class MyActionListener implements ActionListener{
	
    public void actionPerformed(ActionEvent e){
        
       
    	new HandongPlay().setVisible(true);
    	
    }
}

@SuppressWarnings("serial")
public class CreditCard extends JFrame {

    private JButton Enter;
    private JTextField userNum;
    private JLabel label;
    // private JPasswordField passText;
    
    
   public CreditCard() throws SQLException {
	   
	   
	   
	   Connection con = null;
		
		
		
		try {
						Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		try {
							con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "12skdmsdn");
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			try {
					if (!con.isClosed())
							System.out.println("Successfully connected to MySQL server.");
				} catch (SQLException e) {
						// TODO Auto-generated catch block
							e.printStackTrace();
							}

									Statement stmt = null;
										try {
												stmt = (Statement) con.createStatement();
											} catch (SQLException e) {
													// TODO Auto-generated catch block
												e.printStackTrace();
											}
											try {
														stmt.execute("use playinfo") ;
												} catch (SQLException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
											
											
											String [] str_arr = BookPlay.payPlay.split("/");

												PreparedStatement s = (PreparedStatement) con.prepareStatement("INSERT INTO pay(title,player,date,seat,payment) VALUES(?,?,?,?,?)");
												
												s.setString(1,str_arr[0] );
												s.setString(2,str_arr[1]);
												s.setString(3,str_arr[2]);
												s.setString(4, str_arr[3]);
												s.setString(5, "카드결제");
												
												s.executeUpdate();
												
												s.close();
												con.close();
      int width = 450;
      int height = 300;
      setTitle("Credit Card Pay");
      setResizable(false);
      Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
      setBounds(screenSize.width/2 - width/2, screenSize.height/2 - height/2, width, height);
      //화면 중앙에 놓기
      
      JPanel panel = new JPanel();
        
        label = new JLabel("카드 번호: ");
        userNum = new JTextField(10);
        
        panel.add(label);
        panel.add(userNum);
        
        Enter = new JButton("확인");
        panel.add(Enter);

        MyActionListener listener = new MyActionListener();
        Enter.addActionListener(listener);
        
        add(panel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }         
}