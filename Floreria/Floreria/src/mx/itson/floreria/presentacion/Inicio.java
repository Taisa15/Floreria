/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.floreria.presentacion;

import java.awt.Color;

/**
 *
 * @author ovalo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.black);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmpresa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnRVenta = new javax.swing.JButton();
        btnReporteVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEmpresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEmpresa.setForeground(new java.awt.Color(0, 0, 204));
        btnEmpresa.setText("Empresa");
        btnEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Menu - Empresa");

        btnProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(153, 51, 255));
        btnProducto.setText("Flores");
        btnProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(0, 204, 0));
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnCatalogo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(255, 0, 0));
        btnCatalogo.setText("Catalogo");
        btnCatalogo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnVenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(0, 51, 51));
        btnVenta.setText("Venta");
        btnVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnRVenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRVenta.setForeground(new java.awt.Color(102, 0, 102));
        btnRVenta.setText("RVenta");
        btnRVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnRVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRVentaActionPerformed(evt);
            }
        });

        btnReporteVentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReporteVentas.setForeground(new java.awt.Color(102, 0, 0));
        btnReporteVentas.setText("Estadistica de ventas");
        btnReporteVentas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        Empresa e = new Empresa();
        e.setVisible(true);
        hide();

    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        FloresListado fl = new FloresListado();
        fl.setVisible(true);
        hide();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        InventarioListado il = new InventarioListado();
        il.setVisible(true);
        hide();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        CatalogoList cl = new CatalogoList();
        cl.setVisible(true);
        hide();
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        ventasForm vf = new ventasForm();
        vf.setVisible(true);
        hide();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnRVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRVentaActionPerformed
        
    }//GEN-LAST:event_btnRVentaActionPerformed

    private void btnReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteVentasActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnRVenta;
    private javax.swing.JButton btnReporteVentas;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
