/**
 *Jet Manager- Integrantes:
 * @author JOSÉ PIRELA
 * @author ANA DE PALMA
 * @author JULIO PAREDES
 * @author RICARDO ABUNASSAR
 * @author JESÚS RANGEL
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ABUNASSAR PENARANDA
 */
public class VConsultaCandidatos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarRecordUtilidad
     */
    public VConsultaCandidatos() {
        initComponents();
    }

    public JScrollPane getScrollpanReporteProyecto() {
        return scrollpanReporteProyecto;
    }

    public JTable getTableReporteNombres() {
        return tableReporteNombres;
    }

    public JButton getBtnConsultarNombres() {
        return btnConsultarNombres;
    }

    public JButton getBtnConsultarPalabrasClave() {
        return btnConsultarPalabrasClave;
    }

    public JLabel getLblApellidos() {
        return lblApellidos;
    }

    public JLabel getLblNombres() {
        return lblNombres;
    }

    public JLabel getLblPalabrasClave() {
        return lblPalabrasClave;
    }
    
    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public JRadioButton getRadNombres() {
        return radNombres;
    }

    public JRadioButton getRadPalabrasClave() {
        return radPalabrasClave;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public JTextField getTxtPalabrasClave() {
        return txtPalabrasClave;
    }

    public ButtonGroup getBtngroupFiltrarPor() {
        return btngroupFiltrarPor;
    }

    public JPanel getPanConsultarUtilidad() {
        return panConsultarCandidatos;
    }
    
     public void Agregar_Listener(ActionListener ac)
   {
   
       this.radNombres.addActionListener(ac);
       this.radPalabrasClave.addActionListener(ac);
       this.btnConsultarNombres.addActionListener(ac);
       this.btnConsultarPalabrasClave.addActionListener(ac);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupFiltrarPor = new javax.swing.ButtonGroup();
        panConsultarCandidatos = new javax.swing.JPanel();
        lblFiltrarPor = new javax.swing.JLabel();
        radNombres = new javax.swing.JRadioButton();
        radPalabrasClave = new javax.swing.JRadioButton();
        btnConsultarNombres = new javax.swing.JButton();
        lblNombres = new javax.swing.JLabel();
        btnConsultarPalabrasClave = new javax.swing.JButton();
        lblApellidos = new javax.swing.JLabel();
        txtPalabrasClave = new javax.swing.JTextField();
        lblPalabrasClave = new javax.swing.JLabel();
        scrollpanReporteProyecto = new javax.swing.JScrollPane();
        tableReporteNombres = new javax.swing.JTable();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jpanEncabezado1 = new javax.swing.JPanel();
        lblRegistrarCandidato1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panConsultarCandidatos.setBackground(new java.awt.Color(102, 102, 102));
        panConsultarCandidatos.setForeground(new java.awt.Color(102, 102, 102));
        panConsultarCandidatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltrarPor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFiltrarPor.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltrarPor.setText("Filtrar por:");
        panConsultarCandidatos.add(lblFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        radNombres.setBackground(new java.awt.Color(102, 102, 102));
        btngroupFiltrarPor.add(radNombres);
        radNombres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radNombres.setForeground(new java.awt.Color(255, 255, 255));
        radNombres.setText("Nombres y/o apellidos");
        radNombres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radNombresStateChanged(evt);
            }
        });
        radNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radNombresMouseClicked(evt);
            }
        });
        radNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNombresActionPerformed(evt);
            }
        });
        //radiobtnProyecto.setSelected(true);
        panConsultarCandidatos.add(radNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        radPalabrasClave.setBackground(new java.awt.Color(102, 102, 102));
        btngroupFiltrarPor.add(radPalabrasClave);
        radPalabrasClave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        radPalabrasClave.setForeground(new java.awt.Color(255, 255, 255));
        radPalabrasClave.setText("Palabras clave");
        radPalabrasClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radPalabrasClaveMouseClicked(evt);
            }
        });
        panConsultarCandidatos.add(radPalabrasClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btnConsultarNombres.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarNombres.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConsultarNombres.setText("Consultar");
        btnConsultarNombres.setVisible(false);
        btnConsultarNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarNombresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarNombresMouseEntered(evt);
            }
        });
        btnConsultarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNombresActionPerformed(evt);
            }
        });
        panConsultarCandidatos.add(btnConsultarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblNombres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres:");
        lblNombres.setVisible(false);
        panConsultarCandidatos.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        btnConsultarPalabrasClave.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarPalabrasClave.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConsultarPalabrasClave.setText("Consultar");
        btnConsultarPalabrasClave.setVisible(false);
        btnConsultarPalabrasClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarPalabrasClaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarPalabrasClaveMouseEntered(evt);
            }
        });
        btnConsultarPalabrasClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPalabrasClaveActionPerformed(evt);
            }
        });
        panConsultarCandidatos.add(btnConsultarPalabrasClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos:");
        panConsultarCandidatos.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 20));
        lblApellidos.setVisible(false);

        txtPalabrasClave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPalabrasClave.setVisible(false);
        panConsultarCandidatos.add(txtPalabrasClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 220, -1));

        lblPalabrasClave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPalabrasClave.setForeground(new java.awt.Color(255, 255, 255));
        lblPalabrasClave.setText("Palabras clave:");
        lblPalabrasClave.setVisible(false);
        panConsultarCandidatos.add(lblPalabrasClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 20));

        scrollpanReporteProyecto.setVisible(false);
        scrollpanReporteProyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tableReporteNombres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableReporteNombres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Proyecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpanReporteProyecto.setViewportView(tableReporteNombres);

        panConsultarCandidatos.add(scrollpanReporteProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 990, 130));

        txtNombres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPalabrasClave.setVisible(false);
        panConsultarCandidatos.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 220, -1));

        txtApellidos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPalabrasClave.setVisible(false);
        panConsultarCandidatos.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 220, -1));

        getContentPane().add(panConsultarCandidatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1019, 310));

        jpanEncabezado1.setBackground(new java.awt.Color(255, 153, 51));
        jpanEncabezado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarCandidato1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato1.setText("CONSULTAR CANDIDATOS");
        jpanEncabezado1.add(lblRegistrarCandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        getContentPane().add(jpanEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1019, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radNombresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radNombresStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_radNombresStateChanged

    private void radNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radNombresMouseClicked
        // TODO add your handling code here:

       /* cmbboxProyectoConsultar.setVisible(true);
        btnConsultarProyecto.setVisible(true);
        lblNombreProyectoConsultar.setVisible(true);

       

        lblMesConsultar.setVisible(false);
        cmbboxMesConsultar.setVisible(false);
        btnConsultarMes.setVisible(false);
        lblHorasLaborables.setVisible(false);
        txtHorasLaborables.setVisible(false);
        scrollpaneReporteMes.setVisible(false);
        */
    }//GEN-LAST:event_radNombresMouseClicked

    private void radNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNombresActionPerformed

    private void radPalabrasClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radPalabrasClaveMouseClicked
        // TODO add your handling code here:

       /* cmbboxProyectoConsultar.setVisible(false);
        btnConsultarProyecto.setVisible(false);
        lblNombreProyectoConsultar.setVisible(false);
        scrollpanReporteProyecto.setVisible(false);

        

        lblMesConsultar.setVisible(true);
        cmbboxMesConsultar.setVisible(true);
        btnConsultarMes.setVisible(true);*/
    }//GEN-LAST:event_radPalabrasClaveMouseClicked

    private void btnConsultarNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarNombresMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnConsultarNombresMouseClicked

    private void btnConsultarNombresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarNombresMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnConsultarNombresMouseEntered

    private void btnConsultarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNombresActionPerformed
        // TODO add your handling code here:
      //  scrollpanReporteProyecto.setVisible(true);
    }//GEN-LAST:event_btnConsultarNombresActionPerformed

    private void btnConsultarPalabrasClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarPalabrasClaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarPalabrasClaveMouseClicked

    private void btnConsultarPalabrasClaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarPalabrasClaveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarPalabrasClaveMouseEntered

    private void btnConsultarPalabrasClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPalabrasClaveActionPerformed
      //  scrollpaneReporteMes.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarPalabrasClaveActionPerformed

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
            java.util.logging.Logger.getLogger(VConsultaCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VConsultaCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VConsultaCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VConsultaCandidatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VConsultaCandidatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarNombres;
    private javax.swing.JButton btnConsultarPalabrasClave;
    private javax.swing.ButtonGroup btngroupFiltrarPor;
    private javax.swing.JPanel jpanEncabezado1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblFiltrarPor;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPalabrasClave;
    private javax.swing.JLabel lblRegistrarCandidato1;
    private javax.swing.JPanel panConsultarCandidatos;
    private javax.swing.JRadioButton radNombres;
    private javax.swing.JRadioButton radPalabrasClave;
    private javax.swing.JScrollPane scrollpanReporteProyecto;
    private javax.swing.JTable tableReporteNombres;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPalabrasClave;
    // End of variables declaration//GEN-END:variables
}
