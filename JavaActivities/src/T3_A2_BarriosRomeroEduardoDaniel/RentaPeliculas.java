package T3_A2_BarriosRomeroEduardoDaniel;

public interface RentaPeliculas {
    void cargarBD();

    void rentarPelicula();

    void devolverPelicula();

    void mostraPeliculas();

    boolean estaLleno();

    boolean estaVacio();
}
