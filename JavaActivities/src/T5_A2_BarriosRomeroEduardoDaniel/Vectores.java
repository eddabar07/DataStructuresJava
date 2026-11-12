package T5_A2_BarriosRomeroEduardoDaniel;

import java.util.Random;

public class Vectores {

    // Llenar vector 1
    public int[] array1(){
        Random random = new Random();
        int[] numeros = new int[1000];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(0, 100);
        }
        return numeros;
    }

    // Llenar vector 2
    public int[] array2(){
        Random random = new Random();
        int[] numeros = new int[10000];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(0, 100);
        }
        return numeros;
    }

    // Llenar vector 3
    public int[] array3(){
        Random random = new Random();
        int[] numeros = new int[100000];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(0, 100);
        }
        return numeros;
    }

    // Llenar vector 4
    public int[] array4(){
        Random random = new Random();
        int[] numeros = new int[1000000];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(1, 100);
        }
        return numeros;
    }
}
