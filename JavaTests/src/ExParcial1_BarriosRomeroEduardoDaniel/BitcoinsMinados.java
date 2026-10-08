package ExParcial1_BarriosRomeroEduardoDaniel;

public class BitcoinsMinados {
    // Declaracion de variables locales
    private double[][] cantidades = new double[7][3]; //[dia][cantidad Minada]
    private String ip;

    // Constructor
    public BitcoinsMinados(double[][] cantidades, String ip){
        this.cantidades = cantidades;
        this.ip = ip;
    }

    public BitcoinsMinados(){}

    // Getters and Setters
    public double[][] getCantidades() {
        return cantidades;
    }

    public void setCantidades(double[][] cantidades) {
        this.cantidades = cantidades;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Mostrar Direccion IP
        sb.append("Dirección IP: ").append(ip).append("\n");

        // Mostrar las 3 cantidades generadas por día durante una semana
        sb.append("--------------------------------\n");
        for (int i = 0; i < cantidades.length; i++){ // Dia
            sb.append(String.format("Día %-3d: ", i + 1));

            for (int j = 0; j < cantidades[i].length; j++){ // cantidad
                sb.append(String.format("%8.2f ₿   ", cantidades[i][j]));
            }

            sb.append("\n");
        }
        return sb.toString();
    }
}
