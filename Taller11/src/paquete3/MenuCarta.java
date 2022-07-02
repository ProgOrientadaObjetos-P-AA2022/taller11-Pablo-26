
package paquete3;

import paquete2.Menu;

public class MenuCarta extends Menu{
    
    private double guarnicion;
    private double bebida;
    private double porcAdic;
    
    public MenuCarta(String pl, double vi,double g, double b, double c){
        super(pl, vi);
        guarnicion = g;
        bebida = b;
        porcAdic = c;
        
    }

    public void establecerGuarnicion(double g) {
        guarnicion = g;
    }

    public void establecerBebida(double b) {
        bebida = b;
    }

    public void establecerPorcentajeAdicional(double pA) {
        porcAdic = ((pA * valorInicial))/100;
    }
    
    @Override
    public void establecerValorMenu() {
     valorMenu = valorInicial + guarnicion + bebida + porcAdic;
    }
    
    public double obtenerGuarnicion() {
        return guarnicion;
    }

    public double obtenerBebida() {
        return bebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcAdic;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Carta del Menu\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor inicial del Menú: %.2f\n"
                + "Valor Guarnición: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Porcentaje por servicio: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerGuarnicion(),
                obtenerBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());

        return cadena;
    }
}
