/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainesi;

import java.awt.Dimension;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nadaa
 */
public class AdminGestionCarteReduction extends javax.swing.JFrame {

    /**
     * Creates new form admin_reduction
     */
    public AdminGestionCarteReduction() {
        initComponents();
        AfficherTrajet();
        idcarte.setEnabled(false);
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb", "root", "");
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pourcentage = new javax.swing.JTextField();
        idVoyage = new javax.swing.JTextField();
        type_carte = new javax.swing.JComboBox<>();
        supprimer = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        Editer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarte = new javax.swing.JTable();
        idcarte = new javax.swing.JTextField();
        date_expiration = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 3, 36)); // NOI18N
        jLabel1.setText("Gestion des cartes de reduction");

        jLabel2.setText("Id carte");

        jLabel3.setText("Pourcentage");

        jLabel4.setText("IdVoyage");

        jLabel5.setText("Date d'expiration");

        jLabel6.setText("Type de carte");

        Pourcentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PourcentageActionPerformed(evt);
            }
        });

        type_carte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carte étudiant", "Fondation M6", "Fondation H2", "Carte jeune", "Carte d'abonnement" }));

        supprimer.setText("Supprimer");
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMouseClicked(evt);
            }
        });

        ajouter.setText("Ajouter");
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
        });
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        retour.setText("Retour");
        retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retourMouseClicked(evt);
            }
        });

        Editer.setText("Editer");
        Editer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditerMouseClicked(evt);
            }
        });

        tableCarte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id carte", "type de carte", "Pourcentage", "Id Voyage", "Date d'expiration"
            }
        ));
        jScrollPane1.setViewportView(tableCarte);

        idcarte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idcarteMouseClicked(evt);
            }
        });
        idcarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcarteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idcarte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(type_carte, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pourcentage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(idVoyage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_expiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Editer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pourcentage)
                        .addComponent(idVoyage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(type_carte)
                        .addComponent(idcarte))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date_expiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PourcentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PourcentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PourcentageActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterActionPerformed
    
    
    
    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null , Rs1 = null;
    Statement St = null , St1 = null;
    private void Clear(){
        idcarte.setText("");
        type_carte.setSelectedIndex(-1);
        Pourcentage.setText("");
        idVoyage.setText("");
        date_expiration.setDate(new Date(124,1,1));
        
        
    }
    int ID=0;
    
    
    
    
    
    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
        if( type_carte.getSelectedIndex()==-1 || date_expiration.getDate() == null){
             JOptionPane.showMessageDialog(this,"Veuillez remplir tous les champs.");
        } else{
            try{ 
                
                Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb","root","");
                PreparedStatement Add=Con.prepareStatement("insert into carte_reduction values(?,?,?,?,?)");
                
                
                Add.setInt(1, ID);
                Add.setString(2,type_carte.getSelectedItem().toString());
                int pourcentage = Integer.parseInt(Pourcentage.getText());
                int idVoyageValue = Integer.parseInt(idVoyage.getText());
                Add.setInt(3, pourcentage);
                Add.setInt(4, idVoyageValue);
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                // Formater la date en une chaîne de caractères
                String datexpiration = sdf.format(date_expiration.getDate());
                Add.setString(5, datexpiration);
                
                JOptionPane.showMessageDialog(this, "carte ajouter");
                
                
                Add.execute();
                AfficherTrajet();
                
                
                ID++;
                Clear();
                
            } catch (Exception e) {
               JTextArea textArea = new JTextArea(e.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                // This what enables text area to be selectable and copyable
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                // Show the dialog with the error message
                JOptionPane.showMessageDialog(this, scrollPane, "Error in ajouterMouseClicked function", JOptionPane.ERROR_MESSAGE);
            
        } 
            
        
            }
    }//GEN-LAST:event_ajouterMouseClicked

    
    
    
    
    
    
    
    private void AfficherTrajet(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb" , "root" , "");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from carte_reduction");
            
            //Taking rows from Rs and displaying it to the table 
            DefaultTableModel model = new DefaultTableModel();
            tableCarte.setModel(model);
            ResultSetMetaData rsmd = Rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Add column names to the model
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            // Add data rows to the model
            while (Rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = Rs.getObject(i);
                }
                model.addRow(row);
            }
            
            
            
        
        }catch(SQLException e) {
            e.printStackTrace();
        }
    
    
    }
    private void idcarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcarteActionPerformed

    }//GEN-LAST:event_idcarteActionPerformed

    private void idcarteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idcarteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idcarteMouseClicked

    private void EditerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditerMouseClicked
        // Obtenez la ligne sélectionnée dans la tableCarte
    int selectedRow = tableCarte.getSelectedRow();

    // Vérifiez si une ligne est sélectionnée
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(AdminGestionCarteReduction.this, "Veuillez sélectionner une ligne à éditer.");
        return;
    }

    // Obtenez l'ID de la carte à partir de la ligne sélectionnée
    int idCarte = (int) tableCarte.getValueAt(selectedRow, 0);

    // saisir de nouvelles valeurs
    String newType = JOptionPane.showInputDialog(this, "Nouveau type de carte:", tableCarte.getValueAt(selectedRow, 1));
    String newPourcentage = JOptionPane.showInputDialog(this, "Nouveau pourcentage:", tableCarte.getValueAt(selectedRow, 2));
    String newIdVoyage = JOptionPane.showInputDialog(this, "Nouvel ID Voyage:", tableCarte.getValueAt(selectedRow, 3));
    // Vous pouvez également utiliser une boîte de dialogue pour sélectionner une nouvelle date d'expiration

    // Mettez à jour la base de données avec les nouvelles valeurs
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb", "root", "");
        PreparedStatement updateQuery = con.prepareStatement("UPDATE carte_reduction SET type_carte=?, pourcentage=?, idVoyage=? WHERE idcarte=?");

        updateQuery.setString(1, newType);
        updateQuery.setInt(2, Integer.parseInt(newPourcentage));
        updateQuery.setInt(3, Integer.parseInt(newIdVoyage));
        updateQuery.setInt(4, idCarte);

        int rowAffected = updateQuery.executeUpdate();

        if (rowAffected > 0) {
            JOptionPane.showMessageDialog(this, "Carte mise à jour avec succès dans la base de données.");
            // Mettez à jour la JTable
            DefaultTableModel model = (DefaultTableModel) tableCarte.getModel();
            model.setValueAt(newType, selectedRow, 1);
            model.setValueAt(newPourcentage, selectedRow, 2);
            model.setValueAt(newIdVoyage, selectedRow, 3);
        } else {
            JOptionPane.showMessageDialog(this, "La mise à jour de la carte a échoué.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour de la carte: " + e.getMessage());
    }
    }//GEN-LAST:event_EditerMouseClicked

    private void supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseClicked
        int[] selectedRows = tableCarte.getSelectedRows();

    // Vérifiez si des lignes sont sélectionnées
    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(AdminGestionCarteReduction.this, "Veuillez sélectionner au moins une ligne à supprimer.");
        return;
    }

    // Demandez confirmation avant de supprimer
    int option = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer ces cartes?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);

    if (option == JOptionPane.YES_OPTION) {
        // Supprimez les lignes de la base de données
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb", "root", "");
            PreparedStatement deleteQuery = con.prepareStatement("DELETE FROM carte_reduction WHERE idcarte=?");

            for (int selectedRow : selectedRows) {
                // Obtenez l'ID de la carte à partir de chaque ligne sélectionnée
                int idCarte = (int) tableCarte.getValueAt(selectedRow, 0);

                deleteQuery.setInt(1, idCarte);
                int rowAffected = deleteQuery.executeUpdate();

                if (rowAffected > 0) {
                    // Supprimez la ligne de la JTable
                    DefaultTableModel model = (DefaultTableModel) tableCarte.getModel();
                    model.removeRow(selectedRow);
                }
            }

            JOptionPane.showMessageDialog(this, "Cartes supprimées avec succès de la base de données.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de la suppression des cartes: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_supprimerMouseClicked

    private void retourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retourMouseClicked
        new AdminGestionTrajet().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_retourMouseClicked

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
            java.util.logging.Logger.getLogger(AdminGestionCarteReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGestionCarteReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGestionCarteReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGestionCarteReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminGestionCarteReduction().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editer;
    private javax.swing.JTextField Pourcentage;
    private javax.swing.JButton ajouter;
    private com.toedter.calendar.JDateChooser date_expiration;
    private javax.swing.JTextField idVoyage;
    private javax.swing.JTextField idcarte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton retour;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable tableCarte;
    private javax.swing.JComboBox<String> type_carte;
    // End of variables declaration//GEN-END:variables
}
