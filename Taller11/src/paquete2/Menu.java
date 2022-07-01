/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete3.Cuenta;

/**
 *
 * @author USER
 */
public abstract class Menu {
    
    protected Cuenta cliente;
    protected String nombrePlato;
    protected double valorMenu;
    
    public void establecerCuenta(Cuenta c){
        cliente = c;
    }
    
    public void establecerNombrePlato(String nom){
        nombrePlato = nom;
    }
    
    public abstract void establecerMenu();
    
    public Cuenta obtenerCliente(){
        return cliente;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
}
