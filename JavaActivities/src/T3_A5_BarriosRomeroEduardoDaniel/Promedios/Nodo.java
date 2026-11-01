package T3_A5_BarriosRomeroEduardoDaniel.Promedios;

public class Nodo{
    // Declaracion de variables
    private double dato;
    private Nodo apuntador;

    // Constructor 
    public Nodo(double dato) {
        this.dato = dato;
    }

    // Getters and Setters
    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public Nodo getApuntador() {
        return apuntador;
    }

    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }

    // toString
    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", apuntador=" + apuntador + "]";
    }
}
