
package lisnumnom;

import java.util.LinkedList;
public class LisNumNom {

    public static void main(String[] args) {
            LinkedList listaNums= new LinkedList();
            listaNums.add(8);
            listaNums.add(3);
            listaNums.add(5);
            listaNums.add(2);
            listaNums.add(3);
        
            listaNums.addFirst(10);
            System.out.println("Lista de numeros: "+listaNums);
        
            LinkedList lisNombres= new LinkedList();
            lisNombres.add("Marta");
            lisNombres.add("Leonardo"); 
            lisNombres.add("Jesus"); 
            lisNombres.add("Luisa");
            lisNombres.add("Eliza");
        
            lisNombres.addFirst("Livia");
            System.out.println("Lista de nombres:"+lisNombres);
        
            System.out.println("Elemento removido:"+listaNums.poll());
            System.out.println("Elemento removido:"+lisNombres.poll());
        
            System.out.println("Lista de numeros: "+listaNums);
        System.out.println("Lista de nombres:"+lisNombres); 
    }
}

