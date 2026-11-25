package Sesion21_ExternSortingAlgorithms;

import java.util.Arrays;

class MezclaNatural {

    private long recorridos = 0;
    private long comparaciones = 0;
    private long intercambios = 0;

    public void ordenar(int[] datos) {

        while (!estaOrdenado(datos)) {

            recorridos++;

            int inicio1 = 0;

            while (inicio1 < datos.length - 1) {

                int fin1 = encontrarFinSecuencia(datos, inicio1);

                if (fin1 == datos.length - 1) {
                    break;
                }

                int inicio2 = fin1 + 1;
                int fin2 = encontrarFinSecuencia(datos, inicio2);

                mezclar(datos, inicio1, fin1, inicio2, fin2);

                inicio1 = fin2 + 1;
            }
        }
    }

    private int encontrarFinSecuencia(int[] datos, int inicio) {

        while (inicio < datos.length - 1) {

            comparaciones++;

            if (datos[inicio] <= datos[inicio + 1]) {
                inicio++;
            } else {
                break;
            }
        }

        return inicio;
    }

    private void mezclar(int[] datos, int inicio1, int fin1,
                         int inicio2,
                         int fin2) {

        int[] aux = new int[fin2 - inicio1 + 1];

        int i = inicio1;
        int j = inicio2;
        int k = 0;

        while (i <= fin1 && j <= fin2) {

            comparaciones++;

            if (datos[i] <= datos[j]) {
                aux[k++] = datos[i++];
            } else {
                aux[k++] = datos[j++];
            }
        }

        while (i <= fin1) {
            aux[k++] = datos[i++];
        }

        while (j <= fin2) {
            aux[k++] = datos[j++];
        }

        for (int x = 0; x < aux.length; x++) {

            datos[inicio1 + x] = aux[x];

            intercambios++;
        }
    }

    private boolean estaOrdenado(int[] datos) {

        for (int i = 0; i < datos.length - 1; i++) {

            comparaciones++;

            if (datos[i] > datos[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public long getRecorridos() {
        return recorridos;
    }

    public long getComparaciones() {
        return comparaciones;
    }

    public long getIntercambios() {
        return intercambios;
    }
}

public class OrdenamientoExterno {
    // Metodo de intercalacion
    public static int[] ordenamientoIntercalacion(int[] a, int[] b){
        int[] resultado = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                resultado[k++] = a[i++];
            } else {
                resultado[k++] = b[j++];
            }
        }

        while (i < a.length){
            resultado[k++] = a[i++];
        }

        while (j < b.length){
            resultado[k++] = b[j++];
        }
        
        return resultado;
    }

    public static int[] ordenarMezclaDirecta(int[] numeros){
        // Caso base 
        if (numeros.length <= 1){
            return numeros;
        }

        // Dividmos nuestro vector en dos
        int mitad = numeros.length / 2;
        int[] izquierda = Arrays.copyOfRange(numeros, 0, mitad);
        int[] derecho = Arrays.copyOfRange(numeros, mitad, numeros.length);

        // Ordenar vectores auxiliares
        int[] izquierdaOrdeando = ordenarMezclaDirecta(izquierda);
        int[] derechaOrdeando = ordenarMezclaDirecta(derecho);

        // Retorno de vectores ordenados
        return mezclaDirecta(izquierdaOrdeando, derechaOrdeando);
    }

    private static int[] mezclaDirecta(int[] izquierda, int[] derecho){
        int[] resultado = new int [izquierda.length + derecho.length];

        // variables auxiliares
        int izq = 0;
        int der = 0;
        int result = 0;

        while (izq < izquierda.length && der < derecho.length){
            if (izquierda[izq] < derecho[der]){
                resultado[result++] = izquierda[izq++];
            } else {
                resultado[result++] = derecho[der++];
            }
        }

        while (der < derecho.length){
            resultado[result++] = derecho[der++];
        }

        while (izq < izquierda.length){
                resultado[result++] = izquierda[izq++];
        }

        // retornar el vector ordenado
        return resultado;
    }

    

    public static void main(String[] args) {
        System.out.println("---------- Intercalacion ----------");
        int[] datos_a = {1, 2, 4, 6};
        int[] datos_b = {3, 5};
        
        int[] listaOrdenada = ordenamientoIntercalacion(datos_a, datos_b);
        System.out.println(Arrays.toString(listaOrdenada));

        System.out.println("---------- Mezcla Directa ----------");
        int datos[] = {9,243,1236,2,8,9,4,2,6,7,8,9,8,76,654,3,23,456,7,8,94,1213};
        long tInicio, tFin;

        System.out.println("Antes del Ordenamiento");
        System.out.println(Arrays.toString(datos));

        tInicio = System.nanoTime();
        int[] ordeando = ordenarMezclaDirecta(datos);
        tFin= System.nanoTime();

        System.out.println("Tiempo de Ejecucion: " + (tFin - tInicio) + " Nanosegundos");
        System.out.println("Despues del Ordenamiento");
        System.out.println(Arrays.toString(ordeando));

        System.out.println("---------- Mezcla Natural ----------");
        int[] copy = Arrays.copyOf(datos, datos.length);
        
        MezclaNatural MN = new MezclaNatural();
        long inicio1 = System.nanoTime();
        MN.ordenar(copy);
        long final1 = System.nanoTime();
        long total1 = final1 - inicio1;
        
        System.out.println("El resultado en tiempo fue de " + total1 + " ns");
        System.out.println("Recorridos: " + MN.getRecorridos());
        System.out.println("Comparaciones: " + MN.getComparaciones());
        System.out.println("Intercambios: " + MN.getIntercambios());
    }
}

