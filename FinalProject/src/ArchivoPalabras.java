import java.io.File;
import java.util.Scanner;

public class ArchivoPalabras {
    // Metodo para almacenar las palabras del archivo en un vector
    public String[] palabras(String ruta) throws Exception{
        // Accedemos al archivo para leerlo
        Scanner archivo = new Scanner(new File(ruta));
        int cantidad = 0; // Contador de lineas 

        // Recorremos el archivo mientras haya contenido
        while (archivo.hasNextLine()) { // Recorre el archivo mientras haya elementos
            archivo.nextLine(); // Lee la linea actual y brinca a la siguente
            cantidad++; // Aumenta el contador de lineas
        }

        // Vector con el tamaño de cantidad
        String[] palabras = new String[cantidad];

        // Llenamos el vector con las palabras
        for (int i = 0; i < palabras.length; i++){
            palabras[i] = archivo.nextLine().trim().toUpperCase(); // Asigna la palabra en mayusculas y sin espacios al final
        }
        archivo.close();
        return palabras;
    }
}
