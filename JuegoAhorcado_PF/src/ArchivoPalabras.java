import java.util.Scanner;
import java.io.File;

public class ArchivoPalabras {
    // Metodo para leer las palabras del archivo
    public String[] leerPalabras() throws Exception{
        // Scanner para acceder y leer el archivo
        Scanner archivo = new Scanner(new File("Palabras.txt"));
        int cantidadPalabras = 0;
        int i = 0;

        // Leer el archivo y saber cuantas palabras hay
        while (archivo.hasNextLine()) { // Continua hasta que no quede ninguna linea
            archivo.nextLine(); // Lee la linea y avanza a la siguiente
            cantidadPalabras ++;
        }

        // Se cierra con el fin de reiniciar el buffer
        archivo.close();

        // Vector para guardar las palabras
        String[] palabras = new String[cantidadPalabras];

        // Abrimos de nuevo el archivo para asignar las palabras en el vector
        Scanner archivo2 = new Scanner(new File("Palabras.txt"));

        // Meter las palabras en el vector
        while (archivo2.hasNextLine()){
            palabras[i++] = archivo.nextLine().trim().toUpperCase();
        }

        // Cerrar el archivo
        archivo2.close();

        // Retornar el vector con las palabras
        return palabras;
    }
}
