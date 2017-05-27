package handongplay3.User;


import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import handongplay3.Login;
import handongplay3.MainProcess;


public class UserLogin extends Login {

   
   public UserLogin(MainProcess main) {
    
	   super(main);
      // TODO Auto-generated constructor stub
      log(main);
      
   }


   

      
   
   public void log(MainProcess main){
      
      JOptionPane.showMessageDialog(null, "UserMode Success");
      
      main.showFrameTest();
      
               
      
   }
   

  

/*
   @Override
   public void log() {
      // TODO Auto-generated method stub
      
   }
   */  
      
   }

   
   


   
   
