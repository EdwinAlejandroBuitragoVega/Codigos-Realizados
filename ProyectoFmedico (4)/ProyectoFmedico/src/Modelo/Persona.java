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
public class Persona {

    private String nombre;
    private String tipoId;
    private long tel;
    private int edad;
    private long cc;

    public String getNombre() {
        return nombre;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return nombre + "\n tipo Id:    " + tipoId + "\n Id:      " + cc + "\n Teléfono:     " + tel + "\n edad:     " + edad;
    }

}
