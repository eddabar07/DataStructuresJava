package ExParcial1_BarriosRomeroEduardoDaniel;

import java.util.ArrayList;
import java.util.Random;

public class MinadoBitcoins {
    // Declaracion de variables
    ArrayList <BitcoinsMinados> listaBitcoins = new ArrayList<>();

    // Generar bitcoins y gurdarlos respecto a su direccion IP
    public void minarBitcoins(){
        // Declaracion de variables e instancias necesarias
        Random rand = new Random();
        String direccionIP;

        // Generar 4 objetos para el ArrayList
        for (int d = 0; d < 4; d++){
            // Instanciar objeto de la clase BitcoinsMinados
            BitcoinsMinados bm = new BitcoinsMinados();

            // Generar direccion IP
            int ultimoOcteto = rand.nextInt(256);
            direccionIP = "192.168.7." + ultimoOcteto;
            bm.setIp(direccionIP);

            // Generar y llenar matriz con numeros de entre 0.0 y 100.0
            double[][] bitcoin = bm.getCantidades();

            for (int i = 0; i < bitcoin.length; i++){
                for (int j = 0; j < bitcoin[i].length; j++){
                    double random = rand.nextDouble() * 100.0;
                    bitcoin [i][j] = (Math.round(random * 100.0) / 100.0);
                }
            }

            // Asignar la matriz llena al objero y después al ArrayList
            bm.setCantidades(bitcoin);
            listaBitcoins.add(bm);
        }
    }

    // Mostrar elementos
    public void mostrarElementos(){
        // Validar si la lista no está vacia
        if (listaBitcoins.isEmpty()){
            System.out.println("No Se Han Minado Bitcoins Aún");
            return;
        }

        System.out.println("========== ELEMENTOS TOTALES ==========");
        for (BitcoinsMinados bm : listaBitcoins){
            System.out.println(bm);
        }
    }

    // Calcular el promedio de todos los Bitcoins minados
    public void calcularPromedioTotal(){
        // Validar si la lista no está vacia
        if (listaBitcoins.isEmpty()){
            System.out.println("No Se Han Minado Bitcoins Aún");
            return;
        }

        // Declaracion de variables
        double sumaBitcoins = 0;
        int totalElementos = 0;

        // Obtener Cantidades del ArrayList
        for (BitcoinsMinados bm : listaBitcoins) {
            double [][] bitcoin = bm.getCantidades();

            for (int i = 0; i < bitcoin.length; i++) {
                for (int j = 0; j < bitcoin[i].length; j++) {
                    sumaBitcoins += bitcoin[i][j];
                    totalElementos ++;
                }
            }
        }

        // Calcular promedio
        sumaBitcoins = Math.round(sumaBitcoins * 100.0) / 100.0;
        double promedioTotal = sumaBitcoins / totalElementos;
        promedioTotal = Math.round(promedioTotal * 100.0) / 100.0;

        // Mostrar resultado
        System.out.println("========== PROMEDIO DE BITCOINS TOTALES ==========");
        System.out.println("Suma Total de Bitcoins: " + sumaBitcoins);
        System.out.println("Total de Bitcoins Suamados: " + totalElementos);
        System.out.println("Promedio Total de Bitcoins : " + promedioTotal + " ₿");
    }

    // Obtener promedio por semana
    public void calcularPromedioPorSemana(){
        // Validar si la lista no está vacia
        if (listaBitcoins.isEmpty()){
            System.out.println("No Se Han Minado Bitcoins Aún");
            return;
        }

        // Declaracion de variables
        double sumaBitcoins = 0;
        int totalSemanas = listaBitcoins.size();

        // Obtener Cantidades del ArrayList
        for (BitcoinsMinados bm : listaBitcoins){
            // Guardar cantidades en el siguiente vector
            double [][] bitcoin = bm.getCantidades();
        
            for (int i = 0; i < bitcoin.length; i++) { // Recorre todos los días
                for (int j = 0; j < bitcoin[i].length; j++) {
                    sumaBitcoins += bitcoin[i][j];
                }
            }
        }

        // Calcular promedio
        sumaBitcoins = Math.round(sumaBitcoins * 100.0) / 100.0;
        double promedioTotal = sumaBitcoins / totalSemanas;
        promedioTotal = Math.round(promedioTotal * 100.0) / 100.0;

        // Mostrar resultado
        System.out.println("========== PROMEDIO DE BITCOINS POR SEMANA ==========");
        System.out.println("Suma Total de Bitcoins: " + sumaBitcoins);
        System.out.println("Total de Bitcoins Suamados: " + totalSemanas);
        System.out.println("Promedio Total de Bitcoins : " + promedioTotal + " ₿");
    }

    // Obtener promedio por dia
    public void calcularPromedioPorDia(){
        // Validar si la lista no está vacia
        if (listaBitcoins.isEmpty()){
            System.out.println("No Se Han Minado Bitcoins Aún");
            return;
        }

        // Declaracion de variables
        double sumaBitcoins = 0;
        int totalDias = 0;

        // Obtnere cantidades del ArrayList
        for (BitcoinsMinados bm : listaBitcoins) {
            // Guardar cantidades en el siguiente vector
            double [][] bitcoin = bm.getCantidades();

            // Sumar cantidades
            for (int i = 0; i < bitcoin.length; i++) {
                for (int j = 0; j < bitcoin[i].length; j++) {
                    sumaBitcoins += bitcoin[i][j];
                }
                totalDias ++;
            }
        }

        // Calcular promedio
        sumaBitcoins = Math.round(sumaBitcoins * 100.0) / 100.0;
        double promedioTotal = sumaBitcoins / totalDias;
        promedioTotal = Math.round(promedioTotal * 100.0) / 100.0;

        // Mostrar resultado
        System.out.println("========== PROMEDIO DE BITCOINS POR DIA ==========");
        System.out.println("Suma Total de Bitcoins: " + sumaBitcoins);
        System.out.println("Total de Bitcoins Suamados: " + totalDias);
        System.out.println("Promedio Total de Bitcoins : " + promedioTotal + "₿");
    }
}