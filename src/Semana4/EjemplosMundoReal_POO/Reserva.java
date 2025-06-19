/**
 * Clase que representa una reserva de hotel asociada a un cliente y una habitación en una fecha específica.
 */
public class Reserva {

    /**
     * Cliente que realiza la reserva.
     */
    private Cliente cliente;

    /**
     * Habitación reservada.
     */
    private Habitacion habitacion;

    /**
     * Fecha de la reserva en formato dd/MM/yyyy.
     */
    private String fecha;

    /**
     * Crea una nueva instancia de reserva y marca la habitación como ocupada.
     *
     * @param cliente el cliente que hace la reserva
     * @param habitacion la habitación que se va a reservar
     * @param fecha la fecha de la reserva
     */
    public Reserva(Cliente cliente, Habitacion habitacion, String fecha) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
        habitacion.ocupar(); // ocupa la habitación al reservar
    }

    /**
     * Muestra por consola los detalles de la reserva, incluyendo la información del cliente,
     * la habitación reservada y la fecha de la reserva.
     */
    public void mostrarDetalle() {
        System.out.println("Reserva:");
        System.out.println("Cliente: " + cliente.getNombre() + " - Cédula: " + cliente.getCedula());
        System.out.println("Habitación Nº " + habitacion.getNumero() + " (" + habitacion.getTipo() + ")");
        System.out.println("Fecha: " + fecha);
    }

    }
}