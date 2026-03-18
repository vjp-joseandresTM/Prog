/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paraexamen1;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Coche {

    private  String matricula;
    private  String marca;
    private  int[] revisiones;

    public Coche() {
        this.matricula = "";
        this.marca = "";
        this.revisiones = new int[3];
    }

    public Coche(String matricula, String marca, int[] revisiones) {
        this.matricula = matricula;
        this.marca = marca;
        this.revisiones = revisiones;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int[] getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(int[] revisiones) {
        this.revisiones = revisiones;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", revisiones=" + revisiones + '}';
    }

    public void mostrarInfoCoche() {
        System.out.println("MARCA: " + marca);
        System.out.println("MATRICULA: " + matricula);
        for (int i = 0; i < revisiones.length; i++) {
            System.out.println("REVISION "+ i +" : " + revisiones[i]);
        }
        
    }

    public int caclMedia() {
        int suma = 0;
        for (int i = 0; i < revisiones.length; i++) {
            suma += revisiones[i];
        }
        suma = suma / revisiones.length;
        return suma;
    }

    public void introducirInformacion() {
        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Introduce matrícula: ");
        this.matricula = sc.nextLine();

        System.out.print("Introduce marca: ");
        this.marca = sc.nextLine();

        System.out.println("Introduce las 3 revisiones:");
        for (int i = 0; i < revisiones.length; i++) {
            System.out.print("Revisión " + (i + 1) + ": ");
            revisiones[i] = sc.nextInt();
        }
    }
}
