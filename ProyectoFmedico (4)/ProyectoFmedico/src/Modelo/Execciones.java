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
public class Execciones {
    String datoingresadoId;

    public Execciones(String datoingresado) {
        this.datoingresadoId = datoingresado;
    }
    
    public String getMessage(){
    return datoingresadoId+"\n Usted a ingresado mal su número de identificación \n Solo puede ingresar numeros sin puntos, ni comas  \n ---------- Intente Nuevamente ------------- \n";
    }
}
