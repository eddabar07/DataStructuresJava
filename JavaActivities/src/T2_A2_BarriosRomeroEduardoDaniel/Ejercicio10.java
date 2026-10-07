package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Dado un número natural N implementar
 * un metodo recursivo que permita saber
 * si dicho número es Perfecto, Defectivo
 * o Abundante.

 * Complejidad Algoritmo: O(n)
 */

public class Ejercicio10 {
    // Metodos Recursivos
    public static String verificarNumero(int num){
        int div = 1;
        int sumatoria = sumarDivisoresPropios(num, div);
        if (sumatoria == num){
            return "Es un Número Perfecto";
        }
        else if (sumatoria < num){
            return "Es un Número Defectivo";
        }
        else{
            return "Es un Número Abundante";
        }
    }

    private static int sumarDivisoresPropios(int num, int div){
        int aux = 0;

        if (div > (num / 2)){
            return 0;
        }
        else if (num % div == 0) {
            aux = div;
        }
        return aux + sumarDivisoresPropios(num, div + 1);
    }

    static void main(){
        System.out.println("========== NUMEROS ==========");
        String result = verificarNumero(16);
        System.out.println("El número es: " + result);
    }
}
