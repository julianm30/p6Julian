
package daw;

//Se me olvido ponerle abstract Y FALTA el implements en vez de extends
public abstract class Habitacion implements Comparable <Habitacion> {
    private int numero;
    private int capacidad;
    private Estado estado;


    //Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //constructor
    public Habitacion(int numero, int capacidad, Estado estado) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = Estado.Libre; //Se inicializan siempre libres
    }

    //toString
    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }


    //Equals y hashcode(numero) son finals para que no puedan
    //sobrescribirse en las subclases
    @Override
    public final int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numero;
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        return this.numero == other.numero;
    }


    //Falta el metodo limpiar
    public abstract void limpiar();

    //Falta el metodo para comparar las habitaciones
    public int compareTo(Habitacion otraHab){
        return Integer.compare(this.numero, otraHab.numero);
    }


}
