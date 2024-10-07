public class Cliente {
    String cedula;
    String nombre;

   // Constructor
   public Cliente(String cedula, String nombre) {
       this.cedula = cedula;
       this.nombre = nombre;
   }

   // Getters
   public String getCedula() {
       return cedula;
   }

   public String getNombre() {
       return nombre;
   }
}