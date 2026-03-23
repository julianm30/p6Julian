package daw;

import java.util.Set;

public class Hotel {

private String cif;
private String nombre;
//Añado las listas Set
private Set<Cliente> clientes;
    private Set<Habitacion> habitaciones;

//Getters y setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Los setters tamb
    public Set<Cliente> getClientes() {
        return clientes;
    }

    public Set<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    //Modifico el constructor
    //Cosntructor
    public Hotel(String cif, String nombre, Set<Cliente> clientes, Set<Habitacion> habitaciones) {
        this.cif = cif;
        this.nombre = nombre;
        this.clientes = clientes;
        this.habitaciones = habitaciones;
    }

    //toString
    @Override
    public String toString() {
        return "Hotel{" + "cif=" + cif + ", nombre=" + nombre + '}';
    }


}
