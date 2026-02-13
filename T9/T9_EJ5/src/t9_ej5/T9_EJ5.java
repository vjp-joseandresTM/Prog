/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9_ej5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9_EJ5 {

    /**
     * @param args the command line arguments
     */
    //Pedimos un dia al usuario, luego en el while hacemos la busqueda y comparamos si el array tiene el dia que nos ha pedido el usuario.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String diaUsuario;
        boolean encontrado = false;
        
        System.out.print("Introduzca el dia a buscar:");
        diaUsuario = sc.nextLine();
        int i = 0;
        while (i<semana.length && encontrado != true) {            
            if(semana[i].equalsIgnoreCase(diaUsuario)){
                encontrado = true;
                System.out.println("El "+ diaUsuario + " es el "+ (i+1));
            }else{
                i++;
            }
        }
        
        
    }
    
}
