package urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms;

import urjc.grupoo.system.ui.SystemSession;

/**
 *
 * @author Gonzalo Ortega
 */
public class DefenceCreationScreen extends javax.swing.JPanel {

    private final SystemSession session;

    private final ShipCreationScreen.ShipCreationHandler handler;

    /**
     * Creates new form fighterCreationScreen
     */
    public DefenceCreationScreen(SystemSession session,
            ShipCreationScreen.ShipCreationHandler handler) {
        this.session = session;
        this.handler = handler;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defenceSystemLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        defenceTypeSelector = new javax.swing.JComboBox<>();

        defenceSystemLabel.setText("Sistema de defensa");

        doneButton.setText("Siguiente");
        doneButton.setToolTipText("");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Nuevo sistema de defensa");

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        defenceTypeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escudos", "Blindaje" }));
        defenceTypeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenceTypeSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defenceSystemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defenceTypeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nameLabel))
                .addGap(20, 20, 20)
                .addComponent(defenceSystemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defenceTypeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(doneButton)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        String selectedType = (String) defenceTypeSelector.getSelectedItem();
        switch (selectedType) {
            case "Escudos":
            session.getController().addNewPanel(new ShieldCreationScreen(session, handler));
            break;
            case "Blindaje":
            session.getController().addNewPanel(new ArmorCreationScreen(session, handler));
            break;
        }
    }//GEN-LAST:event_doneButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        session.getController().goBack(); // Para volver al checkpoint
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void defenceTypeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defenceTypeSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defenceTypeSelectorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel defenceSystemLabel;
    private javax.swing.JComboBox<String> defenceTypeSelector;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

}
