/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8_ej6;

/**
 *
 * @author DAM
 */
public class Empleados {

    private String nombre;
    private int horasTrabajadas;
    private double tarifaXhora;

    //Constructores
    public Empleados() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaXhora = 0;
    }

    public Empleados(String nombre, int horasTrabajadas, double tarifaXhora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaXhora = tarifaXhora;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaXhora() {
        return tarifaXhora;
    }

    public void setTarifaXhora(double tarifaXhora) {
        this.tarifaXhora = tarifaXhora;
    }

    //Metodos mostrar
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaXhora=" + tarifaXhora + '}';
    }

    //Metodos
    public double calcSueldoBruto() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaXhora;
        } else {
            int horasExtras = horasTrabajadas - 40;
            return (40 * tarifaXhora) + (horasExtras * tarifaXhora * 1.5);
        }
    }

    public void mostrarDatos() {
        double sueldo = calcSueldoBruto();
        System.out.println(nombre + " trabajó " + horasTrabajadas + " horas, cobra " + tarifaXhora + " euros la hora, por lo que le corresponde un sueldo de " + sueldo + " euros.");
    }

}
