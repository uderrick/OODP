package handongplay3.Admin;

import javax.swing.JOptionPane;

import handongplay3.Login;
import handongplay3.MainProcess;

import javax.swing.JFrame;

public class AdminLogin extends Login{

   public AdminLogin(MainProcess main) {
      super(main);
      // TODO Auto-generated constructor stub
      log(main);
   }

   @SuppressWarnings("unused")
private MainProcess main;
   private boolean bLoginCheck;
   
   
   public void log(MainProcess main){

   
      JOptionPane.showMessageDialog(null, "Manager Mode Success");
         
      bLoginCheck = true; 
       
          if(isLogin()){
              main.showPlayInfo(); // ����â �޼ҵ带 �̿��� â�ٿ��
          }

   }

      public boolean isLogin() {     
           return bLoginCheck;
       }
   
      public void setMain(MainProcess main) {
          
          this.main = main;
       }
               
}