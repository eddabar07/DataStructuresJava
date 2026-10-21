package Sesion14_StaticStackExample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Implementacion de una estructura PILA (stack) con VECTORES (arrays)
 * 
 * Operaciones:
 *  1.- Crear
 *  2.- Agregar/Insertar (PUSH)
 *  3.- Eliminar (POP)
 *  4.- Mostrar Cima (peek) o ultimo elemento insertado
 *  5.- Mostrar cantidad de elementos existentes
 *  6.- Vaciar/Restablecer
 * 
 *  7.- Mostrar elementos (NO ES UNA OPERACION CORRECTA EN LAS PILAS)
 */

class PilaEstatica{
    // Declaracion de variables
    Scanner sc = new Scanner(System.in);
    private int datos [];
    private int cima;

    // 1.- Crear
    public PilaEstatica(int tam) {
        // Asiganr el tamaño y la posicion de la cima
        datos = new int[tam];
        cima = -1;
    }

    public PilaEstatica(){
        cima = -1;
    }

    // 2.- Insertar (PUSH)
    public void insertar(){
        // Generar un numero random
        Random rand = new Random();
        int dato = rand.nextInt(100);

        // Insertar el numero si la pila no esta llena
        if (!verificarPilaLLena()){
            cima ++;
            datos[cima] = dato;
            System.out.println("Dato Insertado Correctamente");
        }

        // Mostrar cuando la pila este llena
        else{
            System.out.println("La pila se encuentra llena. No se permite ingresar mas elementos");
        }
    }

    // 3.- Eliminat (POP)
    public void eliminar(){
        if (!verificarPilaVacia()){
            datos[cima] = 0;
            cima --;
        }
        else{
            System.out.println("La pila se encuentra vacia. No hay elementos para eliminar");
        }
    }

    // 4.- Mostrar Cima
    public void mostrarCima(){
        if (!verificarPilaVacia()){
            System.out.println("Cima: " + datos[cima]);
        }
        else{
            System.out.println("La pila se encuentra vacia.");
        }
    }

    // 5.- Mostrar cantidad de elementos existentes
    public void mostrarCantidadElementos(){
        if (!verificarPilaVacia()){
            System.out.println("Elementos Existentes: " + (cima + 1));
        }
        else{
            System.out.println("La pila se encuentra vacia.");
        }
    }

    // 6.- Vaciar
    public void vaciar(){
        if (!verificarPilaVacia()){
            cima = -1;
            System.out.println("Pila Vaciada Correctamente");
        }
        else{
            System.out.println("La pila se encuentra vacia");
        }
    }

    // 7.- Solo para pruebas, recorrer o mostrar datos
    public void mostrarDatos(){
        if (!verificarPilaVacia()){
            System.out.println(Arrays.toString(datos));
        }
        else{
            System.out.println("La pila se encuentra vacia");
        }
    }

    // Metodos auxiliares
    public boolean verificarPilaLLena(){
        return cima == datos.length - 1;
    }

    public boolean verificarPilaVacia(){
        return cima == -1;
    }
}

public class StackTest {
    public static void main(String[] args) {
        // Declaracion de variables
        PilaEstatica pe = new PilaEstatica();
        Scanner sc = new Scanner(System.in);
        byte opc;

        do{
            // Menu de opciones usuario
            System.out.println("\n========== PILA ESTATICA ==========");
            System.out.println("""
                    1.- Crear
                    2.- Agregar/Insertar (PUSH)
                    3.- Eliminar (POP)
                    4.- Mostrar Cima (peek) o ultimo elemento insertado
                    5.- Mostrar cantidad de elementos existentes
                    6.- Vaciar/Restablecer
                    7.- Mostrar elementos (NO ES UNA OPERACION CORRECTA EN LAS PILAS)
                    0.- Salir
                    """);
            System.out.print("Ingresa una opcion: ");
            opc = sc.nextByte();
            sc.nextLine();
                
            // Menu de opciones logica
            switch (opc) {
                case 1:
                    System.out.println("¿Cuántos elementos deseas guardar en la pila?");
                    pe = new PilaEstatica(sc.nextInt());
                    System.out.println("Pila Generada Correctamente");
                    break;
                case 2:
                    pe.insertar();
                    break;
                case 3:
                    pe.eliminar();
                    break;
                case 4:
                    pe.mostrarCima();
                    break;
                case 5:
                    pe.mostrarCantidadElementos();
                    break;
                case 6:
                    pe.vaciar();
                    break;
                case 7:
                    pe.mostrarDatos();
                    break;
                case 0:
                    System.out.println("Salinedo del Programa...");
                    break;
                default:
                    System.err.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        } while (opc != 0);
        sc.close();
    }
}
