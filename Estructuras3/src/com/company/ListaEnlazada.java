package com.company;
import java.util.LinkedList;
import java.util.Scanner;
public class ListaEnlazada {

    public static void main(String[] args) {
        // Adding elements to the linked list
        LinkedList<String> listaEnlazada = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        listaEnlazada.add("Juan");
        listaEnlazada.add("Pedro");
        listaEnlazada.addLast("Luis");
        listaEnlazada.addFirst("Gabriel");
        listaEnlazada.add(2, "juanSeno");
        listaEnlazada.add("Francisco");
        listaEnlazada.add("Angel");
        System.out.println("La lista enlada es la siguente : " + listaEnlazada);

        System.out.println("elimnando  objetos de la lista");
        String x = sc.next();
        listaEnlazada.remove("Angel");
        listaEnlazada.remove(3);
        listaEnlazada.removeFirst();
        listaEnlazada.removeLast();
        System.out.println("Linked list after deletion: " + listaEnlazada);

        System.out.println("Que elemento desea buscar");
        String kk = sc.next();
        boolean status = listaEnlazada.contains(kk);

        if(status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");

        
        int Tamaño = listaEnlazada.size();
        System.out.println("El tamaño de la lista enlazada= " + Tamaño);

        Object element = listaEnlazada.get(2);
        System.out.println("Element returned by get() : " + element);
        listaEnlazada.set(2, "Y");
        System.out.println("Linked list after change : " + listaEnlazada);
    }
}

