import java.util.Random;
import java.util.Scanner;

public class JuegoAhorcado {
    // Metodo para Cargar las palabras
    public String[] cargarPalabras() throws Exception{
        ArchivoPalabras words = new ArchivoPalabras();
        String[] palabras = words.palabras("Palabras.txt");
        return palabras;
    }

    // Metodo para escoger la palabra a adivinar
    public String escogerPalabra(String[] palabras){
        // Random para escoger la palabra por posicion aleatoria
        Random random = new Random();
        int posicion = random.nextInt(palabras.length);
        return palabras[posicion];
    }

    public void iniciarAhorcado(String palabra){
        // Variable para guardar el numero de letras
        char[] letras = new char[palabra.length()];;
        // Indicar la cantidad de letras mediante espacios
        for (int i = 0; i < letras.length; i++){
            letras[i] = '_';
        }
    }

    public boolean seAdivinoLaPalabra(String palabraSecreta, char[] letrasIngresadas){
        Scanner ingresar = new Scanner(System.in);
        System.out.println();
    }
}
