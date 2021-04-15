package urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms.shipsForms;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import urjc.grupoo.data.shipsData.ShipFactory;
import urjc.grupoo.data.shipsData.Spaceship;
import urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms.complementForms.DefenceCreationScreen;
import urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms.crationHandlers.OfferCreationHandler;
import urjc.grupoo.system.ui.Forms.clientForms.offerCreationForms.crationHandlers.ShipCreationHandler;
import urjc.grupoo.system.ui.SystemSession;

/**
 *
 * @author Gonzalo Ortega
 */
public class CargoCreationScreen extends javax.swing.JPanel {

    private final SystemSession session;
    private final ShipCreationHandler handler;
    private final OfferCreationHandler offerhandler;

    /**
     * Creates new form CargoCreationScreen
     *
     * @param session
     * @param handler
     * @param offerhandler
     */
    public CargoCreationScreen(SystemSession session, ShipCreationHandler handler, OfferCreationHandler offerhandler) {
        this.session = session;
        this.handler = handler;
        this.offerhandler = offerhandler;
        initComponents();
    }

    /**
     * Saves the input data in the ShipCreationHandler
     * 
     * @return TRUE if all parameters are of the correct type.
     */
    private boolean checkParameters() {
        if (handler.getDefenceList().isEmpty()) {
            incorrectLabel.setText("Introduzca un sistema de defensa.");
            return false;
        } else {
            try {
                handler.setCargoCapacity(Integer.parseInt(maxCargoField.getText()));
            } catch (NumberFormatException e) {
                incorrectLabel.setText("Revise los datos introducidos.");
                return false;
            }
        }
        incorrectLabel.setText("");
        return true;
    }
    
    private void addDefences() {
        JPanel defencesList = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        defencesPanel.setViewportView(defencesList);

        handler.getDefenceList().forEach((defence) -> {
            addEntry(defence.getDefenceType(), defencesList);
        });
    }
    
    private void addEntry(String text, JPanel displayList) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(text));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        displayList.add(panel, gbc, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doneButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        maxCargoField = new javax.swing.JTextField();
        maxCargoLabel = new javax.swing.JLabel();
        addDefenceButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        incorrectLabel = new javax.swing.JLabel();
        defencesPanel = new javax.swing.JScrollPane();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        doneButton.setText("Siguiente");
        doneButton.setToolTipText("");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameLabel.setText("Carguero");

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        maxCargoLabel.setText("Capacidad máxima de carga:");

        addDefenceButton.setText("Añadir sistema de defensa");
        addDefenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDefenceButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema de defensa:");

        incorrectLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(incorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(139, 139, 139)
                                .addComponent(maxCargoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(defencesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxCargoField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(addDefenceButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nameLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maxCargoLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defencesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addDefenceButton)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maxCargoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(incorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        if (checkParameters()) {    
            Spaceship newShip = new ShipFactory().CreateSpaceship(
                    handler.getType(), handler.getCrewNumber(), handler.getPropulsion1(), handler.getSpeed(),
                    handler.getPropulsion2(), handler.getSpeed(), handler.getRegNumber(),
                    handler.getDefenceList().get(0), handler.getCargoCapacity());
            if (handler.getStationCounter() == 0) {
                offerhandler.addShipToOffer(newShip);
            } else {
                handler.addShip(newShip);
                System.out.println("Naves en el handler: " + handler.getShipList().size());
            }
            session.getController().goBackToCheckPoint();
        }
    }//GEN-LAST:event_doneButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        session.getController().goBack();
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addDefenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDefenceButtonActionPerformed
        if (handler.getDefenceList().isEmpty()) {
            session.getController().addNewPanel(new DefenceCreationScreen(session, handler));
            incorrectLabel.setText("");
        } else {
            incorrectLabel.setText("Los cargueros solo pueden tener un sistema de defensa.");
        }        
    }//GEN-LAST:event_addDefenceButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        addDefences();
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDefenceButton;
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane defencesPanel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField maxCargoField;
    private javax.swing.JLabel maxCargoLabel;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

}
