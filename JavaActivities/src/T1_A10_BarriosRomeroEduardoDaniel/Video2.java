package T1_A10_BarriosRomeroEduardoDaniel;

/**
 * Ordenamiento por inserción (Insertion Sort)
 *
 * Complejidad:
 *  Peor caso = O(n²)
 *  Caso promedio = O(n²)
 *  Mejor caso = O(n)
 */
public class Video2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 8, 7, 5, 1, 2, 3};   // O(n)

        /*
         * Recorre el vector desde la segunda posición.
         *
         * El ciclo externo se ejecuta n - 1 veces.
         */
        for (int j = 1; j < arr.length; j++) {       // O(n)
            int actual = arr[j];                     // O(1)
            int i = j - 1;                           // O(1)

            /*
             * Desplaza hacia la derecha los elementos
             * que son mayores que "actual".
             *
             * En el peor caso, el while puede recorrer
             * casi todo el vector.
             *
             * Por lo tanto:
             * O(n) por cada iteración del for.
             *
             * O(n) * O(n) = O(n²)
             */
            while (i >= 0 && arr[i] > actual) {      // O(n)
                arr[i + 1] = arr[i];                 // O(1)
                i--;                                 // O(1)
            }

            arr[i + 1] = actual;                     // O(1)
        }
    }
}

/**
* ¿Qué está haciendo el código?
*
* El arreglo inicialmente es:
* [5, 3, 4, 8, 7, 5, 1, 2, 3]
* 
* El algoritmo toma un elemento (actual) y lo inserta en la posición 
* correcta dentro de la parte izquierda que ya está ordenada.
* 
* Por ejemplo, comienza con:
* [5, 3, 4, 8, 7, ...]
* 
* Toma 3:
* actual = 3
* 
* Como 5 > 3, desplaza el 5:
* [5, 5, 4, 8, ...]
* 
* Y coloca el 3:
* [3, 5, 4, 8, ...]
* 
* Después toma 4 y lo inserta:
* [3, 4, 5, 8, ...]
* 
* ¿Por qué es O(n²)?
*
* Porque tienes un ciclo for que puede ejecutarse n veces, y dentro 
* hay un while que en el peor caso también puede recorrer n elementos: 
* n × n = n²
*
* Por eso:
* Resultado final → O(n²).
*/