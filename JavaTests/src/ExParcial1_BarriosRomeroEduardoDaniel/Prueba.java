package ExParcial1_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        MinadoBitcoins mb = new MinadoBitcoins();
        int opc;

        do{
            System.out.println("\n========== BLOCKCHAIN ==========");
            System.out.println("""
                    1.- Minar Bitcoins \u20BF
                    2.- Mostrar Inventario Total
                    3.- Mostrar Promedio Total de los Elementos
                    4.- Mostrar Promedio por Semana de los Elementos
                    5.- Mostrar Promedio por Dia de los Elementos
                    0.- Salir del Sistema
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    mb.minarBitcoins();
                    break;
                case 2:
                    mb.mostrarElementos();
                    break;
                case 3:
                    mb.calcularPromedioTotal();
                    break;
                case 4:
                    mb.calcularPromedioPorSemana();
                    break;
                case 5:
                    mb.calcularPromedioPorDia();
                    break;
                case 0:
                    System.out.println("Saliendo del Sistema...");
                    break;
                default:
                    System.err.println("Opción Invaida, Intente Nuevamente");
                    break;
            }
        } while (opc != 0); sc.close();
    }
}