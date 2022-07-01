/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author USER
 */
public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    
    public Menu(String pl, double vi) {
        nombrePlato = pl;
        valorInicial = vi;
    }
    
    public void establecerNombrePlato(String nom){
        nombrePlato = nom;
    }
    
    public abstract void establecerValorMenu();
    
    public void establecerValorMenuInicial(double vi){
        valorInicial = vi;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValorMenuInicial() {
        return valorInicial;
    }
}
