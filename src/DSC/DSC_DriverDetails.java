
package DSC;

import javax.swing.JOptionPane;

/**
 *
 * @author Aliens_Michael
 */
public class DSC_DriverDetails extends javax.swing.JFrame {

    boolean editClicked = false;

    /**
     * Creates new form DSC_DriverDetails
     */
    public DSC_DriverDetails() {
        initComponents();
        disableFields();
        btnSave.setText("Save");
        btnSave.setVisible(false);
        lstDrivers.setSelectedIndex(0);
    }

    public final void enableFields() {
        txfDriverID.setEnabled(true);
        txfDriverName.setEnabled(true);
        txfDriverSurname.setEnabled(true);
        txfContactNo.setEnabled(true);
        txfAddress.setEnabled(true);
        txfVehicleReg.setEnabled(true);
    }

    public final void disableFields() {
        txfDriverID.setEnabled(false);
        txfDriverName.setEnabled(false);
        txfDriverSurname.setEnabled(false);
        txfContactNo.setEnabled(false);
        txfAddress.setEnabled(false);
        txfVehicleReg.setEnabled(false);
    }

    public final void clearFields() {
        txfDriverID.setText(null);
        txfDriverName.setText(null);
        txfDriverSurname.setText(null);
        txfContactNo.setText(null);
        txfAddress.setText(null);
        txfVehicleReg.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("doorstepchef?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        driverTbQuery = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT d FROM DriverTb d");
        driverTbList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : driverTbQuery.getResultList();
        pnlBackground = new javax.swing.JPanel();
        pnlDrivers = new javax.swing.JPanel();
        lblDrivers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDrivers = new javax.swing.JList<>();
        btnAddDriver = new javax.swing.JButton();
        btnDeleteDriver = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();
        lblDriversDetails = new javax.swing.JLabel();
        lblDriverID = new javax.swing.JLabel();
        lblDriverName = new javax.swing.JLabel();
        lblDriverSurname = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblVehicleReg = new javax.swing.JLabel();
        txfDriverID = new javax.swing.JTextField();
        txfDriverName = new javax.swing.JTextField();
        txfDriverSurname = new javax.swing.JTextField();
        txfContactNo = new javax.swing.JTextField();
        txfAddress = new javax.swing.JTextField();
        txfVehicleReg = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Driver Details");

        pnlBackground.setBackground(new java.awt.Color(0, 153, 0));

        pnlDrivers.setBackground(new java.awt.Color(0, 204, 51));
        pnlDrivers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDrivers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrivers.setText("Drivers:");

        lstDrivers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstDrivers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, driverTbList, lstDrivers);
        bindingGroup.addBinding(jListBinding);

        jScrollPane1.setViewportView(lstDrivers);

        btnAddDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Add.png"))); // NOI18N
        btnAddDriver.setText(" Add");
        btnAddDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDriverActionPerformed(evt);
            }
        });

        btnDeleteDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Bin.png"))); // NOI18N
        btnDeleteDriver.setText("Delete");
        btnDeleteDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDriverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDriversLayout = new javax.swing.GroupLayout(pnlDrivers);
        pnlDrivers.setLayout(pnlDriversLayout);
        pnlDriversLayout.setHorizontalGroup(
            pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDriversLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlDriversLayout.createSequentialGroup()
                        .addComponent(lblDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDriver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteDriver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDriversLayout.setVerticalGroup(
            pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDriversLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDriversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteDriver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlDetails.setBackground(new java.awt.Color(0, 204, 51));
        pnlDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDriversDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDriversDetails.setText("Driver's Details:");

        lblDriverID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDriverID.setText("Driver ID:");

        lblDriverName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDriverName.setText("Driver Name:");

        lblDriverSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDriverSurname.setText("Driver Surname:");

        lblContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContactNo.setText("Contact Number:");

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddress.setText("Address:");

        lblVehicleReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVehicleReg.setText("Vehicle Registration:");

        txfDriverID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDriverID.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstDrivers, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.driverID}"), txfDriverID, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txfDriverName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDriverName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstDrivers, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.driverName}"), txfDriverName, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txfDriverSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDriverSurname.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstDrivers, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.driverSurame}"), txfDriverSurname, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txfContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfContactNo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstDrivers, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.contactNumber}"), txfContactNo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txfAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfAddress.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstDrivers, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.address}"), txfAddress, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txfVehicleReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfVehicleReg.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstDrivers, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.vehicleReg}"), txfVehicleReg, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Edit 2.png"))); // NOI18N
        btnEdit.setText(" Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/Save 2.png"))); // NOI18N
        btnSave.setText(" Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDriversDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVehicleReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDriverSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDriverName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDriverID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDriverID)
                            .addComponent(txfDriverName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfDriverSurname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfVehicleReg, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDriversDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriverID)
                    .addComponent(txfDriverID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriverName)
                    .addComponent(txfDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriverSurname)
                    .addComponent(txfDriverSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleReg)
                    .addComponent(txfVehicleReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDrivers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        enableFields();
        btnEdit.setEnabled(false);
        btnSave.setVisible(true);
        editClicked = true;
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (editClicked) {
            int ans = JOptionPane.showConfirmDialog(this, "Do you wish to discard unsaved changes?");
            switch (ans) {
                case JOptionPane.YES_OPTION:
                    btnSave.setVisible(false);
                    btnEdit.setEnabled(true);
                    disableFields();
                    editClicked = false;
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                default:
                    break;
            }
        } else {
            this.dispose();
            new DSC_DriverTable().setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText().equals("Save")) {
            /*
                short newID = Short.parseShort(txfDriverID.getText().trim());
                String newName = txfDriverName.getText().trim();
                String newSurname = txfDriverSurname.getText().trim();
                String newContactNo = txfContactNo.getText().trim();
                String newAddress = txfAddress.getText().trim();
                String newVehicleReg = txfVehicleReg.getText().trim();
                short newRouteID = Short.parseShort(txfRouteID.getText().trim());
             */

            //Commit to database
        } else if (btnSave.getText().equals("Add")) {
            //Add to database
            short newID = Short.parseShort(txfDriverID.getText().trim());
            String newName = txfDriverName.getText().trim();
            String newSurname = txfDriverSurname.getText().trim();
            String newContactNo = txfContactNo.getText().trim();
            String newAddress = txfAddress.getText().trim();
            String newVehicleReg = txfVehicleReg.getText().trim();

            String statement = "INSERT INTO doorstepchef.driver_tb (`DriverID`, `DriverName`, `ContactNumber`, `Address`, `VehicleReg`, `DriverSurname`) \n"
                    + "	VALUES (" + newID + ", '" + newName + "', '" + newContactNo + "', '" + newAddress + "', '" + newVehicleReg + "', '" + newSurname + "');";
            
            
        }
        disableFields();
        btnSave.setVisible(false);
        btnEdit.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDriverActionPerformed
        clearFields();
        enableFields();
        btnEdit.setEnabled(false);
        btnSave.setText("Add");
        btnSave.setVisible(true);
        editClicked = true;
        
        //int num = (SQL query to count number of drivers) + 1;
        //txfDriverID.setText("DSC_");
    }//GEN-LAST:event_btnAddDriverActionPerformed

    private void btnDeleteDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDriverActionPerformed
        String name = txfDriverName.getText() +" "+ txfDriverSurname.getText();       
        String message = "Are you sure you want to delete "+name+"?";
        int answer = JOptionPane.showConfirmDialog(this, message, "Confirm", JOptionPane.INFORMATION_MESSAGE);
        switch(answer){
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(this, name+" will be deleted", "Delete Notification", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, name+" will not be deleted", "Delete Notification", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case JOptionPane.CANCEL_OPTION:
                
                break;
        }
    }//GEN-LAST:event_btnDeleteDriverActionPerformed

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
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSC_DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSC_DriverDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDriver;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDriver;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private java.util.List<DSC.DriverTb> driverTbList;
    private javax.persistence.Query driverTbQuery;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDriverID;
    private javax.swing.JLabel lblDriverName;
    private javax.swing.JLabel lblDriverSurname;
    private javax.swing.JLabel lblDrivers;
    private javax.swing.JLabel lblDriversDetails;
    private javax.swing.JLabel lblVehicleReg;
    private javax.swing.JList<String> lstDrivers;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlDrivers;
    private javax.swing.JTextField txfAddress;
    private javax.swing.JTextField txfContactNo;
    private javax.swing.JTextField txfDriverID;
    private javax.swing.JTextField txfDriverName;
    private javax.swing.JTextField txfDriverSurname;
    private javax.swing.JTextField txfVehicleReg;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
