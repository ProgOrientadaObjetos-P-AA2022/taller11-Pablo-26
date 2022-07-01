/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Menu;

/**
 *
 * @author USER
 */
public class MenuEconomico extends Menu{
    
    protected Cuenta cliente;
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorIniMenu;
    protected double descuento;
    
    public void establecerCliente(Cuenta c){
        cliente = c;
    }
    
    @Override
    public void establecerMenu(){
        
    }
}
