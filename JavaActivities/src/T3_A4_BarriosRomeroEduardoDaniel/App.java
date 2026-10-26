package T3_A4_BarriosRomeroEduardoDaniel;

public class App {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.err.println("Recorriendo Lista cuando esta vacia...");
        ll.mostrarElementos();

        System.out.println("Agregando un primer elemento...");
        ll.agregarElementoInicio(44);
        System.err.println("Recorriendo Lista cuando NO esta vacia...");
        ll.mostrarElementos();

        ll.agregarElementoInicio(33);
        ll.agregarElementoInicio(11);
        ll.agregarElementoInicio(1);
        ll.mostrarElementos();
        
        
        ll.agregarElementoFinal(88);
        ll.agregarElementoFinal(77);
        ll.agregarElementoFinal(99);
        ll.mostrarElementos();

        ll.eliminarInicio();
        ll.mostrarElementos();

        ll.eliminarFinal();
        ll.mostrarElementos();

        ll.elimninarPosicionEspecifica(5);
        ll.mostrarElementos();
    }
}
