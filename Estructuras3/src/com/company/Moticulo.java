package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Moticulo {
    public void Quick(int[] arr, int com) {
        QuickSort qk = new QuickSort();
        long t1 = qk.sort(arr);
        long promedio = (t1) / 3;
        System.out.println("\nQuick Sort tarda \nprimer tiempo .- " + t1);
        System.out.println("El promedio es .-" + promedio);
        if (com == 1) {
            System.out.println("\nQuick Sort \n" + Arrays.toString(arr));
            qk.quickSort(arr, 0, arr.length - 1);
            System.out.println("\nQuick Sort \n" + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moticulo d = new Moticulo();
        System.out.println("Cuantos elementos en el arreglo desea ");
        int z = sc.nextInt(); // z es el numero del tamaño del arreglo
        System.out.println("\nCantidad de numero para el random osea entre el 0 al que usted desea para la generación aleatoria ");
        int cv = sc.nextInt();
        int[] elementos = new int[z];
        Random r = new Random();
        System.out.println("Desea agregar la función de comprobar si funcionan correctamente \n1.-Si");
        int com = sc.nextInt();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Math.abs(r.nextInt(cv));

        }
        d.Quick(elementos, com);
    }
}


