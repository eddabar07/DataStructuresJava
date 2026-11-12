package T5_A2_BarriosRomeroEduardoDaniel;

public class BubbleSort {
    // BubbleSort 1
    public void bubbleSort1(int[] array){
        long tInicio, tFin;
        tInicio = System.nanoTime();
        int aux;
        long intercambios = 0;

        for (int i = 1; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i; j++){
                if (array[j] > array[j + 1]){
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios ++;
                }
            }
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }

    // BubbleSort 2
    public void bubbleSort2(int[] array){
        long tInicio, tFin;
        tInicio = System.nanoTime();
        int aux;
        int i = 1;
        boolean sort = false;
        long intercambios = 0;

        while ((i < array.length) || sort == false) {
            i = i + 1;
            sort = true;
            for(int j = 0; j < array.length - i; j++){
                if(array[j] > array[j + 1]){
                    sort = false;
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios ++;
                }
            }
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }

    // BubbleSort 3
    public void bubbleSort3(int[] array){
        long tInicio, tFin;
        int aux;
        int i = 1;
        boolean sort = false;
        long intercambios = 0;
        tInicio = System.nanoTime();

        do{
            i = i + 1;
            sort = true;
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    sort = false;
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios ++;
                }
            }
        } while (!(i < array.length) || sort == false);
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio) + " Nanosegundos");
    }
}
