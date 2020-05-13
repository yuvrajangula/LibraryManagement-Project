package library_management;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * @author YUVRAJ ANGULA
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.setResizable(false);     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        forgotpassword = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        lbpassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 80, 30));

        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/login.png"))); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 110, -1));

        password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 110, -1));

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        forgotpassword.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        forgotpassword.setForeground(new java.awt.Color(255, 0, 0));
        forgotpassword.setText("Forgot Password? CLICK HERE");
        forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordMouseClicked(evt);
            }
        });
        getContentPane().add(forgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 260, 30));

        lbusername.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbusername.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 220, 20));

        lbpassword.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbpassword.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 220, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/Login background.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    
        if(username.getText().trim().isEmpty() && password.getText().trim().isEmpty() ){
      lbusername.setText("UserName field is empty");
      lbpassword.setText("Passowrd field is empty");
  }
  else if(username.getText().trim().isEmpty()){
    lbusername.setText("UserName field is empty");
  }
  else if(password.getText().trim().isEmpty()){
     lbpassword.setText("Password field is empty");
  }
  else{
      if(username.getText().equals("admin") && password.getText().equals("1234"))
        {
           JOptionPane.showMessageDialog(this,"Welcome To Library Management System");
        setVisible(false);
        dashboard db = new dashboard();
        db.setVisible(true);
        db.pack();
        db.setLocationRelativeTo(null);
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        else 
        {
        JOptionPane.showMessageDialog(null, "Try Again\n Your Username or Password is incorrect");
        password.setText(null);
        username.setText(null);
        }
  }
    }//GEN-LAST:event_loginActionPerformed
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
    JOptionPane.showMessageDialog(null,"Thanks! for using Library Management System\n\n\n\nDeveloped By:- YUVRAJ ANGULA  ");
     System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed
    private void forgotpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpasswordMouseClicked
         forgotpassword fp = new forgotpassword();
         fp.setVisible(true);
         fp.pack();
         fp.setLocationRelativeTo(null);
         fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_forgotpasswordMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel forgotpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JLabel lbusername;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
