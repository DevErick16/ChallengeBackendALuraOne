/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.oracle.vistas;

/**
 *
 * @author Administrator
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCambioMoneda = new javax.swing.JButton();
        btnCambioTemperatura = new javax.swing.JButton();
        btnCambioLongitud = new javax.swing.JButton();
        btnCambioPeso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oracle-Alura Challenge Backend");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(400, 220));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 39, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel2.setBackground(new java.awt.Color(54, 71, 94));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido al challenge Alura!");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.oracle.images/svg.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.oracle.images/logo (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnCambioMoneda.setBackground(new java.awt.Color(54, 71, 94));
        btnCambioMoneda.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCambioMoneda.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.oracle.images/tipo-de-cambio (1).png"))); // NOI18N
        btnCambioMoneda.setText("Conversor de moneda");
        btnCambioMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambioMoneda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambioMoneda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambioMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioMonedaActionPerformed(evt);
            }
        });

        btnCambioTemperatura.setBackground(new java.awt.Color(54, 71, 94));
        btnCambioTemperatura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCambioTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.oracle.images/cambio-climatico.png"))); // NOI18N
        btnCambioTemperatura.setText("Conversor de temperatura");
        btnCambioTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambioTemperatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambioTemperatura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambioTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioTemperaturaActionPerformed(evt);
            }
        });

        btnCambioLongitud.setBackground(new java.awt.Color(54, 71, 94));
        btnCambioLongitud.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCambioLongitud.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioLongitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.oracle.images/medida.png"))); // NOI18N
        btnCambioLongitud.setText("Conversor de longitudes");
        btnCambioLongitud.setToolTipText("");
        btnCambioLongitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambioLongitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambioLongitud.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambioLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioLongitudActionPerformed(evt);
            }
        });

        btnCambioPeso.setBackground(new java.awt.Color(54, 71, 94));
        btnCambioPeso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCambioPeso.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.oracle.images/peso.png"))); // NOI18N
        btnCambioPeso.setText("Conversor de peso");
        btnCambioPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambioPeso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambioPeso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambioPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioPesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCambioMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambioLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCambioPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambioTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambioMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambioTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCambioLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambioPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambioPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioPesoActionPerformed
       FormCambioPeso intPeso = new FormCambioPeso();
       intPeso.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnCambioPesoActionPerformed

    private void btnCambioMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioMonedaActionPerformed
            FormCambioMoneda intMoneda = new FormCambioMoneda();
            intMoneda.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnCambioMonedaActionPerformed

    private void btnCambioTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioTemperaturaActionPerformed
        FormCambioTemperatura intTemperatura= new FormCambioTemperatura();
        intTemperatura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCambioTemperaturaActionPerformed

    private void btnCambioLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioLongitudActionPerformed
       FormCambioLongitud intLongitud = new FormCambioLongitud();
       intLongitud.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnCambioLongitudActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambioLongitud;
    private javax.swing.JButton btnCambioMoneda;
    private javax.swing.JButton btnCambioPeso;
    private javax.swing.JButton btnCambioTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
