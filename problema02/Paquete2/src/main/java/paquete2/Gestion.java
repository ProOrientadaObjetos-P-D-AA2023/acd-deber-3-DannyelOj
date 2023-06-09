/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Gestion {
    private List<Empleados> empleados;

    public Gestion() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        System.out.println("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        Empleados empleado = new Empleados(nombre, salario, edad);
        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleados empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", "
                        + "Salario: " + empleado.getSalario() + ", Edad: "
                        + empleado.getEdad());
            }
        }
    }

    public void calcularAumentoSalarial() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            double totalSalarios = 0;
            for (Empleados empleado : empleados) {
                totalSalarios += empleado.getSalario();
            }
            double salarioPromedio = totalSalarios / empleados.size();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el porcentaje de aumento salarial: ");
            double porcentajeAumento = scanner.nextDouble();

            System.out.println("Nuevos salarios:");
            for (Empleados empleado : empleados) {
                if (empleado.getSalario() < salarioPromedio) {
                    empleado.aumentarSalario(porcentajeAumento);
                    System.out.println("Nombre: " + empleado.getNombre() + ""
                            + ", Nuevo salario: " + empleado.getSalario());
                }
            }
        }
    }
}
