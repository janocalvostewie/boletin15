package boletin15;
/**
 *
 * @author Jano
 */
public class Boletin15 {
    public static void main(String[] args) {
       
  
        //INSTANCIAMOS LOS OBJETOS (UNO DE CADA TIPO)
        Entrenador ent1 = new Entrenador(001, "Pepe", "García", 38, "284EZ89");
        Jugador jug1 = new Jugador(002, "Javi", "Sánchez", 29, 6, "lado Derecho");
        Masajista mas1 = new Masajista(003, "Ana", "Gómez", 27, 18, "Fisioterapia");
        Seleccion jug2 = new Seleccion(004, "Pedro", "Vara", 31);

        //CREAMOS UN ARRAY
        Seleccion personas[] = new Seleccion[4];
        personas[0] = jug1;
        personas[1] = jug2;
        personas[2] = ent1;
        personas[3] = mas1;

         // CONCENTRARSE (método de superclase desde subclase)
        System.out.println("CONCENTRARSE");
        for (Seleccion persona : personas) {
            System.out.print(persona.concentrarse() + "\n");

        }

        // VIAJAR
        System.out.println("VIAJAR");
        for (Seleccion persona : personas) {
            System.out.print(persona.getNombre() + " " + persona.getApellido() + " " + persona.viajar() + "\n");

        }

        // TOSTRING
        System.out.println("toString");
        for (Seleccion persona : personas) {
            System.out.print(persona.toString() + "\n");

        }
        
        
        //INVOCAR MÉTODO DE SUBCLASE DESDE SUPERCLASE
        //No funciona
        //jug2.entrenar();

    }
    
}
