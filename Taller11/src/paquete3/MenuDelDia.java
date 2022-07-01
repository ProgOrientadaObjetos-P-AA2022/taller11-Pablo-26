
package paquete3;

import paquete2.Menu;

public class MenuDelDia extends Menu {
    private double bebida;
    private double postre;

    public MenuDelDia(String cade, double vi, double p, double b) {
        super(cade, vi);
        postre = p;
        bebida = b;
    }

    public void establecerPostre(double c) {
        postre = c;
    }

    public void establecerBebida(double c) {
        bebida = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + postre + bebida;
    }

    public double obtenerPostre() {
        return postre;
    }

    public double obtenerBebida() {
        return bebida;
    }

    @Override
    public String toString() {
        String reporte = String.format("Menú Día\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor inicial del menú: %.2f\n"
                + "Valor postre: %.2f\n"
                + "Valor bebida: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerPostre(),
                obtenerBebida(),
                obtenerValorMenu());

        return reporte;
    }
}
