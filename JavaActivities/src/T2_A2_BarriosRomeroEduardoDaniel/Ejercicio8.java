package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Dado un número natural N y un número
 * natrual R, implementar un metodo recursivo
 * que permita rotar los digitos de N, la cantidad
 * de veces que indique R
 * Complejidad Algoritmo: O(log10(N) + R)
 */

public class Ejercicio8 {
    // Metodo recursivo
    public static int rotarNumero(int n, int r){
        int expo = contarDigitos(n) - 1;
        int multi = (int) Math.pow(10, expo);

        return rotarNumero(n, r, multi);
    }

    private static int rotarNumero(int n, int r, int multi){
        if (r == 0){
            return n;
        }
        n = rotarDigito(n, multi);
        return rotarNumero(n, r - 1, multi);
    }

    private static int rotarDigito(int n, int m){
        int dig = n % 10;
        n = n / 10;
        dig = dig * m;
        n = dig + n;
        return n;
    }

    private static int contarDigitos(int num){
        if (num < 10){
            return 1;
        }
        num = num / 10;
        return 1 + contarDigitos(num);
    }

    static void main() {
        System.out.println("========== ROTAR NUMERO ==========");
        int rotacion = rotarNumero(12587, 1);
        System.out.println(rotacion);
    }
}
