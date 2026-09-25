package T1_A8_BarriosRomeroEduardoDaniel;

import java.time.LocalDate;

public class Alumno {
    // Declaracion de variables
    private int control;
    private String[] nombreCompleto;
    private int edad;
    private String carrera;
    private LocalDate fechaRegistro;

    // Constructor
    public Alumno(int control, String[] nombreCompleto, int edad, String carrera, LocalDate fechaRegistro) {
        this.control = control;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.carrera = carrera;
        this.fechaRegistro = fechaRegistro;
    }

    public Alumno(){}

    // Getter's and Setter's
    public int getControl(){
        return control;
    }

    public void setControl(int control){
        this.control = control;
    }

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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Obtener nombre completo legible
    public String getNombreFormateado() {
        return nombreCompleto[2] + " " + nombreCompleto[0] + " " + nombreCompleto[1];
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n========== FICHA ALUMNO ==========").append("\n");
        sb.append("Número de Control: ").append(control);
        sb.append("Nombre: ").append(getNombreFormateado()).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Carrera: ").append(carrera).append("\n");
        sb.append("Fecha de Registro: ").append(fechaRegistro).append("\n");
        sb.append("-------------------------------------------");

        return sb.toString();
    }
}
