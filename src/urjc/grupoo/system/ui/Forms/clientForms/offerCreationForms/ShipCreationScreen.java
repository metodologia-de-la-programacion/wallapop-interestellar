package urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms;

import urjc.grupoo.data.shopData.Offer;
import urjc.grupoo.data.shopData.Spaceship;
import urjc.grupoo.system.ui.SystemSession;

/**
 *
 * @author Gonzalo Ortega
 */
public class ShipCreationScreen extends javax.swing.JPanel {

    private final SystemSession session;
    private OfferCreationHandler handler;
    /** Creates new form ShipCreationScreen */
    public ShipCreationScreen(SystemSession session, OfferCreationHandler handler) {
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

        propulsion2Label = new javax.swing.JLabel();
        tripulantsLabel = new javax.swing.JLabel();
        tripulantsTextField = new javax.swing.JTextField();
        doneButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        propulsion1Label = new javax.swing.JLabel();
        registerLabel = new javax.swing.JLabel();
        registerTextField = new javax.swing.JTextField();
        propulsion1Selector = new javax.swing.JComboBox<>();
        propulsion2Selector = new javax.swing.JComboBox<>();
        shipTypeSelector = new javax.swing.JComboBox<>();
        registerTextField1 = new javax.swing.JTextField();
        registerLabel1 = new javax.swing.JLabel();

        propulsion2Label.setText("Tipo de propulsión 2");

        tripulantsLabel.setText("Número de tripulantes");

        tripulantsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripulantsTextFieldActionPerformed(evt);
            }
        });

        doneButton.setText("Siguiente");
        doneButton.setToolTipText("");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Tipo de nave");

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        propulsion1Label.setText("Tipo de propulsión 1");

        registerLabel.setText("Número de registro");

        registerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTextFieldActionPerformed(evt);
            }
        });

        propulsion1Selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motor de curvatura", "Compresor de traza", "Motor FTL", "Velas solares", "Motor iónico" }));

        propulsion2Selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Motor de curvatura", "Compresor de traza", "Motor FTL", "Velas solares", "Motor iónico" }));

        shipTypeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destructor", "Carguero", "Caza", "Estación Espacial" }));
        shipTypeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipTypeSelectorActionPerformed(evt);
            }
        });

        registerTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTextField1ActionPerformed(evt);
            }
        });

        registerLabel1.setText("Velocidad sublumínica máxima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(shipTypeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(doneButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(registerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tripulantsTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(registerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tripulantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(registerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerTextField1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(propulsion1Selector, 0, 243, Short.MAX_VALUE)
                            .addComponent(propulsion1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(propulsion2Selector, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(propulsion2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shipTypeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propulsion1Label)
                    .addComponent(propulsion2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propulsion1Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propulsion2Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerLabel1)
                    .addComponent(registerTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerLabel)
                    .addComponent(tripulantsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tripulantsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(doneButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tripulantsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripulantsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tripulantsTextFieldActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        String selectedType = (String) shipTypeSelector.getSelectedItem();
        switch (selectedType) {
            case "Destructor":
                session.getController().addNewPanel(new DestructorCreationScreen(session, handler));
        }
        
        

    }//GEN-LAST:event_doneButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        session.getController().goBack();
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void registerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerTextFieldActionPerformed

    private void shipTypeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipTypeSelectorActionPerformed

    }//GEN-LAST:event_shipTypeSelectorActionPerformed

    private void registerTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerTextField1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel propulsion1Label;
    private javax.swing.JComboBox<String> propulsion1Selector;
    private javax.swing.JLabel propulsion2Label;
    private javax.swing.JComboBox<String> propulsion2Selector;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel registerLabel1;
    private javax.swing.JTextField registerTextField;
    private javax.swing.JTextField registerTextField1;
    private javax.swing.JComboBox<String> shipTypeSelector;
    private javax.swing.JLabel tripulantsLabel;
    private javax.swing.JTextField tripulantsTextField;
    // End of variables declaration//GEN-END:variables

    
    public interface OfferCreationHandler{
        public void onOfferCreated(Offer offer);
    }
    
}
