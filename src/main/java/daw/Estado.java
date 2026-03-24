
package daw;

public enum Estado {

        Reservada(), Libre(), Mantenimiento();

        public static Estado getReservada() {
            return Reservada;
        }

        public static Estado getLibre() {
            return Libre;
        }

        public static Estado getMantenimiento() {
            return Mantenimiento;
        }
}
