/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Expocicion;
import model.GestorBD;

/**
 *
 * @author Usuario
 */
public class ListadoExposicion extends javax.swing.JFrame {

    GestorBD db = new GestorBD();

    /**
     * Creates new form ListadoExposicion
     */
    public ListadoExposicion() {
        initComponents();
        cargarlisata();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaexpo = new javax.swing.JTable();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        listaexpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listaexpo.setAlignmentX(0.0F);
        listaexpo.setAlignmentY(0.0F);
        listaexpo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        listaexpo.setColumnSelectionAllowed(true);
        listaexpo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaexpo);
        listaexpo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (listaexpo.getColumnModel().getColumnCount() > 0) {
            listaexpo.getColumnModel().getColumn(0).setPreferredWidth(112);
            listaexpo.getColumnModel().getColumn(1).setPreferredWidth(112);
            listaexpo.getColumnModel().getColumn(2).setPreferredWidth(112);
            listaexpo.getColumnModel().getColumn(3).setPreferredWidth(112);
        }

        volver.setText("Volver");
        volver.setAlignmentY(0.0F);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA EXPOSICIONES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/expo.jpg"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volver)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoExposicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaexpo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    private void cargarlisata() {
        ArrayList<Expocicion> lista = db.mostrarExpocicion();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = new DefaultTableModel();
        String[] titulos = new String[]{"idExpo","Nombre", "visita", "FechaInicio", "FechaFin", "Horario"};
        dtm.setColumnIdentifiers(titulos);
        listaexpo.setModel(dtm);
        // idGasto,descripcion,importe,nombre,maximoAutorizado
        for (Expocicion lg : lista) {
            Object[] row = {lg.getId_expocicion(),lg.getNombre() ,lg.getVisita(), lg.getFechaInicio(), lg.getFechaFin(), lg.getHorario()};
            dtm.addRow(row);
        }
        listaexpo.setModel(dtm);

    }
}
