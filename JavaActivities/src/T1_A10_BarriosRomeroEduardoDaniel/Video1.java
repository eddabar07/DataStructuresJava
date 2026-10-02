package T1_A10_BarriosRomeroEduardoDaniel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Resultado ejemplo 1 = O(1)
 * Resultado ejemplo 2 = O(n)
 * Resultado ejemplo 3 = O(n²)
 * Resultado ejemplo 4 = O(log n)
 * Video1
 */
public class Video1 {

    // O(1)
    public void ejemplo1() {
        var names = Arrays.asList("Juan", "Pablo", "Héctor", "Ana", "Karla");
        String first;

        /*
         * Acceso directo al primer elemento por índice.
         * No depende del tamaño de la lista.
         */
        if (names != null && !names.isEmpty()) {     // O(1)
            first = names.get(0);                    // O(1)
        } else {
            first = "lista Vacia";                   // O(1)
        }

        System.out.println(first);                   // O(1)
    }

    // O(n)
    public void ejemplo2() {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(5, 10, 8, 3, 666, 1, 15, 3, 11));

        /*
         * Recorre cada elemento de la lista una vez.
         * La cantidad de iteraciones crece de forma lineal con n.
         */
        for (Integer num : numbers) {                // O(n)
            System.out.println(num);                 // O(1)
        }

        int result;
        if (numbers == null || numbers.isEmpty()) {  // O(1)
            result = 0;                              // O(1)
        } else {
            /*
             * Collections.max() debe recorrer los n elementos 
             * de la lista para encontrar el valor máximo.
             */
            result = Collections.max(numbers);       // O(n)
        }

        System.out.println("Max: " + result);        // O(1)
    }

    // O(n²)
    public void ejemplo3() {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(5, 10, 8, 3, 666, 1, 15, 3, 11));

        /*
         * Ordenamiento por Burbuja (Bubble Sort).
         * 
         * Contiene dos ciclos for anidados.
         * En el peor de los casos, realiza n * n iteraciones.
         *
         * O(n) * O(n) = O(n²)
         */
        for (int i = 0; i < numbers.size() - 1; i++) {       // O(n)
            for (int j = 0; j < numbers.size() - i - 1; j++) {// O(n)
                if (numbers.get(j) > numbers.get(j + 1)) {   // O(1)
                    int temp = numbers.get(j);               // O(1)
                    numbers.set(j, numbers.get(j + 1));      // O(1)
                    numbers.set(j + 1, temp);                // O(1)
                }
            }
        }

        // Mostrar la lista
        for (int i = 0; i < numbers.size(); i++) {           // O(n)
            System.out.println(numbers.get(i));              // O(1)
        }
    }

    // O(log n)
    public void ejemplo4() {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 3, 3, 5, 8, 10, 11, 15, 666)
        );

        int element = 666;                           // O(1)

        int start = 0;                               // O(1)
        int end = numbers.size() - 1;                // O(1)

        int it = 0;                                  // O(1)
        int result = -1;                             // O(1)

        /*
         * Búsqueda Binaria (Binary Search).
         * 
         * Requiere que la lista esté ordenada.
         * En cada iteración descarta la mitad del rango de búsqueda.
         * Por lo tanto, el número de iteraciones es proporcional a log₂(n).
         */
        while (start <= end) {                       // O(log n)

            it++;                                    // O(1)

            int mid = start + (end - start) / 2;     // O(1)

            if (numbers.get(mid) == element) {       // O(1)

                System.out.println("Repeticiones: " + it);
                result = mid;                        // O(1)
                break;                               // O(1)
            }

            if (numbers.get(mid) < element) {        // O(1)
                start = mid + 1;                     // O(1)
            }

            if (numbers.get(mid) > element) {        // O(1)
                end = mid - 1;                       // O(1)
            }
        }

        System.out.println("Posición: " + result);   // O(1)
    }

}

/**
 * ¿Qué está haciendo el código?
 *
 * La clase demuestra las 4 complejidades de Big O más comunes mediante ejemplos:
 *
 * 1. ejemplo1() → O(1) - Constante:
 *    Accede únicamente al índice 0 de la lista. No importa si la lista tiene 5 o 
 *    1,000,000 de elementos, siempre realiza el mismo número de operaciones.
 *
 * 2. ejemplo2() → O(n) - Lineal:
 *    Recorre la lista con un ciclo for y luego busca el valor máximo con 
 *    Collections.max(). Ambas operaciones dependen proporcionalmente de n.
 *
 * 3. ejemplo3() → O(n²) - Cuadrático:
 *    Implementa el algoritmo Bubble Sort usando dos ciclos for anidados. 
 *    Si la lista duplica su tamaño, las operaciones se cuadruplican (n × n = n²).
 *
 * 4. ejemplo4() → O(log n) - Logarítmico:
 *    Implementa Búsqueda Binaria. Reduce el espacio de búsqueda a la mitad en 
 *    cada paso del ciclo while, logrando un tiempo de ejecución muy eficiente.
 */