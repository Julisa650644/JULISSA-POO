/**
 * Clase principal que ejecuta el sistema de reservas de hotel.
 * Crea un cliente, una habitación y, si está disponible,
 * genera una reserva y muestra sus detalles.
 */
public class Principal {

    /**
     * Método principal del sistema.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un nuevo cliente con nombre y cédula
        Cliente cliente1 = new Cliente("Gabriel Torres", "1101234567");

        // Crear una habitación simple con número 101
        Habitacion hab101 = new Habitacion(101, "Simple");

        // Si la habitación está disponible, crear una reserva
        if (hab101.estaDisponible()) {
            // Crear una nueva reserva para el cliente
            Reserva reserva1 = new Reserva(cliente1, hab101, "18/06/2025");

            // Mostrar los detalles de la reserva
            reserva1.mostrarDetalle();
        } else {
            // Si no está disponible, mostrar un mensaje
            System.out.println("La habitación ya está ocupada.");
        }
    }
}
