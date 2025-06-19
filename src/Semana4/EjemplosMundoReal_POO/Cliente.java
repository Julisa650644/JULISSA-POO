/**
 * Clase que representa un cliente con nombre y cédula.
 */
public class Cliente {

   /**
    * Nombre del cliente.
    */
   private String nombre;

   /**
    * Cédula del cliente.
    */
   private String cedula;

   /**
    * Constructor que inicializa un nuevo cliente con nombre y cédula.
    *
    * @param nombre el nombre del cliente
    * @param cedula la cédula del cliente
    */
   public Cliente(String nombre, String cedula){
       this.nombre = nombre;
       this.cedula = cedula;
   }

   /**
    * Obtiene el nombre del cliente.
    *
    * @return el nombre del cliente
    */
   public String getNombre(){
       return nombre;
   }

   /**
    * Obtiene la cédula del cliente.
    *
    * @return la cédula del cliente
    */
   public String getCedula(){
       return cedula;
   }
}
