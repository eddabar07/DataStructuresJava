package T3_A3_BarriosRomeroEduardoDaniel;

public class Impresion {
    // Declaracion de variables
    private int identificador;
    private int tamañoArchivo;
    private int cantidadHojas;

    // Constructor
    public Impresion(int identificador, int tamañoArchivo, int cantidadHojas){
        this.identificador = identificador;
        this.tamañoArchivo = tamañoArchivo;
        this.cantidadHojas = cantidadHojas;
    }

    // Getters and Setters

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(byte tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nIdentificador: ").append(identificador).append("\n");
        sb.append("Peso del Archivo: ").append(tamañoArchivo).append(" Kb").append("\n");
        sb.append("Cantidad de Hojas: ").append(cantidadHojas).append(" hojas").append("\n");
        sb.append("-------------------------------------------").append("\n");

        return sb.toString();
    }
}
