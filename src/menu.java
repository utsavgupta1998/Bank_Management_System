
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class menu extends javax.swing.JFrame {
    /**
     * Creates new form menu
     */
    public menu() {
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

        jLabel1 = new javax.swing.JLabel();
        createbutton = new javax.swing.JButton();
        depositbutton = new javax.swing.JButton();
        withdrawbutton = new javax.swing.JButton();
        balancebutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        anotherexitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT AN OPTION");

        createbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createbutton.setText("CREATE ACCOUNT");
        createbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbuttonActionPerformed(evt);
            }
        });

        depositbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        depositbutton.setText("DEPOSIT ACCOUNT");
        depositbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositbuttonActionPerformed(evt);
            }
        });

        withdrawbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        withdrawbutton.setText("WITHDRAW AMOUNT");
        withdrawbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawbuttonActionPerformed(evt);
            }
        });

        balancebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        balancebutton.setText("BALANCE ENQUIRY");
        balancebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancebuttonActionPerformed(evt);
            }
        });

        closebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        closebutton.setText("CLOSE AN ACCOUNT");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        anotherexitbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anotherexitbutton.setText("EXIT");
        anotherexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotherexitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(depositbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdrawbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balancebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anotherexitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 303, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createbutton)
                .addGap(18, 18, 18)
                .addComponent(depositbutton)
                .addGap(18, 18, 18)
                .addComponent(withdrawbutton)
                .addGap(18, 18, 18)
                .addComponent(balancebutton)
                .addGap(18, 18, 18)
                .addComponent(closebutton)
                .addGap(41, 41, 41)
                .addComponent(anotherexitbutton)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbuttonActionPerformed

        createaccount c=new createaccount();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createbuttonActionPerformed

    private void depositbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositbuttonActionPerformed
        depositamount d=new depositamount();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositbuttonActionPerformed

    private void anotherexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotherexitbuttonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "THANKYOU FOR USING OUR BANK MANAGEMENT SYSTEM");
        System.exit(0);
    }//GEN-LAST:event_anotherexitbuttonActionPerformed

    private void withdrawbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawbuttonActionPerformed
        withdrawamount w=new withdrawamount();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_withdrawbuttonActionPerformed

    private void balancebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancebuttonActionPerformed
        // TODO add your handling code here:
        balanceenquiry b=new balanceenquiry();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_balancebuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        // TODO add your handling code here:
        closeaccount c=new closeaccount();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anotherexitbutton;
    private javax.swing.JButton balancebutton;
    private javax.swing.JButton closebutton;
    private javax.swing.JButton createbutton;
    private javax.swing.JButton depositbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton withdrawbutton;
    // End of variables declaration//GEN-END:variables
}