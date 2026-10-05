package Sesion13_RecursivityExample;

/**
 * RECURSIVIDAD
 *  
 *  Es cuando una funcion o metodo se llama asi mismo o
 *  llama a otros metodos o funciones que en algun momento
 *  volveran a invocar al primer metodo
 * 
 * REGLAS PARA APLICAR LA RECURSIN
 * 
 *  1.- El metodo debe llamarse a si mismo
 *  2.- Debe finalizar en algun momento (CASO BASE)
 *  3.- En cada llamada recursiva, se debe resolver un problema de menor 
 *      tamaño con respecto a la llamada o invocacion anterior
 * 
 *  NOTA: Cuando se analiza un problema para ser resuelto de forma recursiva,
 *        se deben tomar en cuenta dos aspectos: el retorno de valor del metodo
 *        y el (los) parametro(s) de la funcion o metodo recursivo.  
 */

class metodosRecursivos{
    public static void metodoRecursivo1(){
        metodoRecursivo1(); // StackOverflowError
    }

    // Mostrar una secuencia de numeros de forma DESCENDENTE desde N hasta 0
    public static void cuentaRegresivaIterativa(int num){
        for (int i = num; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void cuentaRegresivaRecursiva(int num){
        // Caso Base
        if (num == 0){
            System.out.println("Fin de la cuenta recursiva");
        }
        else{
            cuentaRegresivaRecursiva(num - 1);
        }
    }

    // Mostrar una secuencia de numeros de forma ASCENDENTE desde 1 hasta N
    public static void cuentaProgresivaIterativa(int num, int limite){
        for (int i = num; i <= limite; i++){
            System.out.println(i);
        }
    }

    public static void cuentaProgresivaRecursiva(int num, int limite){
        // Caso base
        if (num <= limite){
            System.out.println("Fin de la cuenta progresiva");
        }
        else{
            System.out.println(num);
            cuentaProgresivaRecursiva(num + 1, limite);
        }
    }

    public static int sumatoriaRecursiva(int num){
        if (num == 1){
            return 1;
        }
        return num + sumatoriaRecursiva(num - 1);
    }

    public static int factorialRecursivo(int num){
        if (num == 1){
            return 1;
        }
        return num * factorialRecursivo(num - 1);
    }

    // Metodo recursivo para mostrar una cadena inversa
    public static String invertirCadenaRecursivo(String cadena){
        if (cadena.length() < 2){
            return cadena;
        }
        return invertirCadenaRecursivo(cadena.substring(1)) + cadena.charAt(0); 
    }

    // Eliminar todas las instancias de una caracter de una cadena
    public static String eliminarCaracterRecursivo(String cadena, char caracter){
        if (cadena.length() == 0){
            return new String();
        }
        else{
            if (cadena.charAt(0) == caracter){
                return eliminarCaracterRecursivo(cadena.substring(1), caracter);
            }
            else{
                return cadena.charAt(0) + eliminarCaracterRecursivo(cadena.substring(1), caracter);
            }
        }
    }
}

public class RecursivityTeas {   
    public static void main(String[] args) {
        System.out.println("========== METODO ITERATIVO REGRESIVO ==========");
        metodosRecursivos.cuentaRegresivaIterativa(10);

        System.out.println("========== METODO RECURSIVO REGRESIVO ==========");
        metodosRecursivos.cuentaRegresivaRecursiva(10);

        System.out.println("========== METODO ITERATIVO PROGESIVO ==========");
        metodosRecursivos.cuentaProgresivaIterativa(1, 10);

        System.out.println("========== METODO RECURSIVO PROGRESIVO ==========");
        metodosRecursivos.cuentaProgresivaRecursiva(1, 10);

        System.out.println("========== METODO RECURSIVO SUMATORIA ==========");
        int sum = metodosRecursivos.sumatoriaRecursiva(5);
        System.out.println(sum);

        System.out.println("========== METODO RECURSIVO FACTORIAL ==========");
        int fact = metodosRecursivos.factorialRecursivo(5);
        System.out.println(fact);

        System.out.println("========== METODO RECURSIVO CADENA INVERSA ==========");
        String inv = metodosRecursivos.invertirCadenaRecursivo("sistemas");
        System.out.println(inv);

        System.out.println("========== METODO RECURSIVO ELIMINAR INSTANCIAS ==========");
        String elim = metodosRecursivos.eliminarCaracterRecursivo("sistemas", 's');
        System.out.println(elim);
    }
}