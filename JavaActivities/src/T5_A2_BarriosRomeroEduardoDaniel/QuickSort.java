package T5_A2_BarriosRomeroEduardoDaniel;

public class QuickSort {
    static int intercambios;
    public static void ordenarQuickSort(int[] array){
        long tInicio, tFin;
        tInicio = System.nanoTime();

        if (array != null && array.length > 1){
            quickSort(array, 0, array.length - 1);
        }

        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
    }

    private static void quickSort(int[] array, int inicio, int fin){
        if (fin <= inicio){
            return;
        }

        int pivote = division(array, inicio, fin);
        quickSort(array, inicio, pivote - 1);
        quickSort(array, pivote + 1, fin);
    }

    private static int division(int[] array, int inicio, int fin) {
        int pivote = array[fin];
        int i = inicio - 1;

        for (int j = inicio; j <= fin; j++){
            if (array[j] < pivote){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                intercambios++;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[fin];
        array[fin] = temp;
        return i;
    }
}
