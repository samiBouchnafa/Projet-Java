/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainesi;

/**
 *
 * @author Dell
 */
public class Mainform extends javax.swing.JFrame {

    /**
     * Creates new form Mainform
     */
    public Mainform() {
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

        MainTicketsBTN = new javax.swing.JButton();
        MainPassengersBTN = new javax.swing.JButton();
        MainFlightBTN = new javax.swing.JButton();
        RetourBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainTicketsBTN.setBackground(new java.awt.Color(204, 204, 255));
        MainTicketsBTN.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        MainTicketsBTN.setForeground(new java.awt.Color(51, 51, 51));
        MainTicketsBTN.setText("Rapports");
        MainTicketsBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainTicketsBTNMouseClicked(evt);
            }
        });

        MainPassengersBTN.setBackground(new java.awt.Color(204, 204, 255));
        MainPassengersBTN.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        MainPassengersBTN.setForeground(new java.awt.Color(51, 51, 51));
        MainPassengersBTN.setText("Gestion des cartes reduction");
        MainPassengersBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainPassengersBTNMouseClicked(evt);
            }
        });
        MainPassengersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainPassengersBTNActionPerformed(evt);
            }
        });

        MainFlightBTN.setBackground(new java.awt.Color(204, 204, 255));
        MainFlightBTN.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        MainFlightBTN.setForeground(new java.awt.Color(51, 51, 51));
        MainFlightBTN.setText("Gestion des trajets");
        MainFlightBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainFlightBTNMouseClicked(evt);
            }
        });
        MainFlightBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFlightBTNActionPerformed(evt);
            }
        });

        RetourBTN.setBackground(new java.awt.Color(204, 204, 255));
        RetourBTN.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        RetourBTN.setForeground(new java.awt.Color(51, 51, 51));
        RetourBTN.setText("Retour");
        RetourBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetourBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RetourBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainTicketsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainPassengersBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainFlightBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(MainFlightBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainPassengersBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainTicketsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(RetourBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainFlightBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFlightBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainFlightBTNActionPerformed

    private void MainPassengersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainPassengersBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainPassengersBTNActionPerformed

    private void MainTicketsBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTicketsBTNMouseClicked
        //new ticketBookings().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_MainTicketsBTNMouseClicked

    private void MainPassengersBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPassengersBTNMouseClicked
        //new passengers().setVisible(true);
        //this.dispose();        
    }//GEN-LAST:event_MainPassengersBTNMouseClicked

    private void MainFlightBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainFlightBTNMouseClicked
        new GestionTrajet().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainFlightBTNMouseClicked

    private void RetourBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetourBTNMouseClicked
        new login0().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetourBTNMouseClicked

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
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainFlightBTN;
    private javax.swing.JButton MainPassengersBTN;
    private javax.swing.JButton MainTicketsBTN;
    private javax.swing.JButton RetourBTN;
    // End of variables declaration//GEN-END:variables
}