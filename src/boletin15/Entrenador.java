package boletin15;

/**
 *
 * @author Jano
 */
public class Entrenador extends Seleccion{
    
    protected String idFederacion;
    
    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
       super(id, nombre, apellido, edad);
             this.idFederacion=idFederacion;
    }
       
    //Métodos
    public String dirigirPartido(){
         String mensaje= " dirige un partido.";
         return mensaje;
    } 
     public String dirigirEntrenamiento(){
         String mensaje= " dirige un entrenamiento.";
         return mensaje;
    } 
    @Override
  public String toString() {
        String mensaje = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad+"\nID de Federación: "+idFederacion;
        return mensaje;
}
   @Override
    public String viajar() {
        String mensaje= " viaja.";
         return mensaje;
    }
}