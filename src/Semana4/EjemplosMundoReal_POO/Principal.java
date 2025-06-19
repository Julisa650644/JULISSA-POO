public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel Torres", "1101234567");
        Habitacion hab101 = new Habitacion(101, "Simple");

        if (hab101.estaDisponible()) {
            Reserva reserva1 = new Reserva(cliente1, hab101, "18/06/2025");
            reserva1.mostrarDetalle();
        } else {
            System.out.println("La habitación ya está ocupada.");
        }
    }
}