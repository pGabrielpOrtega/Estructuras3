package com.company;
import java.util.Hashtable;
import java.util.Scanner;

public class Diccionario {


    public static void main(String[] args) {
        Hashtable<String, Integer> personasyEdades = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        personasyEdades.put("Juan", 25);
        personasyEdades.put("Roberto", 12);
        personasyEdades.put("Laura", 29);
        personasyEdades.put("Juan", 25);
        personasyEdades.put("Roberto", 12);
        personasyEdades.put("Laura", 29);
        System.out.println("Escribr un nombre");
        String nombre = sc.next();
        System.out.println("Escribir la edad");
        int edad = sc.nextInt();
        personasyEdades.put(nombre,edad);
        System.out.println("Que nombre desea buscar");
        String x = sc.next();
        System.out.println(personasyEdades.get(x));

    }
}
