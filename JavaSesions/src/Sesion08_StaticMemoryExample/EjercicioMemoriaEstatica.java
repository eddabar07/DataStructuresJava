package Sesion08_StaticMemoryExample;


/*
    Ejercicio: Crear una app que almacene los datos de los aspirantes
    que obtedran una ficha de nuevo ingreso para la carrera de ISC

    Se requiere leer toda la informacion necesaria, alamcenarla,
    para posteriormente analizarla y poder mostrarla

    Consideraciones para el desarrollo de la app:
    1) Se debe almacear los siguientes datos del aspirante: nombre completo,
    edad, direccion, telefono, redes sociales, carreras interes,
    escuela de procedencia y bachillerato

    2) NO se conoce la cantidad de asipirantes a nuevo ingreso
    3) La app debera imprimir TODA la informacion del aspirante, con el
    siguiente formato:

    Ficha de Ingreso: 001
    -------------------------------
   Nombre: Luke
   Primer Ap.: Skywalker
   ....
   Bachillerato: Fisico Matematico



		=========== MENU ==============
		0) Cuantos ASPIRANTES deseas ingresar?
		1) Agregar aspirante
		2) Eliminar aspirante (ultimmo aspirante)
		3) Buscar aspirante (Numero de ficha, Nombre o por Primer Ap)
		4) Mostrar listado de aspirantes

 */

import java.util.Scanner;

class Aspirante{
    // Declaracion de variables
    Scanner sc = new Scanner(System.in);
    private String[] nombreCompleto;
    private int edad;
    private Object[] direccion;
    private String telefono;
    private String[][] redesSociales;
    private String carreraInteres;
    private String escuela;
    private String bachillerato;

    // Metodo constructor
    public Aspirante(){}

    // Solicitar el nombre completo del aspitante
    public void NombreCompletoAspirante(){
        // Declaracion de variables
        String nombre [] = new String [3];

        // Solicitar nombre del estudiante 
        System.out.println("Ingresa tu Apellido Paterno: ");
        nombre [0] = sc.nextLine();

        System.out.println("Ingresa tu Apellido Materno: ");
        nombre [1] = sc.nextLine();

        System.out.println("Ingresa tu Nombre(s): ");
        nombre [2] = sc.nextLine();

        this.nombreCompleto = nombre;
    }

    // Solicitar la edad del aspirante
    public void edadAspirante(){
        // Declaracion de variables
        int edadTemp = 0;

        // Solicitar la edad del aspirante
        System.out.print("Ingresa la edad del aspirante: ");
        edadTemp = sc.nextInt();
        sc.nextLine();

        this.edad = edadTemp;
    }
    
    // Solicitar la direccion del aspirante
    public void direccionAspirante(){
        // Declaracion de variables
        Object dir [] = new Object[5];

        // Solicitar la direccion del aspirante
        System.out.print("Ingresa el nombre de la calle: ");
        dir [0] = sc.nextLine();

        System.out.print("Ingresa el numero de la vivienda: ");
        dir [1] = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingresa el nombre de la colonia: ");
        dir [2] = sc.nextLine();

        System.out.print("Ingresa el codigo postal: ");
        dir [3] = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingresa el nombre de la ciudad: ");
        dir [4] = sc.nextLine();

        this.direccion = dir;
    }

    // Solicitar el numero de telefono del aspirante
    public void TelefonoAspirante(){
        // Declaracion de variables
        String tel = "";

        System.out.print("Ingresa el numero de telefono del aspirante: ");
        tel = sc.nextLine();

        this.telefono = tel;
    }

    // Solicitar las redes sociales del aspirante
    public void redesSocialesAspirante(){
        // Declarar el limite del arreglo
        System.out.println("¿Cuántas redes sociales deseas ingresar?: ");
        int tamaño = sc.nextInt();
        sc.nextLine(); // (limpia el buffer para evitar problemas de lectura)

        // Declaracion del arreglo
        String redes [][] = new String[tamaño][2];

        // Inicializar arreglo
        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingresa el nombre de la red social " + (i+1) + ": ");
            redes[i][0] = sc.nextLine();

            System.out.println("Ingresa tu nombre de usuario (username): ");
            redes [i][1] = sc.nextLine();
        }

