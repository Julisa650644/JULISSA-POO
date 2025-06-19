public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true; // disponible por defecto
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void ocupar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }
}