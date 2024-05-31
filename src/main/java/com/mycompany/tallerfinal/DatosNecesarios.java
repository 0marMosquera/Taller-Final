
package datosnecesarios;

import java.util.ArrayList;
import java.util.LinkedList;
public class DatosNecesarios {

    public static void main(String[] args) {
            ArrayList<Integer> listaNums = new ArrayList<Integer>();
            listaNums.add(3);
            listaNums.add(9);
            listaNums.add(8);
            
            LinkedList<String> listaCiudades = new LinkedList<String>();
            listaCiudades.add("Cartagena");
            listaCiudades.add("Barranquilla");
            listaCiudades.add("Popayan");
            
            ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
            alumnos.add(new Alumno("Julieta",4.5));
            alumnos.add(new Alumno("Reinaldo",4.8));
            alumnos.add(new Alumno("Favio",4.0));
            
            int a=listaNums.get(0);
            String b=listaCiudades.get(0);
            Alumno c=alumnos.get(0);
            
            System.out.println("El primer numero es "+a);
            System.out.println("La primera ciudad es "+b);
            System.out.println("El alumno "+c.getNombre()+" obtuvo una nota de "+c.getNota()); 
    } 
}
