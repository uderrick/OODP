package handongplay3;



import handongplay3.Admin.AdminPlay;
import handongplay3.User.HandongPlay;
import javax.swing.JPanel;

public class MainProcess{
    
    static LoginGUI loginView;
    static HandongPlay testFrm;
    static AdminPlay info;
    
    JPanel panel;
    
    
   public static void main(String args[]){
      
      run();
     loginView = new LoginGUI();
   }
    public static void algo(){}
    
    public static void run(){
       algo();
    }
  //template 
   
    // 테스트프레임창
    public void showFrameTest(){
    	
    	
    
        loginView.dispose(); // 로그인창닫기
        testFrm = new HandongPlay();
        testFrm.setVisible(true);; // 테스트프레임 오픈
   
    }
    
    public void showPlayInfo() {
    	
        loginView.dispose(); // 로그인창닫기
       try {
		info = new AdminPlay();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       info.setVisible(true);
       
    }
    
 
}
 