/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.Interfaces;

/**
 *
 * @author EdwinB
 */
public class Duck {
     private String name;
    private FlyBehavior flybehavior;

    public Duck(String name, FlyBehavior flybehavior) {
        this.name = name;
        this.flybehavior = flybehavior;
    }

    public String getName() {
        return name;
    }

    public void setFlybehavior(FlyBehavior flybehavior) {
        this.flybehavior = flybehavior;
    }
            
    public void fly(){
        flybehavior.fly();
    }

    public FlyBehavior getFlybehavior() {
        return flybehavior;
    }
        
   
}
