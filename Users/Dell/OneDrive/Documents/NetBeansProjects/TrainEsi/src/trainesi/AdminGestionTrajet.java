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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatter;


/**
 *
 * @author Dell
 */
public class AdminGestionTrajet extends javax.swing.JFrame {
    
    

    /**
     * Creates new form GestionTrajet
     */
    public AdminGestionTrajet() {
        initComponents();
        AfficherTrajet();
        TrajetId.setEditable(false);
        

        

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
        TrajetId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Destination = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Origine = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        String[] timeArray = {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};
        SpinnerListModel model = new SpinnerListModel(timeArray);
        HeureDepart = new javax.swing.JSpinner(model);
        jLabel6 = new javax.swing.JLabel();
        SpinnerListModel model1 = new SpinnerListModel(timeArray);
        HeureArrive = new javax.swing.JSpinner(model1);
        jLabel7 = new javax.swing.JLabel();
        PlaceDisponibleClasse1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        GtEditerBTN = new javax.swing.JButton();
        GtSupprimerBTN = new javax.swing.JButton();
        GtRetourBTN = new javax.swing.JButton();
        GtAjouterBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GtTrajetTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        PlaceDisponibleClasse2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Gestion Des Trajets");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Origine");

        Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kenitra", "Rabat", "Fes", "Casa", "Marrakesh" }));
        Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("TrajetId");

        Origine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kenitra", "Rabat", "Fes", "Casa", "Marrakesh" }));
        Origine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigineActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Destination");

        Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Heure depart");

