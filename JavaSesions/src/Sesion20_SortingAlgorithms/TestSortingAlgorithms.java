package Sesion20_SortingAlgorithms;

import java.util.Arrays;

/**
 * ALGORITMOS DE ORDENAMIENTO
 * 
 * 1. Burbuja
 */

class SortingMethods{
    public static  void bubbleSort1 (int[] array){
        long tInicio, tFin;
        tInicio = System.nanoTime();
        int aux;
        int intercambios = 0;

        for (int i = 1; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i; j++){
                if (array[j] > array[j + 1]){
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios ++;
                }
            }
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }

    public static  void bubbleSort2(int[] array){
        long tInicio, tFin;
        tInicio = System.nanoTime();
        int aux;
        int i = 1;
        boolean sort = false;
        int intercambios = 0;

        while ((i < array.length) || sort == false) {
            i = i + 1;
            sort = true;
            for(int j = 0; j < array.length - i; j++){
                if(array[j] > array[j + 1]){
                    sort = false;
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios ++;
                }
            }
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }

    public static  void bubbleSort3(int[] array){
        long tInicio, tFin;
        int aux;
        int i = 1;
        boolean sort = false;
        int intercambios = 0;
        tInicio = System.nanoTime();

        do{
            i = i + 1;
            sort = true;
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    sort = false;
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios ++;
                }
            }
        } while (!(i < array.length) || sort == false);
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }

    public static  void insertionSort(int[] array){
        long tInicio, tFin;
        int intercambios = 0;
        tInicio = System.nanoTime();
        int aux;
        int j;

        for (int i = 1; i < array.length - 1; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j = j - 1;
                intercambios++;
            }
            array[j + 1] = aux;
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }

    static int intercambios;
    public static void ordenarQuickSort(int[] array){
        long tInicio, tFin;
        tInicio = System.nanoTime();

        if (array != null && array.length > 1){
            quickSort(array, 0, array.length - 1);
        }

        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
    }

    private static void quickSort(int[] array, int inicio, int fin){
        if (fin <= inicio){
            return;
        }

        int pivote = division(array, inicio, fin);
        quickSort(array, inicio, pivote - 1);
        quickSort(array, pivote + 1, fin);
    }

    private static int division(int[] array, int inicio, int fin) {
        int pivote = array[fin];
        int i = inicio - 1;

        for (int j = inicio; j <= fin; j++){
            if (array[j] < pivote){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                intercambios++;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[fin];
        array[fin] = temp;
        return i;
    }

    public static void ordenarShellSort(int[] array){
        long tInicio, tFin;
        int intercambios = 0;

        tInicio = System.nanoTime();

        int salto = array.length / 2;
        while(salto > 0){
            for(int i = salto; i < array.length; i++){
                int aux = array[i];
                int j = i;
                while (j >= salto && array[j - salto] > aux) {
                    array[j] = array[j - salto];
                    j = j - salto;
                    intercambios++;
                }
                array[j] = aux;
            }
            salto = salto / 2;
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
    }

    public static void ordenarRadixSort(int[] array){
        long tInicio, tFin;
        int intercambios = 0;

        tInicio = System.nanoTime();

        int maxValor = array.length;

        for (int i = 0; i < array.length; i++){
            int numero = array[i];
            if (numero > maxValor){
                maxValor = numero;
            }
        }
        int exponente = 1;
        int[] contador = new int[10];
        int[][] cajitas = new int[10][array.length];

        while (maxValor / exponente > 0){
            for (int i = 0; i < array.length; i++){
                int num = array[i];
                int digito = (num / exponente) % 10;
                cajitas[digito][contador[digito]] = num;
                contador[digito]++;
            }
            int indice = 0;
            for(int fila = 0; fila < 10; fila++){
                for(int col = 0; col < contador[fila]; col++){
                    array[indice] = cajitas[fila][col];
                    indice++;
                }
                contador[fila] = 0;
            }
            exponente*=10;
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
    }
}

public class TestSortingAlgorithms {
    public static void main(String[] args) {

        System.out.println("========== Prueba de Algoritmos ==========");
        int datos[] = {9,243,1236,2,8,9,4,2,6,7,8,9,8,76,654,3,23,456,7,8,94,1213};
        System.out.println("---------- Burbuja 1 ----------");
        int copy1[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy1));
        SortingMethods.bubbleSort1(copy1);
        System.out.println("Array Ordenado: " + Arrays.toString(copy1));
        
        System.out.println("---------- Burbuja 2 ----------");
        int copy2[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy2));
        SortingMethods.bubbleSort2(copy2);
        System.out.println("Array Ordenado: " + Arrays.toString(copy2));

        System.out.println("---------- Burbuja 3 ----------");
        int copy3[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy3));
        SortingMethods.bubbleSort3(copy3);
        System.out.println("Array Ordenado: " + Arrays.toString(copy3));

        System.out.println("---------- Insercion ----------");
        int copy4[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy4));
        SortingMethods.insertionSort(copy4);
        System.out.println("Array Ordenado: " + Arrays.toString(copy4));

        System.out.println("---------- QuickSort ----------");
        int copy5[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy5));
        SortingMethods.ordenarQuickSort(copy5);
        System.out.println("Array Ordenado: " + Arrays.toString(copy5));

        System.out.println("---------- ShellSort ----------");
        int copy6[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy6));
        SortingMethods.ordenarShellSort(copy6);
        System.out.println("Array Ordenado: " + Arrays.toString(copy6));

        System.out.println("---------- RadixSort ----------");
        int copy7[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy7));
        SortingMethods.ordenarRadixSort(copy7);
        System.out.println("Array Ordenado: " + Arrays.toString(copy7));
    }
}