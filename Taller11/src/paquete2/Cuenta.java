
package paquete2;

import java.util.ArrayList;

public class Cuenta {
    
    private String nombre;
    private double iva;
    private ArrayList<Menu> menu = new ArrayList<>();
    private double subtotal;
    private double valorCancelar;
    
    public Cuenta(String nom, ArrayList<Menu> men){
        nombre = nom;
        menu = men;
    }
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerIVA(){
        iva = subtotal * 0.12;
    }
    
    public void establecerMenu(ArrayList<Menu> men){
        menu = men;
    }
    
    public void establecerSubtotal() {
        for (int i = 0; i < menu.size(); i++) {
            subtotal += menu.get(i).obtenerValorMenu();
        }
    }
    
    public void calcularValorCancelar() {
        valorCancelar = obtenerSubtotal() + obtenerIVA();
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
    
    public double obtenerSubtotal(){
        return subtotal;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Informacion Cuenta\n"
                + "Nombre: %s\n"
                + "Lista de Menus adquiridos\n",
                obtenerNombre());

        for (int i = 0; i < menu.size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }

        cadena = String.format("%sSubtotal: %.2f\n"
                + "Iva: %.2f\n" 
                + "\nTotal a Pagar: %.2f\n\n",
                cadena,
                obtenerSubtotal(),
                obtenerIVA(),
                valorCancelar);
        return cadena;
    }
}
