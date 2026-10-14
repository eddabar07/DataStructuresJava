package Sesion16_QuequeExample;

import java.util.Arrays;

class FilaEstaticaSinRecorrido{
    private int[] filaEstatica;
    private int frente;
    private int fin;

    public FilaEstaticaSinRecorrido(){
        filaEstatica = new int[5];
        frente = 0;
        fin = -1;
    }

    public void insertarElementos(int numero){
        if (estaLlena()){
            System.out.println("La FIla se Encuentra Llena");
            return;
        }
        
        fin ++;
        filaEstatica[fin] = numero;
    }

    public void eliminarElemento(){
        if (estaVacia()){
            System.out.println("La Fila se Encuentra Llena");
            return;
        }

        filaEstatica[frente] = 0;
        frente ++;
    }

    public void mostrarDatos(){
        System.out.println(Arrays.toString(filaEstatica));;
    }

    public boolean estaLlena(){
        return fin == filaEstatica.length - 1;
    }

    public boolean estaVacia(){
        return fin == -1;
    }
}

class filaEstaticaConReccorrido{
    private int[] filaEstatica;
    private int frente;
    private int fin;

    public filaEstaticaConReccorrido(){
        filaEstatica = new int[5];
        frente = 0;
        fin = -1;
    }

    public void insertarElementos(int numero){
        if (estaLlena()){
            System.out.println("La FIla se Encuentra Llena");
            return;
        }
        
        fin ++;
        filaEstatica[fin] = numero;
    }

    public void eliminarElemento(){
        if (estaVacia()){
            System.out.println("La Fila se Encuentra Llena");
            return;
        }

        filaEstatica[frente] = 0;
        frente ++;

        for (int i = 0; i <= fin - 1; i++){
            filaEstatica[i] = filaEstatica[i + 1];
        }
        filaEstatica[fin] = 0;
        fin --;
    }

    public void mostrarDatos(){
        System.out.println(Arrays.toString(filaEstatica));;
    }

    public boolean estaLlena(){
        return fin == filaEstatica.length - 1;
    }

    public boolean estaVacia(){
        return fin == -1;
    }
}

class filaEstaticaCircular{
    private int[] filaEstatica;
    private int frente;
    private int fin;

    public filaEstaticaCircular(){
        filaEstatica = new int[5];
        frente = 0;
        fin = -1;
    }

    public void insertarElementos(int numero){
        if (estaLlena()){
            System.out.println("La FIla se Encuentra Llena");
            return;
        }
        
        fin ++;
        filaEstatica[fin] = numero;
    }

    public void eliminarElemento(){
        if (estaVacia()){
            System.out.println("La Fila se Encuentra Llena");
            return;
        }

        filaEstatica[frente] = 0;
        frente ++;        
    }

    public void mostrarDatos(){
        System.out.println(Arrays.toString(filaEstatica));;
    }

    public boolean estaLlena(){
        return fin == filaEstatica.length - 1;
    }

    public boolean estaVacia(){
        return fin == -1;
    }
}

public class QuequeTest {
    void main(){
        filaEstaticaCircular fer = new filaEstaticaCircular();

        fer.insertarElementos(7);
        fer.insertarElementos(17);
        fer.insertarElementos(4);
        fer.insertarElementos(87);

        fer.mostrarDatos();

        fer.eliminarElemento();
        fer.mostrarDatos();
    }
}
