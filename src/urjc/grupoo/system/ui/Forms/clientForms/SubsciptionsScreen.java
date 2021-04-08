package urjc.grupoo.system.ui.Forms.clientForms;

/**
 *
 * @author Gonzalo Ortega
 */
public class SubsciptionsScreen extends javax.swing.JPanel {

    /** Creates new form SubsciptionsScreen */
    public SubsciptionsScreen() {
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

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        stationsSubCheck = new javax.swing.JCheckBox();
        destructorsSubCheck = new javax.swing.JCheckBox();
        cargoSubCheck = new javax.swing.JCheckBox();
        fighterSubCheck = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Subscripciones");

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        stationsSubCheck.setText("Estaciones espaciales");

        destructorsSubCheck.setText("Destructores");
        destructorsSubCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destructorsSubCheckActionPerformed(evt);
            }
        });

        cargoSubCheck.setText("Cargueros");

        fighterSubCheck.setText("Cazas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stationsSubCheck)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fighterSubCheck)
                            .addComponent(cargoSubCheck)
                            .addComponent(destructorsSubCheck))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(stationsSubCheck)
                .addGap(18, 18, 18)
                .addComponent(destructorsSubCheck)
                .addGap(18, 18, 18)
                .addComponent(cargoSubCheck)
                .addGap(18, 18, 18)
                .addComponent(fighterSubCheck)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //session.getController().goBack();
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void destructorsSubCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destructorsSubCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destructorsSubCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox cargoSubCheck;
    private javax.swing.JCheckBox destructorsSubCheck;
    private javax.swing.JCheckBox fighterSubCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox stationsSubCheck;
    // End of variables declaration//GEN-END:variables

}
