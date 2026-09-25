package T1_A8_BarriosRomeroEduardoDaniel;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroAlumno {
    HashMap <Integer, Alumno> alumno = new HashMap<>();
    DatosAlumno da = new DatosAlumno();
    Scanner sc = new Scanner(System.in);

    // Añadir alumno
    public void añadirAlumno(){
        System.out.println("\n========== CAPTURA DE 5 ALUMNOS ==========");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n===== Registro del Alumno " + i + " de 5 =====");
            int nuevoFolio = alumno.size() + 1;
            Alumno nuevoAlumno = da.capturarDatos(nuevoFolio);
            alumno.put(nuevoFolio, nuevoAlumno);
            System.out.println("Alumno registrado con el Folio: " + String.format("%04d", nuevoFolio));
        }
        System.out.println("\n¡Se han registrado exitosamente los 5 alumnos!");
    }

    // Vaciar lista
    public void vaciarLista(){
        if (alumno.isEmpty()){
            System.out.println("No hay Alumnos registrados");
            return;
        }

        alumno.clear();
        System.out.println("Lista Vaciada Correctamente");
    }

    // Buscar por carrera
    public void buscarCarrea(){
        if (alumno.isEmpty()){
            System.out.println("No hay Alumnos registrados");
            return;
        }

        int opcCarrera;
        do{
            System.out.println("\n========== BUSCAR ALUMNO POR CARRERA ==========");
            System.out.println("""
                    1.- Ing. Sistemas Computacionales
                    2.- Ing. Mecatronica
                    3.- Ing. Industrias Alimentarias
                    4.- Lic. Administracion
                    5.- Contador Público
                    0.- REGRESAR
                    """);
            System.out.print("Ingresa una opción: ");
            opcCarrera = sc.nextInt();
            sc.nextLine();
            System.out.println();

            String carreraBuscada = "";

            switch (opcCarrera) {
                case 1:
                    carreraBuscada = "ingenieria en sistemas computacionales";
                    break;
                
                case 2:
                    carreraBuscada = "ingenieria mecatronica";
                    break;

                case 3:
                    carreraBuscada = "ingenieria en industrias alimentarias";
                    break;
            
                case 4:
                    carreraBuscada = "licenciatura en administracion";
                    break;

                case 5:
                    carreraBuscada = "licenciatura en contador publico";
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opción Invalida");
                    break;
            }
            System.out.println("\n========== ALUMNOS DE LA CARRERA SELECCIONADA ==========");

            boolean encontrado = false;
            for (Alumno a : alumno.values()) {
                if (a.getCarrera().equalsIgnoreCase(carreraBuscada)) {
                    System.out.println(a);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No hay alumnos registrados en esta carrera.");
            }
        } while (opcCarrera != 0);
    }

    // Calcular promedio de edades
    public void promedioEdades(){
        if (alumno.isEmpty()){
            System.out.println("No hay Alumnos registrados");
            return;
        }

        int sumaEdades = 0;
        int totalAlumnos = alumno.size();

        for (Alumno a : alumno.values()){
            sumaEdades += a.getEdad();
        }

        double promedio = (double) sumaEdades / totalAlumnos;

        System.out.println("\n========== PROMEDIO GENERAL DE EDAD ==========");
        System.out.println("Total de alumnos registrados: " + totalAlumnos);
        System.out.println("Promedio de edad: " + String.format("%.2f", promedio) + " años");
    }

    // Mostrar alumnos después de la fecha limite de registro
    public void buscarDespuesFecha(){
        if (alumno.isEmpty()){
            System.out.println("No hay Alumnos registrados");
            return;
        }

        System.out.println("========== ALUMNOS REGISTRADOS DESPUÉS DEL 10/08/2026 ==========");
        
        LocalDate fechaLimite = LocalDate.of(2026, 8, 10);

        for (Alumno a : alumno.values()) {            
            if (a.getFechaRegistro().isAfter(fechaLimite)) {
                System.out.println(a);
            }
        }
    }

    // Mostrar listado de aspirantes
    public void mostrarLista(){
        if (alumno.isEmpty()){
            System.out.println("No hay Aspirantes regitrados");
            return;
        }

        System.out.println("\n========== LISTA DE ALUMNOS ==========");
        for (Alumno a : alumno.values()){
            System.out.println(a);
        }
    }
}