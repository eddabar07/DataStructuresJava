import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ArchivoPalabras {
    // Crear archivo
    public void crearArchivo() throws Exception{
        File nuevoArchivo = new File("src/Palabras.txt");

        // Verificar si el archivo ya exixste
        if (!nuevoArchivo.exists()){
            nuevoArchivo.createNewFile();
            JOptionPane.showMessageDialog(null, "Archivo Creado Correctamente", "Nuevo Archivo",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El Archivo Ya Existe", "Nuevo Archivo",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    // Cargar palabras al archivo mediante teclado
    public void cargarPalabrasArchivo() throws Exception{
        // Scanner para leer las palabras por teclado
        Scanner capturar  = new Scanner(System.in);

        // Abrir archivo para poder escribir sobre el
        PrintWriter escribir = new PrintWriter(new FileWriter("src/Palabras.txt", true));

        // Solicitar la palabra a agregar
        JOptionPane.showInputDialog(null, "Ingrese la Palabra: ", "Cargar Palabra",
            JOptionPane.INFORMATION_MESSAGE);
        String palabra = capturar.nextLine().trim().toUpperCase();

        // Guardar palabra en el archivo
        escribir.println(palabra);
        escribir.close();
        capturar.close();

        // Mensaje de confirmacion
        JOptionPane.showMessageDialog(null, "Palabra Guardada Correctamente", "Cargar Palabra",
            JOptionPane.INFORMATION_MESSAGE);
    }

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

    // Borrar el archivo y crear uno nuevo vacio
    public void reiniciarArchivo() throws Exception{
        File archivoNuevo = new File("src/Palabras.txt");

        // Comprobar si existe el archivo
        if (archivoNuevo.exists()){
            // Eliminar archivo
            archivoNuevo.delete();

            JOptionPane.showMessageDialog(null, "Archivo Eliminado", "Reiniciar Archivo",
                JOptionPane.INFORMATION_MESSAGE);
            
            // Crear nuevo archivo
            archivoNuevo.createNewFile();
            
            JOptionPane.showMessageDialog(null, "El Nuevo Archivo se Creo Exitosamente", "Reiniciar Archivo",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El Archivo No Existe", "Reiniciar Archivo",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
