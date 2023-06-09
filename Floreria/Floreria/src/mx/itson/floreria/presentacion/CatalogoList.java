/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.floreria.presentacion;

import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mx.itson.floreria.entidades.Flores;
import mx.itson.floreria.persistencia.FloresDAO;


/**
 *
 * @author Axel G. valverde
 */
public class CatalogoList extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    int id = 0;
    public CatalogoList() {
        initComponents();
        this.id = id;
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalogo = new javax.swing.JTable();
        lblLista = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnbInicio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblCatalogo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblCatalogo.setForeground(new java.awt.Color(255, 0, 0));
        tblCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblCatalogo);

        lblLista.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblLista.setForeground(new java.awt.Color(51, 255, 51));
        lblLista.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Catalogo");

        mnbInicio.setBackground(new java.awt.Color(255, 255, 255));
        mnbInicio.setForeground(new java.awt.Color(0, 204, 0));
        mnbInicio.setText("Inicio");
        mnbInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnbInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnbInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnbInicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblLista, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        List<Flores> flores = FloresDAO.obtenerTodos();
        modelo = (DefaultTableModel) tblCatalogo.getModel();
        modelo.setRowCount(0);

        for (Flores f : flores) {
            modelo.addRow(new Object[]{
                
                f.getNombre(),
                f.getPrecio()
                    

            });
            
            int totalFlores = modelo.getRowCount();     
            lblLista.setText("Total de flores registradas: " + totalFlores);
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void mnbInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnbInicioMouseClicked
        Inicio i = new Inicio();
        i.setVisible(true);
        hide();
    }//GEN-LAST:event_mnbInicioMouseClicked

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
            java.util.logging.Logger.getLogger(CatalogoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLista;
    private javax.swing.JMenu mnbInicio;
    private javax.swing.JTable tblCatalogo;
    // End of variables declaration//GEN-END:variables
}
