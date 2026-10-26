package T3_A4_BarriosRomeroEduardoDaniel;

public class LinkedList {
    Nodo nodoInicio;
    Nodo nodoFin;

    // 1. Crear
    public LinkedList(){
        nodoFin = nodoInicio = null;
    }

    // 2.1. Agregar al inicio
    public void agregarElementoInicio(int dato){ // Agrega un elemento cuando la lista esta vacia
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
    public void agregarElementoFinal(int dato){ // Agrega elemento cuando la lista esta vacia
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
    public void eliminarDatoEspecifico(int datoBuscar){
        // Si la lista esta vacia...
        if (nodoInicio == null){
            System.out.println("La lista se encuentra vacia");
            return;
        }
        else if (datoBuscar == nodoInicio.getDato()){
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

    // 4. Mostrar Elementos (recorrido)
    public void mostrarElementos(){
        Nodo nodoActual = nodoInicio;

        while(nodoActual != null){
            System.out.print("[" + nodoActual.getDato() + "] ==> ");
            nodoActual = nodoActual.getApuntador();
        }
        System.out.println();
    }

    // Menu insertar
    public void menuInsertar(){

    }
}
