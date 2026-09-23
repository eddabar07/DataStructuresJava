package T1_A7_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        // Crear objeto de registroAspirante
        RegistroAspirante registro = new RegistroAspirante();

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Menu de opciones
        do{
            System.out.println("\n========== Menú Aspirantes ==========");
            System.out.println("""
            1.- Ingresar Aspirante
            2.- Buscar Aspirante por Nombre
            3.- Buscar Aspirante por Folio
            4.- Mostrar listado de Aspirantes
            5.- Eliminar Aspirante por Nombre
            6.- Eliminar Aspirante por Folio
            0.- Salir
            """);
            System.out.print("Ingresa una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    registro.añadirAspirante();
                    break;
                
                case 2:
                    registro.buscarAspiranteNombre();
                    break;

                case 3:
                    registro.buscarAspiranteFolio();
                    break;

                case 4:
                    registro.mostrarLista();
                    break;
                
                case 5:
                    registro.eliminarAspiranteNombre();
                    System.out.println();
                    break;

                case 6:
                    registro.eliminarAspiranteFolio();
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
