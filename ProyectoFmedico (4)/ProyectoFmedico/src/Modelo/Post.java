/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Admin
 */
public class Post {

    Paciente objPaciente = new Paciente();
    

    public Post() {
    }

    private void agregarPaciente(String nombre, String tipoId, int edad, long id, long telf, String operacion) {
        this.objPaciente.setNombre(nombre);
        this.objPaciente.setCc(id);
        this.objPaciente.setTipoId(tipoId);
        this.objPaciente.setEdad(edad);
        this.objPaciente.setTel(telf);
        this.objPaciente.setOperación(operacion);

    }

   
}
