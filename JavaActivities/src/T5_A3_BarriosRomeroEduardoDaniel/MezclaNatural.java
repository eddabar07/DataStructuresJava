package T5_A3_BarriosRomeroEduardoDaniel;

public class MezclaNatural {
    private long recorridos = 0;
    private long comparaciones = 0;
    private long intercambios = 0;

    public int[] ordenar(int[] datos) {

        while (!estaOrdenado(datos)) {

            recorridos++;

            int inicio1 = 0;

            while (inicio1 < datos.length - 1) {

                int fin1 = encontrarFinSecuencia(datos, inicio1);

                if (fin1 == datos.length - 1) {
                    break;
                }

                int inicio2 = fin1 + 1;
                int fin2 = encontrarFinSecuencia(datos, inicio2);

                mezclar(datos, inicio1, fin1, inicio2, fin2);

                inicio1 = fin2 + 1;
            }
        }
        return datos;
    }

    private int encontrarFinSecuencia(int[] datos, int inicio) {

        while (inicio < datos.length - 1) {

            comparaciones++;

            if (datos[inicio] <= datos[inicio + 1]) {
                inicio++;
            } else {
                break;
            }
        }

        return inicio;
    }

    private void mezclar(int[] datos, int inicio1, int fin1, int inicio2, int fin2) {

        int[] aux = new int[fin2 - inicio1 + 1];

        int i = inicio1;
        int j = inicio2;
        int k = 0;

        while (i <= fin1 && j <= fin2) {

            comparaciones++;

            if (datos[i] <= datos[j]) {
                aux[k++] = datos[i++];
            } else {
                aux[k++] = datos[j++];
            }
        }

        while (i <= fin1) {
            aux[k++] = datos[i++];
        }

        while (j <= fin2) {
            aux[k++] = datos[j++];
        }

        for (int x = 0; x < aux.length; x++) {

            datos[inicio1 + x] = aux[x];

            intercambios++;
        }
    }

    private boolean estaOrdenado(int[] datos) {

        for (int i = 0; i < datos.length - 1; i++) {

            comparaciones++;

            if (datos[i] > datos[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public long getRecorridos() {
        return recorridos;
    }

    public long getComparaciones() {
        return comparaciones;
    }

    public long getIntercambios() {
        return intercambios;
    }
}
