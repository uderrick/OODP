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
   
    // �׽�Ʈ������â
    public void showFrameTest(){
    	
    	
    
        loginView.dispose(); // �α���â�ݱ�
        testFrm = new HandongPlay();
        testFrm.setVisible(true);; // �׽�Ʈ������ ����
   
    }
    
    public void showPlayInfo() {
    	
        loginView.dispose(); // �α���â�ݱ�
       try {
		info = new AdminPlay();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       info.setVisible(true);
       
    }
    
 
}
 