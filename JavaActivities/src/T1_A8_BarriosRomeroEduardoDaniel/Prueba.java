package T1_A8_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        // Crear objeto de registroAlumno
        RegistroAlumno ra = new RegistroAlumno();

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Menu de opciones
        do{
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1.- Llenar lista (Llenar el HashMap con 5 alumnos)");
            System.out.println("2.- Vaciar lista");
            System.out.println("3.- Mostrar los alumnos por carrera");
            System.out.println("4.- Calcular Promedio de edades");
            System.out.println("5.- Mostrar alumnos inscritos después del 10/08/2026");
            System.out.println("6.- Mostrar listado de alumnos");
            System.out.println("0.- Salir");

            System.out.print("Ingresa una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    ra.añadirAlumno();
                    break;
                
                case 2:
                    ra.vaciarLista();
                    break;

                case 3:
                    ra.buscarCarrea();
                    break;

                case 4:
                    ra.promedioEdades();
                    break;

                case 5:
                    ra.buscarDespuesFecha();
                    break;

                case 6:
                    ra.mostrarLista();;
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }    
}
