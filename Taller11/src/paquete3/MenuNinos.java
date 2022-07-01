
package paquete3;

import paquete2.Menu;

public class MenuNinos extends Menu{
    private double helado;
    private double pastel;

    public MenuNinos(String cade, double vi, double h, double p) {
        super(cade, vi);
        helado = h;
        pastel = p;
    }

    public void establecerHelado(double c) {
        helado = c;
    }

    public void establecerPastel(double c) {
        pastel = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + helado + pastel;
    }

    public double obtenerHelado() {
        return helado;
    }

    public double obtenerPastel() {
        return pastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Niños\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor Inicial del menú: %.2f\n"
                + "Valor porcion  helado: %.2f\n"
                + "Valor porcion Pastel: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerHelado(),
                obtenerPastel(),
                obtenerValorMenu());

        return cadena;
    }
}
