package Sesion22_SearchAlgorithms;

class AlgoritmosDeBusqueda{
    private int machetazos = 0;

    public int binarySearch(int[] numeros, int dato){
        int inicio = 0;
        int tamFinal = numeros.length - 1;
        int middle = 0;

        while (inicio <= tamFinal){
            middle = (inicio + tamFinal) / 2;
            machetazos++;

            if (numeros[middle] == dato){
                return middle;
            } else if (numeros[middle] > dato){
                tamFinal = middle - 1;
            } else {
                inicio = middle + 1;
            }
        }
        return -1;
    }

    public int getMachete(){
        return machetazos;
    }

}

public class SearchAlgorithms{
    public static void main(String[] args) {
        int[] numPiloto = {3, 5, 7, 11, 12, 16, 22, 33, 44, 55};

        System.out.println("=== Busqueda Binaria ===");
        AlgoritmosDeBusqueda algs = new AlgoritmosDeBusqueda();

        long tInicio = System.nanoTime();
        int pos = algs.binarySearch(numPiloto, 11);
        long tFin = System.nanoTime();
        System.out.println("Tiempo de ejecucion: " + (tFin - tInicio));
        System.out.println("Dato encontrado en la posicion: " + pos);
        System.out.println("Cantidad de partidas del arreglo: " + algs.getMachete());
    }
}
