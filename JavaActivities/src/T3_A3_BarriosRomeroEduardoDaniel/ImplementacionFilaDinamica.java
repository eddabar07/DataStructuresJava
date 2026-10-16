package T3_A3_BarriosRomeroEduardoDaniel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class ImplementacionFilaDinamica implements RegistroImpresiones{
    Queue <Impresion> colaImpresion = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    @Override 
    public void imprimir(){
        System.out.println("=== COLA DE IMPRESION ===");
        for (Impresion i : colaImpresion){
            System.out.println(i);
        }
    }

    @Override 
    public void agregarColaImpresion(){
        if (estaLlena()){
            System.out.println("La fila de impresion se encuentra llena");
            return;
        }

        // Generar parametros random
        Random rand  = new Random();
        int identificador = rand.nextInt(256);
        int tamañoArchivo = rand.nextInt(10000);
        int cantidadHojas = rand.nextInt(256);

        Impresion impresion = new Impresion(identificador, tamañoArchivo, cantidadHojas);
        
        colaImpresion.add(impresion);
        
        System.out.println("Archivo Cargado Correctamente");
    }

    @Override 
    public void eliminarColaImpresion(){
        if (estaVacia()) {
            System.out.println("La fila de impresion se encuentra vacia");
            return;
        }

        System.out.println("--- Archivo Eliminado ---");
        System.out.println(colaImpresion.poll());
    }

    @Override 
    public void mostrarTotalBytes(){
        if (estaVacia()) {
            System.out.println("La fila de impresion se encuentra vacia");
            return;
        }

        int sumaBytes = 0;

        for (Impresion imp : colaImpresion){
            int bytes = imp.getTamañoArchivo();

            for(int i = 0; i <= 0; i++){
                sumaBytes += bytes;
            }
        }
        System.out.println("Total de Bytes: " + sumaBytes + " Bytes");
    }

    @Override 
    public void mostrarTotalHojasImpresas(){
        if (estaVacia()) {
            System.out.println("La fila de impresion se encuentra vacia");
            return;
        }

        int sumaHojas = 0;

        for (Impresion imp : colaImpresion){
            int hojas = imp.getCantidadHojas();

            for(int i = 0; i <= 0; i++){
                sumaHojas += hojas;
            }
        }
        System.out.println("Total de Hojas Impreas: " + sumaHojas + " Hojas");
    }

    // metodos auxiliares
    @Override 
    public boolean estaLlena() {
        return colaImpresion.size() == 5;
    }

    @Override 
    public boolean estaVacia() {
        return colaImpresion.isEmpty();
    }

    @Override
    public void menu(){
        // Declaracion de variables
        int opc;

        do{
            // Menu de opciones Usuario
            System.out.println("\n--- MANEJO DE COLA DE IMPRESION DINAMICA ---");
            System.out.println("""
                    1.- Imprimir
                    2.- Agregar a la Cola de Impresión
                    3.- Eliminar de a Cola de Impresión
                    4.- Mostra Total de Bytes Impresos
                    5.- Mostrar Total de Hojas Impresas
                    6.- Salir
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones Logica
            switch (opc) {
                case 1:
                    imprimir();
                    break;
                case 2:
                    agregarColaImpresion();
                    break;
                case 3:
                    eliminarColaImpresion();
                    break;
                case 4: 
                    mostrarTotalBytes();
                    break;
                case 5:
                    mostrarTotalHojasImpresas();
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        } while(opc != 6);
    }
}
