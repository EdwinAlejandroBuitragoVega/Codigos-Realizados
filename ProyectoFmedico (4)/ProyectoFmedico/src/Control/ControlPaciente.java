/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ControlPaciente implements ActionListener {
    ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private final Paciente objPaciente;
    private final VentanaPost ventanaPaceinte;
    private final VentanaPos ventanaFinal;
   

    public ControlPaciente(Paciente objPaciente, VentanaPost ventanaPaceinte, VentanaPos ventanaFinal) {
        this.objPaciente = objPaciente;
        this.ventanaPaceinte = ventanaPaceinte;
        this.ventanaFinal = ventanaFinal;
  

    }

    public ControlPaciente() {
        this.objPaciente = new Paciente();
        this.ventanaPaceinte = new VentanaPost();
        this.ventanaFinal = new VentanaPos();
       

  
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        if (this.ventanaPaceinte.getJButtonRegistrar() == ex.getSource()) {
            
            if (!(ventanaPaceinte.getJtxfNombre().getText().equals("") || ventanaPaceinte.getJtxaRecomend().getText().equals("") || ventanaPaceinte.getJtxtProced().getText().equals(""))) {
                try {
                    objPaciente.setCc(Long.parseLong(ventanaPaceinte.getJtxtId().getText()));
                } catch (NumberFormatException q) {
                    JOptionPane.showMessageDialog(null, "El dato ID debe ser númerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    objPaciente.setEdad(Integer.parseInt(ventanaPaceinte.getJtxtEdad().getText()));
                } catch (NumberFormatException q) {
                    JOptionPane.showMessageDialog(null, "El dato Edad debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    objPaciente.setTel(Long.parseLong(ventanaPaceinte.getJtxttelefono().getText()));
                } catch (NumberFormatException q) {
                    JOptionPane.showMessageDialog(null, "El dato Telefono debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                objPaciente.setNombre(ventanaPaceinte.getJtxfNombre().getText());
                objPaciente.setTipoId(ventanaPaceinte.getjComboTipoID().getSelectedItem().toString());
                objPaciente.setEps(ventanaPaceinte.getjComboEps().getSelectedItem().toString());
                objPaciente.setCategoria(ventanaPaceinte.getjComboCateg().getSelectedItem().toString());
                objPaciente.setRecomendacion(ventanaPaceinte.getJtxaRecomend().getText());
                //ventanaFinal.getjTextArea1().append(objPaciente.toString());
                //ventanaFinal.setVisible(true);
                
                 ventanaFinal.getjTextArea1().append(""
                        + objPaciente.getNombre() + ""
                        + "\n" + objPaciente.getTipoId() + ""
                        + "\n" + objPaciente.getCc() + ""
                        + "\n" + objPaciente.getEdad() + ""
                        + "\n" + objPaciente.getTel() + ""
                        + "\n" + objPaciente.getCategoria()+ "" 
                        + "\n" + objPaciente.getRecomendacion()); 
                        
               listaPacientes.add(objPaciente);
                do {
                  ventanaFinal.setVisible(true);
                } while (this.ventanaFinal.getJbuttonVolver() == ex.getSource());
            }

        }

    }

}
