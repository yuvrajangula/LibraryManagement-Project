package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * @author Yuvraj Angula
 */
public class statistics extends javax.swing.JFrame {
    public statistics() {
        initComponents();
        setLocationRelativeTo(null);
        formComponentShown();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        logout = new javax.swing.JLabel();
        closebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATISTICS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 660, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ISSUE DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 87, 660, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RETURN DETAILS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 660, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 660, 102));

        jTable2.setBackground(new java.awt.Color(255, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable2ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 660, 111));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/exit.png"))); // NOI18N
        logout.setToolTipText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        closebutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/red-x-mark-transparent-background-3.png"))); // NOI18N
        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/123456.png"))); // NOI18N
        jLabel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel6ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
            System.out.println("Connected"); 
            Statement st=con.createStatement();
            ResultSet  rs = st.executeQuery("select issue.studentID, student.name, issue.bookID ,book.name, issue.issueDate , issue.dueDate from student inner join book inner join issue where book.bookID=issue.bookID and student.studentID=issue.studentID and issue.returnBook='NO'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            ResultSet  rs1 = st.executeQuery("select issue.studentID, student.name, issue.bookID ,book.name, issue.issueDate , issue.dueDate from student inner join book inner join issue where book.bookID=issue.bookID and student.studentID=issue.studentID and issue.returnBook='YES'");
            jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
         }
    }
    
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

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
//            System.out.println("Connected"); 
//            Statement st=con.createStatement();
//            ResultSet  rs = st.executeQuery("select issue.studentID, student.name, issue.bookID ,book.name, issue.issueDate , from student inner join book inner join issue where book.bookID=issue.bookID and student.studentID=issue.studentID and issue.returnBook='NO'");
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
////            ResultSet  rs1 = st.executeQuery("select issue.studentID, student.name, issue.bookID ,book.name, issue.issueDate , from student inner join book inner join issue where book.bookID=issue.bookID and student.studentID=issue.studentID and issue.returnBook='YES'");
////            jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//         }
    }//GEN-LAST:event_jTable1ComponentShown

    private void jLabel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel6ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6ComponentShown

    private void jTable2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable2ComponentShown
//  try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
//            System.out.println("Connected"); 
//            Statement st=con.createStatement();
////            ResultSet  rs = st.executeQuery("select issue.studentID, student.name, issue.bookID ,book.name, issue.issueDate , from student inner join book inner join issue where book.bookID=issue.bookID and student.studentID=issue.studentID and issue.returnBook='NO'");
////            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//            ResultSet  rs1 = st.executeQuery("select issue.studentID, student.name, issue.bookID ,book.name, issue.issueDate , from student inner join book inner join issue where book.bookID=issue.bookID and student.studentID=issue.studentID and issue.returnBook='YES'");
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//         }
    }//GEN-LAST:event_jTable2ComponentShown
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new statistics().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
