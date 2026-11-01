package T3_A5_BarriosRomeroEduardoDaniel.Promedios;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int opc;

        do{
            // Menu de opciones usuario
            System.out.println("\n === LISTA ENLAZADA TEMPERATURAS ===");
            System.out.println("""
                1.- Insertar temperatura al inicio
                2.- Insertar temperatura al final
                3.- Eliminar temperatura al inicio
                4.- Eliminar temperatura al final
                5.- Eliminar temperatura por dato
                6.- Eliminar temperatura por posicion
                7.- Mostrar promedio de temperaturas
                8.- Mostrar Datos
                0.- Salir del Sistema
                """);
            System.out.print("Ingresa una Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc){
                case 1:
                    System.out.print("Temperatura en °C: ");
                    ll.insertarInicio(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 2:
                     System.out.print("Temperatura en °C: ");
                    ll.insertarFinal(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 3:
                    ll.eliminarInicio();
                    break;
                case 4:
                    ll.eliminarFinal();
                    break;
                case 5:
                    System.out.print("Temperatura a eliminar: ");
                    ll.eliminarTemperaturaEspecifica(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 6:
                    System.out.print("Posicion de la temperatura a eliminar: ");
                    ll.elimninarPosicionEspecifica(sc.nextInt());
                    sc.nextLine();
                    break;
                case 7:
                    ll.obtenerPromedioTemperaturas();
                    break;
                case 8:
                    ll.mostrarElementos();
                    break;
                case 0:
                    System.out.println("Saliendo del Sistema...");
                    break;
                default:
                    System.out.println("Opcion Invalida> Intente Nuevamente");
                    break;
            }
        } while(opc != 0); sc.close();
    }
}

