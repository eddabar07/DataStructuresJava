package T5_A3_BarriosRomeroEduardoDaniel;

import java.util.Arrays;

public class MezclaDirecta {
     public static int[] ordenarMezclaDirecta(int[] numeros){
        // Caso base 
        if (numeros.length <= 1){
            return numeros;
        }

        // Dividmos nuestro vector en dos
        int mitad = numeros.length / 2;
        int[] izquierda = Arrays.copyOfRange(numeros, 0, mitad);
        int[] derecho = Arrays.copyOfRange(numeros, mitad, numeros.length);

        // Ordenar vectores auxiliares
        int[] izquierdaOrdeando = ordenarMezclaDirecta(izquierda);
        int[] derechaOrdeando = ordenarMezclaDirecta(derecho);

        // Retorno de vectores ordenados
        return mezclaDirecta(izquierdaOrdeando, derechaOrdeando);
    }

    private static int[] mezclaDirecta(int[] izquierda, int[] derecho){
        int[] resultado = new int [izquierda.length + derecho.length];

        // variables auxiliares
        int izq = 0;
        int der = 0;
        int result = 0;

        while (izq < izquierda.length && der < derecho.length){
            if (izquierda[izq] < derecho[der]){
                resultado[result++] = izquierda[izq++];
            } else {
                resultado[result++] = derecho[der++];
            }
        }

        while (der < derecho.length){
            resultado[result++] = derecho[der++];
        }

        while (izq < izquierda.length){
                resultado[result++] = izquierda[izq++];
        }

        // retornar el vector ordenado
        return resultado;
    }
}
