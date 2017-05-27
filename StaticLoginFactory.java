package handongplay3;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import handongplay3.Admin.*;
import handongplay3.User.*;

public class StaticLoginFactory implements LoginFactory   {
  
	private JPasswordField passText;
    private JTextField userText;

  
    
   public Login makeLogin(MainProcess main,JTextField a, JPasswordField b ){
	   
        if(a.getText().equals("hgu")&& new String(b.getPassword()).equals("1234")){

            
          return new UserLogin(main);
          
        }
        
        else if(a.getText().equals("manager")&& new String(b.getPassword()).equals("1234")){
             
         return  new AdminLogin(main);
           
        }
        else
        {
        	return  new AdminLogin(main);
        }
     
   }   
      
   }
   

