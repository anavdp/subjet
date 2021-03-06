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
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Vicky
 */
public class VRegistroCliente extends javax.swing.JFrame {

    /**
     * Creates new form VRegistroCliente
     */
    public VRegistroCliente() {
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

        tabCliente = new javax.swing.JTabbedPane();
        panCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtRifCliente = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        txtTelfCliente = new javax.swing.JTextField();
        txtNomCliente = new javax.swing.JTextField();
        cmbPais = new javax.swing.JComboBox<>();
        txtCodTelf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbRif = new javax.swing.JComboBox<>();
        panProy = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbIdioma = new javax.swing.JComboBox<>();
        txtTitProy = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescProy = new javax.swing.JTextArea();
        DTPFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtProyId = new javax.swing.JTextField();
        DTPFechaIni = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        jpanEncabezado1 = new javax.swing.JPanel();
        lblRegistrarCandidato1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JetManager- Registrar Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        panCliente.setBackground(new java.awt.Color(102, 102, 102));
        panCliente.setForeground(new java.awt.Color(255, 255, 255));
        panCliente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        panCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(txtCorreo);
        jLabel1.setText("Rif");
        panCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo");
        panCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre o Razón Social");
        panCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección");
        panCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCorreo.setName("txtCorreo"); // NOI18N
        panCliente.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 350, 30));

        txtCiudad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCiudad.setName("txtRifCliente"); // NOI18N
        panCliente.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 110, 30));

        txtRifCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtRifCliente.setName("txtRifCliente"); // NOI18N
        panCliente.add(txtRifCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 200, 30));

        btnSiguiente.setBackground(new java.awt.Color(255, 153, 51));
        btnSiguiente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        panCliente.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono");
        panCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("País");
        panCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ciudad");
        panCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        panCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 350, -1));

        txtTelfCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panCliente.add(txtTelfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 230, 30));

        txtNomCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNomCliente.setName("txtRifCliente"); // NOI18N
        panCliente.add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 30));

        cmbPais.setEditable(true);
        cmbPais.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cmbPais.setMaximumRowCount(10);
        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Anguilla", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bahréin", "Bangladesh", "Barbados", "Belarús", "Bélgica", "Belice", "Benín", "Birmania", "Bolivia", "Bosnia-Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Congo", "Congo, República Democrática del", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea Ecuatorial", "Guinea-Bissau", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajstán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia", "Madagascar", "Malasia", "Malawi", "Maldivas", "Malí", "Malta", "Marruecos", "Marshall", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Qatar", "Reino Unido", "República Centroafricana", "República Checa", "República Dominicana", "Ruanda", "Rumania", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santa Sede (Vaticano)", "Santo Tomé y Príncipe", "Senegal", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Suecia", "Suiza", "Surinam", "Tailandia", "Taiwán", "Tanzania", "Tayikistán", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Yugoslavia", "Zambia", "Zimbabue" }));
        cmbPais.setFocusable(false);
        panCliente.add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 170, 30));

        txtCodTelf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panCliente.add(txtCodTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("-");
        panCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        cmbRif.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cmbRif.setMaximumRowCount(3);
        cmbRif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "E", "P" }));
        cmbRif.setFocusable(false);
        panCliente.add(cmbRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        tabCliente.addTab("Cliente", panCliente);

        panProy.setBackground(new java.awt.Color(102, 102, 102));
        panProy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panProy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        panProy.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 90, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Título");
        panProy.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Descripción");
        panProy.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de Inicio");
        panProy.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Final");
        panProy.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Idioma");
        panProy.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        cmbIdioma.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Inglés", "Español", "Otro.." }));
        panProy.add(cmbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 100, 30));

        txtTitProy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panProy.add(txtTitProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 380, 30));

        txtDescProy.setColumns(20);
        txtDescProy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDescProy.setRows(5);
        jScrollPane2.setViewportView(txtDescProy);

        panProy.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 380, -1));

        DTPFechaFinal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        panProy.add(DTPFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 140, 30));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        panProy.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Codigo");
        panProy.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        txtProyId.setEditable(false);
        txtProyId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtProyId.setName("txtRifCliente"); // NOI18N
        panProy.add(txtProyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 250, 30));

        DTPFechaIni.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        panProy.add(DTPFechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 140, 30));

        tabCliente.addTab("Proyecto", panProy);
        panProy.getAccessibleContext().setAccessibleName("tabProyecto");

        getContentPane().add(tabCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 840, 483));
        tabCliente.getAccessibleContext().setAccessibleName("tabPane");

        btnCancelar.setBackground(new java.awt.Color(255, 153, 51));
        btnCancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 90, -1));

        jpanEncabezado1.setBackground(new java.awt.Color(255, 153, 51));
        jpanEncabezado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarCandidato1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblRegistrarCandidato1.setText("REGISTRAR CLIENTES");
        jpanEncabezado1.add(lblRegistrarCandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        getContentPane().add(jpanEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 80));

        btnSalir.setBackground(new java.awt.Color(255, 153, 51));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRegistroCliente().setVisible(true);
            }
        });
    }

    public JDateChooser getDTPFechaFinal() {
        return DTPFechaFinal;
    }

    public JComboBox<String> getCmbRif() {
        return cmbRif;
    }

    public void setDTPFechaFinal(JDateChooser DTPFechaFinal) {
        this.DTPFechaFinal = DTPFechaFinal;
    }

    public JDateChooser getDTPFechaIni() {
        return DTPFechaIni;
    }

    public void setDTPFechaIni(JDateChooser DTPFechaIni) {
        this.DTPFechaIni = DTPFechaIni;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }


    public JButton getBtnSiguiente() {
        return btnSiguiente;
    }

    public void setBtnSiguiente(JButton btnSiguiente) {
        this.btnSiguiente = btnSiguiente;
    }

    public JComboBox<String> getCmbIdioma() {
        return cmbIdioma;
    }

    public void setCmbIdioma(JComboBox<String> cmbIdioma) {
        this.cmbIdioma = cmbIdioma;
    }

    public JTextField getTxtCiudad() {
        return txtCiudad;
    }

    public void setTxtCiudad(JTextField txtCiudad) {
        this.txtCiudad = txtCiudad;
    }

 

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextArea getTxtDescProy() {
        return txtDescProy;
    }

    public void setTxtDescProy(JTextArea txtDescProy) {
        this.txtDescProy = txtDescProy;
    }

    public JTextArea getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextArea txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNomCliente() {
        return txtNomCliente;
    }

    public void setTxtNomCliente(JTextField txtNomCliente) {
        this.txtNomCliente = txtNomCliente;
    }

    public JComboBox<String> getCmbPais() {
        return cmbPais;
    }

    public JTextField getTxtProyId() {
        return txtProyId;
    }



  
    public JTextField getTxtRifCliente() {
        return txtRifCliente;
    }

    public void setTxtRifCliente(JTextField txtRifCliente) {
        this.txtRifCliente = txtRifCliente;
    }

    public JTextField getTxtTelfCliente() {
        return txtTelfCliente;
    }

    public void setTxtTelfCliente(JTextField txtTelfCliente) {
        this.txtTelfCliente = txtTelfCliente;
    }

    public JTextField getTxtTitProy() {
        return txtTitProy;
    }

    public void setTxtTitProy(JTextField txtTitProy) {
        this.txtTitProy = txtTitProy;
    }

    public JPanel getPanCliente() {
        return panCliente;
    }

    public JPanel getPanProy() {
        return panProy;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
    

    public JTabbedPane getTabCliente() {
        return tabCliente;
    }
    
    

    /*public JButton getBtnBuscar() {
        return btnBuscar;
    }
    */

    public JTextField getTxtCodTelf() {
        return txtCodTelf;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DTPFechaFinal;
    private com.toedter.calendar.JDateChooser DTPFechaIni;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbRif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanEncabezado1;
    private javax.swing.JLabel lblRegistrarCandidato1;
    private javax.swing.JPanel panCliente;
    private javax.swing.JPanel panProy;
    private javax.swing.JTabbedPane tabCliente;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodTelf;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDescProy;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtProyId;
    private javax.swing.JTextField txtRifCliente;
    private javax.swing.JTextField txtTelfCliente;
    private javax.swing.JTextField txtTitProy;
    // End of variables declaration//GEN-END:variables

public void agregarListener(ActionListener accion){
    this.btnAgregar.addActionListener(accion);
    this.btnCancelar.addActionListener(accion);
    this.btnSiguiente.addActionListener(accion);
    this.txtRifCliente.addActionListener(accion);
    this.btnSalir.addActionListener(accion);
  
    
}
public void agregarFocusListener(FocusListener foco){
    this.txtRifCliente.addFocusListener(foco);
    
}

}
