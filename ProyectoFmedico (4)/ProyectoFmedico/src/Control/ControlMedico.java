/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Medico;
import Vista.VentanaIngresar;
import Vista.VentanaRegistroMedicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControlMedico implements ActionListener {

    ArrayList<Medico> listaMedicos = new ArrayList<>();
    private final Medico objMedico;
    private final VentanaIngresar ventanaRegMedico;
    private final VentanaRegistroMedicos VentanaShowMedico;

    public ControlMedico(Medico objMedico, VentanaIngresar ventanaRegMedico, VentanaRegistroMedicos VentanaShowMedico) {
        this.objMedico = objMedico;
        this.ventanaRegMedico = ventanaRegMedico;
        this.VentanaShowMedico = VentanaShowMedico;
    }

    public String Lista() {
        String s = "";
        for (int i = 0; i < listaMedicos.size(); i++) {
            s = ""
                    + listaMedicos.get(i);
        }
        return s;
    }

    public ControlMedico() {
        this.objMedico = new Medico();
        this.ventanaRegMedico = new VentanaIngresar();
        this.VentanaShowMedico = new VentanaRegistroMedicos();
    }

    @Override
    public void actionPerformed(ActionEvent ex) {

        if (this.ventanaRegMedico.getjButtonAvanzar() == ex.getSource()) {
            if (!(ventanaRegMedico.getjTextNombre().getText().equals("") || ventanaRegMedico.getjTextNombre().getText().equals(""))) {
                try {
                    objMedico.setCc(Long.parseLong(ventanaRegMedico.getjTextID().getText()));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El dato ID debe ser númerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    objMedico.setEdad(Integer.parseInt(ventanaRegMedico.getjTextEdad().getText()));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El dato Edad debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    objMedico.setTel(Long.parseLong(ventanaRegMedico.getjTextTelefono().getText()));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El dato Telefono debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                objMedico.setNombre(ventanaRegMedico.getjTextNombre().getText());
                objMedico.setTipoId(ventanaRegMedico.getjComboBoxTipoId().getSelectedItem().toString());
                objMedico.setEspecialidad(ventanaRegMedico.getjTextEspecialidad().getText());
                VentanaShowMedico.getJtextARespuesta().append(""
                        + objMedico.getNombre() + ""
                        + "\n" + objMedico.getTipoId() + ""
                        + "\n" + objMedico.getCc() + ""
                        + "\n" + objMedico.getEdad() + ""
                        + "\n" + objMedico.getTel() + ""
                        + "\n" + objMedico.getEspecialidad());
                listaMedicos.add(objMedico);
                
                do {
                    VentanaShowMedico.setVisible(true);
                } while (VentanaShowMedico.getJbuttonAvanzar() == ex.getSource());

            }
            // throw new UnsupportedOperationException("Not supported yet.");//To change body of generated methods, choose Tools | Templates.
        }

    }
}
