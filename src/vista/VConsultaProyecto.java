/**
 *Jet Manager- Integrantes:
 * @author JOSÉ PIRELA
 * @author ANA DE PALMA
 * @author JULIO PAREDES
 * @author RICARDO ABUNASSAR
 * @author JESÚS RANGEL
 */
package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Vicky
 */
public class VConsultaProyecto extends javax.swing.JFrame {

    /**
     * Creates new form VConsultarProyecto
     */
    public VConsultaProyecto() {
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

        jpanEncabezado1 = new javax.swing.JPanel();
        lblRegistrarCandidato1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbIdioma = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescProy = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        cmbTitulo = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        DTPFechaIni = new com.toedter.calendar.JDateChooser();
        DTPFechaFinal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanEncabezado1.setBackground(new java.awt.Color(255, 153, 51));
        jpanEncabezado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarCandidato1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato1.setText("Consultar Proyecto");
        jpanEncabezado1.add(lblRegistrarCandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        getContentPane().add(jpanEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 80));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setBackground(new java.awt.Color(255, 153, 51));
        btnModificar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 90, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cliente");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Descripción");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de Inicio");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Final");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Idioma");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        cmbIdioma.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Inglés", "Español", "Otro.." }));
        cmbIdioma.setEnabled(false);
        jPanel2.add(cmbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, 30));

        txtDescProy.setColumns(20);
        txtDescProy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDescProy.setRows(5);
        txtDescProy.setEnabled(false);
        jScrollPane2.setViewportView(txtDescProy);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 380, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cmbTitulo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        cmbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTituloActionPerformed(evt);
            }
        });
        jPanel2.add(cmbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 370, 30));

        cmbCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel2.add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 230, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Título");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 90, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 153, 51));
        btnCancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 100, 30));

        btnSalir.setBackground(new java.awt.Color(255, 153, 51));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 80, 30));

        DTPFechaIni.setEnabled(false);
        DTPFechaIni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel2.add(DTPFechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 140, 30));

        DTPFechaFinal.setEnabled(false);
        DTPFechaFinal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel2.add(DTPFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 780, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTituloActionPerformed

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
            java.util.logging.Logger.getLogger(VConsultaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VConsultaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VConsultaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VConsultaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VConsultaProyecto().setVisible(true);
            }
        });
    }

    public JDateChooser getDTPFechaFinal() {
        return DTPFechaFinal;
    }

    public JDateChooser getDTPFechaIni() {
        return DTPFechaIni;
    }

    

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JComboBox<String> getCmbCliente() {
        return cmbCliente;
    }

    public JComboBox<String> getCmbIdioma() {
        return cmbIdioma;
    }

    public JComboBox<String> getCmbTitulo() {
        return cmbTitulo;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JPanel getJpanEncabezado1() {
        return jpanEncabezado1;
    }

    public JLabel getLblRegistrarCandidato1() {
        return lblRegistrarCandidato1;
    }

    public JTextArea getTxtDescProy() {
        return txtDescProy;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DTPFechaFinal;
    private com.toedter.calendar.JDateChooser DTPFechaIni;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JComboBox<String> cmbTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanEncabezado1;
    private javax.swing.JLabel lblRegistrarCandidato1;
    private javax.swing.JTextArea txtDescProy;
    // End of variables declaration//GEN-END:variables

public void agregarListener(ActionListener accion){
    
    this.btnCancelar.addActionListener(accion);
    this.btnGuardar.addActionListener(accion);
    this.btnModificar.addActionListener(accion);
    this.btnSalir.addActionListener(accion);
    this.cmbTitulo.addActionListener(accion);
    this.cmbCliente.addActionListener(accion);
}

}
