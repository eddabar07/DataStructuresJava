package T3_A5_BarriosRomeroEduardoDaniel.Temperaturas_y_atributos;

public class Nodo {
    // Declaracion de variables
    private Temperatura temperatura;
    private Nodo apuntador;

    // Constructor
    public Nodo(Temperatura temperatura){
        this.temperatura = temperatura;
    }

    // Getters and Setters
    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
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
        return "Nodo [temperatura=" + temperatura + ", apuntador=" + apuntador + "]";
    }
}
