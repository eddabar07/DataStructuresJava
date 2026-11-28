package T5_A3_BarriosRomeroEduardoDaniel;

import java.util.Arrays;

public class AppIntercalacion {
    public static void main(String[] args) {
        Vectores array = new Vectores();
        Intercalacion inter = new Intercalacion();

        System.out.println("=== Algoritmos de Ordenamiento");

        int[] original_1000 = array.array1();
        int[] original_10000 = array.array2();
        int[] original_100000 = array.array3();
        int[] original_1000000 = array.array4();

        // Dividir array de 1000
        int mitad_1000 = original_1000.length / 2;
        int[] izquierda_1000 = Arrays.copyOfRange(original_1000, 0, mitad_1000);
        int[] derecha_1000 = Arrays.copyOfRange(original_1000, mitad_1000, original_1000.length);

        Arrays.sort(izquierda_1000);
        Arrays.sort(derecha_1000);

        // Dividir array de 10000
        int mitad_10000 = original_10000.length / 2;
        int[] izquierda_10000 = Arrays.copyOfRange(original_10000, 0, mitad_10000);
        int[] derecha_10000 = Arrays.copyOfRange(original_10000, mitad_10000, original_10000.length);

        Arrays.sort(izquierda_10000);
        Arrays.sort(derecha_10000);

        // Dividir array de 100000
        int mitad_100000 = original_100000.length / 2;
        int[] izquierda_100000 = Arrays.copyOfRange(original_100000, 0, mitad_100000);
        int[] derecha_100000 = Arrays.copyOfRange(original_100000, mitad_100000, original_100000.length);

        Arrays.sort(izquierda_100000);
        Arrays.sort(derecha_100000);

        // Dividir array de 1000000
        int mitad_1000000 = original_1000000.length / 2;
        int[] izquierda_1000000 = Arrays.copyOfRange(original_1000000, 0, mitad_1000000);
        int[] derecha_1000000 = Arrays.copyOfRange(original_1000000, mitad_1000000, original_1000000.length);

        Arrays.sort(izquierda_1000000);
        Arrays.sort(derecha_1000000);

        System.out.println("---------- Intercalacion (1,000 Elementos) ----------");
        System.out.println("Vector Desordenado: " + Arrays.toString(original_1000));
        System.out.println();
        System.out.println("Vector Ordenado: " + Arrays.toString(
            inter.ordenamientoIntercalacion(izquierda_1000, derecha_1000)));

        System.out.println("---------- Intercalacion (10,000 Elementos) ----------");
        System.out.println("Vector Ordenado: " + Arrays.toString(
            inter.ordenamientoIntercalacion(izquierda_10000, derecha_10000)));

        System.out.println("---------- Intercalacion (100,000 Elementos) ----------");
        System.out.println("Vector Ordenado: " + Arrays.toString(
            inter.ordenamientoIntercalacion(izquierda_100000, derecha_100000)));

        System.out.println("---------- Intercalacion (1,000,000 Elementos) ----------");
        System.out.println("Vector Ordenado: " + Arrays.toString(
            inter.ordenamientoIntercalacion(izquierda_1000000, derecha_1000000)));
    }
}
