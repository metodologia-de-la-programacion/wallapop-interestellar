package urjc.grupoo.system.ui.Forms.adminForms;

import urjc.grupoo.system.ui.SystemSession;

/**
 * Clase correspondiente a la ventana que permite reportar a los usuarios
 *
 * @author Sergio
 */
public class UpdatePermission extends javax.swing.JPanel {

    private final SystemSession session;

    /**
     * Creates new form UpdatePermission
     *
     * @param session
     */
    public UpdatePermission(SystemSession session) {
        this.session = session;
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

        userTextField = new javax.swing.JTextField();
        clientLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        piracy = new javax.swing.JCheckBox();
        fraud = new javax.swing.JCheckBox();
        incorrect = new javax.swing.JLabel();

        clientLabel.setText("Introduce el ID del cliente");

        doneButton.setText("Confirmar");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        piracy.setText("Piratería");
        piracy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piracyActionPerformed(evt);
            }
        });

        fraud.setText("Fraude");
        fraud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addGap(253, 253, 253))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(piracy)
                                .addGap(93, 93, 93)
                                .addComponent(fraud))
                            .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(596, Short.MAX_VALUE)
                    .addComponent(backButton)
                    .addGap(87, 87, 87)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(clientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incorrect)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(piracy)
                    .addComponent(fraud))
                .addGap(68, 68, 68)
                .addComponent(doneButton)
                .addGap(80, 80, 80))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(backButton)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Permite reportar o no al usuario introduciendo su Id y marcando la
     * casilla de fraude o pirateria
     *
     * @param evt
     */
    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed

        String idUser = userTextField.getText();
        if (idUser != null) {
            if (piracy.isSelected()) {
                session.getAdminFacade().reportUserOfFraud(Integer.getInteger(idUser));
            } else {
                session.getAdminFacade().resolveUserReportOfPiracy(Integer.getInteger(idUser));
            }
            if (fraud.isSelected()) {
                session.getAdminFacade().reportUserOfFraud(Integer.getInteger(idUser));
            } else {
                session.getAdminFacade().resolveUserReportOfFraud(Integer.getInteger(idUser));
            }
        } else {
            incorrect.setText("Usuario no encontrado");
        }
    }//GEN-LAST:event_doneButtonActionPerformed

    /**
     * Se vuelve a la ventana anterior al pulsar el botón superior derecho "<"
     *
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        session.getController().goBack();
        setVisible(false);

    }//GEN-LAST:event_backButtonActionPerformed

    private void piracyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piracyActionPerformed

    }//GEN-LAST:event_piracyActionPerformed

    private void fraudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraudActionPerformed

    }//GEN-LAST:event_fraudActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JCheckBox fraud;
    private javax.swing.JLabel incorrect;
    private javax.swing.JCheckBox piracy;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
