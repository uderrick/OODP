package handongplay3.Payment;


import java.awt.Choice;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import handongplay3.User.*;
import javax.swing.*;

public class PaymentChoice extends JFrame {
      
   private JPanel panel;
   private JButton okbtn;
   private Choice payment;
   public static int index;
   private JButton Enter;
    private Choice bank; //bank choice
    private JLabel label2;

public static void main(String[] args) {
   
   new PaymentChoice();
   
   }

public PaymentChoice() {
   
	
	
	
	
	
   setBounds(100, 100, 450, 300);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   Container contentPane = this.getContentPane();
   
   panel = new JPanel();
   payment = new Choice();
   
   payment.addItem("카드 결제");
   payment.addItem("무통장입금");
   
   panel.add(payment);
   
   okbtn = new JButton("확인");
   panel.add(okbtn);
   
   contentPane.add(panel);
   
   okbtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         
         index = payment.getSelectedIndex();
         new Payment();
         
   
      }
   });
   
   setVisible(true);
   }
}
