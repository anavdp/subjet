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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Vicky
 */
public class VConsultaEntrevista extends javax.swing.JFrame {

    /**
     * Creates new form VConsultaEntrevista
     */
    public VConsultaEntrevista() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelCand = new javax.swing.JPanel();
        cmbCandidato = new javax.swing.JComboBox<>();
        panelProyecto = new javax.swing.JPanel();
        cmbProyecto = new javax.swing.JComboBox<>();
        panelFecha = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        radCandidato = new javax.swing.JRadioButton();
        radProy = new javax.swing.JRadioButton();
        radFecha = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jpanEncabezado1 = new javax.swing.JPanel();
        lblRegistrarCandidato1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JetManager- Consultar Entrevistas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        cmbCandidato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbCandidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        javax.swing.GroupLayout panelCandLayout = new javax.swing.GroupLayout(panelCand);
        panelCand.setLayout(panelCandLayout);
        panelCandLayout.setHorizontalGroup(
            panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCandLayout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addComponent(cmbCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
        );
        panelCandLayout.setVerticalGroup(
            panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
            .addGroup(panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCandLayout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(cmbCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );

        jPanel1.add(panelCand, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 190, 80));
        panelCand.setVisible(false);

        panelProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        cmbProyecto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        javax.swing.GroupLayout panelProyectoLayout = new javax.swing.GroupLayout(panelProyecto);
        panelProyecto.setLayout(panelProyectoLayout);
        panelProyectoLayout.setHorizontalGroup(
            panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelProyectoLayout.createSequentialGroup()
                    .addGap(0, 34, Short.MAX_VALUE)
                    .addComponent(cmbProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        panelProyectoLayout.setVerticalGroup(
            panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
            .addGroup(panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelProyectoLayout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(cmbProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );

        jPanel1.add(panelProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 190, 80));
        panelProyecto.setVisible(false);

        panelFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        jDateChooser1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jDateChooser2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Desde");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Hasta");

        javax.swing.GroupLayout panelFechaLayout = new javax.swing.GroupLayout(panelFecha);
        panelFecha.setLayout(panelFechaLayout);
        panelFechaLayout.setHorizontalGroup(
            panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFechaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFechaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelFechaLayout.setVerticalGroup(
            panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
                    .addGroup(panelFechaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 80));
        panelFecha.setVisible(false);

        tabla.setBackground(new java.awt.Color(102, 102, 102));
        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        tabla.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabla.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 660, 300));

        radCandidato.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(radCandidato);
        radCandidato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        radCandidato.setForeground(new java.awt.Color(255, 255, 255));
        radCandidato.setText("Candidato");
        radCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCandidatoActionPerformed(evt);
            }
        });
        jPanel1.add(radCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        radProy.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(radProy);
        radProy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        radProy.setForeground(new java.awt.Color(255, 255, 255));
        radProy.setText("Proyecto");
        jPanel1.add(radProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        radFecha.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(radFecha);
        radFecha.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        radFecha.setForeground(new java.awt.Color(255, 255, 255));
        radFecha.setText("Rango de Fecha");
        jPanel1.add(radFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 153, 51));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, -1));

        btnConsultar.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 600));

        jpanEncabezado1.setBackground(new java.awt.Color(255, 153, 51));
        jpanEncabezado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarCandidato1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato1.setText("CONSULTAR ENTREVISTAS");
        jpanEncabezado1.add(lblRegistrarCandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        getContentPane().add(jpanEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCandidatoActionPerformed

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
            java.util.logging.Logger.getLogger(VConsultaEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VConsultaEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VConsultaEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VConsultaEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VConsultaEntrevista().setVisible(true);
            }
        });
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(JButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JComboBox<String> getCmbCandidato() {
        return cmbCandidato;
    }

    public void setCmbCandidato(JComboBox<String> cmbCandidato) {
        this.cmbCandidato = cmbCandidato;
    }

    public JComboBox<String> getCmbProyecto() {
        return cmbProyecto;
    }

    public void setCmbProyecto(JComboBox<String> cmbProyecto) {
        this.cmbProyecto = cmbProyecto;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JDateChooser getjDateChooser2() {
        return jDateChooser2;
    }

    public void setjDateChooser2(JDateChooser jDateChooser2) {
        this.jDateChooser2 = jDateChooser2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return tabla;
    }

    public void setjTable1(JTable jTable1) {
        this.tabla = jTable1;
    }

    public JRadioButton getRadCandidato() {
        return radCandidato;
    }

    public JPanel getPanelCand() {
        return panelCand;
    }

    public JPanel getPanelFecha() {
        return panelFecha;
    }

    public JPanel getPanelProyecto() {
        return panelProyecto;
    }
    

    public void setRadCandidato(JRadioButton radCandidato) {
        this.radCandidato = radCandidato;
    }

    public JRadioButton getRadFecha() {
        return radFecha;
    }

    public void setRadFecha(JRadioButton radFecha) {
        this.radFecha = radFecha;
    }

    public JRadioButton getRadProy() {
        return radProy;
    }

    public void setRadProy(JRadioButton radProy) {
        this.radProy = radProy;
    }

    public JTable getTabla() {
        return tabla;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCandidato;
    private javax.swing.JComboBox<String> cmbProyecto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanEncabezado1;
    private javax.swing.JLabel lblRegistrarCandidato1;
    private javax.swing.JPanel panelCand;
    private javax.swing.JPanel panelFecha;
    private javax.swing.JPanel panelProyecto;
    private javax.swing.JRadioButton radCandidato;
    private javax.swing.JRadioButton radFecha;
    private javax.swing.JRadioButton radProy;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void agregarListener(ActionListener accion){
        this.btnConsultar.addActionListener(accion);
        this.btnSalir.addActionListener(accion);
        this.getRadProy().addActionListener(accion);
        this.getRadFecha().addActionListener(accion);
        this.getRadCandidato().addActionListener(accion);
                
    }
}
