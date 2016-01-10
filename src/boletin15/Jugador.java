
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Jugador extends Seleccion{
    protected int dorsal;
    protected String demarcacion;
    
    public Jugador(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
       super(id, nombre, apellido, edad);
       this.dorsal=dorsal;
       this.demarcacion=demarcacion;
    }
    
    
    //MÉTODOS
    public String jugarPartido(){
         String mensaje= " juega un partido.";
         return mensaje;
    } 
     public String entrenar(){
         String mensaje= " entrena.";
         return mensaje;
    } 
    @Override
    public String viajar() {
        String mensaje= " viaja.";
         return mensaje;
    }
    @Override
    public String toString() {
        String mensaje = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad+"\nDorsal: "+dorsal+"\nDemarcación: "+demarcacion;
        return mensaje;
}
}