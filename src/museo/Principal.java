/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import model.GestorBD;
import model.loginPersona;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {
GestorBD g = new GestorBD();
     String nom ="";
     int id=0;
    /**
     * Creates new form Principal
     */
    public Principal(loginPersona p) {
        initComponents();

        id=p.getId();
        vistar(p.getDescripcion());

    }

   public  Principal() {
        initComponents();
       
        
        vistar(g.LoginEmple());
 
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuCargarExposicion = new javax.swing.JMenuItem();
        mnuListaporexpo = new javax.swing.JMenuItem();
        mnuCargaObraenexpo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAgregarObra = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuAgregarRestauracion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnuCargarArtista = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/woman.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Museo Genaro Perez");
        jLabel1.setAlignmentY(0.0F);

        jLabel3.setFont(new java.awt.Font("Harrington", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MUSEO GENARO PEREZ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Exposiciones");

        jMenuItem1.setText("Listado Exposiciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuCargarExposicion.setText("Cargar Exposicion");
        mnuCargarExposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCargarExposicionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCargarExposicion);

        mnuListaporexpo.setText("Lista Por Exposicion");
        mnuListaporexpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaporexpoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuListaporexpo);

        mnuCargaObraenexpo.setText("Carga de Obra en Exposicion");
        mnuCargaObraenexpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCargaObraenexpoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCargaObraenexpo);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Obras");

        mnuAgregarObra.setText("Agregar Obra");
        mnuAgregarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarObraActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAgregarObra);

        jMenuItem2.setText("Listado obras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Restauraciones");

        jMenuItem5.setText("Listado de obras en restauracion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        mnuAgregarRestauracion.setText("Agregar Restauracion");
        mnuAgregarRestauracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarRestauracionActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAgregarRestauracion);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setText("Ticket");

        jMenuItem6.setText("ticket");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setText("Artistas");

        mnuCargarArtista.setText("Cargar Artista");
        mnuCargarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCargarArtistaActionPerformed(evt);
            }
        });
        jMenu6.add(mnuCargarArtista);

        jMenuItem4.setText("Listar Artista");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setText("Cerrar Sesion");

        mnuCerrarSesion.setText("Cerrar Sesion");
        mnuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu5.add(mnuCerrarSesion);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ListadoExposicion l = new ListadoExposicion();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(l.EXIT_ON_CLOSE);
        l.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ListaObras p = new ListaObras();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListaTicket p = new ListaTicket();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Restauraciones r = new Restauraciones();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(r.EXIT_ON_CLOSE);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnuAgregarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarObraActionPerformed
        AgregarObraa r = new AgregarObraa();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(r.EXIT_ON_CLOSE);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuAgregarObraActionPerformed

    private void mnuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarSesionActionPerformed
        Ingreso p = new Ingreso();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
        g.CerraEmple(id);
    }//GEN-LAST:event_mnuCerrarSesionActionPerformed

    private void mnuCargarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCargarArtistaActionPerformed
        AgregarArtista p = new AgregarArtista();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_mnuCargarArtistaActionPerformed

    private void mnuAgregarRestauracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarRestauracionActionPerformed
        AgregarRestauracion p = new AgregarRestauracion();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnuAgregarRestauracionActionPerformed

    private void mnuCargarExposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCargarExposicionActionPerformed

        CargarExposicion p = new CargarExposicion();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_mnuCargarExposicionActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ListadoArtistas p = new ListadoArtistas();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuListaporexpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaporexpoActionPerformed
       
         AgregarObrasPorExpo1 p = new AgregarObrasPorExpo1();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        this.dispose();
        
        
    }//GEN-LAST:event_mnuListaporexpoActionPerformed

    private void mnuCargaObraenexpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCargaObraenexpoActionPerformed
        AgregarObrasPorExpo p = new AgregarObrasPorExpo();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_mnuCargaObraenexpoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuAgregarObra;
    private javax.swing.JMenuItem mnuAgregarRestauracion;
    private javax.swing.JMenuItem mnuCargaObraenexpo;
    private javax.swing.JMenuItem mnuCargarArtista;
    private javax.swing.JMenuItem mnuCargarExposicion;
    private javax.swing.JMenuItem mnuCerrarSesion;
    private javax.swing.JMenuItem mnuListaporexpo;
    // End of variables declaration//GEN-END:variables

    private void vistar(String descripcion) {

        if (descripcion.equals("Administrador")) {

        } else if (descripcion.equals("Recepcionista")) {
            jMenu2.setVisible(false);
            jMenu3.setVisible(false);
            mnuCargarExposicion.setVisible(false);
            jMenu6.setVisible(false);
        } else if (descripcion.equals("Restaurador")) {
            jMenu1.setVisible(false);
            jMenu2.setVisible(false);
            jMenu4.setVisible(false);
            jMenu6.setVisible(false);
        }

    }
}
