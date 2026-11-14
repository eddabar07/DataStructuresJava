import java.util.Arrays;

public class MezclaDirecta {
    public static int[] mergeSort(int[] numeros){
        // Caso base
        if (numeros.length <= 1){
            return numeros;
        }

        // Dividimos el arreglo en 2 mitades
        int mitad = numeros.length / 2;
        int[] izquierda = Arrays.copyOfRange(numeros, 0, mitad);
        int[] derecha = Arrays.copyOfRange(numeros, mitad, numeros.length);

        // Llamamos al mismo metodo para ordenar los arreglos auxiliares
        int[] izquierdaOrdenado = mergeSort(izquierda);
        int[] derechaOrdenado = mergeSort(derecha);

        

        // Combinamos los arreglos auxiliares ordenados
        return merge(izquierdaOrdenado, derechaOrdenado);
    }

    // Metodo que combina los arreglos auxiliares previamente ordenados recibiendolos como parametros
    private static int[] merge(int[] izquierda, int[] derecha){
        // Arreglo donde guardaremos el resultado con el tamanio de la suma de los arreglos auxiliares
        int[] ordenado = new int[izquierda.length + derecha.length];

        // Variables auxiliares que nos ayudaran a avanzar de posicion en cada arreglo
        int izq = 0;
        int der = 0;
        int ord = 0;

        // Recorrer ambos arreglos mientras haya elementos
        while (izq < izquierda.length && der < derecha.length){
            // Comparamos elementos de ambos arreglos y los asignamos al resultado
            if (izquierda[izq] < derecha[der]){
                ordenado[ord++] = izquierda[izq++]; // Asigna el elemento y avanza a la siguiente posicion
            } else {
                ordenado[ord++] = derecha[der++];
            }
        }

        // Asignamos los elemento restantes de cada subarreglo al arreglo ordenado (en caso de haber)
        while (izq < izquierda.length) {
            ordenado[ord++] = izquierda[izq++];
        }

        while (der < derecha.length){
            ordenado[ord++] = derecha[der++];
        }
        
        // Devolvemos el arreglo ordenado
        return ordenado;
    }

    public static void main(String[] args) {
        int datos[] = {9,243,1236,2,8,9,4,2,6,7,8,9,8,76,654,3,23,456,7,8,94,1213};
        long tInicio, tFin;
        System.out.println("---------- Burbuja 1 ----------");
        int copy1[] = Arrays.copyOf(datos, datos.length);
        System.out.println("Array Original: " + Arrays.toString(copy1));
        tInicio = System.nanoTime();
        int[] ord = mergeSort(copy1);
        tFin = System.nanoTime();
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
        System.out.println("Array Ordenado: " + Arrays.toString(ord));
    }
}
