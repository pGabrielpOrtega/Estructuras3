package com.company;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class Pilas {
    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }
    public static void main(String[] args) {
        Stack<String> libros = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int l = 0,palanca;

        System.out.println("Menu principal \n1.-Meter libros \n2.-Para elimar el primer elemento \n3.-Para buscar un libro");
        do{
           palanca = sc.nextInt();
           switch (palanca){
               case 1:
                   int h = leerEntero(sc, "Ingrese el numero de elemmentos que va ingresar", "Ha ingresado un caracter no valido");
                       System.out.println("El nombre de los libros");
                       String f= sc.nextLine();
                       libros.push(f);
                   break;
               case 2:
                   String y = libros.pop();
                   System.out.println("Se ha eliminado .-"+ y);
                   break;
               case 3:
                   System.out.println("Cual libro busca");
                   String busqueda = sc.next();
                   Integer pos =libros.search(busqueda);
                   if(pos == -1)
                       System.out.println("Element not found");
                   else
                       System.out.println("Element is found at position " + pos);
                   break;
           }

        }
        while (l ==0);
    }
    static void stack_push(Stack<String> stack,String x)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(x);
        }
    }

}
