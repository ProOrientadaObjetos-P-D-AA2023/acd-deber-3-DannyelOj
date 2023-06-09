/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paquete1;

/**
 *
 * @author VEL-USER
 */
public class Paquete1 {

    public static void main(String[] args) {
        System.out.println("Informe venta productos");
        ventaProductos venta = new ventaProductos();
        venta.ingresarDatos();
        venta.calcularDescuento();
        venta.calcularPrecioFinal();
    }
}