        // Add the spinner to your GUI

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Heure arrivé");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Places dispo 1");

        GtEditerBTN.setText("EDITER");
        GtEditerBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtEditerBTNMouseClicked(evt);
            }
        });

        GtSupprimerBTN.setText("SUPPRIMER");
        GtSupprimerBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtSupprimerBTNMouseClicked(evt);
            }
        });

        GtRetourBTN.setText("RETOUR");
        GtRetourBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtRetourBTNMouseClicked(evt);
            }
        });
        GtRetourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GtRetourBTNActionPerformed(evt);
            }
        });

        GtAjouterBTN.setText("AJOUTER");
        GtAjouterBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtAjouterBTNMouseClicked(evt);
            }
        });

        GtTrajetTable.setModel(new javax.swing.table.DefaultTableModel(
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
        GtTrajetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtTrajetTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GtTrajetTable);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Places dispo 2");

        jButton1.setText("Recherche Avancée");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GtSupprimerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GtAjouterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TrajetId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Origine, 0, 90, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(HeureDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(HeureArrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GtEditerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GtRetourBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlaceDisponibleClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PlaceDisponibleClasse1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TrajetId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Origine, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HeureDepart, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HeureArrive, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GtAjouterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GtEditerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GtSupprimerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GtRetourBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PlaceDisponibleClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlaceDisponibleClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationActionPerformed

    private void OrigineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrigineActionPerformed

    private void GtRetourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GtRetourBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GtRetourBTNActionPerformed
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null , Rs1 = null;
    Statement St = null , St1 = null;
    
    private void Clear(){
        TrajetId.setText("");
        Origine.setSelectedIndex(-1);
        Destination.setSelectedIndex(-1);
        Date.setDate(new Date(124,0,1));
        HeureDepart.setValue("00:00");
        HeureArrive.setValue("00:00");
        
    }
    
        private void CalculID(){
        try {
            St1=Con.createStatement();
            Rs1=St1.executeQuery("select Max(TrajetIdTbl) from trajettable");
            Rs1.next();
            ID = Rs1.getInt(1)+1;
        } catch(Exception e) {
            // This exception is prompted by GTP 3.5 to make the exception copyable .
                JTextArea textArea = new JTextArea(e.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                // This what enables text area to be selectable and copyable
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                // Show the dialog with the error message
                JOptionPane.showMessageDialog(this, scrollPane, "Error in clear function", JOptionPane.ERROR_MESSAGE);
        }
    }
    int ID =0;
    private boolean EstInvalidePourAjouter() {
    return 
           Date.getDate() == null ||
           HeureDepart.toString().isEmpty() ||
           HeureArrive.toString().isEmpty() ||
           PlaceDisponibleClasse1.toString().isEmpty() ||
           PlaceDisponibleClasse2.toString().isEmpty() ||
            PlaceDisponibleClasse1.getText()== null ||
           PlaceDisponibleClasse2.getText() == null;
}
    
    private void GtAjouterBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtAjouterBTNMouseClicked
        if( EstInvalidePourAjouter() ) {
            JOptionPane.showMessageDialog(this, "Missing information ");
       } else if( Origine.getSelectedItem() ==  Destination.getSelectedItem() ) {
            JOptionPane.showMessageDialog(this, "L'origine et la destination ne peuvent pas etre les memes ");
        }else {
            try {
                 CalculID();
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb" , "root" , "");
                 PreparedStatement Add = Con.prepareStatement("insert into trajettable values (?,?,?,?,?,?,?,?)");
                 Add.setInt(1, ID);
                 Add.setString(2, Origine.getSelectedItem().toString());
                 Add.setString(3, Destination.getSelectedItem().toString());
                 
                 // The Date variable values are like this : "Fri Feb 02 00:18:50 GMT 2024" But the database is expecting 
                 // year:mm:day so we have to make a convertion before we store in the DateTbl variable
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                 String formattedDate = sdf.format(Date.getDate());
                 Add.setString(4, formattedDate);
                 
                 Add.setString(5, HeureDepart.getValue().toString());
                 Add.setString(6, HeureArrive.getValue().toString());
                 Add.setInt(7, Integer.valueOf(PlaceDisponibleClasse1.getText()));
                 Add.setInt(8, Integer.valueOf(PlaceDisponibleClasse2.getText()));
                 
                 int raw = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Trajet Ajouté");
                 AfficherTrajet();
                 Clear();
                 
            
            }catch(Exception e){
                // This exception is prompted by GTP 3.5 to make the exception copyable .
                JTextArea textArea = new JTextArea(e.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                // This what enables text area to be selectable and copyable
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                // Show the dialog with the error message
                JOptionPane.showMessageDialog(this, scrollPane, "Error in ajouter", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_GtAjouterBTNMouseClicked
    int i=0;
    private void GtTrajetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtTrajetTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)GtTrajetTable.getModel();
        int MyIndex = GtTrajetTable.getSelectedRow();
        i  = Integer.valueOf(model.getValueAt(MyIndex , 0).toString()); 
        TrajetId.setText(model.getValueAt(MyIndex , 0).toString());
        Origine.setSelectedItem(model.getValueAt(MyIndex , 1).toString());
        Destination.setSelectedItem(model.getValueAt(MyIndex , 2).toString());
        
        Date.setDate((Date) model.getValueAt(MyIndex, 3));
        ((JSpinner.DefaultEditor) HeureDepart.getEditor()).getTextField().setText(model.getValueAt(MyIndex, 4).toString());
        ((JSpinner.DefaultEditor) HeureArrive.getEditor()).getTextField().setText(model.getValueAt(MyIndex, 5).toString());

        PlaceDisponibleClasse1.setText(model.getValueAt(MyIndex , 6).toString());
        PlaceDisponibleClasse2.setText(model.getValueAt(MyIndex , 7).toString());
    }//GEN-LAST:event_GtTrajetTableMouseClicked

    private void DateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DateMouseClicked

    private void GtEditerBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtEditerBTNMouseClicked
        if(i==0){
            JOptionPane.showMessageDialog(this, "Veuillez Selectionner un trajet à modifier !");
            
            
        }else{
            CalculID();  
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb", "root" , "");
                String Query ="Update trajettable set OrigineTbl=?, DestinationTbl=?, DateTbl=?, HeureDepartTbl=?, HeureArriveTbl=?, PlaceDisponibleClasse1Tbl=?, PlaceDisponibleClasse2Tbl=? where TrajetIdTbl=?";
                PreparedStatement Add = Con.prepareStatement(Query);

                
   
                 Add.setString(1, Origine.getSelectedItem().toString());
                 Add.setString(2, Destination.getSelectedItem().toString());
                 
                 // The Date variable values are like this : "Fri Feb 02 00:18:50 GMT 2024" But the database is expecting 
                 // year:mm:day so we have to make a convertion before we store in the DateTbl variable
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                 String formattedDate = sdf.format(Date.getDate());
                 Add.setString(3, formattedDate);
                 
                 Add.setString(4, HeureDepart.getValue().toString());
                 Add.setString(5, HeureArrive.getValue().toString());
                 Add.setInt(6, Integer.valueOf(PlaceDisponibleClasse1.getText()));
                 Add.setInt(7, Integer.valueOf(PlaceDisponibleClasse2.getText()));

                 Add.setInt(8, i);
                 
                 int raw = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Trajet Modifié");
                 AfficherTrajet();
                 Clear();
                
            } catch (SQLException e) {
                // This exception is prompted by GTP 3.5 to make the exception copyable .
                JTextArea textArea = new JTextArea(e.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                // This what enables text area to be selectable and copyable
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                // Show the dialog with the error message
                JOptionPane.showMessageDialog(this, scrollPane, "Error in editer", JOptionPane.ERROR_MESSAGE);
            }
         
        }
    }//GEN-LAST:event_GtEditerBTNMouseClicked

    private void GtSupprimerBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtSupprimerBTNMouseClicked
        if(i==0){
            JOptionPane.showMessageDialog(this, "Veuillez Selectionner un trajet à Suuprimer !");
            
        }else{
            CalculID();  
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb", "root" , "");
                String Query ="Delete from trajettable where TrajetIdTbl=" + i;
                Statement Deletion = Con.createStatement();
                Deletion.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"trajet Supprimé");
                AfficherTrajet();
                Clear();
                
            } catch (SQLException e) {
                // This exception is prompted by GTP 3.5 to make the exception copyable .
                JTextArea textArea = new JTextArea(e.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                // This what enables text area to be selectable and copyable
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                // Show the dialog with the error message
                JOptionPane.showMessageDialog(this, scrollPane, "Error in delete function", JOptionPane.ERROR_MESSAGE);
            }
         
        }
    }//GEN-LAST:event_GtSupprimerBTNMouseClicked

    private void GtRetourBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtRetourBTNMouseClicked
        new Mainform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GtRetourBTNMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new RechercheAvance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void AfficherTrajet(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esitraindb" , "root" , "");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from trajettable");
            
            //Taking rows from Rs and displaying it to the table 
            DefaultTableModel model = new DefaultTableModel();
            GtTrajetTable.setModel(model);
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
            
            
            
        
        }catch(Exception e) {
            // This exception is prompted by GTP 3.5 to make the exception copyable .
                JTextArea textArea = new JTextArea(e.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 200));

                // This what enables text area to be selectable and copyable
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                // Show the dialog with the error message
                JOptionPane.showMessageDialog(this, scrollPane, "Error in Afficher function", JOptionPane.ERROR_MESSAGE);
        }
    
    
    }
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
            java.util.logging.Logger.getLogger(AdminGestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGestionTrajet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGestionTrajet().setVisible(true);
            }
        });
    }
    //PROBLEM
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JComboBox<String> Destination;
    private javax.swing.JButton GtAjouterBTN;
    private javax.swing.JButton GtEditerBTN;
    private javax.swing.JButton GtRetourBTN;
    private javax.swing.JButton GtSupprimerBTN;
    private javax.swing.JTable GtTrajetTable;
    private javax.swing.JSpinner HeureArrive;
    private javax.swing.JSpinner HeureDepart;
    private javax.swing.JComboBox<String> Origine;
    private javax.swing.JTextField PlaceDisponibleClasse1;
    private javax.swing.JTextField PlaceDisponibleClasse2;
    private javax.swing.JTextField TrajetId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
