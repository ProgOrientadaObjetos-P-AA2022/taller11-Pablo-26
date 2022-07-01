
package paquete1;

import java.util.ArrayList;
import paquete2.Cuenta;
import paquete2.Menu;
import paquete3.MenuCarta;
import paquete3.MenuDelDia;
import paquete3.MenuEconomico;
import paquete3.MenuNinos;

public class Ejecutor {

    public static void main(String[] args) {
        
        ArrayList<Menu> lista = new ArrayList<>();

        MenuNinos Ninos1 = new MenuNinos("Cajita Feliz", 3.75, 2.00, 2.35);
        MenuNinos Ninos2 = new MenuNinos("Hamburguesa Junior", 1.75, 0.50, 2.00);

        MenuEconomico Economico1 = new MenuEconomico("Combo económico de pizza + refresco", 4.75, 10);

        MenuDelDia DiaMenu = new MenuDelDia("Beff Steak", 5.50, 5, 3.15);

        MenuCarta CartaMenu = new MenuCarta("Ensalada de Maricos", 7.50, 3, 4);

        lista.add(Ninos1);
        lista.add(Ninos2);
        lista.add(Economico1);
        lista.add(DiaMenu);
        lista.add(CartaMenu);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        Cuenta cuenta = new Cuenta("Pablo Ramon", lista, 7);
        cuenta.establecerValorCancelar();
        cuenta.establecerSubtotal();

        System.out.println(cuenta);

    }
    
}
