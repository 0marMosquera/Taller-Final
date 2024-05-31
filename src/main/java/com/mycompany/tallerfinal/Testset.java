
package testset;

import java.util.TreeSet;
public class Testset {

    public static void main(String[] args) {
        TreeSet listaNums= new TreeSet();
            listaNums.add(4);
            listaNums.add(1);
            listaNums.add(6);
            listaNums.add(7);
            listaNums.add(0);
            System.out.println("Lista de numeros: "+listaNums);
            
            TreeSet listaNombres= new TreeSet();
            listaNombres.add("Jhon");
            listaNombres.add("Jose");
            listaNombres.add("Clara");
            listaNombres.add("Mileydi");
            listaNombres.add("Daniela");
            System.out.println("Lista de nombres:"+listaNombres);
                    
            System.out.println("Numeros mayores o iguales a 3:"+listaNums.tailSet(3)); 
            System.out.println("Nombres mayores o iguales a Daniel:"+listaNombres.tailSet("Daniel"));
            
            System.out.println("Numeros en orden descendente: "+listaNums.descendingSet());
             System.out.println("Nombres en orden descendente:"+listaNombres.descendingSet()); 
    } 
}