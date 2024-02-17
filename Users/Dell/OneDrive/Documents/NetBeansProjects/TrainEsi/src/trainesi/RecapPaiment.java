/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainesi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class RecapPaiment extends javax.swing.JFrame {

    /**
     * Creates new form RecapPaiment
     */
    int trajet_id;
    int classe;
    int carte_id;
    
    Connection Con = null;
    java.sql.PreparedStatement pst = null;
    ResultSet Rs = null , Rs1 = null;
    Statement St = null , St1 = null;
          
    public RecapPaiment(int trajet_id , int classe, int carte_id)  {
        initComponents();
        this.trajet_id =trajet_id;
        this.classe = classe;
        this.carte_id = carte_id;
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
        jPanel2 = new javax.swing.JPanel();
        Origine = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Destination = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        HeureDepart = new javax.swing.JLabel();
        HeureArrive = new javax.swing.JLabel();
        CarteValide = new javax.swing.JLabel();
        PrixInitial = new javax.swing.JLabel();
        PrixFinal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Valider = new javax.swing.JButton();
        Valider1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Carte de Reduction");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 220, 220));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setText("Recapitulatif du ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setText("Paiment ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 72, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Origine.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        Origine.setText("Origine :");

        Destination.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        Destination.setText("Destination :");

        Date.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        Date.setText("Date :");

        HeureDepart.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        HeureDepart.setText("HeureDepart :");

        HeureArrive.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        HeureArrive.setText("Heure d'arrivée :");

        CarteValide.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        CarteValide.setText("Carte de reduction :");

        PrixInitial.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        PrixInitial.setText("Prix initiale :");

        PrixFinal.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        PrixFinal.setText("Prix final :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrixFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrixInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeureArrive, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Origine, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)))
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HeureDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarteValide, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Origine)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(Destination)
                .addGap(18, 18, 18)
                .addComponent(Date)
                .addGap(18, 18, 18)
                .addComponent(HeureDepart)
                .addGap(18, 18, 18)
                .addComponent(HeureArrive)
                .addGap(30, 30, 30)
                .addComponent(CarteValide)
                .addGap(30, 30, 30)
                .addComponent(PrixInitial)
                .addGap(30, 30, 30)
                .addComponent(PrixFinal)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 202, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel27.setText("Origine :");

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel29.setText("Destination :");

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel30.setText("Date :");

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel31.setText("HeureDepart :");

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel32.setText("Heure d'arrivée :");

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel34.setText("Carte de reduction :");

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel35.setText("Prix initiale :");

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel36.setText("Prix final :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)))
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(22, 22, 22)
                .addComponent(jLabel32)
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addGap(32, 32, 32)
                .addComponent(jLabel35)
                .addGap(30, 30, 30)
                .addComponent(jLabel36)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 202, -1));

        Valider.setText("ANNULER");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        getContentPane().add(Valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 130, 50));

        Valider1.setText("VALIDER");
        getContentPane().add(Valider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 130, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValiderActionPerformed
     private void afficherTrajet() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb" , "root" , "");
            St = Con.createStatement();
            String query = "SELECT OrigineTbl, DestinationTbl, DateTbl, HeureDepart, HeureArrive FROM trajettable WHERE TrajetId=" +trajet_id;
            Rs = St.executeQuery(query);
            Origine.setText(Rs.getString("OrigineTbl"));
            Destination.setText(Rs.getString("DestinationTbl"));
            Date.setText(Rs.getDate("DateTbl").toString());
            HeureDepart.setText(Rs.getTime("HeureDepart").toString());
            HeureArrive.setText(Rs.getTime("HeureArrive").toString());
            
            PrixInitial.setText(Rs.getString("OrigineTbl"));
            PrixFinal.setText(Rs.getString("OrigineTbl"));
        } catch (SQLException ex) {
            Logger.getLogger(RecapPaiment.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
         
     }
    /**
     * @param args the command line arguments
     */
   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarteValide;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Destination;
    private javax.swing.JLabel HeureArrive;
    private javax.swing.JLabel HeureDepart;
    private javax.swing.JLabel Origine;
    private javax.swing.JLabel PrixFinal;
    private javax.swing.JLabel PrixInitial;
    private javax.swing.JButton Valider;
    private javax.swing.JButton Valider1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
