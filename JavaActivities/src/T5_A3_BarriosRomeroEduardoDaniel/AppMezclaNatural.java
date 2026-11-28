package T5_A3_BarriosRomeroEduardoDaniel;

import java.util.Arrays;

public class AppMezclaNatural {
    public static void main(String[] args) {
        Vectores array = new Vectores();
        MezclaNatural mn = new MezclaNatural();
        System.out.println("=== Algoritmos de Ordenamiento");
        int[] original_1000 = array.array1();
        int[] original_10000 = array.array2();
        int[] original_100000 = array.array3();
        int[] original_1000000 = array.array4();

        System.out.println("---------- Mezcla Directa (1,000 Elementos) ----------");
        System.out.println("Vector Desordenado: " + Arrays.toString(original_1000));
        int[] res = mn.ordenar(original_1000);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(res));

        System.out.println("---------- Mezcla Directa (10,000 Elementos) ----------");
        System.out.println("Vector Desordenado: " + Arrays.toString(original_10000));
        int[] res2 = mn.ordenar(original_10000);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(res2));

        System.out.println("---------- Mezcla Directa (100,000 Elementos) ----------");
        System.out.println("Vector Desordenado: " + Arrays.toString(original_100000));
        int[] res3 = mn.ordenar(original_100000);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(res3));

        System.out.println("---------- Mezcla Directa (1,000,000 Elementos) ----------");
        System.out.println("Vector Desordenado: " + Arrays.toString(original_1000000));
        int[] res4 = mn.ordenar(original_1000000);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(res4));
    }
}
