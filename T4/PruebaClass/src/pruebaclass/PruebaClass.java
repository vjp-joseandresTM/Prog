/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaclass;

/**
 *
 * @author alumno
 */
public class PruebaClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montania");
        bici1.setAntiguedad(58);
        
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Mitical");
        bici2.setColor("Nigga");
        bici2.setTipo("Montania");
        bici2.setAntiguedad(6);
        
        bici1.mostrarBicicleta();
        bici2.mostrarBicicleta();
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
        
        
    }
    
}
