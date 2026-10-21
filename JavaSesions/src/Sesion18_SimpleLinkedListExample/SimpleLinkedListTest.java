package Sesion18_SimpleLinkedListExample;

class Nodo{
    // Declaracion de variables
    private int dato;
    private Nodo apuntador;

    // Constructor 
    public Nodo(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getApuntador() {
        return apuntador;
    }

    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", apuntador=" + apuntador + "]";
    }
}

/**
 * OPERACIONES PARA LINKEDLIST
 * 
 *  1. Crear
 *  2. Agregar
 *      2.1. Al inicio
 *      2.2. Al final
 *      2.3. En pocicion especifica 
 *  3. Eliminar
 *      3.1. Al inicio
 *      3.2. Al final
 *      3.3. En pocicion especifica (DATO ESPECIFICO)
 *  4. Mostrar Datos (Recorrer)
 */

class LinkedList{
    Nodo nodoInicio;
    Nodo nodoFin;

    // 1. Crear
    public LinkedList(){
        nodoFin = nodoInicio = null;
    }

    // 2.1. Agregar al inicio
    public void agregarElementoInicio(int dato){ // Agrega un elemento cuando la lista esta vacia
        if (nodoInicio == null){            
            Nodo newNodo = new Nodo(dato);

            nodoInicio = nodoFin = newNodo;
        } else { // Agrega elemento cuando la lista NO esta vacia
            Nodo newNodo = new Nodo(dato);

                newNodo.setApuntador(nodoInicio); // Inserta el dato en el nodo del inicio
                nodoInicio = newNodo; // Recorre el nodo a la derecha
        }
    }

    // Agregar al final
    public void agregarElementoFinal(int dato){ // Agrega elemento cuando la lista esta vacia
        if (nodoInicio == null){
            Nodo newNodo = new Nodo(dato);

            nodoInicio = nodoFin = newNodo;
        } else { // Agrega un elemento cuando la lista NO esta vacia
            Nodo newNodo = new Nodo(dato);

            nodoFin.setApuntador(newNodo);
            
            nodoFin = newNodo;
        }
    }

    // 4. Mostrar Elementos (recorrido)
    public void mostrarElementos(){
        Nodo nodoActual = nodoInicio;

        while(nodoActual != null){
            System.out.print("[" + nodoActual.getDato() + "] ==> ");
            nodoActual = nodoActual.getApuntador();
        }
        System.out.println();
    }
}

public class SimpleLinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.err.println("Recorriendo Lista cuando esta vacia...");
        ll.mostrarElementos();

        System.out.println("Agregando un primer elemento...");
       // ll.agregarElementoInicio(44);
        System.err.println("Recorriendo Lista cuando NO esta vacia...");
        ll.mostrarElementos();

        //ll.agregarElementoInicio(33);
        //ll.agregarElementoInicio(11);
        //ll.agregarElementoInicio(1);
        //ll.mostrarElementos();
        
        
        ll.agregarElementoFinal(88);
        ll.agregarElementoFinal(77);
        ll.agregarElementoFinal(99);
        ll.mostrarElementos();
    }
}
