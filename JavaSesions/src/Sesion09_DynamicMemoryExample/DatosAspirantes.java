package Sesion09_DynamicMemoryExample;

import java.util.Scanner;

public class DatosAspirantes {    
    Scanner sc = new Scanner(System.in);

    // Captura de datos
    public Aspirantes capturarDatos(int folioGenerado){
        Aspirantes a = new Aspirantes();
        a.setFolio(folioGenerado);

        System.out.println("========== REGISTRO DE ASPIRANTE ==========");

        // Nombre
        String nombre [] = new String[3];

        System.out.print("Apellido Paterno: ");
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

        // Direccion
        String dire[] = new String[5];

        System.out.print("Calle: ");
        dire[0] = sc.nextLine();

        System.out.print("Número: ");
        dire[1] = sc.nextLine();

        System.out.print("Colonia: ");
        dire[2] = sc.nextLine();

        System.out.print("Código postal: ");
        dire[3] = sc.nextLine();

        System.out.print("Ciudad: ");
        dire[4] = sc.nextLine();

        a.setDireccion(dire);

        // Telefono
        System.out.print("Número de Teléfono: ");
        a.setTelefono(sc.nextLine());

        // Redes Sociales
        System.out.print("¿Cuántas de tus redes sociales deseas agregar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        String redes[][] = new String[cantidad][2];

        for (int i = 0; i < redes.length; i++){
            System.out.print("Nombre de la red social " + (i + 1) + " :");
            redes[i][0] = sc.nextLine();

            System.out.print("Nombre de usuario: ");
            redes[i][1] = sc.nextLine();
        }
        a.setRedesSociales(redes);

        // Carrera de interes
        String carreras [] = {
            "ingenieria en sistemas computacionales",
            "ingenieria mecatronica", 
            "ingenieria en industrias alimentarias",
            "licenciatura en administracion",
            "licenciatura en contador publico"};

        while (true) {
            System.out.print("Carrera de interés: ");
            String buscar = sc.nextLine().toLowerCase().trim();
            boolean encontrada = false;

            for (String carrera : carreras){
                if (buscar.equalsIgnoreCase(carrera)){
                    a.setCarreraInteres(carrera);
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

        // Carrera de procedencia
        System.out.print("Escuela de procedencia: ");
        a.setEscuelaProcedencia(sc.nextLine());

        // Bachilleraro de procedencia
        System.out.print("Bachillerato de procedencia: ");
        a.setBachillerato(sc.nextLine());

        return a;
    }
}