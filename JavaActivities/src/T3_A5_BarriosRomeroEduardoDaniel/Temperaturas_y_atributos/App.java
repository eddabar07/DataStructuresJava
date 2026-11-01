package T3_A5_BarriosRomeroEduardoDaniel.Temperaturas_y_atributos;

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
                7.- Mostrar promedio por rango de fechas
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
                    ll.insertarInicio();
                    break;
                case 2:
                    ll.insertarFinal();
                    break;
                case 3:
                    ll.eliminarInicio();
                    break;
                case 4:
                    ll.eliminarFinal();
                    break;
                case 5:
                    ll.eliminarTemperaturaEspecifica();
                    break;
                case 6:
                    ll.elimninarPosicionEspecifica();
                    break;
                case 7:
                    ll.promedioPorFechas();
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
