/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ej20;

/**
 *
 * @author DAM
 */
public class Cuenta {

    private int saldo;
    private int cantidad;

    public Cuenta() {
        this.saldo = 0;
        this.cantidad = 0;
    }

    public Cuenta(int saldo) {
        this.saldo = saldo;
        this.cantidad = cantidad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar( int cantidad) {
        
            if (cantidad <= 10) {
                System.out.println("La cantidad a ingresar debe ser de 10€ o superior, porfavor intentelo de nuevo.");
            } else {
                saldo = cantidad + saldo;
                System.out.println("La cantidad depositada es: " + cantidad);
                System.out.println("TOTAL DE SALDO DISPONIBLE: " + saldo);
            }
        
    }

    public void extraer( int cantidad) {
        do {
            if (cantidad <= 5) {
                System.out.println("La cantidad a extraer debe ser igual o superior a 5, porfavor introduzca una cantidad adecuada ");

            } else {
                saldo = saldo - cantidad;
                System.out.println("La cantidad extraida es: " + cantidad);
                System.out.println("TOTAL DE SALDO DISPONIBLE: " + saldo);
            }
        } while (saldo > 10);
    }

}
