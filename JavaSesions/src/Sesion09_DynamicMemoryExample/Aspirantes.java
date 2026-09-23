package Sesion09_DynamicMemoryExample;

public class Aspirantes {
    // Declaracion de variables de instancia
    private String[] nombreCompleto;
    private int edad;
    private int folio;
    private String[] direccion;
    private String telefono;
    private String[][] redesSociales;
    private String carreraInteres;
    private String escuelaProcedencia;
    private String bachillerato;

    // Constructor
    public Aspirantes(){}

    // Getters and Setters
    public String[] getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String[] nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFolio(){
        return folio;
    }

    public void setFolio(int folio){
        this.folio = folio;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String[][] getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(String[][] redesSociales) {
        this.redesSociales = redesSociales;
    }

    public String getCarreraInteres() {
        return carreraInteres;
    }

    public void setCarreraInteres(String carreraInteres) {
        this.carreraInteres = carreraInteres;
    }

    public String getEscuelaProcedencia() {
        return escuelaProcedencia;
    }

    public void setEscuelaProcedencia(String escuelaProcedencia) {
        this.escuelaProcedencia = escuelaProcedencia;
    }

    public String getBachillerato() {
        return bachillerato;
    }

    public void setBachillerato(String bachillerato) {
        this.bachillerato = bachillerato;
    }

    // Obtener nombre completo legible
    public String getNombreFormateado() {
        return nombreCompleto[0] + " " + nombreCompleto[1] + " " + nombreCompleto[2];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------\n");
        sb.append("Folio: ").append(String.format("%04d", folio)).append("\n");
        sb.append("Nombre: ").append(getNombreFormateado()).append("\n");
        sb.append("Edad: ").append(edad).append("\n");

        sb.append("Dirección: Calle ").append(direccion[0]).append(" #").append(direccion[1])
          .append(", Col. ").append(direccion[2]).append(", C.P. ").append(direccion[3])
          .append(", ").append(direccion[4]).append("\n");

        sb.append("Teléfono: ").append(telefono).append("\n");

        sb.append("Redes sociales:\n");
        for (String[] red : redesSociales) {
            sb.append("  - ").append(red[0]).append(": ").append(red[1]).append("\n");
        }
        
        sb.append("Carrera de interés: ").append(carreraInteres).append("\n");
        sb.append("Escuela de procedencia: ").append(escuelaProcedencia).append("\n");
        sb.append("Bachillerato: ").append(bachillerato).append("\n");
        sb.append("-------------------------------------------");
        return sb.toString();
    }
}