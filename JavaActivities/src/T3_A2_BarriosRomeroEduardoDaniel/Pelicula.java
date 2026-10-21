package T3_A2_BarriosRomeroEduardoDaniel;

public class Pelicula {
    // Declaracion de variables
    private String titulo;
    private String genero;
    
    // Constructor
    public Pelicula(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Pelicula(){}

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n========== PELICULAS DISPONIBLES ==========\n");
        sb.append("Nombre de la Pelicula: ").append(titulo).append("\n");
        sb.append("Género: ").append(genero).append("\n");
        sb.append("------------------------------------------------\n");

        return sb.toString();
    }

}
