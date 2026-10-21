package Sesion15_DynamicStackExample;

import java.util.Stack;

/**
 * 
 */

public class DynamicStackTest {
    public static void main(String[] args) {
        // Creacion de pila dinamica
        Stack <Integer> dynamicStack = new Stack<>();

        // Insertar objetos a la pila
        dynamicStack.push(9);
        dynamicStack.push(7);
        dynamicStack.push(2);

        // Mostrar el elemento superiror
        System.out.println(dynamicStack.peek());

        // Insertar elementos nuevos a la pila
        dynamicStack.push(29);
        dynamicStack.push(78);
        dynamicStack.push(5);

        // Eliminar elementos de la pila
        dynamicStack.pop();

        // Mostrar cima actualizada
        System.out.println(dynamicStack.peek());

        // Buscar elemento dentro de la pila
        System.out.println(dynamicStack.search(7));
    }
}
