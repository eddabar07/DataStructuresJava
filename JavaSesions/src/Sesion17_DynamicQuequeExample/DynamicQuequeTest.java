package Sesion17_DynamicQuequeExample;

import java.util.LinkedList;
import java.util.Queue;

public class DynamicQuequeTest {
    public static void main(String[] args) {
        
    
        Queue <Integer> filaDinamica = new LinkedList<>();

        System.out.println(filaDinamica.add(7));
        filaDinamica.add(9);
        filaDinamica.add(1);
        filaDinamica.add(10);

        System.out.println(filaDinamica);

        System.out.println(filaDinamica.poll());

        System.out.println(filaDinamica);

    }
    
}
