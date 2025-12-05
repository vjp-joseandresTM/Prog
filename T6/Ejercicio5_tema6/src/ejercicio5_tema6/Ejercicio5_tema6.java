/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_tema6;

/**
 *
 * @author DAM
 */
public class Ejercicio5_tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ornitorrinco o = new Ornitorrinco("Perry", "Macho", "Marrón", 5, 2);
        System.out.println(o.obtenerMensajeOviparo());
        o.mostrarNumHuevos();
        o.ponerHuevo();
        o.mostrarNumHuevos();
        o.incubarHuevo();
        o.mostrarNumHuevos();

        System.out.println();

        Murcielago m = new Murcielago("Baity", "Hembra", "Negro", 3, 10);
        System.out.println(m.obtenerMensajeVolador());
        m.mostrarAlturaVuelo();
        m.aumentarAlturaVuelo();
        m.mostrarAlturaVuelo();
        m.bajarAlturaVuelo();
        m.mostrarAlturaVuelo();     // TODO code application logic here
    }

}
