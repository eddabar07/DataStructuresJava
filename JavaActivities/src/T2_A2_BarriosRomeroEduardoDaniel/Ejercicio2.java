package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Dado un número entero N, no negativo,
 * implementar un metodo recursivo que
 * permita saber cual es el factorial de 
 * dicho numero.

 * Complejidad Algoritmo: O(n)
 */

public class Ejercicio2 {
    // Metodo recursivo
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void main() {
        System.out.println("========== FACTORIAL ==========");
        int fact = factorial(0);
        System.out.println("Factorial: " + fact);
    }
}
