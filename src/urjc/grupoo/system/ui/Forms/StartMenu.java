package urjc.grupoo.system.ui.Forms;

import urjc.grupoo.system.ui.SystemSession;

/**
 *
 * @author Gonzalo Ortega
 */
public class StartMenu extends javax.swing.JPanel {
    
    private final SystemSession session;
    
    /**
     * Creates new form NewJPanel
     */
    public StartMenu(SystemSession session) {
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

        clientLogin = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        crateClient = new javax.swing.JButton();
        crateAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(50, 50, 50));

        clientLogin.setText("Iniciar sesión de Cliente");
        clientLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientLoginActionPerformed(evt);
            }
        });

        adminLogin.setText("Iniciar sesión de Admisistrador");

        crateClient.setText("Crear cuenta de Cliente");
        crateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crateClientActionPerformed(evt);
            }
        });

        crateAdmin.setText("Crear cuenta de Administrador");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(crateClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crateAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(clientLogin)
                .addGap(18, 18, 18)
                .addComponent(adminLogin)
                .addGap(18, 18, 18)
                .addComponent(crateClient)
                .addGap(18, 18, 18)
                .addComponent(crateAdmin)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clientLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientLoginActionPerformed
        setVisible(false);
        session.getController().login();
    }//GEN-LAST:event_clientLoginActionPerformed

    private void crateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crateClientActionPerformed
        setVisible(false);
        session.getController().createClient();
    }//GEN-LAST:event_crateClientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLogin;
    private javax.swing.JButton clientLogin;
    private javax.swing.JButton crateAdmin;
    private javax.swing.JButton crateClient;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
