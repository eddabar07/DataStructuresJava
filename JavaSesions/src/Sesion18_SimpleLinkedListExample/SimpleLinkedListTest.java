package Sesion18_SimpleLinkedListExample;

import java.util.Scanner;

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
    Scanner sc = new Scanner(System.in);
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

    // 2.2 Agregar al final
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

    // 3.1 Eliminar al inicio
    public void eliminarInicio(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else{
            nodoInicio = nodoInicio.getApuntador();
        }
    }

    // 3.2 Eliminar al final
    public void eliminarFinal(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else if (nodoInicio.getApuntador() == null){
            nodoInicio = nodoInicio.getApuntador();
            return;
        }
        else{
            Nodo nodoActual = nodoInicio.getApuntador();
            Nodo nodoPosterior = nodoActual.getApuntador();
            
            while (nodoPosterior.getApuntador() != null){
                nodoActual = nodoActual.getApuntador();
                nodoPosterior = nodoPosterior.getApuntador();
            }

            nodoActual.setApuntador(nodoPosterior.getApuntador());
        }
    }

    // 3.3 Eliminar elemento especifico
    public void eliminarDatoEspecifico(int datoBuscar){
        // Si la lista esta vacia...
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else if (datoBuscar == nodoInicio.getDato()){
            System.out.println("Dato Encontrado en el Primer Nodo");
            nodoInicio = nodoInicio.getApuntador();

        } else{
            Nodo nodoAnterior = nodoInicio;
            Nodo nodoPosterior = nodoInicio.getApuntador();

            // Buscar dato mientras que no termine la lista
            while (datoBuscar != nodoPosterior.getDato() && nodoPosterior.getApuntador() != null){
                nodoAnterior = nodoPosterior;
                nodoPosterior = nodoPosterior.getApuntador();
            }

            if (datoBuscar == nodoPosterior.getDato()){
                nodoAnterior.setApuntador(nodoPosterior.getApuntador());
                nodoPosterior = nodoPosterior.getApuntador();
            }
            System.out.println("Dato no encontrado");
        }
    }

    // 3.4 Eliminar elemento posicion especifica 
    public void elimninarPosicionEspecifica(int posicion){
        if (posicion < 0){
            System.out.println("Posicion Invalida");
            return;
        }
        else if (posicion == 0){
            nodoInicio = nodoInicio.getApuntador();
            return;
        }
        else{
            Nodo nodoAnterior = nodoInicio;
            Nodo nodoEliminar;
            int contador = 0;

            while (contador < posicion -1 && nodoAnterior.getApuntador() != null) {
                nodoAnterior = nodoAnterior.getApuntador();
                contador++;
            }

            // Comprobar si existe la posicion
            if (nodoAnterior.getApuntador() != null){
                nodoEliminar = nodoAnterior.getApuntador();
                nodoAnterior.setApuntador(nodoEliminar.getApuntador());
            }
            else{
                System.out.println("La posicion " + posicion + " no existe");
                return;
            }
        }
    }

    // 4. Mostrar Elementos (recorrido)
    public void mostrarElementos(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else{
            Nodo nodoActual = nodoInicio;

            while(nodoActual != null){
                System.out.print("[" + nodoActual.getDato() + "] ==> ");
                nodoActual = nodoActual.getApuntador();
            }
            System.out.println();
        }
    }

    // Menu insertar
    public void menuInsertar(){
        int opc;

        do{
            // Menu de opciones usuarios
            System.out.println("\n=== Insertar Elementos ===");
            System.out.println("""
                1.- Insertar elemento al inicio
                2.- Insertar elemento al final
                3.- Mostrar Elementos
                4.- Regresar
            """);
            System.out.print("Ingresa una Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    System.out.print("Elemento a ingresar: ");
                    agregarElementoInicio(sc.nextInt());
                    sc.nextLine();
                    break;

                case 2:
                    System.out.print("Elemento a ingresar: ");
                    agregarElementoFinal(sc.nextInt());
                    sc.nextLine();
                    break;

                case 3:
                    mostrarElementos();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcion Invalida. Intente Nuevamente");
                    break;
            }
        } while (opc != 4);
    }

    // Menu insertar
    public void menuEliminar(){
        int opc;

        do{
            // Menu de opciones usuarios
            System.out.println("\n=== Eliminar Elementos ===");
            System.out.println("""
                1.- Eliminar elemento al inicio
                2.- Eliminar elemento al final
                3.- Eliminar elemento por dato
                4.- Eliminar elemento por posicion
                5.- Mostrar Elementos
                6.- Regresar
            """);
            System.out.print("Ingresa una Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    eliminarInicio();
                    break;

                case 2:
                    eliminarFinal();
                    break;

                case 3:
                    System.out.print("Dato a eliminar: ");
                    eliminarDatoEspecifico(sc.nextInt());
                    sc.nextLine();
                    break;

                case 4:
                    System.out.print("Posicion del elemento a eliminar: ");
                    elimninarPosicionEspecifica(sc.nextInt());
                    sc.nextLine();
                    break;

                case 5:
                    mostrarElementos();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opcion Invalida. Intente Nuevamente");
                    break;
            }
        }while (opc != 6);    
    }
}

public class SimpleLinkedListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int opc;

        do{
            // Menu de opciones usuarios
            System.out.println("\n=== Listas Enlazadas (LinkedLists) ===");
            System.out.println("""
                1.- Insertar Elementos
                2.- Eliminar Elementos
                0.- Salir
            """);
            System.out.print("Ingresa una Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    ll.menuInsertar();
                    break;

                case 2:
                    ll.menuEliminar();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opcion Invalida. Intente Nuevamente");
                    break;
            }
        } while (opc != 0); 
        sc.close(); 
    }
}
