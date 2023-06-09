/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author VEL-USER
 */
public class Empleados {
    private String nombre;
    private double salario;
    private int edad;

    public Empleados(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public void aumentarSalario(double porcentaje) {
        double aumento = salario * (porcentaje / 100);
        salario += aumento;
    }
}
