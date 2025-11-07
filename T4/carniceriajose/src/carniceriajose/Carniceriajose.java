/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carniceriajose;

import java.util.Scanner;
/**
 *
 * @author José
 */
public class Carniceriajose {
//Declaramos constantes que vamos a utilizar a futuro.  
public static final char LETRAINI = 'A'; 
public static final char LETRAFIN = 'C';
//Declaramos unas variables iniciales para las compras y los pedidos.
public static int numCompra = 1;
public static int numPedido = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMenu();
        int opcion = 0;
        
        do {
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    char letraCompra = generarLetraAleatoria(LETRAINI, LETRAFIN);
                    System.out.println("La opcion seleccionada es 1");
                    generarNumeroEsperaCompra();
                    System.out.println(letraCompra);
                    
                    break;
                
                case 2:
                    char letraPedidos = generarLetraAleatoria(LETRAINI, LETRAFIN);
                    System.out.println("La opcion seleccionada es 2");
                    generarNumeroEsperaPedido();
                    System.out.println(letraPedidos);
                    break;
                
                case 3:
                
                break;
               
            }
            
        } while (opcion != 3);
    }
    //Muestra las opciones de forma visual.
    public static void mostrarMenu(){
        System.out.println("----MENU DE OPCIONES----");
        System.out.println("1.Comprar");
        System.out.println("2.Recoger Pedido");
        System.out.println("3.Salir");
    }
    //Le pide al usuario que aporte una opcion y devuelve el resultado de dicha opcion
    public static int pedirOpcion(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;
        System.out.println("Por favor, ingresa un número:");
        numero = sc.nextInt();
       
        return numero ;
    }
    //Genera una letra aleatoria generando unas letras char "Inicio" y "Fin", que son tomadas de las Constantes.
    public static char generarLetraAleatoria(char a, char c) {
        return (char) (a + (int)(Math.random() * (c - a + 1)));
    }
    //Se incrementa el numero de compra 
    public static void incrementarNumeroCompra(){
        numCompra++;
        
    }
    //Se incrementa el numero de pedido
    public static void incrementarNumeroPedido(){
        numPedido++;
    }   
    //Generamos el numero de compra y despues incrementamos.
    public static void generarNumeroEsperaCompra(){
        
        System.out.println("C"+ numCompra );
        incrementarNumeroCompra();
    } 
    //Igual que en el caso anterior pero cambiando el caracter de c a p.
    public static void generarNumeroEsperaPedido(){
        
        System.out.println("P"+ numPedido );
        incrementarNumeroPedido();
    } 
}
