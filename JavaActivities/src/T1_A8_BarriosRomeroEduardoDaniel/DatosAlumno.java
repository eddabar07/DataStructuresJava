package T1_A8_BarriosRomeroEduardoDaniel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatosAlumno {
    // Declaracion Scanner
    Scanner sc = new Scanner(System.in);

    // Capturar datos
    public Alumno capturarDatos(int numControl){
        Alumno a = new Alumno();
        a.setControl(numControl);
        
        // Nombre
        String[] nombre = new String[3];

        System.out.print("Apellido Paterno:");
        nombre[0] = sc.nextLine();

        System.out.print("Apellido Materno: ");
        nombre[1] = sc.nextLine();

        System.out.print("Nombre(s): ");
        nombre[2] = sc.nextLine();

        a.setNombreCompleto(nombre);

        // Edad
        System.out.print("Edad: ");
        a.setEdad(sc.nextInt());
        sc.nextLine();

        // Carrera
        String carreras [] = {
            "ingenieria en sistemas computacionales",
            "ingenieria mecatronica", 
            "ingenieria en industrias alimentarias",
            "licenciatura en administracion",
            "licenciatura en contador publico"};

        while (true) {
            System.out.print("Carrera: ");
            String buscar = sc.nextLine().toLowerCase().trim();
            boolean encontrada = false;

            for (String carrera : carreras){
                if (buscar.equalsIgnoreCase(carrera)){
                    a.setCarrera(carrera);
                    encontrada = true;
                    break;
                }
            }
            if (encontrada){
                break;
            }
            else{
                System.err.println("Carrera no encontrada. Intente nuevamente");
            }
        }

        // Fecha de Registro
        System.out.println("Fecha de Registro (DD/MM/AAAA): ");
        String fecha = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate formatDate = LocalDate.parse(fecha, formatter);
        a.setFechaRegistro(formatDate);

        return a;
    }
}

