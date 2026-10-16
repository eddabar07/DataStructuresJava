package T3_A3_BarriosRomeroEduardoDaniel;

public interface RegistroImpresiones {
    void imprimir();

    void agregarColaImpresion();

    void eliminarColaImpresion();

    void mostrarTotalHojasImpresas();

    void mostrarTotalBytes();

    boolean estaLlena();

    boolean estaVacia();

    void menu();
}
