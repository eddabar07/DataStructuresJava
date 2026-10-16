package T3_A3_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        RegistroImpresiones ife = new ImplementacionFilaEstatica();
        RegistroImpresiones ifd = new ImplementacionFilaDinamica();
        int opc;

        do{
            // Menu de opciones Usuario
            System.out.println("\n========== MANEJO DE COLAS DE IMPRESION ==========");
            System.out.println("""
                    1.- Manejo Estatico
                    2.- Manejo Dinamico
                    0.- Salir
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones Logica
            switch (opc) {
                case 1:
                    ife.menu();
                    break;
                case 2:
                    ifd.menu();
                    break;
                case 0:
                    System.out.println("Saliendo del Programa...");
                    break;
                default:
                    System.err.println("Opción Invalida. Intente de Nuevo");
                    break;
            }
        } while(opc != 0);
        sc.close();
    }
}
