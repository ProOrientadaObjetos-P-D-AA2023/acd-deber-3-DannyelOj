/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paquete2;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Paquete2 {

    public static void main(String[] args) {
        System.out.println("Gestion de Empleados");
        Empleados gE = new Empleados();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú ");
            System.out.println("Agregar empleado                         [1]");
            System.out.println("Mostrar información de los empleados     [2]");
            System.out.println("Calcular aumento de salario              [3]");
            System.out.println("Salir                                    [4]");
            System.out.println("Seleccione una opción: ");

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    gE.agregarEmpleado();
                    break;
                case 2:
                    gE.mostrarEmpleados();
                    break;
                case 3:
                    gE.calcularAumentoSalarial();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
