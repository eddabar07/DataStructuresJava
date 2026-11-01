package T3_A5_BarriosRomeroEduardoDaniel.Promedios;

import java.util.Scanner;

public class LinkedList {
    Scanner sc = new Scanner(System.in);
    Nodo nodoInicio;
    Nodo nodoFin;

    // 1. Crear
    public LinkedList(){
        nodoFin = nodoInicio = null;
    }

    // 2.1. Agregar al inicio
    public void insertarInicio(double dato){ // Agrega un elemento cuando la lista esta vacia
        if (nodoInicio == null){            
            Nodo newNodo = new Nodo(dato);

            nodoInicio = nodoFin = newNodo;
        } else { // Agrega elemento cuando la lista NO esta vacia
            Nodo newNodo = new Nodo(dato);

                newNodo.setApuntador(nodoInicio); // Inserta el dato en el nodo del inicio
                nodoInicio = newNodo; // Recorre el nodo a la derecha
        }
    }

    // 2.2 Agregar al final
    public void insertarFinal(double dato){ // Agrega elemento cuando la lista esta vacia
        if (nodoInicio == null){
            Nodo newNodo = new Nodo(dato);

            nodoInicio = nodoFin = newNodo;
        } else { // Agrega un elemento cuando la lista NO esta vacia
            Nodo newNodo = new Nodo(dato);

            nodoFin.setApuntador(newNodo);
            
            nodoFin = newNodo;
        }
    }

    // 3.1 Eliminar al inicio
    public void eliminarInicio(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else{
            nodoInicio = nodoInicio.getApuntador();
        }
    }

    // 3.2 Eliminar al final
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

    // 3.3 Eliminar elemento especifico
    public void eliminarTemperaturaEspecifica(double datoBuscar){
        // Si la lista esta vacia...
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        if (datoBuscar == nodoInicio.getDato()){
            System.out.println("Dato Encontrado en el Primer Nodo");
            nodoInicio = nodoInicio.getApuntador();

        } else{
            Nodo nodoAnterior = nodoInicio;
            Nodo nodoPosterior = nodoInicio.getApuntador();

            // Buscar dato mientras que no termine la lista
            while (datoBuscar != nodoPosterior.getDato() && nodoPosterior.getApuntador() != null){
                nodoAnterior = nodoPosterior;
                nodoPosterior = nodoPosterior.getApuntador();
            }

            if (datoBuscar == nodoPosterior.getDato()){
                nodoAnterior.setApuntador(nodoPosterior.getApuntador());
                nodoPosterior = nodoPosterior.getApuntador();
            }
            System.out.println("Dato no encontrado");
        }
    }

    // 3.4 Eliminar elemento posicion especifica 
    public void elimninarPosicionEspecifica(int posicion){
        if (posicion < 0){
            System.out.println("Posicion Invalida");
            return;
        }
        else if (posicion == 0){
            nodoInicio = nodoInicio.getApuntador();
            return;
        }
        else{
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

    // 4. Obtener promedio de temperaturas
    public void obtenerPromedioTemperaturas(){
        if (nodoInicio == null){
            System.out.println("La lisa se encuentra vacia");
            return;
        }
        if(nodoInicio.getApuntador() == null){
            if(nodoInicio.getDato() >= 0 && nodoInicio.getDato() <= 10){
                System.out.println("El promedio es de: " + nodoInicio.getDato() + " la temperatura se considera congelacion");
            }
            else if(nodoInicio.getDato() >= 11 && nodoInicio.getDato() <= 20){
                System.out.println("El promedio es de: " + nodoInicio.getDato() + " la temperatura se considera fria");
            }
            else if(nodoInicio.getDato() >= 21 && nodoInicio.getDato() <= 30){
                System.out.println("El promedio es de: " + nodoInicio.getDato() + " la temperatura se considera normal");
            }
            else if(nodoInicio.getDato() >= 31){
                System.out.println("El promedio es de: " + nodoInicio.getDato() + " la temperatura se considera alta");
            }
        }
        else{
            Nodo nodoAnterior = nodoInicio;
            double suma = 0;
            int contador = 0;

            while (nodoAnterior != null){
                suma += nodoAnterior.getDato();
                contador++;
                nodoAnterior = nodoAnterior.getApuntador();
            }

            if (contador > 0){
                double promedio = suma / contador;

                promedio = Double.parseDouble(String.format("%.2f", promedio));
                promedio = (double) promedio;

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

    // 5. Mostrar Elementos (recorrido)
    public void mostrarElementos(){
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else{
            Nodo nodoActual = nodoInicio;

            while(nodoActual != null){
                System.out.print("[" + nodoActual.getDato() + "] ==> ");
                nodoActual = nodoActual.getApuntador();
            }
            System.out.println();
        }
    }
}
