/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ministry;


import java.awt.Color;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class EmployeeHome extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeHome
     */
    public EmployeeHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btnViewPharmacy = new javax.swing.JButton();
        lblViewPharmacy = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        btn_exit_home = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewPharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacy(1).png"))); // NOI18N
        btnViewPharmacy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPharmacyActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        lblViewPharmacy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblViewPharmacy.setText("View Pharmacy information");
        jPanel1.add(lblViewPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ministryOfHealthLogoBackground.png"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        btn_exit_home.setBackground(new java.awt.Color(255, 0, 0));
        btn_exit_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit_home.setText("Exit");
        btn_exit_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit_homeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPharmacyActionPerformed
        if (AdminSession.isLoggedIn()) {
        setVisible(false);
        new viewPharmacy().setVisible(true);
        } else {
        // Redirect to adminLogin.java
        setVisible(false);
        AdminSession.setLoggedIn(false,-1); // Reset isLoggedIn status
        new ministryLogin().setVisible(true);
        }
    }//GEN-LAST:event_btnViewPharmacyActionPerformed

    private void btn_exit_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit_homeActionPerformed
        btn_exit_home.setBackground(Color.red);
        btn_exit_home.setOpaque(true);
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
        new ministryLogin().setVisible(true);
    }//GEN-LAST:event_btn_exit_homeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewPharmacy;
    private javax.swing.JButton btn_exit_home;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblViewPharmacy;
    // End of variables declaration//GEN-END:variables
}