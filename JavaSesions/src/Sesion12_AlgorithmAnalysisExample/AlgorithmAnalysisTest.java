package Sesion12_AlgorithmAnalysisExample;

/**
 * Ejemplo 1: Obtener la sumatoria de los numeros del 1 al 100000
 *  Tomar de ejecucion su algoritmo
 */

class Sumatorias{
    public static void sumatoriaBucle(int num){
        long tiInicio = System.currentTimeMillis();

        int suma = 0;
        for (int i = 0; i <= num; i++){
            suma += i;
        }
        System.out.println("Sumatoria: " + suma);

        long tiFin = System.currentTimeMillis();
        long tiempoTranscurrido = tiFin - tiInicio;
        System.out.printf("Tiempo Transcurrido: %d milisegundos \n", tiempoTranscurrido); 
    }

    public static void sumatoriaFormula(int num){
        long tiInicio = System.currentTimeMillis();

        double suma = 0;
        suma = (num * (num + 1)) / 2;
        System.out.println("Sumatoria: " + suma); 

        long tiFin = System.currentTimeMillis();
        long tiempoTranscurrido = tiFin - tiInicio;
        System.out.printf("Tiempo Transcurrido: %d milisegundos \n", tiempoTranscurrido);
    }
}

public class AlgorithmAnalysisTest{
    public static void main(String[] args) {
        Sumatorias.sumatoriaBucle(100000);
        Sumatorias.sumatoriaFormula(100000);
    }
}