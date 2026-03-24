package daw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Resort {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("12345", "Meliah");
        Cliente c1 = new Cliente("0123", 350.0);
        Cliente c2 = new Cliente("1234", 325.5);
        Habitacion h1 = new Estandar(100, 2, Libre);
        Habitacion h2 = new Estandar(110, 1, libre);

        Habitacion h3 = new Suite(200, 2, Libre);
        Habitacion h4 = new Suite(210, 1, libre);

        Habitacion h5 = new SuitePresidencial(300, 2, Libre);
        Habitacion h6 = new SuitePresidencial(310, 1, libre);
        
        
        
 //Creo una lista a partir de las habitaciones
        Set<Cliente> listaClientes = new HashSet<>();
        Set<Habitacion> listaHabitaciones = new HashSet<>();
        listaHabitaciones.add(h1);
        listaHabitaciones.add(h2);
        listaHabitaciones.add(h3);
        listaHabitaciones.add(h4);
        listaHabitaciones.add(h5);
        listaHabitaciones.add(h6);

        //una lista nueva para añadir las habitaciones contratables
        List<Contratable> listaContratable = new ArrayList<>();
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion instanceof Contratable) {
                listaHabitaciones.add((Habitacion) listaContratable); //Conversion explicita
            }
        }

    }

    public static Map<String, Double> gastoPorCliente(Hotel hotel) {
        Map<String, Double> listaGastoClientes = new HashMap<>();
        
        for(Cliente cli : cliente.getGastoAcumulado()){
            if(cli instanceof )
        }
        
        
        
    }
    //

}
