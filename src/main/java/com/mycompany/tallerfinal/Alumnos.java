
package alumno;

/**
 *
 * @author Omar Reinaldo
 */
public class Alumnos {
    public static void main(String arg[])
    {
            Alumno estudiante[]=new Alumno[3];
            estudiante[0]=new Alumno("Luis",3.9);
            estudiante[1]=new Alumno("Maria",4.5);
            estudiante[2]=new Alumno("Laura",4.7);
    
            for(Alumno al:estudiante)
            {
            System.out.println("El alumno "+al.getNombre()+" obtuvo una nota de "+al.getNota());
        }
    }
}
