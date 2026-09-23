package Sesion11_HashMapExample;

import java.util.HashMap;

/**
 * HASHMAP
 * 
 * Coleccion de objetos almacenados en formato PAR -> Clave, valor
 * 
 */

class Alumno {
    private String numControl;
    private String nombre;

    public Alumno(String numControl, String nombre) {
        this.numControl = numControl;
        this.nombre = nombre;
    }
    public String getNumControl() {
        return numControl;
    }
    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno [numControl=" + numControl + ", nombre=" + nombre + "]";
    }
}

public class HashMapTest {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("01", "Luke");
        Alumno a2 = new Alumno("02", "Leia");
        Alumno a3 = new Alumno("03", "Han");

        HashMap<String, Alumno> alumnos = new HashMap<String, Alumno>();

        alumnos.put("01", a1);
        alumnos.put(a2.getNumControl(), a2);
        alumnos.put(a3.getNumControl(), a3);

        System.out.println("--- Iterar o recorrer el HASHMAP ---");

        System.out.println(alumnos);

        System.out.println(alumnos.get("03").getNombre());

        System.out.println(alumnos.keySet());
        System.out.println(alumnos.values());

        System.out.println("--- Iteracion sobre claves ---");
        for (String clave : alumnos.keySet()){
            System.out.println(clave);
        }

        System.out.println("--- Iteracion sobre claves ---");
        for (Alumno alumno : alumnos.values()){
            System.out.println(alumno.getNombre());
        }
    }
}