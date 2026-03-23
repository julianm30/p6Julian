package daw;

import java.util.Objects;

public final class Cliente {
    private String nif;
    private double gastoAcumulado;

    //Getters y Setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getGastoAcumulado() {
        return gastoAcumulado;
    }

    public void setGastoAcumulado(double gastoAcumulado) {
        this.gastoAcumulado = gastoAcumulado;
    }

    //Constructor
    public Cliente(String nif, double gastoAcumulado) {
        this.nif = nif;
        this.gastoAcumulado = gastoAcumulado;
    }

    //Equals y hashCode por nif
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }

    //toString //Me faltaba el toString
    @Override
    public String toString() {
        return "Cliente [nif=" + nif + ", gastoAcumulado=" + gastoAcumulado + ", toString()=" + super.toString() + "]";
    }





}
