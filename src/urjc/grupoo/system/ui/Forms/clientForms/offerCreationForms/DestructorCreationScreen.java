package urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms;

import urjc.grupoo.data.shipsData.Spaceship;
import urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms.ShipCreationScreen.ShipCreationHandler;
import urjc.grupoo.system.ui.SystemSession;

/**
 *
 * @author Gonzalo Ortega
 */
public class DestructorCreationScreen extends javax.swing.JPanel {
    
    private final SystemSession session;
    private final ShipCreationScreen.ShipCreationHandler handler;
    
    /** Creates new form fighterCreationScreen */
    public DestructorCreationScreen(SystemSession session,
            ShipCreationHandler handler) {
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

        doneButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addWeaponButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        weaponsDisplay = new javax.swing.JList<>();
        addDefenceButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        defencesDisplay = new javax.swing.JList<>();

        doneButton.setText("Siguiente");
        doneButton.setToolTipText("");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameLabel.setText("Destructor");

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addWeaponButton.setText("Añadir arma");
        addWeaponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWeaponButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Armas:");

        jScrollPane1.setViewportView(weaponsDisplay);

        addDefenceButton.setText("Añadir sistema de defensa");
        addDefenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDefenceButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Sistemas de defensa:");

        jScrollPane2.setViewportView(defencesDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(addDefenceButton)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(addWeaponButton)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nameLabel))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDefenceButton)
                    .addComponent(addWeaponButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(doneButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        session.getController().goBackToCheckPoint();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        session.getController().goBack(); // Para volver al checkpoint
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addWeaponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWeaponButtonActionPerformed
        session.getController().checkPoint();
        session.getController().addNewPanel(new WeaponCreationScreen(session, handler));
    }//GEN-LAST:event_addWeaponButtonActionPerformed

    private void addDefenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDefenceButtonActionPerformed
        session.getController().checkPoint();
        session.getController().addNewPanel(new DefenceCreationScreen(session, handler));
    }//GEN-LAST:event_addDefenceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDefenceButton;
    private javax.swing.JButton addWeaponButton;
    private javax.swing.JButton backButton;
    private javax.swing.JList<String> defencesDisplay;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JList<String> weaponsDisplay;
    // End of variables declaration//GEN-END:variables

}
