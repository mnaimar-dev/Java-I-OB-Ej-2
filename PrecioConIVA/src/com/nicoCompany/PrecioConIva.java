package com.nicoCompany;

import java.util.Scanner;

public class PrecioConIva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer precio: ");
        double precio_1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo precio: ");
        double precio_2 = scanner.nextDouble();

        totalConIVA(precio_1, precio_2);
    }

    private static double totalConIVA(double precio_1, double precio_2) {
        double suma = precio_1 + precio_2;
        double precioConIVA = suma * 1.21;
        System.out.println("El precio con IVA es: " + precioConIVA);
        return precioConIVA;
    }

}
