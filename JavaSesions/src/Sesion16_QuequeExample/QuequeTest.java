package Sesion16_QuequeExample;

import java.util.Arrays;
import java.util.Scanner;

class FilaEstaticaSinRecorrido{
    private int[] filaEstatica;
    private int frente;
    private int fin;

    public FilaEstaticaSinRecorrido(){
        filaEstatica = new int[5];
        frente = 0;
        fin = -1;

        System.out.println("Fila Creada Correctamente");
    }

    public void insertarElementos(int numero){
        if (estaLlena()){
            System.out.println("La Fila se Encuentra Llena");
            return;
        }
        
        fin ++;
        filaEstatica[fin] = numero;

        System.out.println("Elemento Insertado Correctamente");
    }

    public void eliminarElemento(){
        if (estaVacia()){
            System.out.println("La Fila se Encuentra Llena");
            return;
        }

        filaEstatica[frente] = 0;
        frente ++;

        System.out.println("Elemento Eliminado Correctamente");
    }

    public void mostrarDatos(){
        System.out.println(Arrays.toString(filaEstatica));;
    }

    public boolean estaLlena(){
        return fin == filaEstatica.length - 1;
    }

    public boolean estaVacia(){
        return fin == -1;
    }

    public void menuSinRecorrido(){
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int opc;
        FilaEstaticaSinRecorrido fila = null;

        do{
            // Menu de opciones Circular
            System.out.println("\n========== MANEJO DE FILAS SIN RECORRIDO ==========");
            System.out.println("""
                    1.- Crear Fila Estatica
                    2.- Insertar Elemento
                    3.- Eliminar Elementos
                    4.- Mostrar Elementos
                    5.- Regresar
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Logica menu de opciones
            switch (opc) {
                case 1:
                    fila = new FilaEstaticaSinRecorrido();
                    break;
                case 2:
                    System.out.print("Ingresa un Numero: ");
                    fila.insertarElementos(sc.nextInt());
                    break;
                case 3:
                    fila.eliminarElemento();
                    break;
                case 4:
                    fila.mostrarDatos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        }while (opc != 5);
        sc.close();
    }
}

class FilaEstaticaConReccorrido{
    private int[] filaEstatica;
    private int frente;
    private int fin;

    public FilaEstaticaConReccorrido(){
        filaEstatica = new int[5];
        frente = 0;
        fin = -1;

        System.out.println("Fila Creada Correctamente");
    }


    public void insertarElementos(int numero){
        if (estaLlena()){
            System.out.println("La FIla se Encuentra Llena");
            return;
        }
        
        fin ++;
        filaEstatica[fin] = numero;

        System.out.println("Elemento Insertado Correctamente");
    }

    public void eliminarElemento(){
        if (estaVacia()){
            System.out.println("La Fila se Encuentra Llena");
            return;
        }

        filaEstatica[frente] = 0;
        frente ++;

        for (int i = 0; i <= fin - 1; i++){
            filaEstatica[i] = filaEstatica[i + 1];
        }
        filaEstatica[fin] = 0;
        fin --;

        System.out.println("Elemento Eliminado Correctamente");
    }

    public void mostrarDatos(){
        System.out.println(Arrays.toString(filaEstatica));;
    }

    public boolean estaLlena(){
        return fin == filaEstatica.length - 1;
    }

    public boolean estaVacia(){
        return fin == -1;
    }

    public void menuConRecorrido(){
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int opc;
        FilaEstaticaConReccorrido fila = null;

        do{
            // Menu de opciones Circular
            System.out.println("\n========== MANEJO DE FILAS CON RECORRIDO ==========");
            System.out.println("""
                    1.- Crear Fila Estatica
                    2.- Insertar Elemento
                    3.- Eliminar Elementos
                    4.- Mostrar Elementos
                    5.- Regresar
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Logica menu de opciones
            switch (opc) {
                case 1:
                    fila = new FilaEstaticaConReccorrido();
                    break;
                case 2:
                    System.out.print("Ingresa un Numero: ");
                    fila.insertarElementos(sc.nextInt());
                    break;
                case 3:
                    fila.eliminarElemento();
                    break;
                case 4:
                    fila.mostrarDatos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        }while (opc != 5);
        sc.close();
    }
}

class FilaEstaticaCircular{
    private int[] filaEstatica;
    private int frente;
    private int fin;

    // Crear fila estatica
    public FilaEstaticaCircular(){
        filaEstatica = new int[5];
        frente = 0;
        fin = -1;

        System.out.println("Fila Creada Correctamente");
    }

    public void insertarElementos(int numero) {
        if (estaLlena()) {
            System.out.println("La FIla se Encuentra Llena");
            return;
        }

        fin = (fin + 1) % filaEstatica.length;
        filaEstatica[fin] = numero;

        System.out.println("Elemento Insertado Correctamente");
    }

    public void eliminarElemento() {
        if (estaVacia()) {
            System.out.println("La fila se encuentra vacia");
            return;
        }

        filaEstatica[frente] = 0;

        if (frente == fin) {
            frente = 0;
            fin = -1;
        } 
        else{
            frente = (frente + 1) % filaEstatica.length;
        }

        System.out.println("Elemento Eliminado Correctamente");
    }

    public void mostrarDatos(){
        System.out.println(Arrays.toString(filaEstatica));;
    }

    public boolean estaLlena() {
        return (fin + 1) % filaEstatica.length == frente && fin != -1;
    }

    public boolean estaVacia() {
        return fin == -1;
    }

    public void menuCircular(){
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int opc;
        FilaEstaticaCircular fila = null;

        do{
            // Menu de opciones Circular
            System.out.println("\n========== MANEJO CIRCULAR DE FILAS ==========");
            System.out.println("""
                    1.- Crear Fila Estatica
                    2.- Insertar Elemento
                    3.- Eliminar Elementos
                    4.- Mostrar Elementos
                    5.- Regresar
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Logica menu de opciones
            switch (opc) {
                case 1:
                    fila = new FilaEstaticaCircular();
                    break;
                case 2:
                    System.out.print("Ingresa un Numero: ");
                    fila.insertarElementos(sc.nextInt());
                    break;
                case 3:
                    fila.eliminarElemento();
                    break;
                case 4:
                    fila.mostrarDatos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        }while (opc != 5);
        sc.close();
    }
}

public class QuequeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        FilaEstaticaSinRecorrido fesr = new FilaEstaticaSinRecorrido();
        FilaEstaticaConReccorrido fecr = new FilaEstaticaConReccorrido();
        FilaEstaticaCircular fec = new FilaEstaticaCircular();

        do{
            // Menu de opciones Circular
            System.out.println("\n========== TIPOS DE MANEJO DE FILAS ==========");
            System.out.println("""
                    1.- Manejo sin Recorrido
                    2.- Manejo con Recorrido
                    3.- Manejo Circular
                    4.- Salir
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Logica menu de opciones
            switch (opc) {
                case 1:
                    fesr.menuSinRecorrido();
                    break;
                case 2:
                    fecr.menuConRecorrido();
                    break;
                case 3:
                    fec.menuCircular();
                    break;
                case 4:
                    System.out.println("Saliendo del Programa...");
                    break;
                default:
                    System.out.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        }while (opc != 4);
        sc.close();
    }
}