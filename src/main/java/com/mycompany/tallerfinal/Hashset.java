
package hashset;

import java.util.HashSet;
public class Hashset {

    public static void main(String[] args) 
    {
        HashSet listaNums= new HashSet();
        listaNums.add(8); 
        listaNums.add(3); 
        listaNums.add(5); 
        listaNums.add(2);
        listaNums.add(3);
        
        System.out.println("Lista de numeros: "+listaNums);

        HashSet listNombres= new HashSet();
        listNombres.add("Lucas");
        listNombres.add("Favio");
        listNombres.add("Omar");
        listNombres.add("Wilmer");
        listNombres.add("Messi");
        System.out.println("Lista de nombres:"+listNombres);

        listaNums.remove(5);
        listNombres.remove("Cristiano");

        System.out.println("Lista de numeros: "+listaNums);
        System.out.println("Lista de nombres:"+listNombres); 
    }
}
