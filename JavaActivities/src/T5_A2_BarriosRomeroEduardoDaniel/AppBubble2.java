package T5_A2_BarriosRomeroEduardoDaniel;

import java.util.Arrays;

public class AppBubble2 {
    public static void main(String[] args) {
        Vectores array = new Vectores();
        BubbleSort bs = new BubbleSort();
        System.out.println("=== Algoritmos de Ordenamiento");
        int[] original_1000 = array.array1();
        int[] original_10000 = array.array2();
        int[] original_100000 = array.array3();
        int[] original_1000000 = array.array4();

        System.out.println("---------- Bubble Sort 2 (1,000 Elementos) ----------");
        int[] copy1 = Arrays.copyOf(original_1000, original_1000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy1));
        System.out.println();
        bs.bubbleSort2(copy1);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy1));

        System.out.println("---------- Bubble Sort 2 (10,000 Elementos) ----------");
        int[] copy2 = Arrays.copyOf(original_10000, original_10000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy2));
        System.out.println();
        bs.bubbleSort2(copy2);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy2));

        System.out.println("---------- Bubble Sort 2 (100,000 Elementos) ----------");
        int[] copy3 = Arrays.copyOf(original_100000, original_100000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy3));
        System.out.println();
        bs.bubbleSort2(copy3);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy3));

        System.out.println("---------- Bubble Sort 2 (1,000,000 Elementos) ----------");
        int[] copy4 = Arrays.copyOf(original_1000000, original_1000000.length);
        System.out.println("Vector Desordenado: " + Arrays.toString(copy4));
        System.out.println();
        bs.bubbleSort2(copy4);
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(copy4));
    }
}
