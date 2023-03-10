package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del articulo");

        String articulo = leer.next();

        System.out.println("Ingresa el valor del articulo " + articulo);

        double val = leer.nextDouble();
        System.out.println("Ingrese la cantidad de articulos");

        double cantidad = leer.nextDouble();
        double subtotal = val * cantidad;

        double IVA = subtotal * 0.13;

        double total = IVA + subtotal;

        System.out.println("subtotal = " + subtotal);
        System.out.println("IVA = " + IVA);
        System.out.println("total = " +total);
    }
}
