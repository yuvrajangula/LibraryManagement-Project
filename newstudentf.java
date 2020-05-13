package library_management;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * @author Yuvraj Angula
 */
public class newstudentf extends javax.swing.JFrame {

    public newstudentf() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studID = new javax.swing.JTextField();
        sstudent = new javax.swing.JTextField();
        sfather = new javax.swing.JTextField();
        scourse = new javax.swing.JComboBox();
        sbranch = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Branch Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, 30));

        studID.setBackground(new java.awt.Color(255, 255, 204));
        studID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(studID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 156, -1));

        sstudent.setBackground(new java.awt.Color(255, 255, 204));
        sstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(sstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 156, -1));

        sfather.setBackground(new java.awt.Color(255, 255, 204));
        sfather.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(sfather, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 156, -1));

        scourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        scourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Btech", "Mtech" }));
        scourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scourseActionPerformed(evt);
            }
        });
        getContentPane().add(scourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 156, -1));

        sbranch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sbranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSE", "IT", "ME", "EE", "CIVIL" }));
        sbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbranchActionPerformed(evt);
            }
        });
        getContentPane().add(sbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 156, -1));

        saveButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/save-icon--1.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setToolTipText("Add Data to db");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        exitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/red-x-mark-transparent-background-3.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD NEW STUDENT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 700, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/exit.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/123456.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scourseActionPerformed

    private void sbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbranchActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
          dashboard db = new dashboard();
         db.setVisible(true);
         db.setLocationRelativeTo(null);
         db.pack();
         db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    
        String studentID=studID.getText().trim();
        String name=sstudent.getText().trim();
        String fatherName=sfather.getText().trim();
        String courseName=(String) scourse.getSelectedItem();
        String branchName=(String) sbranch.getSelectedItem();
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1ms","root","1234");
            System.out.println("Connected"); 
            String sql="INSERT INTO student (studentID , name , fatherName , courseName ,branchName) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt;
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,studentID);
            pstmt.setString(2,name);
            pstmt.setString(3,fatherName);
            pstmt.setString(4,courseName);
            pstmt.setString(5,branchName);
            pstmt.execute();
            pstmt.close();
             JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new newstudentf().setVisible(true);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"STUDENT ID ALREADY EXIST");  
           setVisible(false);
           new newstudentf().setVisible(true);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         login lg=new login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        lg.pack();
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new newstudentf().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox sbranch;
    private javax.swing.JComboBox scourse;
    private javax.swing.JTextField sfather;
    private javax.swing.JTextField sstudent;
    private javax.swing.JTextField studID;
    // End of variables declaration//GEN-END:variables
}
