/**
 * Clase que representa una habitación de hotel.
 */
public class Habitacion {

    /**
     * Número identificador de la habitación.
     */
    private int numero;

    /**
     * Tipo de habitación (ej. simple, doble, suite).
     */
    private String tipo;

    /**
     * Indica si la habitación está disponible.
     */
    private boolean disponible;

    /**
     * Crea una nueva habitación con el número y tipo especificado.
     * La habitación se marca como disponible por defecto.
     *
     * @param numero el número de la habitación
     * @param tipo el tipo de la habitación
     */
    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;
    }

    /**
     * Devuelve el número de la habitación.
     *
     * @return número de la habitación
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Devuelve el tipo de la habitación.
     *
     * @return tipo de la habitación
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Indica si la habitación está disponible.
     *
     * @return true si está disponible, false si está ocupada
     */
    public boolean estaDisponible() {
        return disponible;
    }

    /**
     * Marca la habitación como ocupada.
     */
    public void ocupar() {
        this.disponible = false;
    }

    /**
     * Libera la habitación, marcándola como disponible.
     */
    public void liberar() {
        this.disponible = true;
    }
}

    }
}