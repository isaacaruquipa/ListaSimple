package com.estructura;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	        Stack pila = new Stack();
	        Queue q = new LinkedList();
            pila.push(1);
            pila.push(2);
            pila.push(3);
            pila.push(4);
            pila.push(5);

            //
        System.out.println("Recorrido de la pila:");
            while (!pila.empty()) {
                System.out.println(pila.pop());
            }

            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
        System.out.println("Recorrido de la cola:");
            while (!q.isEmpty()) {
                System.out.println(q.poll());
            }

            //
        System.out.println("Recorrido de la lista :");
            ListaSimple lista = new ListaSimple();
            lista.insertarInicio(1);
            lista.insertarInicio(2);
            lista.insertarInicio(3);
            lista.insertarInicio(4);
            lista.insertarInicio(5);
            lista.insertarInicio(6);
            lista.insertarInicio(7);
            lista.insertarInicio(8);
            lista.insertarInicio(9);
            lista.recorrerLista();
            // eliminar un elemento de la lista
            lista.eliminarElemento(3);
            System.out.println("Recorrido de la lista :");
            lista.recorrerLista();

    }

    // funcion elimina los numeros pares de la pila y recibe como parametro la pila

    static void eliminaPares(Stack pila) {
        Stack pila2 = new Stack();
        while (!pila.empty()) {
            int numero = (int) pila.pop();
            if (numero % 2 == 0) {
                pila2.push(numero);

            }
        }
        while (!pila2.empty()) {
            pila.push(pila2.pop());
        }
    }
}
