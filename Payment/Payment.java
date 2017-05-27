package handongplay3.Payment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import handongplay3.User.BookPlay;

@SuppressWarnings("serial")
public class Payment extends JFrame {

    private JButton Enter;
    private Choice bank; //bank choice
    private JLabel banktext;
    public static int bankindex;
    public static String bankString;
    // private JPasswordField passText;
     
    public Payment() {
    	
    	
    	
    	
    	
       // setting
      int width = 450;
      int height = 300;
      setTitle("Payment");
      setResizable(false);
      Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
      setBounds(screenSize.width/2 - width/2, screenSize.height/2 - height/2, width, height);
      //화면 중앙에 놓기
      
      JPanel panel = new JPanel();
        
        banktext = new JLabel("은행 선택: ");
        bank = new Choice();
        bank.addItem("기업은행");
        bank.addItem("농협은행");
        bank.addItem("신한은행");
        bank.addItem("국민은행");
        bank.addItem("부산은행");
        
        panel.add(banktext);
        panel.add(bank);
        
        Enter = new JButton("확인");
        panel.add(Enter);
        
        
        try {
			Enter.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
			     
			     if (PaymentChoice.index == 0) {
			        try {
						new CreditCard();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			     }
			     
			     else if (PaymentChoice.index == 1) {
			        bankString = bank.getItem(bank.getSelectedIndex());
			           
			        try {
						new Account();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			     }       
			  }
      });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        add(panel);
        
        
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      }
}