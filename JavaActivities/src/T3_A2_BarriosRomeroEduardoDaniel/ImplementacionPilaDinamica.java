package T3_A2_BarriosRomeroEduardoDaniel;

import java.util.Scanner;
import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{
    Stack <Pelicula> baseDatos = new Stack<>();
    Scanner sc = new Scanner(System.in);


    @Override 
    public void cargarBD(){
        Pelicula p = new Pelicula("IronMan", "Accion");
        baseDatos.push(p);

        Pelicula p2 = new Pelicula("Avengers Endgame", "Accion");
        baseDatos.push(p2);

        Pelicula p3 = new Pelicula("Avengers", "Accion");
        baseDatos.push(p3);

        Pelicula p4 = new Pelicula("Capitan America: El Primer Vengador", "Accion");
        baseDatos.push(p4);
        
        Pelicula p5 = new Pelicula("Avengers Infinity War", "Accion");
        baseDatos.push(p5);

        System.out.println("Base de Datos Cargada Correctamente");
    }

    @Override 
    public void rentarPelicula(){
        if (estaVacio()){
            System.out.println("Por el momento no tenemos peliculas disponibles.");
            return;
        }

        System.out.println("Pelicula Rentada:");
        System.out.println();
        baseDatos.pop();
    }

    @Override 
    public void devolverPelicula(){        
        if (estaLleno()){
            System.out.println("El inventario se encuentra lleno");
            return;
        }

        System.out.print("Pelicula a Devolver: ");
        String titulo = sc.nextLine();

        System.out.print("Genero de la Pelicula a Devolver: ");
        String genero = sc.nextLine();


        Pelicula pelicula = new Pelicula(titulo, genero);
        baseDatos.push(pelicula);
        System.out.println("Pelicula Devuelta:");
        baseDatos.peek();

    }

    @Override 
    public void mostraPeliculas(){
        if (estaVacio()){
            System.out.println("Por el momento no tenemos peliculas disponibles.");
            return;
        }

        for(Pelicula p : baseDatos){
            System.out.println(p);
        }
    }

    @Override 
    public boolean estaLleno(){
        return (baseDatos.size() == 5);
    }

    @Override 
    public boolean estaVacio(){
        return baseDatos.isEmpty();
    }

    @Override 
    public void menuOpciones(){
        int opc;

        do{
            // Menu de opciones usuario
            System.out.println("\n========== RENTA DE PELICULAS ==========");
            System.out.println("""
                    1.- Cargar BD de peliculas
                    2.- Renta de Pelicula
                    3.- Devolver Pelicula
                    4.- Mostrar Cantidad de Peliculas Disponibles
                    5.- Regresar
                    """);
            System.out.print("Ingresa una Opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Menu de opciones logica
            switch (opc) {
                case 1:
                    cargarBD();
                    break;
                case 2:
                    rentarPelicula();
                    break;
                case 3:
                    devolverPelicula();
                    break;
                case 4:
                    mostraPeliculas();
                    break;
                case 5:
                    break;
                default:
                    System.err.println("Opción Invalida. Intente Nuevamente");
                    break;
            }
        } while (opc != 5);
    }
}