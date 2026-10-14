package T3_A2_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declaracion de varibles
        ImplementacionPilaEstatica ipe = new ImplementacionPilaEstatica();
        Scanner sc = new Scanner(System.in);
        byte opc;

        do{
            // Menu de opciones usuario
            System.out.println("\n========== RENTA DE PELICULAS ==========");
            System.out.println("""
                    1.- Cargar BD de peliculas
                    2.- Renta de Pelicula
                    3.- Devolver Pelicula
                    4.- Mostrar Cantidad de Peliculas Disponibles
                    0.- Salir
                    """);
            System.out.println("Ingresa una Opción: ");
            opc = sc.nextByte();
            sc.nextLine();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    ipe.cargarBD();
                    break;
                case 2:
                    ipe.rentarPelicula();
                    break;
                case 3:
                    ipe.devolverPelicula();
                    break;
                case 4:
                    ipe.mostraPeliculas();
                    break;
                case 0:
                    System.out.println("Saliendo... Vuelva Pronto");
                    break;
                default:
                    System.err.println("Opción Invalida. Intente Nuevamente");
                    break;
            }
        } while (opc != 0);
        sc.close();
    }
}
