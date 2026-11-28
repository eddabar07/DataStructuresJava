package T5_A3_BarriosRomeroEduardoDaniel;

public class Intercalacion {
    public int[] ordenamientoIntercalacion(int[] a, int[] b){
        int[] resultado = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                resultado[k++] = a[i++];
            } else {
                resultado[k++] = b[j++];
            }
        }

        while (i < a.length){
            resultado[k++] = a[i++];
        }

        while (j < b.length){
            resultado[k++] = b[j++];
        }
        
        return resultado;
    }
}
