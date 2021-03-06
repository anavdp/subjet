/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Jet Manager- Integrantes:
 * @author JOSÉ PIRELA
 * @author ANA DE PALMA
 * @author JULIO PAREDES
 * @author RICARDO ABUNASSAR
 * @author JESÚS RANGEL
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.*;
import dao.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.VRegistroEntrevista;
import controlador.CRegistroCliente;

/**
 *
 * @author Vicky
 */
public class CRegistroEntrevista implements ActionListener, KeyListener {

    private  static VRegistroEntrevista vre;
    private static ArrayList<MProyecto> proyectos;
    private static DaoProyecto daoP;
    private DaoCandidato daoCan;
    private DaoEntrevista daoE;
    
    public CRegistroEntrevista(){
        vre= new VRegistroEntrevista();
        vre.setVisible(true);	
        vre.agregarListener(this);
        proyectos= new ArrayList<>();
        daoP=new DaoProyecto();
        daoCan= new DaoCandidato();
        daoE= new DaoEntrevista();
        cargarCandidatos();
        cargarProyectos();
   
        
  //Agregar listener al cuadro de texto del rif
  
   
    vre.getTxtSalOfer().addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e) {
                soloNumeros(e);
            }
    });
    
        vre.getTxtSalPret().addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e) {
                soloNumeros(e);
            }
    });
      
    }
    public static void cargarProyectos(){
        ResultSet rs;
        String id,titulo;
        MProyecto proy;
        try{
        rs= daoP.consultarProyectos();
        while(rs.next()){
            id=rs.getString("ProyId");
            titulo=rs.getString("ProyTitulo");
            proy= new MProyecto(id,titulo);
            proyectos.add(proy);
            vre.getCmbTitProy().addItem(titulo);
        }
         rs.close();
        }catch(Exception e){}
       
    }
       //Limpar los campos del formulario
    
    public void agregarEntrevista(){
        if(vre.getCmbRif().getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione o agregue un candidato");
            return;
        }
        if(vre.getTxtSalOfer().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor introfuzca el salario ofertado");
            return;
        
        }
        if(vre.getCmbCargoAsp().getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione el cargo aspirado");
            return;
        }
        if(vre.getCmbTipo().getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione el tipo de entrevista");
            return;
        }
        if(vre.getDTPFechaEntrevista().getDate().equals(null)){
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha");
            return;
        }
        if(vre.getCmbTitProy().getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un proyecto");
            return;
        }
            int i= vre.getCmbTitProy().getSelectedIndex()-1;
            MProyecto p= proyectos.get(i);
            String rif= vre.getCmbRif().getSelectedItem().toString();
            if(daoE.buscarEntrevista(rif, p.getProyId())){
                JOptionPane.showMessageDialog(null, "Error: Este candidato ya realizo esta entrevista");
                return;
            }
            
           MEntrevista ent= new MEntrevista();
           ent.setEntCargoAsp(vre.getCmbCargoAsp().getSelectedItem().toString());
           ent.setEntEntrevistador(vre.getTxtEntrevistador().getText());
           ent.setEntFecha(vre.getDTPFechaEntrevista().getDate());
           ent.setEntIDCandidato(rif);
           ent.setEntIdProy(p.getProyId());
           ent.setEntObservaciones(vre.getTxtObservaciones().getText());
           ent.setEntSalOfer(Float.valueOf(vre.getTxtSalOfer().getText()));
           ent.setEntTipo(vre.getCmbTipo().getSelectedIndex());
           ent.setSalPret(Float.valueOf(vre.getTxtSalPret().getText()));
          if(daoE.insertarEntrevista(ent)){
              JOptionPane.showMessageDialog(null, "Entrevista Registrada con Exito");
              Limpiar();
          }
           
            
        
        
        
    }
    
    
    public void buscarCandidato(){
        
        String rif= vre.getCmbRif().getSelectedItem().toString();
        ResultSet rs;
        String nom;
        if(rif.equals("...")){
           return;}
            try {
                rs= daoCan.BuscarCandidato(rif);
                if(rs.next()){
                    nom= rs.getString("CanNombres")+" "+ rs.getString("CanApellidos");
                    vre.getTxtNomCandidato().setText(nom);
                }
                rs.close();
                }
             catch (SQLException ex) {
                Logger.getLogger(CRegistroEntrevista.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    public void cargarCandidatos(){
        ResultSet rs;
       
        try {
            rs= daoCan.ConsultarCandidatos();
            while(rs.next()){
                vre.getCmbRif().addItem(rs.getString("CanRif"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRegistroEntrevista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Limpiar(){
    
       vre.getTxtNomCandidato().setText("");
       vre.getCmbRif().setSelectedIndex(0);
       vre.getBtnBuscar().setEnabled(true);
       vre.getCmbTitProy().setSelectedItem("...");
       vre.getCmbCargoAsp().setSelectedIndex(0);
       vre.getTxtSalPret().setText("");
       vre.getTxtSalOfer().setText("");
       vre.getDTPFechaEntrevista().setCalendar(null);
       vre.getCmbTipo().setSelectedIndex(0);
       vre.getTxtEntrevistador().setText("");
       vre.getTxtObservaciones().setText("");
       
   }
    public void soloNumeros(KeyEvent e){
        
        char tecla= e.getKeyChar();
        
        if (Character.isLetter(tecla)){
            e.consume();  }
       
    }
   
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
       
    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource().equals(vre.getBtnSalir())){
            vre.dispose();
        }
        if(e.getSource().equals(vre.getBtnCancelar())){
            this.Limpiar();
        }
        if(e.getSource().equals(vre.getCmbRif())){
            buscarCandidato();
        }
        if(e.getSource().equals(vre.getBtnBuscar())){
            new CRegistroCandidato();
        }
        if(e.getSource().equals(vre.getBtnRegistrar())){
            agregarEntrevista();
        }
    }
    
}
