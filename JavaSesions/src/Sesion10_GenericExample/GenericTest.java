package Sesion10_GenericExample;

import java.util.ArrayList;

/**
 * WRAPPER CLASSES
 * 
 * Convert primitive data types into objects
 * 
 * Integers
 *  byte -> Byte
 *  short -> Short
 *  int -> Integer
 *  long -> Long
 * 
 * Real numbers
 *  float -> Float
 *  double -> Double
 * 
 * Boolean
 *  boolean -> Boolean
 * 
 * Character
 *  char -> Character
 */

public class GenericTest {
    public static void main(String[] args) {
        System.out.println("---------- WRAPPER6 CLASSES ----------");

        double temp = 45.26;
        Double temp2 = 23.4;

        System.out.println(temp * 100);
        System.out.println(temp2 * 100);

        String temp3 = "89.7";
        System.out.println(Double.parseDouble(temp3) * 100);

        int age = 45;
        Integer age2 = 25;

        System.out.println(age * 100);
        System.out.println(age2 * 100);

        int n1 = 0234;
        int n2 = 0x12345A;

        System.out.println(n1);
        System.out.println(n2);

        System.out.println(Integer.toBinaryString(1000));
        System.out.println(Integer.toHexString(1000));
        System.out.println(Integer.toOctalString(1000));

        System.out.println("---------- GENERICS ----------");

        byte ageArray[] = {45, 23, 15, 60, 50};
        System.out.println(ageArray);

        // Mostrar las edades ordenadas de manera Ascendente
        ArrayList <Integer> ageList = new ArrayList<Integer>();

        ageList.add(45);
        ageList.add(23);
        ageList.add(15);
        ageList.add(60);
        ageList.add(50);

        System.out.println(ageList);

        ageList.sort(null);
        System.out.println(ageList);

        ageList.reversed();
        System.out.println(ageList);
    }
}

