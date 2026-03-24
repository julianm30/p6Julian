
package daw;

//Falta final
public final class Suite extends Habitacion implements Reservable, Contratable{
    private boolean jacuzzi;
    private double precio;

    //Getters y setters
    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(){
        this.getEstado(Estado.Libre);

    }
    //Constructor
       public Suite(int numero, int capacidad, boolean jacuzzi, double precio) {
        super(numero, capacidad);
        this.jacuzzi = jacuzzi;
        this.precio = precio;
        this.setEstado(Estado.Libre);
    }

    //toString
    @Override
    public String toString() {
        return "Suite{" + "jacuzzi=" + jacuzzi + ", precio=" + precio +"numero de habitacion: " + super.getNumero()
                + "estado de la habitacion: " + super.getEstado() + "Capacidad de la habitacion: " + super.getCapacidad() + '}';
    }


    public void llenarJacuzzzi(){
        System.out.println("Llenando jacuzzi...");
    }

    public void limpiar(){
        System.out.println("Jacuzzi desinfectado");
    }
}
