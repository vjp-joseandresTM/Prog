/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej2;

/**
 *
 * @author DAM
 */
public class T5_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso prog = new Curso();
        Curso web = new Curso();
        
        prog.obtenerNombre("Programacion orientada a objetos");
        prog.obtenerHoras(800);
        
        web.obtenerNombre("Diseño en WEB");
        web.obtenerHoras(600);
        
        prog.mostrar();
        web.mostrar();
        
        System.out.println("Numero de cursos creados: " + prog.sumarCursos());
        System.out.println("Numero de cursos creados: " + web.sumarCursos());
    }
    
}
