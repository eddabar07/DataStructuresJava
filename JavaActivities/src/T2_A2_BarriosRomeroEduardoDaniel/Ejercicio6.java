package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Dado un número entero, no negativo, 
 * se pide implementar un metodo recurisvo
 * que te permita invertir (el orden de los digitos)
 * de dicho número.

 * Complejidad Algoritmo: O(log10(N))
 */
public class Ejercicio6 {
    // Metodo recursivo
    public static int invertirNum(int num){
        int res = 0;
        return invertirNumero(num, res);
    }

    public static int invertirNumero(int num, int res){
        if (num == 0){
            return res;
        }
        int resi = num % 10;
        num = num / 10;
        res = (res * 10) + resi;
        return invertirNumero(num, res);
    }

    static void main() {
        System.out.println("========== INVERITR NUMERO ==========");
        int resultado = invertirNum(1234);
        System.out.println(resultado);
    }
}
