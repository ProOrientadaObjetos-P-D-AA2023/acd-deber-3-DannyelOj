/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class ventaProductos {
    private double precio;
    private int cantidad;

    public void calcularDescuento() {
        double descuento;
        if (precio >= 1000 && cantidad >= 10) {
            descuento = 0.1 * precio;
        } else {
            descuento = 0.05 * precio;
        }
        System.out.println("El descuento es: " + descuento);
    }

    public void calcularPrecioFinal() {
        double descuento;
        if (precio >= 1000 && cantidad >= 10) {
            descuento = 0.1 * precio;
        } else {
            descuento = 0.05 * precio;
        }
        double precioFinal = precio - descuento;
        System.out.println("Precio final después del descuento: $" + precioFinal);
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de productos: ");
        cantidad = scanner.nextInt();
    }
}
