/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9_ej9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9_EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Introduce tu contraseña: ");
        String contrasena = sc.nextLine();

        boolean valida = true;

        // Longitud mínima
        if (contrasena.length() < 6) {
            System.out.println("La contraseña debe tener al menos 6 caracteres.");
            valida = false;
        }

        // Al menos dos dígitos
        int contadorDigitos = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.out.println("La contraseña debe contener al menos dos dígitos.");
            valida = false;
        }

        // El nombre de usuario no puede aparecer dentro de la contraseña
        if (contrasena.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("La contraseña no puede contener el nombre de usuario.");
            valida = false;
        }

        // Resultado final
        if (valida) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
        }

    }

}
