package boletin15;
/**
 *
 * @author Jano
 */
public class Masajista extends Seleccion{
    protected int anosExp;
    protected String titulacion;
    
    public Masajista(int id, String nombre, String apellido, int edad, int anosExp, String titulacion) {
       super(id, nombre, apellido, edad);
       this.anosExp=anosExp;
       this.titulacion=titulacion;
    }
     //Métodos
    public String darMasaje(){
         String mensaje= " da un masaje.";
         return mensaje;
    } 
    @Override
    public String toString() {
        String mensaje = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad+"\nExperiencia: "+anosExp+" años\nTitulación: "+titulacion;
        return mensaje;
}
     @Override
    public String viajar() {
        String mensaje= " viaja.";
         return mensaje;
    }
}