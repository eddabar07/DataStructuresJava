package T3_A2_BarriosRomeroEduardoDaniel;

import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{
    Stack <Pelicula> baseDatos = new Stack<>();

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
    }

    @Override 
    public void rentarPelicula(){
        if (estaVacio()){
            System.out.println("Por el momento no tenemos peliculas disponibles.");
            return;
        }

        System.out.println("Pelicula Rentada:");
        baseDatos.peek();
        baseDatos.pop();
    }

    @Override 
    public void devolverPelicula(){
        Pelicula pelicula = new Pelicula();
        
        if (estaLleno()){
            System.out.println("El inventario se encuentra lleno");
            return;
        }

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
}