package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * @author Yuvraj Angula
 */
public class newbook extends javax.swing.JFrame {
    public newbook() 
    {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookf = new javax.swing.JTextField();
        namef = new javax.swing.JTextField();
        publisherf = new javax.swing.JTextField();
        pricef = new javax.swing.JTextField();
        publishyearf = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Publish Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        bookf.setBackground(new java.awt.Color(255, 255, 204));
        bookf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(bookf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 140, -1));

        namef.setBackground(new java.awt.Color(255, 255, 204));
        namef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 140, 26));

        publisherf.setBackground(new java.awt.Color(255, 255, 204));
        publisherf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(publisherf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 140, 26));

        pricef.setBackground(new java.awt.Color(255, 255, 204));
        pricef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(pricef, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, 27));

        publishyearf.setBackground(new java.awt.Color(255, 255, 204));
        publishyearf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(publishyearf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 26));

        savebutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/save-icon--1.png"))); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        closebutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/red-x-mark-transparent-background-3.png"))); // NOI18N
        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NEW BOOK");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/exit.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/123456.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
    
        String bookID = bookf.getText().trim();
        String name = namef.getText().trim();
        String publisher = publisherf.getText().trim();
        String price = pricef.getText().trim();
        String publishyear = publishyearf.getText().trim();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
            System.out.println("Connected"); 
            String sql="INSERT INTO book ( bookID , name , publisher , price , publishYear) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt;
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,bookID);
            pstmt.setString(2,name);
            pstmt.setString(3,publisher);
            pstmt.setString(4,price);
            pstmt.setString(5,publishyear);
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new newbook().setVisible(true);
            setLocationRelativeTo(null);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"BOOK ID ALREADY EXIST");  
           setVisible(false);
           new newbook().setVisible(true);
        }
        
    }//GEN-LAST:event_savebuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        
        dashboard db = new dashboard();
        db.setVisible(true);
        db.setLocationRelativeTo(null);
        db.pack();
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_closebuttonActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        login lg=new login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.pack();
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new newbook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookf;
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField pricef;
    private javax.swing.JTextField publisherf;
    private javax.swing.JTextField publishyearf;
    private javax.swing.JButton savebutton;
    // End of variables declaration//GEN-END:variables
}
