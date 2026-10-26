package T3_A4_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int opc;

        do{
            // Menu de opciones usuarios
            System.out.println("\n=== Listas Enlazadas (LinkedLists) ===");
            System.out.println("""
                1.- Insertar Elementos
                2.- Eliminar Elementos
                0.- Salir
            """);
            System.out.print("Ingresa una Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    ll.menuInsertar();
                    break;

                case 2:
                    ll.menuEliminar();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opcion Invalida. Intente Nuevamente");
                    break;
            }
        } while (opc != 0); 
        sc.close();  
    }
}
