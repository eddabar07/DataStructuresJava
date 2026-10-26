package T3_A4_BarriosRomeroEduardoDaniel;

public class Nodo{
    // Declaracion de variables
    private int dato;
    private Nodo apuntador;

    // Constructor 
    public Nodo(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getApuntador() {
        return apuntador;
    }

    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", apuntador=" + apuntador + "]";
    }
}