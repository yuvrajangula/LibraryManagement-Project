package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * @author Yuvraj Angula
 */
public class returnBook extends javax.swing.JFrame {
    public returnBook() {
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
        bookf = new javax.swing.JTextField();
        studentf = new javax.swing.JTextField();
        issuef = new javax.swing.JTextField();
        duef = new javax.swing.JTextField();
        logout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        returnbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("BookID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("StudentID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        bookf.setBackground(new java.awt.Color(255, 255, 204));
        bookf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(bookf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 155, -1));

        studentf.setBackground(new java.awt.Color(255, 255, 204));
        studentf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        studentf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentfActionPerformed(evt);
            }
        });
        getContentPane().add(studentf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 155, -1));

        issuef.setBackground(new java.awt.Color(255, 255, 204));
        issuef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(issuef, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 155, -1));

        duef.setBackground(new java.awt.Color(255, 255, 204));
        duef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(duef, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 155, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/exit.png"))); // NOI18N
        logout.setToolTipText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Return Book");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 700, -1));

        returnbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        returnbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/return book png.png"))); // NOI18N
        returnbutton.setText("Return");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(returnbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        closebutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/red-x-mark-transparent-background-3.png"))); // NOI18N
        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        searchbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/search.png"))); // NOI18N
        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/123456.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentfActionPerformed

    }//GEN-LAST:event_studentfActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
     login lg = new login();
     lg.setVisible(true);
     lg.setLocationRelativeTo(null);
     lg.pack();
     this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
         dashboard db = new dashboard();
        db.setVisible(true);
        db.setLocationRelativeTo(null);
        db.pack();
        this.dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed

        String bookID=bookf.getText();
        String studentID=studentf.getText();
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
            System.out.println("Connected"); 
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select *from issue where bookID='"+bookID+"'and studentID='"+studentID+"'");
            if(rs.next())
            {
                issuef.setText(rs.getString(3));
                duef.setText(rs.getString(4));
                bookf.setEditable(false);
                studentf.setEditable(false);
           }
            else
            {
            JOptionPane.showMessageDialog(null, "Incorrect StudentID or BookID ");
            setVisible(false);
            new returnBook().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Book is not issued to this student");
        }

    }//GEN-LAST:event_searchbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        String bookID = bookf.getText();
        String studentID = studentf.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
            System.out.println("Connected"); 
            Statement st = con.createStatement();
            st.executeUpdate("update issue set returnBook='YES' where studentID='"+studentID+"' and bookID='"+bookID+"'");
            JOptionPane.showMessageDialog(null, "Book Successfully Returned");
            setVisible(false);
            new returnBook().setVisible(true);
         }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_returnbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookf;
    private javax.swing.JButton closebutton;
    private javax.swing.JTextField duef;
    private javax.swing.JTextField issuef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logout;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField studentf;
    // End of variables declaration//GEN-END:variables
}
