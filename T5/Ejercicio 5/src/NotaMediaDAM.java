/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */

import java.util.Scanner;

public class NotaMediaDAM {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      
      Curso prog = new Curso("Programacion");
      Curso ldm = new Curso("Lenguaje de marcas");
      Curso bd = new Curso("Base de datos");
      Curso ed = new Curso("Entornos de desarrollo");
      Curso si = new Curso ("Sistemas informaticos");
      Curso fol = new Curso("FOL");
     System.out.print("Por favor, introduzca la nota de " + prog.getNombre() + ": ");
        prog.setNota(sc.nextDouble());

        System.out.print("Introduzca la nota de " + ldm.getNombre() + ": ");
        ldm.setNota(sc.nextDouble());

        System.out.print("Introduzca la nota de " + bd.getNombre() + ": ");
        bd.setNota(sc.nextDouble());

        System.out.print("Introduzca la nota de " + ed.getNombre() + ": ");
        ed.setNota(sc.nextDouble());

        System.out.print("Introduzca la nota de " + si.getNombre() + ": ");
        si.setNota(sc.nextDouble());

        System.out.print("Por último, introduzca la nota de " + fol.getNombre() + ": ");
        fol.setNota(sc.nextDouble());  
        
        double media = Curso.calcularMedia(
            prog.getNota(),
            ldm.getNota(),
            bd.getNota(),
            ed.getNota(),
            si.getNota(),
            fol.getNota()
        ); 
        
        System.out.println("La media fue:" + media);
    }
    
    
}

