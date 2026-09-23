package Sesion05_DynamicArrayADTExample;
/*
Vectores en JAVA

    int datos [];
    datos = new [10];
    datos [4] = 100;

    int datos [] = new int[10];
    int datos [] = {90, 80, 100};

    Crear nuesra propia implementacion de VECTOR MUTABLE

1) Datos -> vector de eneteros
2) Crear 
3) Llenar
4) Agregar elemento al FINAL
5) Agregar elemento al INICIO
6) Mostrar elementos
7) Eliminar elemento del INICIO
8) Eliminar elemento del FINAL
*/

import java.util.Scanner;

class Vector{
    Scanner sc = new Scanner(System.in);
    int datos [];
    int tamaño;

    // 1) Crear
    public void crear(int capacidad){
        datos = new int[capacidad];
    }

    // Constructor
    public Vector(){}

    // 3) Llenar
    public void llenar(int capacidad) {
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
            tamaño++;
        }
    }

    // 4) Agregar al final
    public void agregarFinal(int valor) {
        if (tamaño == datos.length){
            System.out.println("No se pueden agregar mas datos. El vector esta lleno");
            return;
        }
        datos[tamaño] = valor;
        tamaño++;
    }

    // 5) Agregar al inicio
    public void agregarInicio(int valor) {
        if (tamaño == datos.length){
            System.out.println("No se pueden agregar mas datos. El vector esta lleno");
            return;
        }
        // Recorrer todo hacia la derecha para hacer espacio
        for (int i = tamaño; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = valor;
        tamaño++;
    }

    // 6) Mostrar elementos
    public void mostrar() {
        System.out.print("Vector: [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(datos[i]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 7) Eliminar del inicio
    public void eliminarInicio() {
        if (tamaño == 0) {
            System.out.println("El vector esta vacio.");
            return;
        }
        // Recorrer todo hacia la izquierda
        for (int i = 0; i < tamaño - 1; i++) {
            datos[i] = datos[i + 1];
        }
        tamaño--;
    }

    // 8) Eliminar del final
    public void eliminarFinal() {
        if (tamaño == 0) {
            System.out.println("El vector esta vacio.");
            return;
        }
        tamaño--; 
    }

}

public class ProblemaVectorEspecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int opcion;

        do {
            System.out.println("\n1) Crear y Llenar");
            System.out.println("2) Agregar al final");
            System.out.println("3) Agregar al inicio");
            System.out.println("4) Mostrar");
            System.out.println("5) Eliminar del inicio");
            System.out.println("6) Eliminar del final");
            System.out.println("0) Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el tamaño del vector: "); 
                    v.crear(sc.nextInt());
                    System.out.print("¿Cuantos elementos deseas ingresar?: ");
                    v.llenar(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Valor a agregar al final: ");
                    v.agregarFinal(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Valor a agregar al inicio: ");
                    v.agregarInicio(sc.nextInt());
                    break;
                case 4:
                    v.mostrar();
                    break;
                case 5:
                    v.eliminarInicio();
                    break;
                case 6:
                    v.eliminarFinal();
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }
}
