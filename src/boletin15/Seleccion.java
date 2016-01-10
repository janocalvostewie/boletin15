package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Seleccion {

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    //CONSTRUCTORES
    public Seleccion(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //GETTERS Y SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    //MÉTODOS
    public String concentrarse() {
        String mensaje= "La selección se concentra.";
         return mensaje;
    }

    public String viajar() {
        String mensaje= "La selección viaja.";
         return mensaje;
    }

    public String toString() {
        String mensaje = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad;
        return mensaje;
    }
}
