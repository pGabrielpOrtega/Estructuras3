package com.company;
import java.util.*;
import java.util.Queue;

public class Main {
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

	// write your code here
Scanner sc = new Scanner(System.in);
        Queue<String> x = new LinkedList<>();
        String filaEspera;
        int l = leerEntero(sc, "Ingrese el numero de clientes en cola", "Ha ingresado un caracter no valido");
        for (int i = 0; i <l ; i++) {
            System.out.println("Sus nombres");
            filaEspera = sc.next();
            x.add(filaEspera);
        }
        System.out.println("LLamando a los cliente por orden ingresado");
        for (int i = 0; i <l ; i++) {
            String primero = x.poll();
            System.out.println("Pase "+primero+" A Caja para retirar dinero");
        }



    }

}
