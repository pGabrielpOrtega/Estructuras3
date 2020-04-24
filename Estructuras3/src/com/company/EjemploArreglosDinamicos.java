package com.company;
//Este fue un proyecto para programación 1 que lo lleve con usted siendo un buen ejemplo del uso de los arreglos dinamicos
import java.util.Scanner;

public class EjemploArreglosDinamicos {
    public static void main(String[] args) {
        //        // write your code here
        Scanner sc = new Scanner(System.in);
        DynArray<Double> precio = new DynArray<>(7);
        DynArray<String> nombreProductos = new DynArray(7);
        DynArray<Double> codigo = new DynArray<>(7);
        DynArray<String> Carrito = new DynArray(7);
        int palanca, leerMenu, otraPalanca;
        int repetir = 0;
        double[] Final = {7};
        do {
            System.out.println("hola \n bienvendido al mercadito \n El yo no quiero reporbar la clase \n ");
            System.out.println("Que Menu desea ver \n le recomendamos que inicie por el #1" +
                    "\n 1.- Productos" +
                    "\n 2.- Clientes" +
                    "\n 3.-Imprimir");
            double x, z, k,q,w,e,r,t,y;
            leerMenu = sc.nextInt();
            double imp = 15.0;
//TODO: Menu Productos


            precio.addIndex(0,12.0);
            nombreProductos.addIndex(0,"Leche");
            codigo.addIndex(0,100.0);
//Todo: Seperar
            precio.addIndex(1,17.0);
            nombreProductos.addIndex(1,"pan");
            codigo.addIndex(1,101.0);
// Todo: Seperarar
            precio.addIndex(2,80.0);
            nombreProductos.addIndex(2,"pistola");
            codigo.addIndex(2,102.0);
            if (leerMenu == 1)
                do {
                    System.out.println("El menu de productos es el siguente" +
                            " \n 1.-Desea añadir productos no existentes para añadirlos temporalmente  " +
                            "\n 2.-Desea ver los productos ya existentes" +
                            "\n 3.-Desea añadir a la carreta Algunos productos" +
                            "\n 4.-Desea eliminar el ultimo producto");

                    palanca = sc.nextInt();
                    switch (palanca){
                        case 1:
                            System.out.println("Precio del producto");
                            k= sc.nextInt();
                            precio.addIndex(3, k);
                            System.out.println("Nombre del producto");
                            nombreProductos.addIndex(3, sc.next());
                            System.out.println("Ya que hay un orden con el codigo sera el siguente"+ 103);
                            System.out.println("Desea añadir otro producto Cualquier numero menos el --. 1 .--");
                            otraPalanca =sc.nextInt();
                            if (otraPalanca != 1) {
                                System.out.println("Añadio solo 1 producto");
                                System.out.println("palanca");
                                palanca =sc.nextInt();
                                break;

                            }
                            System.out.println("Precio del producto");
                            k= sc.nextInt();
                            precio.addIndex(4, k);
                            System.out.println("Nombre del producto");
                            nombreProductos.addIndex(4, sc.next());
                            System.out.println("Ya que hay un orden con el codigo sera el siguente"+ 104);
                            System.out.println("Desea añadir otro producto 1.- para si");
                            otraPalanca =sc.nextInt();
                            if (otraPalanca ==1 ) {
                                System.out.println("Añadio solo 2 producto");
                                System.out.println("Salir manualmente");
                                palanca =sc.nextInt();
                                break;

                            }
                            break;
                        case 2:
                            System.out.println("Los productos son los siguentes \n" + nombreProductos.getIndex(0));
                            System.out.println("El codigo son los siguentes \n" + codigo.getIndex(0));
                            System.out.println("El precio son los siguentes \n" + precio.getIndex(0));
                            System.out.println("Los productos son los siguentes \n" + nombreProductos.getIndex(1));
                            System.out.println("El codigo son los siguentes \n" + codigo.getIndex(1));
                            System.out.println("El precio son los siguentes \n" + precio.getIndex(1));
                            System.out.println("Los productos son los siguentes \n" + nombreProductos.getIndex(2));
                            System.out.println("El codigo son los siguentes \n" + codigo.getIndex(2));
                            System.out.println("El precio son los siguentes \n" + precio.getIndex(2));
                            System.out.println("¿Añadio nuevos productos? 1.-Para Si Añadio 1 producto 2.- Si añadio 2 productos "  );
                            otraPalanca = sc.nextInt();
                            System.out.println("Salir manualmente 5");
                            palanca =sc.nextInt();
                            if (otraPalanca ==1) {
                                System.out.println("Los productos son los siguentes \n" + nombreProductos.getIndex(3));
                                System.out.println("El codigo son los siguentes \n" + codigo.getIndex(3));
                                System.out.println("El precio son los siguentes \n" + precio.getIndex(3));
                                System.out.println("Salir manualmente");
                                palanca =sc.nextInt();
                            }
                            if (otraPalanca == 2){
                                System.out.println("Los productos son los siguentes \n" + nombreProductos.getIndex(3));
                                System.out.println("El codigo son los siguentes \n" + codigo.getIndex(3));
                                System.out.println("El precio son los siguentes \n" + precio.getIndex(3));
                                System.out.println("Los productos son los siguentes \n" + nombreProductos.getIndex(4));
                                System.out.println("El codigo son los siguentes \n" + codigo.getIndex(4));
                                System.out.println("El precio son los siguentes \n" + precio.getIndex(4));
                                System.out.println("Salir manualmente");
                                palanca =sc.nextInt();
                            }
                            break;
                        case 3:
                            System.out.println("Que productos desea añadir");

                            break;
                        case 4:
                            System.out.println("Se ha elminido el ultimos producto");
                            Carrito.removeLast();
                            break;

                    }while (palanca !=5)



                        leerMenu = 2;
                } while (leerMenu != 1);
            System.out.println("Esta Saliendo del menu de productos");

// Todo: Menu Clientes
            System.out.println("Desea cear una cuenta \n 1.-Si \n 2.-No");
            if (leerMenu == 2)
                System.out.println("a");
            DynArray<Double> aregloRTN = new DynArray<>(5);
            DynArray<String> areglosClienttesNombres = new DynArray(5);
            palanca = sc.nextInt();
            switch (palanca) {
                case 1:
                    //Todo:Comienza RTN
                    System.out.println("Su Rtn");
                    k = sc.nextInt();
                    aregloRTN.addIndex(0, k);
                    //Todo Clientes
                    System.out.println("Su nombre");
                    areglosClienttesNombres.addIndex(0, sc.next());
                    System.out.println("Su numero de telefono");
                    x = sc.nextInt();
                    aregloRTN.addIndex(1, x);
                    System.out.println("Su correo electronico");
                    areglosClienttesNombres.addIndex(1, sc.next());
                    break;
                case 2:
                    System.out.println("Usted no desea crear una Cuenta =( ");
            }
            System.out.println("Esta Saliendo del menu de Clientes");

// Todo: Imprimir
            System.out.println("Usted tiene cuenta de clientes 1.-Si 2.-No");
            if (leerMenu == 3)
                System.out.println("ignorado");
            palanca = sc.nextInt();
            if (palanca == 1) {
                System.out.println(aregloRTN.getIndex(0));
                System.out.println(areglosClienttesNombres.getIndex(0));
                System.out.println(aregloRTN.getIndex(1));
                System.out.println(areglosClienttesNombres.getIndex(1));
            }
            if (palanca == 2) {
                System.out.println("Usted es cliente Final");
            }
            System.out.println("Que productos tiene en su carrito");
            q = sc.nextInt();
            System.out.println("El precio total es de" );
            System.out.println("Esta saliendo del menu de imprimir");




            System.out.println(" Cualquier numero para Salir Para Salir");
            repetir = sc.nextInt();



        } while (repetir == 0);


    }
}
