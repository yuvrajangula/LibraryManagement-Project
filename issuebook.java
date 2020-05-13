package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/*
 *author Yuvraj Angula
 */
public class issuebook extends javax.swing.JFrame {

    public issuebook() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        issueButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        bookf = new javax.swing.JTextField();
        studentf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser3.setBackground(new java.awt.Color(240, 240, 204));
        jDateChooser3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 128, 29));

        jDateChooser1.setBackground(new java.awt.Color(240, 240, 204));
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 128, 29));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("BOOK ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("STUDENT ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("ISSUE DATE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("DUE DATE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        issueButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        issueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/issue book.png"))); // NOI18N
        issueButton.setText("Issue");
        issueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(issueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        closeButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        bookf.setBackground(new java.awt.Color(255, 255, 204));
        bookf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(bookf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 128, -1));

        studentf.setBackground(new java.awt.Color(255, 255, 204));
        studentf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(studentf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 128, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ISSUE BOOK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/exit.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/123456.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueButtonActionPerformed
   
        SimpleDateFormat dFormat =new SimpleDateFormat("dd-MM-yyyy");
        String bookID= bookf.getText();
        String studentID = studentf.getText();
        String issueDate=dFormat.format(jDateChooser1.getDate());
        String dueDate=dFormat.format(jDateChooser3.getDate());
        String returnBook="NO";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
            System.out.println("Connected"); 
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from book where bookID='"+bookID +"'");
            if(rs.next())
            {
                ResultSet rs1 = st.executeQuery("select *from student where studentID='"+studentID+"'");
                if(rs1.next())
                 {
                     st.executeUpdate("insert into issue values('"+bookID+"','"+studentID+"','"+issueDate+"','"+dueDate+"','"+returnBook+"')");
                       JOptionPane.showMessageDialog(null, "Book Succesfully Issued");
                       setVisible(false);
                       new issuebook().setVisible(true);
                 }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect StudentID");
                }
           }
            else
            {
            JOptionPane.showMessageDialog(null, "Incorrect BookID\nNo Such Book is Available");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Conncetion Failed");
        }
    }//GEN-LAST:event_issueButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dashboard db = new dashboard();
        db.setVisible(true);
        db.setLocationRelativeTo(null);
        db.pack();
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

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
                new issuebook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookf;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton issueButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField studentf;
    // End of variables declaration//GEN-END:variables
}
