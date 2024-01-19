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
public class Paciente extends Persona {

    private String operación, recomendacion, eps, categoria;

    public String getOperación() {
        return operación;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEps() {
        return eps;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setOperación(String operación) {
        this.operación = operación;
    }

    @Override
    public String toString() {
        return "\n Procedimiento Quirurgico:        " + operación + "\n eps:      " + eps + "\n categoria:      " + categoria +"\n  recomendacion:     \n" + recomendacion  ;
    }

} 
