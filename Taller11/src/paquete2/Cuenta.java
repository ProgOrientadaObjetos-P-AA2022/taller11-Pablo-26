
package paquete2;

import java.util.ArrayList;

public class Cuenta {
    
    private String nombre;
    private double iva;
    private ArrayList<Menu> menu = new ArrayList<>();
    private double subtotal;
    private double valorCancelar;
    
    public Cuenta(String nom, ArrayList<Menu> men, double sb){
        nombre = nom;
        menu = men;
        subtotal = sb;
    }
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerIVA(double iv){
        iva = iv;
    }
    
    public void establecerMenu(ArrayList<Menu> men){
        menu = men;
    }
    
    public void establecerValorCancelar(double c){
        valorCancelar = c;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public double obtenerIVA(){
        return iva;
    }
    
    public ArrayList<Menu> obtenerMenu(){
        return menu;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
}
