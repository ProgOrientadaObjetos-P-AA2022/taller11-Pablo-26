
package paquete3;

import paquete2.Cuenta;
import paquete2.Menu;

public class MenuEconomico extends Menu{
    
    private double porcDesc;

    public MenuEconomico(String cade, double valIni, double porcDes) {
        super(cade, valIni);
        porcDesc = porcDes;
    }

    public void establecerDescuentoP(double n) {
        porcDesc = n;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - (valorInicial * porcDesc / 100);
    }

    public double obtenerDescuentoP() {
        return porcDesc;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Económico\n"
                + "Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "Valor Inicial del menú: %.2f\n"
                + "Porcentaje Descuento: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerDescuentoP(),
                obtenerValorMenu());

        return cadena;
    }
}
