
package arraylist;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
            ArrayList listaNums= new ArrayList();
            listaNums.add(4);
            listaNums.add(6);
            listaNums.add(2);
            listaNums.add(7);
            listaNums.add(8);
            System.out.println("Lista de numeros: "+listaNums);
        
        
            ArrayList listaNombres= new ArrayList();
            listaNombres.add("Martin");
            listaNombres.add("Sofia");
            listaNombres.add("Natalia");
            listaNombres.add("Paublo");
            listaNombres.add("Matias");
            System.out.println("Lista de nombres:"+listaNombres);
        
        
            System.out.println("Numero posicion 2:"+listaNums.get(2));
            System.out.println("Nombre posicion 0:"+listaNombres.get(0));

        
            listaNums.set(0,15);
            listaNombres.set(0,"Kevin");
        
        
            System.out.println("Lista de numeros: "+listaNums);
        System.out.println("Lista de nombres:"+listaNombres); 
    }
    
}