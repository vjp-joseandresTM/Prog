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
        Bicicleta.aumentarContadorBicicletas();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montania");
        bici1.setAntiguedad(58);
        
        Bicicleta bici2 = new Bicicleta("Mitical", "Nigga","Montania", 6);
        Bicicleta.aumentarContadorBicicletas();
        
        
        Bicicleta bici3 = new Bicicleta("MTN");
        Bicicleta.aumentarContadorBicicletas();
        bici3.setColor("Rojo");
        bici3.setTipo("Carretera");
        bici3.setAntiguedad(0);
        
        
        
        bici1.mostrarBicicleta();
        System.out.println(bici2.toString());
        System.out.println(bici2.getMarca());
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
        
        Bicicleta bici4 = new Bicicleta("Chochosa", "Peluda", "Voladora", 12);
        System.out.println("");
        
        System.out.println("Numero de bicicletas " +Bicicleta.getContadorBicicletas() );
        
    }
    
}
