package handongplay3;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class LoginGUI extends JFrame { // JFrame �� ��� �޾ƾ��� 

     MainProcess main = new MainProcess();
    @SuppressWarnings("unused")
    private JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
    /*factory design pattrn*/
    protected Login loginopen;
    protected LoginFactory logFactory;
    
    
    public LoginGUI() {
       
       
       
        // setting
        setTitle("login");
        setSize(280, 150);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        
        placeLoginPanel(panel);

        // add
        add(panel);
       
        // visible
        setVi();
               
                     
    }
   
  public void setVi(){
     
     setVisible(true);
  }
    
    /**
    * @return the passText
    */
   public JPasswordField getPassText() {
      return passText;
   }

   /**
    * @param passText the passText to set
    */
   public void setPassText(JPasswordField passText) {
      this.passText = passText;
   }

   /**
    * @return the userText
    */
   public JTextField getUserText() {
      return userText;
   }

   /**
    * @param userText the userText to set
    */
   public void setUserText(JTextField userText) {
      this.userText = userText;
   }

   public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);
       
        JLabel passLabel = new JLabel("Pass");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);
        
       // �Է�â 
        setUserText(new JTextField(20));
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
       
        setPassText( new JPasswordField(20));
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
     
        
        //���¹�ư 
        btnInit = new JButton("Reset");
        btnInit.setBounds(10, 80, 100, 25);
        panel.add(btnInit);
        
        //�̹�Ʈ�ڵ鸵 //���¹�ư������ 
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });
       
        
        //�α��� ��ư
        btnLogin = new JButton("Login");
        btnLogin.setBounds(160, 80, 100, 25);
        panel.add(btnLogin);
        
        
        
        
        //�̹�Ʈ�ڵ鸵 //�α��� 
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	/*factory design pattrn*/
               logFactory = (LoginFactory)new StaticLoginFactory(); 
               loginopen = logFactory.makeLogin(main,getUserText(),getPassText());
            }
        });
    }
    
  
  
    public boolean isLogin() {     
        return bLoginCheck;
    }
/*
    public void setMain(MainProcess main){
       this.main =main;
    }
*/    
}

 