
package paquete3;

public class Cuenta {
    
    private String nombre;
    private double iva;
    private String menu;
    private double valorCancelar;
    
    public Cuenta(String nom, double v, String men, double c){
        nombre = nom;
        iva = v;
        menu = men;
        valorCancelar = c;
    }
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerIVA(double iv){
        iva = iv;
    }
    
    public void establecerMenu(String men){
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
    
    public String obtenerMenu(){
        return menu;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
}