        this.redesSociales = redes;
    }

    // Solicitar las carreras de interes del aspirante
    public void carrerasInteres(){
        // Declaracion de variables
        String interes = null; 
        String buscar;
        boolean encontrado = false;

        // Array con las carreras disponibles
        String carreras [] = {
            "ingenieria en sistemas computacionales",
            "ingenieria mecatronica", 
            "ingenieria en industrias alimentarias",
            "licenciatura en administracion",
            "licenciatura en contador publico"
        };

        System.out.println("Ingresa la carrera de tu interes: ");
        buscar = sc.nextLine().toLowerCase().trim();

        // Buscar carrera de interes entre las opciones
        for (int i = 0; i < carreras.length; i++){
            if (carreras[i].equals(buscar)){
                encontrado = true;
                interes = carreras[i];
                break;
            }
        }

        // Validar si fue encontrado o no
        if (encontrado){
            System.out.println("¡La carrera '" + interes + "' se encuentra disponible en el plantel!");
        } 
        else {
            System.out.println("La carrera ingresada no se encuentra disponible en el plantel.");
        }

        this.carreraInteres = interes;
    }

    // Solicitar escuela de procedencia
    public void escuelaAspirante(){
        System.out.println("Ingresa la escuela de procedencia del aspirante: ");
        this.escuela = sc.nextLine();
    }

    // Solicitar el bachillerato del aspirante
    public void bachilleratoAspirante(){
        System.out.println("Ingresa el bachillerato del aspirante: ");
        this.bachillerato = sc.nextLine();
    }

    // Metodo que arma el registro completo de este aspirante
    public void registrarAspirante(){
        NombreCompletoAspirante();
        edadAspirante();
        direccionAspirante();
        TelefonoAspirante();
        redesSocialesAspirante();
        carrerasInteres();
        escuelaAspirante();
        bachilleratoAspirante();
    }

    public String[] getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public Object[] getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String[][] getRedesSociales() {
        return redesSociales;
    }

    public String getCarreraInteres() {
        return carreraInteres;
    }

    public String getEscuela() {
        return escuela;
    }

    public String getBachillerato() {
        return bachillerato;
    }

    public String imprimirFicha(int numeroFicha){
        StringBuilder sb = new StringBuilder();

        // Formateo del numero de ficha (001, 002, 003...)
        String folio = String.format("%03d", numeroFicha);

        // Mostrar el reporte del aspirante 
        sb.append("Ficha de Ingreso: ").append(folio).append("\n");
        sb.append("-------------------------------\n");
        sb.append("Nombre: ").append(nombreCompleto[2]).append("\n");
        sb.append("Primer Ap.: ").append(nombreCompleto[0]).append("\n");
        sb.append("Segundo Ap.: ").append(nombreCompleto[1]).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Direccion: ").append(direccion[0]).append(" #").append(direccion[1])
          .append(", Col. ").append(direccion[2]).append(", CP ").append(direccion[3])
          .append(", ").append(direccion[4]).append("\n");
        sb.append("Telefono: ").append(telefono).append("\n");

        sb.append("Redes Sociales: ");
        if (redesSociales != null && redesSociales.length > 0){
            for (int i = 0; i < redesSociales.length; i++){
                sb.append(redesSociales[i][0]).append(" (").append(redesSociales[i][1]).append(")");
                if (i < redesSociales.length - 1) sb.append(", ");
            }
            sb.append("\n");
        } else {
            sb.append("Ninguna\n");
        }

        sb.append("Carrera de Interes: ").append(carreraInteres).append("\n");
        sb.append("Escuela de Procedencia: ").append(escuela).append("\n");
        sb.append("Bachillerato: ").append(bachillerato).append("\n");

        return sb.toString();
    }
}

class RegistroAspirantes{
    // Declaracion de variables
    private Aspirante[] aspirantes;
    private int capacidad;
    private int contador;

    // Constructor
    public RegistroAspirantes(){
        capacidad = 0;
        contador = 0;
        aspirantes = null;
    }

