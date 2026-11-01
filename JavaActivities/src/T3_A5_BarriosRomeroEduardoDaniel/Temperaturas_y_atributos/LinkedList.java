package T3_A5_BarriosRomeroEduardoDaniel.Temperaturas_y_atributos;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Scanner;

public class LinkedList {
    // Declaracion de variables
    Scanner sc = new Scanner(System.in);
    Nodo nodoInicio;
    Nodo nodoFin;

    // Creacion de la lista enlazada
    public LinkedList(){
        nodoFin = nodoInicio = null;
    }

    // Solicitar datos de temeratura
    public Temperatura solicitarDatos(){
        // Instanciar objeto Temperatura
        Temperatura temp = new Temperatura();
        int[] fechaReg = new int[3];

        // Solicitar temperatura
        System.out.print("Ingresa la temperatura en °C: ");
        double temperatura = sc.nextDouble();
        sc.nextLine();

        System.out.println("--- FECHA DE REGISTRO ---");
        // Solicitar fecha de registro
        System.out.print("Ingresa el dia: ");
        fechaReg[0] = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingresa el mes (01 - 12): ");
        fechaReg[1] = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingresa el anio: ");
        fechaReg[2] = sc.nextInt();
        sc.nextLine();

        // Validar que los dias no sean negativos o excedan el rango
        if (fechaReg[0] < 1 || fechaReg[1] < 1 ||
            fechaReg[1] > 12 || fechaReg[2] < 1){

            System.out.println("La fecha ingresada es invalida.");
            return null;
        }

        // Validar que el dia exista en el mes
        YearMonth mes = YearMonth.of(fechaReg[2], fechaReg[1]);

        if (fechaReg[0] > mes.lengthOfMonth()){

            System.out.println("La fecha ingresada es invalida.");
            return null;
        }

        // Asignacion de los datos
        temp.setTemperatura(temperatura);
        temp.setFecha(fechaReg);

        // Retorno del objeto Temperatura
        return temp;
    }

    // Ingresar temperatura al inicio de la lista
    public void insertarInicio(){
        Temperatura temp = solicitarDatos();
        if (nodoInicio == null){            
            Nodo newNodo = new Nodo(temp);
            nodoInicio = nodoFin = newNodo;
        } 
        else { // Agrega elemento cuando la lista NO esta vacia
            Nodo newNodo = new Nodo(temp);
            newNodo.setApuntador(nodoInicio); // Inserta el dato en el nodo del inicio
            nodoInicio = newNodo; // Recorre el nodo a la derecha
        }
    }

    // Ingresar temperatura al final
    public void insertarFinal(){
        Temperatura temp = solicitarDatos();
        if (nodoInicio == null){
            Nodo newNodo = new Nodo(temp);
            nodoInicio = nodoFin = newNodo;

        } else { // Agrega un elemento cuando la lista NO esta vacia
            Nodo newNodo = new Nodo(temp);
            nodoFin.setApuntador(newNodo);
            nodoFin = newNodo;
        }
    }

    // Eliminar temperatura al inicio
    public void eliminarInicio(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else{
            nodoInicio = nodoInicio.getApuntador();
        }
    }

    // Eliminar temperatura al final
    public void eliminarFinal(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else if (nodoInicio.getApuntador() == null){
            nodoInicio = nodoInicio.getApuntador();
            return;
        }
        else{
            Nodo nodoActual = nodoInicio.getApuntador();
            Nodo nodoPosterior = nodoActual.getApuntador();
            
            while (nodoPosterior.getApuntador() != null){
                nodoActual = nodoActual.getApuntador();
                nodoPosterior = nodoPosterior.getApuntador();
            }

            nodoActual.setApuntador(nodoPosterior.getApuntador());
        }
    }

