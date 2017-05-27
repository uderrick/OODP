package handongplay3.Payment;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




import com.mysql.jdbc.PreparedStatement;
import handongplay3.User.*;
import handongplay3.User.BookPlay;

class MyActionListener implements ActionListener{
	
    public void actionPerformed(ActionEvent e){
        
       
    	new HandongPlay().setVisible(true);
    }
}



@SuppressWarnings("serial")
public class Account extends JFrame {

    private JLabel label;
    public String bankString;
    private JButton Enter;
    
 
    
    public Account() throws SQLException {
    	
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
   												s.setString(5, "무통장입금");
   												
   												s.executeUpdate();
   												
   												s.close();
   												con.close();
    	
    	
    	
    	
       int width = 450;
      int height = 300;
      setTitle("Account Pay");
      setResizable(false);
      Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
      setBounds(screenSize.width/2 - width/2, screenSize.height/2 - height/2, width, height);
      //화면 중앙에 놓기
      
      JPanel panel = new JPanel();
       
       label = new JLabel();
       
       String data = "아래의 가상 계좌로 입금해주십시오 \n"
            + Payment.bankString;
      
       label.setText(data);
      label.setText(data + " 010-9404-3690");
      
      panel.add(label);

      add(panel);
      
      Enter = new JButton("확인");
      panel.add(Enter);
     
      MyActionListener listener = new MyActionListener();
      Enter.addActionListener(listener);
     
    	 
     
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      }    
    
    
  
}