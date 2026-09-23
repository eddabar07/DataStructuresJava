package Sesion07_SpecialStringExample;

/*
OPERACONES CON CADENA ESPECIAL

1.- Crear
2.- Mostrar
3.- Mostrar cadena invertida por palabras
4.- Mostrar cadena invertida por caracteres
5.- Agregar elemento al inicio
6.- Agregar elemento al final
7.- Eliminar elemento al inicio
8.- Eliminar elemento al final
9.- Mostrar la cadena en formao camelCase
10.- Agregar elemento en una posicion especifica
*/

class CadenaEspecial{
    // Declaracion de variable cadena
    private String cadena;

    // 1.- Metodo constructor (Crear)
    public CadenaEspecial(String cadena) {
        this.cadena = cadena;
    }

    // 2.- Getter and Setter (Mostrar)
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "CadenaEspecial [cadena=" + cadena + "]";
    }

    // 3.- Mostrar cadena invertida por palabras
    public String invertidaPalabras(){
        // Declaracion de variables locales
        String cadenaInvertida = "";
        String palabras [] = cadena.split(" ");

        // Recorrer la cadena
        for (int i = palabras.length - 1; i >= 0; i--){
            cadenaInvertida += palabras[i].concat(" ");
        }

        // Retornar la cadena ya invertida
        return cadenaInvertida;
    }
}


public class PrubeaCadenaEspecial {
    public static void main(String[] args) {
        String cad = "Ingenieria en Sistemas Computacionales";
        
        CadenaEspecial ce = new CadenaEspecial(cad);
        System.out.println(ce.invertidaPalabras());

        System.err.println("El problema de las cadenas con STRING es la INMUTABILIDAD");     
        
        int iteraciones = 10;
        long tiInicio = System.currentTimeMillis();
        String texto = "";

        for (int i  = 0; i < iteraciones; i++){
            texto +=  "S";
        }

        long tfin = System.currentTimeMillis();
        long tTranscurrido = tfin - tiInicio;

        System.out.println(texto);
        System.out.printf("Tiempo Transcurrido: %d milisegundos \n", tTranscurrido);

        System.out.print("Para MODIFICAR CADENAS sin impacto en la memoria");
        System.out.println("Por la INMUTABILIDAD de String, se recomineda utilizar StrringBuilder o StringBuffer");

        tiInicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i  = 0; i < iteraciones; i++){
             sb.append("S");
        }

        tfin = System.currentTimeMillis();
        tTranscurrido = tfin - tiInicio;
        System.out.printf("Tiempo Transcurrido: %d milisegundos \n", tTranscurrido);
    }
}