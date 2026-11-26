package T5_A2_BarriosRomeroEduardoDaniel;

public class RadixSort {
    public static void ordenarRadixSort(int[] array){
        long tInicio, tFin;
        int intercambios = 0;

        tInicio = System.nanoTime();

        int maxValor = array.length;

        for (int i = 0; i < array.length; i++){
            int numero = array[i];
            if (numero > maxValor){
                maxValor = numero;
            }
        }
        int exponente = 1;
        int[] contador = new int[10];
        int[][] cajitas = new int[10][array.length];

        while (maxValor / exponente > 0){
            for (int i = 0; i < array.length; i++){
                int num = array[i];
                int digito = (num / exponente) % 10;
                cajitas[digito][contador[digito]] = num;
                contador[digito]++;
            }
            int indice = 0;
            for(int fila = 0; fila < 10; fila++){
                for(int col = 0; col < contador[fila]; col++){
                    array[indice] = cajitas[fila][col];
                    indice++;
                }
                contador[fila] = 0;
            }
            exponente*=10;
        }
        tFin = System.nanoTime();
        System.out.println("Cantidad de intercambios: " + intercambios);
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
    }
}
