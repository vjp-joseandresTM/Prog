/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_ed;

/**
 *
 * @author DAM
 */
public class EJ3_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int sumaPrimos(int numeroMaximo) {

    int acumulador = 0;
    int numero = 2;
    int contador;
    boolean primo;

    do {//Nodo 1
        System.out.println(numero);
        contador = 2; //Nodo 2
        primo = true;
        while ((primo) && (contador != numero)) {//Nodo 3
            if (numero % contador == 0) {//Nodo 4
                primo = false;//Nodo 5
            } 
            contador++;//Nodo 6
        }

        if (primo) {//Nodo 7
            acumulador = acumulador + numero;//Nodo 8
        }

        numero++;//Nodo 9
    } while (numero <= numeroMaximo);//Nodo 10

    return acumulador;//Nodo 11
}

}
