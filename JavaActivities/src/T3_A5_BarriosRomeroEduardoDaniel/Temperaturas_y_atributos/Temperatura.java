package T3_A5_BarriosRomeroEduardoDaniel.Temperaturas_y_atributos;

public class Temperatura {
    // Declaracion de variables
    private double temperatura;
    private int[] fecha = new int[3];

    // Constructor
    public Temperatura(double temperatura, int[] fecha){
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    public Temperatura(){}

    // Getters and Setters
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int[] getFecha() {
        return fecha;
    }

    public void setFecha(int[] fecha) {
        this.fecha = fecha;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(temperatura).append(" - ").append(fecha[0]);
        sb.append("/").append(fecha[1]).append("/");
        sb.append(fecha[2]).append("]").append("==>");

        return sb.toString();
    }
}