    // Opcion 0: definir cuantos aspirantes se van a registrar
    public void definirCapacidad(int capacidad){
        this.capacidad = capacidad;
        this.aspirantes = new Aspirante[capacidad];
        this.contador = 0;
        System.out.println("Se reservo espacio para " + capacidad + " aspirantes");
    }

    // Opcion 1: agregar un aspirante
    public void agregarAspirante(Aspirante a){
        if (aspirantes == null){
            System.out.println("Primero debes indicar cuantos aspirantes deseas ingresar");
            return;
        }
        if (contador >= capacidad){
            System.out.println("No hay espacio disponible. Ya se alcanzó el límite de " + capacidad + " aspirantes.");
            return;
        }

        aspirantes[contador] = a;
        contador++;
        System.out.println("Aspirante registrado con folio " + String.format("%03d", contador));
    }

    // Opcion 2: eliminar el ultimo aspirante agregado
    public void eliminarUltimoAspirante(){
        if (contador == 0){
            System.out.println("No hay aspirantes registrados para eliminar.");
            return;
        }

        contador--;
        aspirantes[contador] = null;
        System.out.println("Se eliminó el último aspirante registrado.");
    }

    // Opcion 3: buscar por numero de ficha, nombre o primer apellido
    public void buscarAspirante(String criterio){
        boolean encontrado = false;

        // Buscar por numero de ficha (si el criterio es numerico)
        try {
            int folio = Integer.parseInt(criterio);
            if (folio >= 1 && folio <= contador){
                System.out.println(aspirantes[folio - 1].imprimirFicha(folio));
                return;
            }
        } catch (NumberFormatException e) {
            // no es numero, seguimos buscando por texto
        }

        // Buscar por nombre o primer apellido
        String buscar = criterio.toLowerCase().trim();
        for (int i = 0; i < contador; i++){
            String nombrePila = aspirantes[i].getNombreCompleto()[2].toLowerCase().trim();
            String apellidoPaterno = aspirantes[i].getNombreCompleto()[0].toLowerCase().trim();

            if (nombrePila.equals(buscar) || apellidoPaterno.equals(buscar)){
                System.out.println(aspirantes[i].imprimirFicha(i + 1));
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("No se encontró ningún aspirante con ese criterio.");
        }
    }

    // Opcion 4: mostrar listado completo
    public void mostrarAspirantes(){
        if (contador == 0){
            System.out.println("Aun no hay aspirantes registrados.");
            return;
        }

        for (int i = 0; i < contador; i++){
            System.out.println(aspirantes[i].imprimirFicha(i + 1));
        }
    }

    public int getContador(){
        return contador;
    }

    public boolean capacidadDefinida(){
        return aspirantes != null;
    }
    
}

public class EjercicioMemoriaEstatica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroAspirantes registro = new RegistroAspirantes();
        int opcion;

        do{
            System.out.println("\n=========== MENU ==============");
            System.out.println("0) Cantidad de Aspirantes a Ingresar");
            System.out.println("1) Agregar aspirante");
            System.out.println("2) Eliminar aspirante (ultimo aspirante)");
            System.out.println("3) Buscar aspirante (Numero de ficha, Nombre o por Primer Ap)");
            System.out.println("4) Mostrar listado de aspirantes");
            System.out.println("5) Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion){
                case 0:
                    System.out.print("¿Cuántos aspirantes deseas ingresar?: ");
                    int capacidad = sc.nextInt();
                    sc.nextLine();
                    registro.definirCapacidad(capacidad);
                    break;

                case 1:
                    Aspirante a = new Aspirante();
                    a.registrarAspirante();
                    registro.agregarAspirante(a);
                    break;

                case 2:
                    registro.eliminarUltimoAspirante();
                    break;

                case 3:
                    System.out.print("Ingresa el numero de ficha, nombre o primer apellido a buscar: ");
                    String criterio = sc.nextLine();
                    registro.buscarAspirante(criterio);
                    break;

                case 4:
                    registro.mostrarAspirantes();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion != 5);
        sc.close();
    }
}