    // Eliminar en posicion especifica
    public void elimninarPosicionEspecifica(){
        // Solicitar posicion
        System.out.println("Ingresa la posicion del nodo a eliminar: ");
        int posicion = sc.nextInt();
        sc.nextLine();

        if (posicion < 0){ // Validar la posicion 
            System.out.println("Posicion Invalida");
            return;
        }
        else if (posicion == 0){ // Eliminar cuando solo hay un elemento
            nodoInicio = nodoInicio.getApuntador();
            return;
        }
        else{ // Eliminar cuando hay 2 o mas elementos
            Nodo nodoAnterior = nodoInicio;
            Nodo nodoEliminar;
            int contador = 0;

            while (contador < posicion -1 && nodoAnterior.getApuntador() != null) {
                nodoAnterior = nodoAnterior.getApuntador();
                contador++;
            }

            // Comprobar si existe la posicion
            if (nodoAnterior.getApuntador() != null){
                nodoEliminar = nodoAnterior.getApuntador();
                nodoAnterior.setApuntador(nodoEliminar.getApuntador());
            }
            else{
                System.out.println("La posicion " + posicion + " no existe");
                return;
            }
        }
    }

    // Eliminar temperatura especifica
    public void eliminarTemperaturaEspecifica(){
        // Verificar si la lista est vacia
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }

