package T1_A10_BarriosRomeroEduardoDaniel;

/**
 * Análisis de complejidad temporal.
 *
 * Operaciones básicas: O(1)
 *
 * Tiempo de un if:
 * O(max(bloque_if, bloque_else))
 *
 * Tiempo de un for:
 * Se obtiene sumando los tiempos de las operaciones
 * que realiza el ciclo.
 *
 * COMPLEJIDAD:
 * 
 *  Ejemplo 1:
 *      Mejor Caso = O(n)
 *      Caso promedio = O(n) 
 *      peor caso = O(n)
 * 
 *  Ejemplo 2:
 *      Mejor caso = O(n²)
 *      Caso promedio = O(n²)
 *      Peor caso = O(n²)
 * 
 *  Ejemplo 3:
 *      Mejor caso = O(1) -> cuando n <= 1
 *      Caso promedio = O(n)
 *      Peor caso = O(n) -> cuando n >= 1
 */
public class Video3 {
    // EJEMPLO 1: Suma todos los elementos de un arreglo
    public int ejemplo1(int arreglo[], int tam_arreglo) {
        int i;              // O(1)
        int suma = 0;       // O(1)

        /*
         * El ciclo se ejecuta tam_arreglo veces.
         *
         * TFor = O(1) + O(1) + ... + O(1)
         *      = tam_arreglo * O(1)
         *      = O(n)
         */
        for (i = 0; i < tam_arreglo; i = i + 1) {
            suma = suma + arreglo[i];    // O(1)
        }
        return suma;        
        //T(n) = O(1) + O(n) + O(1) = O(n + 2) = O(n)
    }
    
     
    //EJEMPLO 2: Utiliza dos ciclos for anidados.
    public int ejemplo2(int N) {
        int a = 0;          // O(1)
        int i, j;            // O(1)

        /*
         * El primer ciclo se ejecuta N veces.
         * El segundo ciclo también se ejecuta N veces
         * por cada iteración del primer ciclo.
         *
         * N * N * O(1) = O(N²)
         */

        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                a = a + 1 + j;      // O(1)
            }
        }
        return a;
        // T(n) = O(1) + O(n²) + O(1) = O(n² + 1) = O(n²)

    }

    //EJEMPLO 3: Calcula el factorial de un número.
    public int ejemplo3(int n) {
        int i, factorial;       // O(1)

        //Caso base
        if (n <= 1) {            // O(1)
            factorial = 1;       // O(1)
        }

        // Caso general
        else {                   
            factorial = 1;       // O(1)

            /*
             * El ciclo se ejecuta aproximadamente n veces.
             *
             * Complejidad = O(n)
             */
            for (i = 2; i <= n; i = i + 1) {
                factorial = factorial * i;     // O(1)
            }
        }

        /*
         * Tif = O(max(T1, T2))
         *
         * T1 = O(1)
         * T2 = O(n)
         *
         * Por lo tanto:
         *
         * Tif = O(n)
         */

        return factorial;
        // T(n) = O(1) + O(n) =  O(n)
    }
}

/**
* ¿Qué hace cada ejemplo?

* ejemplo1() → O(n)
* Recorre el arreglo una sola vez. Si hay n elementos, realiza aproximadamente n operaciones.

* ejemplo2() → O(n²)
* Tiene un for dentro de otro for. Por cada una de las n iteraciones externas hace n iteraciones internas: n * n = n².

* ejemplo3() → O(n)
* Calcula el factorial recorriendo desde 2 hasta n, por lo que el número de operaciones crece linealmente.
*/