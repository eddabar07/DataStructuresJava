package T5_A2_BarriosRomeroEduardoDaniel;

import java.util.Arrays;

public class AppBubbleSort3 {
    public static void main(String[] args) {
        Vectores array = new Vectores();
        BubbleSort bs = new BubbleSort();
        System.out.println("=== Algoritmos de Ordenamiento");
        int[] original_1000 = array.array1();
        int[] original_10000 = array.array2();
        int[] original_100000 = array.array3();
        int[] original_1000000 = array.array4();

        System.out.println("---------- Bubble Sort 3 (1,000 Elementos) ----------");
        int[] copy9 = Arrays.copyOf(original_1000, original_1000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy9));
        System.out.println();
        bs.bubbleSort3(copy9);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy9));

        System.out.println("---------- Bubble Sort 3 (10,000 Elementos) ----------");
        int[] copy10 = Arrays.copyOf(original_10000, original_10000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy10));
        System.out.println();
        bs.bubbleSort3(copy10);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy10));

        System.out.println("---------- Bubble Sort 3 (100,000 Elementos) ----------");
        int[] copy11 = Arrays.copyOf(original_100000, original_100000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy11));
        System.out.println();
        bs.bubbleSort3(copy11);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy11));

        System.out.println("---------- Bubble Sort 3 (1,000,000 Elementos) ----------");
        int[] copy12 = Arrays.copyOf(original_1000000, original_1000000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy12));
        System.out.println();
        bs.bubbleSort3(copy12);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy12));
    }
}
