package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Dado dos números enteros positivos, 
 * implementar un metodo recursivo que
 * permita realizar la operacion aritmetica
 * de division mediante restas sucesivas

 * Complejidad Algoritmo: O(n)
 */
public class Ejercicio4 {
    // Metodo recursivo
    public static int division(int n1, int n2){
        if (n1 < n2){
            return 0;
        }
        return 1 + division(n1 - n2, n2);
    }

    static void main() {
        System.out.println("========== DIVISION ==========");
        int result = division(17, 4);
        System.out.println("Resultado: " + result);
    }
}
