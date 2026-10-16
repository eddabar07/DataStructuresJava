package T3_A2_BarriosRomeroEduardoDaniel;

import java.util.Scanner;

public class ImplementacionPilaEstatica implements RentaPeliculas{
    private Pelicula baseDatos[] = new Pelicula[5];
    private int cima = -1;
    Scanner sc = new Scanner(System.in);


    @Override 
    public void cargarBD(){
        baseDatos[++cima] = new Pelicula("IronMan", "Accion");

        baseDatos[++cima] = new Pelicula("Avengers Endgame", "Accion");

        baseDatos[++cima] = new Pelicula("Avengers", "Accion");

        baseDatos[++cima] = new Pelicula("Capitan America: El Primer Vengador", "Accion");
        
        baseDatos[++cima] = new Pelicula("Avengers Infinity War", "Accion");
        
        System.out.println("Base de Datos Cargada Correctamente");
    }

    @Override 
    public void rentarPelicula(){
        if (estaVacio()){
            System.out.println("Por el momento no tenemos peliculas disponibles.");
            return;
        }

        System.out.println("=== Pelicula Rentada ===");
        System.out.println("Titulo: " + baseDatos[cima].getTitulo());
        System.out.println("Genero: " + baseDatos[cima].getGenero());

        baseDatos[cima] = null;
        cima--;
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

        cima++;
        baseDatos[cima] = pelicula;

        System.out.println("=== Pelicula Devuelta ===");
        System.out.println("Titulo: " + baseDatos[cima].getTitulo());
        System.out.println("Genero: " + baseDatos[cima].getGenero());
    }

    @Override 
    public void mostraPeliculas(){
        for (Pelicula p : baseDatos){
            System.out.println(p);
        }
    }

    @Override 
    public boolean estaLleno(){
        return cima == baseDatos.length - 1;
    }

    @Override 
    public boolean estaVacio(){
        return cima == -1;
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
