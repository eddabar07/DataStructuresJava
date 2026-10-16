package T3_A2_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declaracion de varibles
        RentaPeliculas rpe = new ImplementacionPilaEstatica();
        RentaPeliculas rpd = new ImplementacionPilaDinamica();

        Scanner sc = new Scanner(System.in);
        int opc;

        do{
            // Menu de opciones usuario
            System.out.println("\n========== MANEJO DE PILAS. RENTA PELICULAS ==========");
            System.out.println("""
                    1.- Manejo Estatico
                    2.- Manejo Dinamico
                    0.- Salir
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    rpe.menuOpciones();
                    break;
                case 2:
                    rpd.menuOpciones();
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
