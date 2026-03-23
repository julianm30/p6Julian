package daw;

public class SuitePresidencial extends Habitacion {

    private boolean mayordomo;

    //Getters y setters
    public boolean isMayordomo() {
        return mayordomo;
    }

    public void setMayordomo(boolean mayordomo) {
        this.mayordomo = mayordomo;
    }

    //Constructor
    public SuitePresidencial(boolean mayordomo, int numero, int capacidad, Estado estado) {
        super(numero, capacidad, estado);
        this.mayordomo = mayordomo;
    }

    //ToString
    @Override
    public String toString() {
        return "SuitePresindencial{" + "mayordomo=" + mayordomo + "numero de habitacion: " + super.getNumero()
                + "estado de la habitacion: " + super.getEstado() + "Capacidad de la habitacion: " + super.getCapacidad() + '}';
    }

    public void limpiar(){
        System.out.println("El mayordomo ha ordenado la habitacion");
    }
}
