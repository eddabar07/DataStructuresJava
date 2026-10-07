package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Dado una cadena (String) implementar
 * un metodo recursivo que permita inverir
 * dicha cadena.

 * Complejidad Algoritmo: O(n)
 */

public class Ejercicio12 {
    // Metodo recursivo
    public static String invertirCadena(String cad){
        if (cad.length() < 2){
            return cad;
        }
        return invertirCadena(cad.substring(1)) + cad.charAt(0);
    }

    static void main(){
        System.out.println("========== INVERTIR CADENA ==========");
        String inv = invertirCadena("Sistemas");
        System.out.println(inv);
    }
}
