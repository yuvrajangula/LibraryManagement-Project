package library_management;

import javax.swing.JFrame;
import javax.xml.stream.events.StartDocument;

/*
 * @author Yuvraj Angula
 */
public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newstudent = new javax.swing.JButton();
        newbook = new javax.swing.JButton();
        issuebook = new javax.swing.JButton();
        returnbook = new javax.swing.JButton();
        stats = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newstudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        newstudent.setText("New Student");
        newstudent.setToolTipText("click for adding new student into the database");
        newstudent.setPreferredSize(new java.awt.Dimension(150, 50));
        newstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newstudentActionPerformed(evt);
            }
        });
        getContentPane().add(newstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        newbook.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        newbook.setText("New Book");
        newbook.setPreferredSize(new java.awt.Dimension(150, 50));
        newbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbookActionPerformed(evt);
            }
        });
        getContentPane().add(newbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, -1));

        issuebook.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        issuebook.setText("Issue Book");
        issuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebookActionPerformed(evt);
            }
        });
        getContentPane().add(issuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, 45));

        returnbook.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        returnbook.setText("Return Book");
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });
        getContentPane().add(returnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 140, 45));

        stats.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stats.setText("Statistics");
        stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsActionPerformed(evt);
            }
        });
        getContentPane().add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 140, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/exit.png"))); // NOI18N
        jLabel3.setToolTipText("LogOut");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management/123456.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbookActionPerformed
        newbook nb = new newbook();
        nb.setVisible(true);
        nb.setLocationRelativeTo(null);
        nb.pack();
        nb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_newbookActionPerformed

    private void newstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newstudentActionPerformed
         newstudentf ns = new newstudentf();
         ns.setVisible(true);
         ns.setLocationRelativeTo(null);
         ns.pack();
         ns.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();      
    }//GEN-LAST:event_newstudentActionPerformed

    private void statsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsActionPerformed
      statistics ss = new statistics();
      ss.setVisible(true);
      ss.setLocationRelativeTo(null);
      ss.pack();
      this.dispose();
    }//GEN-LAST:event_statsActionPerformed

    private void issuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebookActionPerformed
        issuebook iss = new issuebook();
        iss.setVisible(true);
        iss.setLocationRelativeTo(null);
        iss.pack();
        iss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_issuebookActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     login lg = new login();
     lg.setVisible(true);
     lg.setLocationRelativeTo(null);
     lg.pack();
     this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
          returnBook rb= new returnBook();
          rb.setVisible(true);
          rb.setLocationRelativeTo(null);
          rb.pack();
          this.dispose();
    }//GEN-LAST:event_returnbookActionPerformed
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton issuebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton newbook;
    private javax.swing.JButton newstudent;
    private javax.swing.JButton returnbook;
    private javax.swing.JButton stats;
    // End of variables declaration//GEN-END:variables
}
