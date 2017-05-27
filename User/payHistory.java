package handongplay3.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import handongplay3.Storage.Storage;


public class payHistory extends javax.swing.JFrame {


    public payHistory() throws SQLException {
        initComponents();
    }

  

    private void initComponents() throws SQLException {
    	
    	 Connection con = null;
		
		
   		
		try {
						Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		try {
							con = DriverManager.getConnection("jdbc:mysql://localhost?autoReconnect=true&useSSL=false", "root", "12skdmsdn");
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
//===============================================//   
						Storage [] pi = new Storage[7];
						
					 for( int i = 0; i < 7 ; i++)
				    {
						 	pi[i] = new Storage();
			
				    }
		
						stmt.executeQuery("SELECT title,player,date,seat,payment FROM pay");
					    ResultSet rs = stmt.getResultSet(); 		
					
			
			
					   
					    for( int i = 0; rs.next() ; i++)
					    {
					    	pi[i].get_title(rs.getString("title"));
					    	pi[i].get_player(rs.getString("player"));
					    	pi[i].get_date(rs.getString("date"));
					    	pi[i].get_content(rs.getString("seat"));
					    	pi[i].get_payment(rs.getString("payment"));
					    }
					    
					    rs.close();
					    con.close();
					    
					    
					    
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            	
            	{pi[0].return_title(),pi[0].return_player(),pi[0].return_date(),pi[0].return_content(),pi[0].return_payment()},
                {pi[1].return_title(),pi[1].return_player(),pi[1].return_date(),pi[1].return_content(),pi[1].return_payment()},
                {pi[2].return_title(),pi[2].return_player(),pi[2].return_date(),pi[2].return_content(),pi[2].return_payment()},
                {pi[3].return_title(),pi[3].return_player(),pi[3].return_date(),pi[3].return_content(),pi[3].return_payment()},
                {pi[4].return_title(),pi[4].return_player(),pi[4].return_date(),pi[4].return_content(),pi[4].return_payment()},
                {pi[5].return_title(),pi[5].return_player(),pi[5].return_date(),pi[5].return_content(),pi[5].return_payment()},
                {pi[6].return_title(),pi[6].return_player(),pi[6].return_date(),pi[6].return_content(),pi[6].return_payment()},
                {null, null, null, null, null}
            },
            
            
            new String [] {
                "Title ", "Player", "Date", "Seat", "Payment"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("결제 내역 확인");

        okBtn.setText("확인");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {                                      
        this.setVisible(false);
        new HandongPlay().setVisible(true);
    }                                     

 
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(payHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okBtn;
    // End of variables declaration                   
}
