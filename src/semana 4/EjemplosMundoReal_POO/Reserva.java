public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fecha;

    public Reserva(Cliente cliente, Habitacion habitacion, String fecha) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
        habitacion.ocupar(); // ocupa la habitación al reservar
    }

    public void mostrarDetalle() {
        System.out.println("Reserva:");
        System.out.println("Cliente: " + cliente.getNombre() + " - Cédula: " + cliente.getCedula());
        System.out.println("Habitación Nº " + habitacion.getNumero() + " (" + habitacion.getTipo() + ")");
        System.out.println("Fecha: " + fecha);
    }
}