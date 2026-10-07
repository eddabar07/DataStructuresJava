package T2_A2_BarriosRomeroEduardoDaniel;

/**
 * Implementar un metodo recursivo
 * que permita saber si una cadena
 * (String) esta formada, de tal manera
 * que todos sus caracteres sean distintos
 * entre si.

 * Complejidad Algoritmo: O(n²)
 */

public class Ejercicio14 {
    // Metodo Recursivo
    public static boolean verificarCadena(String cad){
        int pos = 0;
        String aux = "";
        return verificarCadena(cad, pos, aux);
    }

    private static boolean verificarCadena(String cad, int pos, String aux){
        if (pos == cad.length()){
            return true;
        }
        char actual = cad.charAt(pos);
        if (aux.contains(actual + "")){
            return false;
        }
        else{
            aux = aux + actual;
            return verificarCadena(cad, pos + 1, aux);
        }
    }

    static void main(){
        System.out.println("========== FORMACION CADENA ==========");
        boolean result = verificarCadena("unicornio");
        System.out.println("¿La cadena esta formada por caracteres distintos?: " + result);
    }
}