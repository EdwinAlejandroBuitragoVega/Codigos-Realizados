/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaaviones;

/**
 *
 * @author Edwin Alejandro Buitrago Vega
 */
public abstract class Aviones {

    private int velocidad;
    private String matricula;

    public Aviones(int velocidad, String matricula) {
        this.velocidad = velocidad;
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract void Visualisar();
}