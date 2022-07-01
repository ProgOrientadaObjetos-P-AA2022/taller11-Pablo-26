
package paquete3;

import paquete2.Menu;

public class MenuCarta extends Menu{
    
    private double guarnicion;
    private double bebida;
    private double porcAdic;
    
    public MenuCarta(String pl, double vi,double g, double b){
        super(pl, vi);
        guarnicion = g;
        bebida = b;
        
    }

    public void establecerValorporciondeGuarnicion(double g) {
        guarnicion = g;
    }

    public void establecerValorBebida(double b) {
        bebida = b;
    }

    public void establecerPorcentajeAdicional(double pA) {
        porcAdic = ((pA * valorInicial))/100;
    }
    
    @Override
    public void establecerValorMenu() {
     valorMenu = valorInicial + guarnicion + bebida + porcAdic;
    }
    
    public double obtenerValorporciondeGuarnicion() {
        return guarnicion;
    }

    public double obtenerValorBebida() {
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
        String cadena=String.format("Menu a la carta\n%s",super.toString());
        cadena=String.format("%s"
                + "Valor porcion guarnicion:%.2f\n"
                + "Valor bebida:%.2f\n"
                + "Porcentaje Adicional:%.2f\n"
                + "Valor menu:%.2f\n", cadena,
                obtenerValorporciondeGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }
}