        // Eliminar si solo existe un dato
        if (nodoInicio.getApuntador() == null){
            System.out.println("Solo se encontro una temperatura en la lista");
            nodoInicio = nodoInicio.getApuntador();
            System.out.println("Temperatura eliminada");
        }
        else{
            // Solicitar los datos a eliminar y guardarlos en una variable temporal
            Temperatura temp = solicitarDatos();

            // Comprueba si existe el elemento y si solo existe un elemento
            if (nodoInicio.getApuntador() == null){

                    nodoInicio = nodoInicio.getApuntador();
                    System.out.println("Temperatura eliminada");
            }
            else{
                // Declaracion de nodos auxiliares
                Nodo nodoAnterior = nodoInicio;
                Nodo nodoPosterior = nodoInicio.getApuntador();

                // Buscar dato mientras que no termine la lista
                while (nodoAnterior != null &&
                (!Arrays.equals(temp.getFecha(), nodoPosterior.getTemperatura().getFecha()) ||
                temp.getTemperatura() != nodoPosterior.getTemperatura().getTemperatura())){
                    
                    nodoAnterior = nodoPosterior;
                    nodoPosterior = nodoPosterior.getApuntador();
                }

                // verificar si el dato fue encontrdo
                if (nodoPosterior != null){

                    // Eliminr la temperatura
                    nodoAnterior.setApuntador(nodoPosterior.getApuntador());
                    nodoPosterior = nodoPosterior.getApuntador();
                    System.out.println("Temperatura eliminada");
                }
                System.out.println("Dato no encontrado");
            }
        }
    }

    
    // Determinar promedio por rango de fechas
    public void promedioPorFechas(){

        // Validar si la lista esta vacia
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }

        // Declaracion de variables locales
        Temperatura temp;
        Nodo nodoActual = nodoInicio;
        int[] fechaInicio = new int[3];
        int[] fechaFin = new int[3];
        int contador = 0;
        double suma = 0;
        double promedio;

        if (nodoActual.getApuntador() == null){
             if(nodoActual.getTemperatura().getTemperatura() >= 0 && nodoActual.getTemperatura().getTemperatura() <= 10){
                System.out.println("El promedio es de: " + nodoActual.getTemperatura().getTemperatura() + " la temperatura se considera congelacion");
            }
            else if(nodoActual.getTemperatura().getTemperatura() >= 11 && nodoActual.getTemperatura().getTemperatura() <= 20){
                System.out.println("El promedio es de: " + nodoActual.getTemperatura().getTemperatura() + " la temperatura se considera fria");
            }
            else if(nodoActual.getTemperatura().getTemperatura() >= 21 && nodoActual.getTemperatura().getTemperatura() <= 30){
                System.out.println("El promedio es de: " + nodoActual.getTemperatura().getTemperatura() + " la temperatura se considera normal");
            }
            else if(nodoActual.getTemperatura().getTemperatura() >= 31){
                System.out.println("El promedio es de: " + nodoActual.getTemperatura().getTemperatura() + " la temperatura se considera alta");
            }
        }
        else{

            // Solicitar el rango de fechas
            System.out.println("--- FECHA INICIO ---");

            System.out.print("Ingresa el dia (01 - 31): ");
            fechaInicio[0] = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa el mes (01 - 12): ");
            fechaInicio[1] = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa el anio: ");
            fechaInicio[2] = sc.nextInt();
            sc.nextLine();

            // Validar que los dias no sean negativos o excedan el rango
            if (fechaInicio[0] < 1 || fechaInicio[1] < 1 ||
                fechaInicio[1] > 12 || fechaInicio[2] < 1){

                System.out.println("La fecha ingresada es invalida.");
                return;
            }

            // Validar que el dia exista en el mes
            YearMonth mesInicio = YearMonth.of(fechaInicio[2], fechaInicio[1]);

            if (fechaInicio[0] > mesInicio.lengthOfMonth()){

                System.out.println("La fecha ingresada es invalida.");
                return;
            }

            System.out.println("\n--- FECHA FIN ---");
            
            System.out.print("Ingresa el dia (01 - 31): ");
            fechaFin[0] = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa el mes (01 - 12): ");
            fechaFin[1] = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa el anio: ");
            fechaFin[2] = sc.nextInt();
            sc.nextLine();

            // Validar que los dias no sean negativos o excedan el rango
            if (fechaFin[0] < 1 || fechaFin[1] < 1 ||
                fechaFin[1] > 12 || fechaFin[2] < 1){

                System.out.println("La fecha ingresada es invalida.");
                return;
            }

            // Validar que el dia exista en el mes
            YearMonth mesFin = YearMonth.of(fechaFin[2], fechaFin[1]);

            if (fechaFin[0] > mesFin.lengthOfMonth()){

                System.out.println("La fecha ingresada es invalida.");
                return;
            }

            LocalDate inicio = LocalDate.of(fechaInicio[2], fechaInicio[1], fechaInicio[0]);
            LocalDate fin = LocalDate.of(fechaFin[2], fechaFin[1], fechaFin[0]);

            if (fin.isBefore(inicio)) {
                System.out.println("La fecha final no puede ser anterior a la inicial.");
                return;
            }

            // Buscar la fecha inicial
            while (nodoActual != null &&
                !Arrays.equals(nodoActual.getTemperatura().getFecha(), fechaInicio)){

                nodoActual = nodoActual.getApuntador();
            }

            // Validar si existe la fecha inicial
            if (nodoActual == null){
                System.out.println("La fecha inicial no se encuentra en la lista");
                return;
            }

            // Recorrer desde la fecha inicial hasta la fecha final
            while (nodoActual != null){

                temp = nodoActual.getTemperatura();

                suma += temp.getTemperatura();
                contador++;

                // Comprobar si se llego a la fecha final
                if (Arrays.equals(temp.getFecha(), fechaFin)){
                    break;
                }

                nodoActual = nodoActual.getApuntador();
            }

            // Validar si se encontro la fecha final
            if (nodoActual == null){
                System.out.println("La fecha final no se encuentra despues de la fecha inicial");
                return;
            }

            // Calcular el promedio
            if (contador > 0){

                promedio = suma / contador;

                // Formatear el promedio a dos decimales
                promedio = Double.parseDouble(String.format("%.2f", promedio));

                // Validar que tipo de temperatura es
                if(promedio >= 0 && promedio <= 10){
                    System.out.println("El promedio es de: " + promedio + " la temperatura se considera congelacion");
                }
                else if(promedio >= 11 && promedio <= 20){
                    System.out.println("El promedio es de: " + promedio + " la temperatura se considera fria");
                }
                else if(promedio >= 21 && promedio <= 30){
                    System.out.println("El promedio es de: " + promedio + " la temperatura se considera normal");
                }
                else if(promedio >= 31){
                    System.out.println("El promedio es de: " + promedio + " la temperatura se considera alta");
                }
            }
        }
    }

    // Mostrar elementos
     public void mostrarElementos(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else{
            Nodo nodoActual = nodoInicio;

            System.out.println("[TEMPERATURA - FECHA] ==>");
            while(nodoActual != null){
                Temperatura temp = nodoActual.getTemperatura();
                System.out.print(temp);
                nodoActual = nodoActual.getApuntador();
            }
            System.out.println();
        }
    }
}