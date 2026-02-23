/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edrepaso2;

/**
 *
 * @author DAM
 */
public class Edrepaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int sumaPrimos(int numeroMaximo) {
        int acumulador = 0;
        int numero = 2;//Nodo 1
        int contador;
        boolean primo;
        do {//Nodo2
            System.out.println(numero);
            contador = 2;//Nodo3
            primo = true;
            while (primo && contador != numero) {//Nodo 4
                if (numero % contador == 0) {//Nodo 5
                    primo = false;//Nodo 6
                }
                contador++;//Nodo 7
            }
            if (primo) {//Nodo 8
                acumulador = acumulador + numero;// Nodo 9
            }
            numero++;//Nodo 10
        } while (numero <= numeroMaximo);
        return acumulador;//Nodo 12
    }
}
