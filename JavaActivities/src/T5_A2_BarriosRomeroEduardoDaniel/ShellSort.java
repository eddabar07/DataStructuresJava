package T5_A2_BarriosRomeroEduardoDaniel;

public class ShellSort {
    public static void ordenarShellSort(int[] array){
        long tInicio, tFin;
        int intercambios = 0;

        tInicio = System.nanoTime();

        int salto = array.length / 2;
        while(salto > 0){
            for(int i = salto; i < array.length; i++){
                int aux = array[i];
                int j = i;
                while (j >= salto && array[j - salto] > aux) {
                    array[j] = array[j - salto];
                    j = j - salto;
                    intercambios++;
                }
                array[j] = aux;
            }
            salto = salto / 2;
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
    }
}
