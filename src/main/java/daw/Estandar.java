package daw;

//LAs clases hijas son finals
public final class Estandar extends Habitacion implements Contratable, Reservable {

    private boolean minibar;
    private double precio;

    //Getteers y Setters
    public boolean getMinibar() {
        return minibar;
    }

    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Constructor
    public Estandar(boolean minibar, double precio, int numero, int capacidad, Estado estado) {
        super(numero, capacidad, estado);
        this.minibar = minibar;
        this.precio = precio;
    }

    //toString sobreescrito
    @Override
    public String toString() {
        return "Estandar{" + "minibar=" + minibar + ", precio=" + precio + "numero de habitacion: " + super.getNumero()
                + "estado de la habitacion: " + super.getEstado() + "Capacidad de la habitacion: " + super.getCapacidad() + "}";
    }

    public void limpiar() {
        System.out.println("Habitacion limpia y minibar relleno");
    }

    //metodo reservable = No cambiaba le estado de la habitacion

    public void reservar() {
        this.setEstado(Estado.Reservada);
    }

    public void cancelarReserva(){
        this.setEstado(Estado.Libre);
    }

    //Falta metodo contratar
    public void contratar(Cliente cliente) {
        reservar();
        cliente.setGastoAcumulado(cliente.getGastoAcumulado() + this.precio);
    }

}
