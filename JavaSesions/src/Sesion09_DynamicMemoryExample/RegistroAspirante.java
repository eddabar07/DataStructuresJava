package Sesion09_DynamicMemoryExample;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroAspirante {
    private ArrayList<Aspirantes> listaAspirante = new ArrayList<>();
    private DatosAspirantes da = new DatosAspirantes();
    private Scanner sc = new Scanner(System.in);


    // Añadir aspirante
    public void añadirAspirante(){
        int nuevoFolio = listaAspirante.size() + 1;
        Aspirantes nuevoAspirante = da.capturarDatos(nuevoFolio);
        listaAspirante.add(nuevoAspirante);
        System.out.println("\nAspirante registrado correctamente con el Folio: " + String.format("%04d", nuevoFolio));
    }
    
    // Buscar aspirante por nombre
    public void buscarAspiranteNombre(){
        if (listaAspirante.isEmpty()){
            System.out.println("No hay aspirantes regitrados");
            return;
        }

        System.out.println("Nombre o Apellido del Aspirante: ");
        String nombre = sc.nextLine().toLowerCase();

        for (Aspirantes asp : listaAspirante){
            if (asp.getNombreFormateado().toLowerCase().contains(nombre)){
                System.out.println("\nAspirante Encontrado");
                System.out.println(asp);
                return;
            }
        }
    }

    // Buscar aspirante por folio
    public void buscarAspiranteFolio(){
        if (listaAspirante.isEmpty()){
            System.out.println("No hay Aspirantes regitrados");
            return;
        }

        System.out.println("Folio del Aspirante: ");
        int folio = sc.nextInt();
        sc.nextLine();

        for (Aspirantes asp : listaAspirante){
            if (asp.getFolio() == folio){
                System.out.println("\nAspirante Encontrado");
                System.out.println(asp);
                return;
            }
        }
    }

    // Eliminar aspirante por nombre
    public void eliminarAspiranteNombre(){
        if (listaAspirante.isEmpty()){
            System.out.println("No hay Aspirantes regitrados");
            return;
        }

        System.out.println("Nombre o Apellido del Aspirante: ");
        String nombre = sc.nextLine().toLowerCase();

        for (int i = 0; i < listaAspirante.size(); i++){
            if (listaAspirante.get(i).getNombreFormateado().toLowerCase().contains(nombre)){
                listaAspirante.remove(i);
                System.out.println("Aspirante Eliminado Correctamente");
                return;
            }
        }
        System.out.println("Aspirante no encontrado");
    }

    // Eliminar aspirante
    public void eliminarAspiranteFolio(){
        if (listaAspirante.isEmpty()){
            System.out.println("No hay Aspirantes regitrados");
            return;
        }

        System.out.println("Folio del Aspirante: ");
        int folio = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < listaAspirante.size(); i++){
            if (listaAspirante.get(i).getFolio() == folio){
                listaAspirante.remove(i);
                System.out.println("Aspirante Eliminado Correctamente");
                return;
            }
        }
        System.out.println("Aspirante no encontrado");
    }

    // Mostrar listado de aspirantes
    public void mostrarLista(){
        if (listaAspirante.isEmpty()){
            System.out.println("No hay Aspirantes regitrados");
            return;
        }

        System.out.println("\n========== LISTA DE ASPIRANTES ==========");
        for (Aspirantes asp : listaAspirante){
            System.out.println(asp);
        }
    }
}